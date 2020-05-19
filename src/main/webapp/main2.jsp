<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2020/5/18
  Time: 8:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="./addOrUpdate" method="post">
        <input type="hidden" name="sid" value="${user.id}">
        <input type="text" placeholder="用户名" name="stuName" value="${user.stuName}">
        <input type="text" placeholder="用户年龄" name="stuAge" value="${user.stuAge}">
        <input type="submit">
    </form>
</body>
</html>
