package com.hlb.web;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Fly on 2019/3/25.
 */
public class Action05 extends ActionSupport {
    private String name;
    private int age;
    private String addr;

    private String email;
    private String telphone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String m1(){
        System.out.println("大家饿了吗，困了吗");
        return "success";
    }
}