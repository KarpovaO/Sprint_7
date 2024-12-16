package test.data;

import model.Order;

public class OrderData {
    public static final Order[] ORDERS= {
            new Order("Анна", "Клюева", "Тверь", 2, "1234567890", 1, "2023-07-15", "Быстрее", new String[]{"BLACK"}),
            new Order("Марта", "Иванова", "Питер", 2, "1234567890", 1, "2022-12-12", "ыыыыы", new String[]{"GREY"}),
            new Order("Татьяна", "Смирнова", "Люберцы", 3, "1234567890", 1, "2024-06-23", "123", new String[]{"BLACK","GREY"}),
            new Order("Тамара", "Картер", "Москва", 1, "1234567890", 1, "2024-10-10", "не привозите", new String[]{}),
    };
}
