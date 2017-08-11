package com.hg.entity;

/**
 * Created by sstl on 2017/8/11.
 */
public class OrderInfo {

    private Integer id;
    private String orderid;
    private UserInfo user;
    private ProductionInfo pro;
    private Integer quantity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public ProductionInfo getPro() {
        return pro;
    }

    public void setPro(ProductionInfo pro) {
        this.pro = pro;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
