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
        <%
            if (session.getAttribute("user") != null) {
                response.sendRedirect("product.jsp");
            }
        %>
        <h1>Welcome to my shop</h1>
        <form action="ProcessProduct" method="post">
            Customer ID: <input type="text" name="username"/>
            Password: <input type="password" name="password"/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
