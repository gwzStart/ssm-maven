<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/30
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<div align="center">
    <p>SSM整合例子</p>

    <table>
        <tr>
            <td><a href="addBank.jsp">添加用户</a></td>
        </tr>
        <tr>
            <td><a href="queryBanks.jsp">查询用户</a></td>
        </tr>
    </table>

    <img src="static/images/mouse.jpg">
</div>

</body>
</html>
