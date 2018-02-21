<%--
  Created by IntelliJ IDEA.
  User: EasyWay
  Date: 24.10.2017
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>

<body>
<form action="/controller?command=register" method="post" >
    Имя:<input required type="text" name="name"><br>
    <br>
    Email:<input required type="email" name="newemail"><br>
    <br>
    Пароль:<input required type="password" name="newpwd"><br>
    <br>
<input type="submit" value="OK" name="register">
</form>

</body>
</html>
