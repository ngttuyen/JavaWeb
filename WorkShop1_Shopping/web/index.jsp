<%-- 
    Document   : index
    Created on : Jun 20, 2019, 3:28:26 PM
    Author     : Quynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to my shop</h1>
        <form action="ProcessProduct" method="post">
            <table>
                <tr>
                    <td>CustomerID :</td>
                    <td><input type="text" name="username"/><br></td>
                </tr>
                <tr>
                    <td>Password :</td>
                    <td><input type="text" name="username"/><br></td>
                </tr>
            </table>
            <input type="submit" value="Continue"/>
        </form>
        <p style="font-style: italic">Note : CustomerID and Password : 1234</p>
    </body>
</html>
