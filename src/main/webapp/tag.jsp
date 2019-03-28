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
    <h1>控制标签</h1>
    <p>====================if=====================</p>
    <s:if test="%{false}">
        <div>Will Not Be Executed1</div>
    </s:if>
    <s:else>
        <div>Will Not Be Executed2</div>
    </s:else>

    <h2>循环标签</h2>
    <p>==============iterator===========</p>
    <s:iterator value="%{users}" var="user">
        <li><s:property /></li>
    </s:iterator>
    <s:iterator value="%{users}" var="user">
        <li><s:property value="#user.username"/></li>
    </s:iterator>
    <s:iterator value="{'窗帘','闪闪','也也'}" >
        <li><s:property /></li>
    </s:iterator>
    <s:iterator value="#{'name':'闪闪','content':'你好'}" var="u">
        <li><s:property value="value"/></li>
    </s:iterator>

    <s:debug/>

    <h1>数据标签</h1>
    <%--<s:date name="birthday" format="dd/MM/yyyy" />
    <s:date name="birthday" format="%{getText('some.i18n.key')}" />
    <s:date name="birthday" nice="true" />--%>
    <s:date name="birthday" format="yyyy年MM号dd日"/>
    <s:date name="birthday" nice="true"/>
<h1>引入页面</h1>
<s:include value="upload.jsp"/>
</body>
</html>