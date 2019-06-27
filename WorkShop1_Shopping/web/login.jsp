<%-- 
    Document   : login
    Created on : Jun 23, 2019, 10:22:04 PM
    Author     : Quynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="ProcessLogin" method="post">
            <table>
                <tr>
                    <td>Username: </td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"></td>
                <tr>
            </table>
            ${requestScope.error}

        </form>
    </body>
</html>
