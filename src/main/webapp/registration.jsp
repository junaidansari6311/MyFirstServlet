<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration</title>
</head>
<body>
<form action="registrationServlet" method="post">
        <table border="1" width="30%" cellpadding="5">
            <thead>
            <tr>
                <th colspan="2">Enter Information Here</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>User Name:</td>
                <td><input type="text" name="username" value="" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" value="" /></td>
            </tr>
            <tr>
                <td>Mobile Number:</td>
                <td><input type="text" name="mobileNo" value="" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" value="" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register" /></td>
            </tr>
            <tr>
                <td colspan="2">Already registered!! <a href="login.html">Login Here</a></td>
            </tr>
            </tbody>
        </table>
</form>
</body>
</html>