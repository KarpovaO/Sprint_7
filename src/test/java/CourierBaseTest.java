import lombok.extern.slf4j.Slf4j;
import model.Courier;
import org.junit.After;

import static api.CourierClientApi.deleteCourierResponse;

@Slf4j
public class CourierBaseTest extends BaseTest {
    Courier courier;
    @After
    public void clearTestData()
    {
        try {
            deleteCourierResponse(courier);
            System.out.println("Курьер удалён успешно");

        } catch (Exception e) {
            System.out.println("Ошибка. Курьер не удалён");
            System.out.println(courier.getFirstname());
            log.error("e: ", e);
        }
    }
}