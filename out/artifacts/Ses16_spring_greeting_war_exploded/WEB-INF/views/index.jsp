<%--
  Created by IntelliJ IDEA.
  User: FPT SHOP
  Date: 5/12/2021
  Time: 12:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post" action="/calculate">
    <input type="text" name="firstOperand">
    <input type="text" name="secondOperand">
    <input type="submit" name="operator" value="Addition">
    <input type="submit" name="operator" value="Subtraction">
    <input type="submit" name="operator" value="Multiplication">
    <input type="submit" name="operator" value="Division">
</form>

</body>
</html>
