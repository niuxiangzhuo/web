package com.entity;

import java.util.Date;

public class Order {
    private String order_id;
    private double oprice;
    private Date otime;
    private int ostatus;
    private User user;

    public Order() {
    }

    public Order(String order_id, double oprice, Date otime, int ostatus, User user) {
        this.order_id = order_id;
        this.oprice = oprice;
        this.otime = otime;
        this.ostatus = ostatus;
        this.user = user;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public int getOstatus() {
        return ostatus;
    }

    public void setOstatus(int ostatus) {
        this.ostatus = ostatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", oprice=" + oprice +
                ", otime=" + otime +
                ", ostatus=" + ostatus +
                ", user=" + user +
                '}';
    }
}
