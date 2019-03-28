package com.hlb.web;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Fly on 2019/3/25.
 */
public class Action06 extends ActionSupport {

    private String phone;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    public String m1(){
        System.out.println("大家饿了吗，困了吗");
        return "success" ;
    }
}