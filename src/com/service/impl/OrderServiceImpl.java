package com.service.impl;

import com.dao.OrderDao;
import com.service.OrderService;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    @Override
    public void selectOrder() {
        orderDao.selectOrder();
    }
}
