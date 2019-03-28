package com.hlb.web;

import org.apache.struts2.ServletActionContext;

/**
 * Created by Fly on 2019/3/26.
 */
public class DpAction {
    public String toJsp(){
        Object msg = ServletActionContext.getRequest().getAttribute("msg");
        System.out.println(msg);
        return "success";
    }
}