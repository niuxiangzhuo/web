package com.entity;

import java.util.HashSet;
import java.util.Set;

public class User {
    private Integer cid;
    private String cname;
    private String pwd;
    private Set<Order> orders = new HashSet<>();

    public User() {
    }

    public User(Integer cid, String cname, String pwd, Set<Order> orders) {
        this.cid = cid;
        this.cname = cname;
        this.pwd = pwd;
        this.orders = orders;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", orders=" + orders +
                '}';
    }
}
