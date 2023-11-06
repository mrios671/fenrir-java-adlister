<%--
  Created by IntelliJ IDEA.
  User: milianigiarios
  Date: 11/3/23
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Color</title>
    <style>
        body{
            background-color: <%= request.getAttribute("color")%>;
        }
    </style>
</head>
<body>
    <h1>Welcome to your color page!</h1>
</body>
</html>
