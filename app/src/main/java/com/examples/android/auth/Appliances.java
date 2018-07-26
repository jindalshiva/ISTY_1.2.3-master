package com.examples.android.auth;

public class Appliances {
    private String userId;
    private String itemName;
    private String type;
    private String status;
    private String schedule;

    public Appliances(){

    }

    public Appliances(String userId, String itemName, String type, String status, String schedule) {
        this.userId = userId;
        this.itemName = itemName;
        this.type = type;
        this.status = status;
        this.schedule = schedule;

    }

    public String getUserId() {
        return userId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getSchedule() {
        return schedule;
    }
}
