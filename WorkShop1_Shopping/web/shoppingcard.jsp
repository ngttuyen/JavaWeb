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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your shopping card</h1>
        Customer : <select name="select">
            <option></option>
            <option></option>
        </select><br>
        <table border="1">
            <c:forEach items="${requestScope.List}" var="List">
                <tr>
                    <td>${List.key}</td>
                    <td>${List.value}</td>
                </tr>
            </c:forEach>
            <%
                //HashMap<String, OrderLine> buyerList = (HashMap) ;
//                for (String name : buyerList.keySet()) {
//                    out.print(name + buyerList.get(name).getQuantity() + buyerList.get(name).getPrice());
//                }
                out.print(request.getAttribute("List"));
            %>
            Payment method: <input type="text" name="payment"/><br>
            <input type="submit" value="Continue"/>
        </table>
    </body>
</html>
