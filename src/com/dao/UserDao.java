package com.dao;

import com.entity.User;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<User> selectUser(){
        Session session = this.getSession();
        List list = session.createSQLQuery("SELECT * FROM tb_custom").addEntity(User.class).list();
        return list;
    }
}
