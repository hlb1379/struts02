package com.hlb.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Fly on 2019/3/25.
 */
public class Api01 extends ActionSupport implements ServletRequestAware,ServletResponseAware{

    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private HttpSession session;

    public void m1() throws Exception{
        //req,resp,session
        javax.servlet.http.HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpSession session = request.getSession();
        session.setAttribute("smsg","sessionsession");
        request.getRequestDispatcher("info.jsp").forward(request,response);
        return;
    }
    public String m2() throws Exception{

        Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");

        Map<String, Object> session = ActionContext.getContext().getSession();
        session.put("smsg", "我是session中的值");
        request.put("msg", "我是request域中的值");

        return SUCCESS;
    }
    public String m3() throws Exception{

        session.setAttribute("smsg","sessionsession");
        servletRequest.getRequestDispatcher("info.jsp").forward(servletRequest,servletResponse);
        return SUCCESS;
    }

    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.servletRequest = httpServletRequest;
        this.session = servletRequest.getSession();
    }

    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.servletResponse = httpServletResponse;

    }

}