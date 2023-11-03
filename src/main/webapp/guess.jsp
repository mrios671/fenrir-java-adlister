<%--
  Created by IntelliJ IDEA.
  User: milianigiarios
  Date: 11/3/23
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<form action="/guess" method="post">
    <label for="guess">Guess a number between 1 and 3:</label>
    <input type="number" id="guess" name="guess" min="1" max="3" required>
    <button type="submit">Submit</button>
</form>
</body>
</html>
