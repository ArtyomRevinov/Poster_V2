<%--
  Created by IntelliJ IDEA.
  User: EasyWay
  Date: 21.10.2017
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page isErrorPage="true" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>ErrorPage</title>
</head>
<body>
 Request from ${pageContext.errorData.requestURI} is failed
<br/>
Servlet name or type: ${pageContext.errorData.servletName}
<br/>
Status code: ${pageContext.errorData.satusCode}
<br/>
Exception: ${pageContext.errorData.throwable}
</body>
</html>
