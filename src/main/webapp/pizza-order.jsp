<%--
  Created by IntelliJ IDEA.
  User: milianigiarios
  Date: 11/3/23
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%--A user goes to /pizza-order and sees a pizza order form. This form features choices to select the crust type, sauce type, size type (use select inputs), toppings (checkboxes), and delivery address (text input). Use System.out.println to output the values submitted by the user.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pizza order form</title>
</head>
<body>
    <form action="/pizza-order" method="POST">
        <label for="crust">Choose a Crust: </label>
        <select id="crust" name="crust">
            <option value="traditional">Traditional</option>
            <option value="thin">Thin</option>
            <option value="deep_dish">Deep Dish</option>
            <option value="homestyle">Homestyle</option>
        </select>
        <br>
        <label for="sauce">Choose a sauce: </label>
        <select id="sauce" name="sauce">
            <option value="marinara">Marinara</option>
            <option value="alfredo">Alfredo</option>
            <option value="pesto">Pesto</option>
            <option value="spicy">Spicy Red Tomato</option>
        </select>
        <br>
        <label for="size">Choose a Size: </label>
        <select id="size" name="size">
            <option value="small">Small 10"</option>
            <option value="medium">Medium 12"</option>
            <option value="large">Large 16"</option>
            <option value="xl">Extra Large 18"</option>
        </select>
        <br>
        <label for="toppings">Toppings:</label><br>
        <input type="checkbox" id="toppings" name="toppings" value="pepperoni">
        <label for="pepperoni">Pepperoni</label><br>
        <input type="checkbox" id="toppings" name="toppings" value="mushrooms">
        <label for="basil">Basil</label><br>
        <input type="checkbox" id="toppings" name="toppings" value="olives">
        <label for="mozzarella">Mozzarella</label><br>

        <label for="address">Please enter your delivery address</label>
        <input type="text" id="address" name="address"><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
