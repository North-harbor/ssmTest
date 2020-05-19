<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2020/5/19
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>商品名</th>
            <th>商品价格</th>
            <th>商品日期</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${goodsList}" var="good">
            <tr>
                <td>${good.name}</td>
                <td>${good.price}</td>
                <td>
                    <fmt:formatDate value="${good.time}" pattern="yyyy-MM-dd"/>
                </td>
                <td><a href="./deleteByIds?id=${good.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
