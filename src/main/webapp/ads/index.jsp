<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: milianigiarios
  Date: 11/6/23
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
    <h1>Here are all yor ads!</h1>

    <c:forEach var="ads" items="${ads}">
        <div class="ads">
            <h2>${ads.title}</h2>
            <p>${ads.description}</p>
        </div>
    </c:forEach>
</body>
</html>
