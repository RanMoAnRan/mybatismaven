package com.jing.pojo;

/**
 * @Description //TODO 订单详情表
 * @Date 18:31 2019/5/15
 *
 **/
public class Orderdetail {
    
    private Integer id;
    
    private Double totalPrice;
    
    private Integer status;

    //配置Orderdetail和Item一对一的关系
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Orderdetail{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", item=" + item +
                '}';
    }

}
