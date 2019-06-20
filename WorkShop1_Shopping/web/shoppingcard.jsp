<%-- 
    Document   : shoppingcart
    Created on : Jun 20, 2019, 3:54:05 PM
    Author     : Quynh
--%>

<%@page import="model.Product"%>
<%@page import="model.OrderLine"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your shopping card</h1>
        Customer : <select name="select">
            <option></option>
            <option></option>
        </select><br>
        <% 
            for(Product p :OrderLine.getAll()){
                out.print(p.getProductName());
            };
        %>
        Payment method: <input type="text" name="payment"/><br>
        <input type="submit" value="Continue"/>

    </body>
</html>
