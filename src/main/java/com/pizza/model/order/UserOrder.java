package com.pizza.model.order;

import java.io.Serializable;

public class UserOrder {

    private String time;
    private String content;
    private String address;

    public UserOrder(String time, String content, String address) {
        this.time = time;
        this.content = content;
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
