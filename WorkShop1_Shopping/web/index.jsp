<%-- 
    Document   : product
    Created on : Jun 20, 2019, 3:35:42 PM
    Author     : Quynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <%
        if (session.getAttribute("user") != null) {
            session.setAttribute("check", "OK");
        }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${sessionScope.user.customerName!=null}">
                <h2>You are now loggin as : ${sessionScope.user.customerName} </h2>
            </c:when>
            <c:when test="${sessionScope.user.customerName==null}">
                <h2>You are not loggin</h2>
            </c:when>
        </c:choose>
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
                <c:forEach items="${applicationScope.pList}" var="pList">
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
        <p hidden id="userLoggedInOrNot">${sessionScope.check}</p>

        <a href="shoppingcard.jsp">View Shopping Card</a><P>
            <a id="login" href="login.jsp">Login</a><P>
            <a hidden id="logout" href="ProcessLogout">Logout</a><P>
            <script type="text/javascript">
                var value = document.getElementById("userLoggedInOrNot").innerHTML;
                if (value === "OK") {
                    document.getElementById('login').style.display = "none";
                    document.getElementById('logout').style.display = "block";
                }
            </script>
    </body>
</html>
