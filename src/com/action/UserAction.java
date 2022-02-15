package com.action;

import com.service.OrderService;
import com.service.UserService;

public class UserAction {
    private UserService userService;
    private OrderService orderService;
    private String userName;
    private String pwd;



    public void selectOrder() {
        orderService.selectOrder();
    }
    public void selectUser() {
        userService.selectUser();
    }
//    public String getLogin(){
//        return
//    }




    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
