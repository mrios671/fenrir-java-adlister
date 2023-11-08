<%--lets intellij know that this is going to be an html page--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

=======
>>>>>>> mvc-exercise
<html>
<<<<<<< HEAD:src/main/webapp/login.jsp
<body>
<<<<<<< HEAD
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


=======
    <jsp:include page="partials/navbar.jsp" />
=======
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
>>>>>>> sessions-and-cookies-exercise:src/main/webapp/WEB-INF/login.jsp
    <div class="container">
        <h1>Please Log In</h1>
        <form action="/login" method="POST">
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Log In">
        </form>
    </div>
>>>>>>> mvc-exercise
</body>
</html>