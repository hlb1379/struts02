<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <form action="toat_batch_add.action" method="post">
        <p>
            客户一：<input name="userList[0].username" placeholder="名字"/>
            <input name="userList[0].address" placeholder="地址"/>
        </p>
        <p>
            客户二：<input name="userList[0].username" placeholder="名字"/>
            <input name="userList[0].address" placeholder="地址"/>
        </p>
        <p>
            客户三：<input name="userList[0].username" placeholder="名字"/>
            <input name="userList[0].address" placeholder="地址"/>
        </p>
        <input type="submit" value="走你">
        <p>${sessionScope.smsg}</p>
        <p>${requestScope.msg}</p>
    </form>
</body>
</html>