<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <form action="uploadAction.action" method="post" enctype="multipart/form-data">
        <p><input type="file" name="img01"/></p>
        <p><input type="submit" value="上传"/></p>
    </form>
</body>
</html>