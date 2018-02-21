<%--
  Created by IntelliJ IDEA.
  User: EasyWay
  Date: 24.10.2017
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form name="loginForm" method="POST" action="/controller?command=login">
    <input type="hidden" name="command" value="login" />
    Login:<br/> <input required type="email" name="login" value=""/>
    <br/>
    Password:<br/> <input required type="password" name="password" value=""/>
    <br/>
        ${errorLoginPassMessage}
    <br/>
        ${wrongAction}
    <br/>
     ${nullPage}
    <br/>
    <input type="submit" value="Log in"/> </form><hr/>
</body>
</html>
