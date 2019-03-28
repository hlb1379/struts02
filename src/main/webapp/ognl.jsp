<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    ognl.jsp
<s:debug/>
<p><s:property value="name"/> </p>
<p><s:property value="user"/> </p>
<p><s:property value="user.username"/> </p>
<p><s:property value="user.address"/> </p>


    <%--非根中的内容--%>
<p><s:property value="#request.addr"/> </p>
<p><s:property value="#application.u"/> </p>
<p><s:property value="#application.u.username"/> </p>
<p><s:property value="#application.u.address"/> </p>
<p><s:property value="dname"/> </p>

<h3>调用方法</h3>
<p><s:property value='sayHello("小明")'/></p>
<h3>调用静态方法</h3>
<p><s:property value="@java.util.UUID@randomUUID()"/> </p>
<p><s:property value="@com.opensymphony.xwork2@SUCCESS"/> </p>
<p><s:property value="@com.hlb.web.OgnlAction@sayHi('谭')"/> </p>
<p><s:property value="@com.hlb.web.OgnlAction@msg"/> </p>

<h3>操作数组</h3>
<p><s:property value="names[0]"/> </p>
<p><s:property value="names[1]"/> </p>
<p><s:property value="names[2]"/> </p>

<h3>操作集合</h3>
<p><s:property value="users[0]"/> </p>
<p><s:property value="users[0].username"/> </p>
${users}
</body>
</html>