package com.joaogodoi.SpringBootWithJPA.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final int orderStatusCode;

    OrderStatus(int orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    public static OrderStatus valueOfOrderStatusCode(int orderStatusCode) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getOrderStatusCode() == orderStatusCode) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }

    public int getOrderStatusCode() {
        return orderStatusCode;
    }
}
