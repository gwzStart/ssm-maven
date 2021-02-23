<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/31
  Time: 11:22
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
    <base href="<%=basePath%>>"/>

    <script type="text/javascript" src="static/js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function () {
            loadBank()
            $("#btnLoad").click(function () {
                loadBank()
            })
        })
        function loadBank() {
            $.ajax({
                url: "queryBanks.do",
                type: "get",
                dataType: "json",
                success: function (data) {
                    //清除旧数据
                    $("#info").html("")
                    $.each(data, function (index, value) {
                        $("#info").append("<tr>")
                            .append("<td>" + value.id + "</td>")
                            .append("<td>" + value.name + "</td>")
                            .append("<td>" + value.balance + "</td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
<div align="center">

    <table border="1px">
        <thead>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>余额</th>
        </tr>
        </thead>
        <tbody id="info">

        </tbody>
    </table>
    <input type="button" value="查询用户" id="btnLoad">
</div>

</body>
</html>
