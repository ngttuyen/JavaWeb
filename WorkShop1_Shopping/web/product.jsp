<%-- 
    Document   : product
    Created on : Jun 20, 2019, 3:35:42 PM
    Author     : Quynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Select thing to buy</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.pList}" var="pList">
                    <tr>
                        <td>${pList.productID}</td>
                        <td>${pList.productName}</td>
                        <td>${pList.productPrice}</td>
                        <td>
                            <form action="ProcessBuy" method="post">
                                <input hidden type="text" name="item" value="${pList.productID}"/>
                                <input type="submit" value="Buy"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="shoppingcard.jsp">View Shopping Card</a>

    </body>
</html>
