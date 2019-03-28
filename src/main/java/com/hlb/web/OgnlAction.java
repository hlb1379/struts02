package com.hlb.web;

import com.hlb.pojo.Dog;
import com.hlb.pojo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fly on 2019/3/26.
 */
public class OgnlAction extends ActionSupport {

    private  String name;
    private User user;
    private String[] names;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public String[] getNames() {
        return names;
    }

    public static String msg = "我爱你";

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute(){
        user = new User();
        user.setUsername("白板");
        user.setAddress("麻将桌");
        System.out.println("hello world");
        ServletActionContext.getRequest().setAttribute("addr","南京");
        ServletActionContext.getServletContext().setAttribute("u",user);
        name = "张无忌";

        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Dog dog = new Dog();
        dog.setDname("小可爱");
        valueStack.push(dog);

        names = new String[]{"悟空", "小牛", "珊儿"};
        users = new ArrayList<User>();
        users.add(new User("妖姬","东北角"));
        users.add(new User("东北角","万万"));

        return SUCCESS;
    }

    public String sayHello(String name) {
        return "hello"+name;
    }

    public static String sayHi(String name) {
        System.out.println("hi--"+name);
        return "hi---"+name;
    }
}