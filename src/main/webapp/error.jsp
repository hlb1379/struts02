<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>显示错误信息</h1>
    <c:fielderror fieldName="address"/>
    <c:fielderror fieldName="name"/>

    <c:fielderror fieldName="username"/>
    <c:fielderror fieldName="telphone"/>
    <c:fielderror fieldName="phone"/>
    <c:fielderror/>
</body>
</html>