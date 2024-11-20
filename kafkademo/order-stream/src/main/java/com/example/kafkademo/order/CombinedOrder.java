package com.example.kafkademo.order;

public class CombinedOrder {

    private String electronicOrderId;
    private String applianceOrderId;
    private String applianceId;
    private String userName;
    private long time;

    public CombinedOrder() {
    }

    public CombinedOrder(long time, String applianceId, String applianceOrderId, String electronicOrderId) {
        this.time = time;
        this.applianceId = applianceId;
        this.applianceOrderId = applianceOrderId;
        this.electronicOrderId = electronicOrderId;
    }

    public String getElectronicOrderId() {
        return electronicOrderId;
    }

    public void setElectronicOrderId(String electronicOrderId) {
        this.electronicOrderId = electronicOrderId;
    }

    public String getApplianceOrderId() {
        return applianceOrderId;
    }

    public void setApplianceOrderId(String applianceOrderId) {
        this.applianceOrderId = applianceOrderId;
    }

    public String getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(String applianceId) {
        this.applianceId = applianceId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CombinedOrder{" +
                "electronicOrderId='" + electronicOrderId + '\'' +
                ", applianceOrderId='" + applianceOrderId + '\'' +
                ", applianceId='" + applianceId + '\'' +
                ", userName='" + userName + '\'' +
                ", time=" + time +
                '}';
    }
}
