package com.hlb.web;

/**
 * Created by Fly on 2019/3/26.
 */
public class ActionInter {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void m1(){
        System.out.println("------>"+name);
    }

    public void login(){
        System.out.println("登录");
    }
}

