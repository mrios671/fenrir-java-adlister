<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/index.jsp">Home</a>
            <a class="navbar-brand" href="/ads">Adlister</a>
            <a class="navbar-brand" href="/favorite-color">Color</a>
        </div>
        <ul class="nav navbar-nav navbar-right">

            <c:choose>
                <c:when test="${empty sessionScope.user}">
                    <li><a href="/login">Login</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="/logout">Logout</a></li>
                    <li><a href="/profile">Profile</a></li>
                </c:otherwise>
            </c:choose>


        </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
