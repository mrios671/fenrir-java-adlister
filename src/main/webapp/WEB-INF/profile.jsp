<<<<<<< HEAD:src/main/webapp/profile.jsp
<h1>Profile</h1>
<p>Welcome to your Profile!</p>

=======
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome to your profile!</h1>
    </div>
<%--    <a href="/login">Logout</a>--%>

</body>
</html>
>>>>>>> sessions-and-cookies-exercise:src/main/webapp/WEB-INF/profile.jsp
