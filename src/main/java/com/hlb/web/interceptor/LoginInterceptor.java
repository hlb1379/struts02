package com.hlb.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by Fly on 2019/3/26.
 */
public class LoginInterceptor extends MethodFilterInterceptor {
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("登录拦截器");

        return actionInvocation.invoke();
    }
}