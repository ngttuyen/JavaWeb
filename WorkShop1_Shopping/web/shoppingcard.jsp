<%-- 
    Document   : shoppingcart
    Created on : Jun 20, 2019, 3:54:05 PM
    Author     : Quynh
--%>

<%@page import="java.util.HashMap"%>
<%@page import="model.Product"%>
<%@page import="model.OrderLine"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping card</title>
    </head>
    <body>

        <form action="ProcessCheckout" method="post">
            <h1>Your shopping card</h1><P>
                ${sessionScope.m.customerID}
            <table border="1">
                <thead>
                    <tr>
                        <th>Product</th>
                        <th>Quantity</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <c:forEach items="${sessionScope.List}" var="List">
                    <tr>
                        <td>${List.key}</td>
                        <td>${List.value.quantity}</td>
                        <td>${List.value.price}</td>
                    </tr>
                </c:forEach>
            </table><P>
            <p>Total: ${sessionScope.total}</p><P>
                Payment method: <input type="text" name="payment"/><br><P>               
                <input type="submit" value="Continue"/>
        </form>
    </body>
</html>
