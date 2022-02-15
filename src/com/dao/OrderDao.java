package com.dao;

import com.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class OrderDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void selectOrder(){
        List list = this.getSession().createSQLQuery("select * from tb_order").addEntity(Order.class).list();
        list.forEach(order -> {
            System.out.println(order);
        });
    }
}
