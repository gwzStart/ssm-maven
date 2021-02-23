<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/31
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>>" />
</head>
<body>
<div align="center">
    <form action="bank/addBank.do" method="post">
        <table>
            <tr>
                <td>name</td>
                <td><input name="name" type="text"></td>
            </tr>
            <tr>
                <td>balance</td>
                <td><input name="balance" type="text"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
                <td><input type="reset"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
