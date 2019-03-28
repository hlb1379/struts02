<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<span>The following action tag will execute result and include it in this page</span>
<br>
<s:action name="actionTagAction" executeResult="true" />
<br>
<span>The following action tag will do the same as above, but invokes method specialMethod in action</span>
<br>
<s:action name="actionTagAction!specialMethod" executeResult="true" />
<br>
<span>The following action tag will not execute result, but put a String in request scope
       under an id "stringByAction" which will be retrieved using property tag</span>
<s:action name="actionTagAction!doDefault" executeResult="false" />
<s:property value="#attr.stringByAction" />
</body>
</html>