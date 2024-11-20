package com.example.kafkademo.order;

public class ElectronicOrder {
    private String orderId;
    private String electronicId;
    private String userId;
    private double price;
    private long time;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getElectronicId() {
        return electronicId;
    }

    public void setElectronicId(String electronicId) {
        this.electronicId = electronicId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
