<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07-04-2020
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Login Success Page</title>
</head>
<body>
<h1> Hi <%= request.getAttribute("user") %> , Login Successful.</h1>
<a href="login.html">Login Page</a>
</body>
</html>
