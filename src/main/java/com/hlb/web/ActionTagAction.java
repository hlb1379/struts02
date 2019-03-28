package com.hlb.web;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

/**
 * Created by Fly on 2019/3/27.
 */
public class ActionTagAction extends ActionSupport {

    public String execute() throws Exception{
        return "done";
    }

    public String doDefault() throws  Exception{
        ServletActionContext.getRequest().setAttribute("stringByAction",
                "This is a String put in by the action's doDefault");
        return "done";
    }
}