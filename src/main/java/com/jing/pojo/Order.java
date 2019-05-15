package com.jing.pojo;


import java.util.List;

/**
 * 订单表
 * 
 */
public class Order {

    private Integer id;

    private String orderNumber;
    //配置Order和User一对一的关系
    private User user;
    //配置Order和Orderdetail一对多的关系
    private List<Orderdetail> orderdetails;


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", user=" + user +
                ", orderdetails=" + orderdetails +
                '}';
    }

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
