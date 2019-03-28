package com.hlb.web;

import org.apache.struts2.ServletActionContext;

/**
 * Created by Fly on 2019/3/26.
 */
public class DisptcherAction {
    public String toJsp(){
        System.out.println("toJsp");
        ServletActionContext.getRequest().setAttribute("msg","hello lily");
        return "success";
    }
}