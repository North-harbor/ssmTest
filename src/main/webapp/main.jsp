<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2020/5/14
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="get" action="findByName">
<table>
    <a href="add.jsp">新增</a><br/>
    <input placeholder="请输入姓名" name="stuName">
    <input type="submit">
    <tr>
        <th>用户编号</th>
        <th>用户名</th>
        <th>用户年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.stuName}</td>
            <td>${user.stuAge}</td>
            <td>
                <a href="./deleteById?id=${user.id}">删除</a>
                <a href="./selectById?id=${user.id}">修改</a>
            </td>
        </tr>
    </c:forEach>

</table>
</form>
</body>
</html>
