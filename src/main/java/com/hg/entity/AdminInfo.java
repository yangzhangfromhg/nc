package com.hg.entity;

import java.io.Serializable;

/**
 * Created by sstl on 2017/8/11.
 */
public class AdminInfo implements Serializable{

    private Integer id;
    private String adminid;
    private String name;
    private String pass;
    private String phone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString(){
        return this.getClass().getName() + "@[ " + getId() + " , "
                                                 + getAdminid() + " , "
                                                 + getName() + " , "
                                                 + getPass() + " , "
                                                 + getPhone() + " ] ";
    }
}
