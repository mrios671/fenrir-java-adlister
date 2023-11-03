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
    <title>Pick a Color</title>
</head>
<body>
    <form action="pickcolor" method="post">
        <label for="color"> Pick your favorite color:
            <select name="color" id="color">
                <option value="black">Black</option>
                <option value="pink">Pink</option>
                <option value="blue">Blue</option>
                <option value="purple">Purple</option>
            </select>
        </label>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
