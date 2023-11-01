<%--lets intellij know that this is going to be an html page--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h1>Log In</h1>
<form method="post" action="login.jsp">
    <label for="username">Username</label>
    <input type="text" id="username" name="username" placeholder="Enter your username">
    <label for="password">Password</label>
    <input type="text" id="password" name="password" placeholder="Enter your password">

    <button type="submit">Submit</button>
</form>
<% String username = request.getParameter("username");%>
<% String password = request.getParameter("password");%>
<c:choose>
    <c:when test='${param.username.equals("admin") && param.password.equals("password")}'>
        <%response.sendRedirect("/profile.jsp");%>
    </c:when>
<%--    <c:when test='${}'>--%>
<%--        <%response.sendRedirect("/profile.jsp");%>--%>
<%--    </c:when>--%>
<%--    <c:otherwise>--%>
<%--        <%response.sendRedirect("/login.jsp");%>--%>
<%--    </c:otherwise>--%>
</c:choose>


</body>
</html>