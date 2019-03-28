package com.hlb.web;

import com.hlb.pojo.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Fly on 2019/3/25.
 */
public class Action04 {
    private List<User> userList;
    private Date birthday;

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String btadd(){
        /*for (User user : userList) {
            System.out.println(user);
        }*/
        System.out.println(birthday);
        return "success";
    }
}