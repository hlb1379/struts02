package com.hlb.web;

import com.hlb.pojo.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Fly on 2019/3/25.
 */
public class Action02 extends ActionSupport implements ModelDriven<User> {
    private User user;
    public String add(){
        System.out.println(user.getAddress()+":"+user.getUsername());
        return Action.SUCCESS;
    }

    @Override
    public void validate() {
        System.out.println("hello validate hehe~");
        String msg = null;
        if (user.getUsername() == null){
            this.addFieldError("username","为什么用户是空的，解释！");
            msg = "用户名为空~";
        }
        if (user.getAddress() == null) {
            this.addFieldError("address","为什么是地址是空的，解释！");
            msg = "地址为空~";
        }

        //如果为空，咱们就要跳转到错误页面去，或者重定向原来的页面

        //如果不为空，或放行--什么都不做


    }

    public void m1(){
        System.out.println("调用到了，呵呵~");
    }


    public User getModel() {
        if (user == null) user = new User();
        return user;
    }
}