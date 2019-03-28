package com.hlb.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by Fly on 2019/3/26.
 */
public class MyInterceptor extends AbstractInterceptor{


    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截器01"); //获取请求路径，看是不是调用的login方法

        return actionInvocation.invoke();
    }
}