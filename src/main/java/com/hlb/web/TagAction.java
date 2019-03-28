package com.hlb.web;

import com.hlb.pojo.User;
import com.opensymphony.xwork2.ActionSupport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Fly on 2019/3/27.
 */
public class TagAction extends ActionSupport  {

    private List<User> users;
    private Date birthday;

    public Date getBirthday() throws ParseException {

        return new SimpleDateFormat("yyyy-MM-dd").parse("2018-10-10");
    }

    public List<User> getUsers() {
        return users;
    }

    public String execute(){

        users = new ArrayList<User>();
        users.add(new User("妖姬","东北角"));
        users.add(new User("东北角","万万"));
        return SUCCESS;
    }

}