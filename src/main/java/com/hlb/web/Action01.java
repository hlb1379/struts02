package com.hlb.web;

import com.opensymphony.xwork2.Action;

import java.util.Date;

/**
 * Created by Fly on 2019/3/25.
 */
public class Action01 {
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String add(){
        System.out.println(birthday);
        System.out.println("hello_"+name);
        return Action.SUCCESS;
    }
}