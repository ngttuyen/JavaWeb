<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page errorPage="error.jsp" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <form action="coursedetails.jsp">
            <table>
                <tr>
                    <td>Course ID: </td>
                    <td><input type="text" name="courseID"/></td>
                </tr>
                <tr>
                    <td>Course Name: </td>
                    <td><input type="text" name="courseName"/></td>
                </tr>
                <tr>
                    <td>Lecture:  </td>
                    <td><input type="text" name="lecture"/></td>
                </tr>
                <tr>
                    <td>Room: </td>
                    <td><input type="text" name="room"/></td>
                </tr>
            </table><br>
            <input type="submit" value="Add">
        </form>
            <%
                Integer counter = (Integer) application.getAttribute("counter");
                if (counter == null || counter == 0) {
                    counter = 1;
                } else {
                    counter++;
                }
                application.setAttribute("counter", counter);
                out.println("Counter "+counter);
            %>
    </body>
</html>