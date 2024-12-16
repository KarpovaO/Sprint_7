import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static api.OrderClientApi.getOrderList;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.*;

public class OrderListTest extends BaseTest {
    @Test
    @DisplayName("Получение списка заказов")
    public void getOrderListTest() {
        getOrderList().then().assertThat().statusCode(SC_OK).body("orders", notNullValue());
    }

    @Test
    @DisplayName("Проверка не пустого списка")
    public void getNotNullOrderListTest() {
        getOrderList()
                .then()
                .assertThat()
                .statusCode(SC_OK)
                .body("orders", hasSize(greaterThan(0))) // Проверяем, что список не пустой
                .body("orders", everyItem(notNullValue())); // Проверяем, что каждый элемент списка не равен null
    }
}