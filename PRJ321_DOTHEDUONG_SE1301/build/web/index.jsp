<%@page import="java.util.ArrayList"%>
<%@page import="model.CourseDAO"%>
<%@page import="model.Course"%>
<%@page errorPage="error.jsp" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>Course List</h1>
        <table border="1">
            <thead>
                <tr>
                    <td>Course ID</td>
                    <td>Course Name</td>
                    <td>Lecture</td>
                    <td>Room</td>
                </tr>
            </thead>
            <tbody>
                <%
                    ArrayList<Course> list = CourseDAO.getAll();
                    for (Course c : list) {
                        out.print("<tr>"
                                + "<td>" + c.getCourseID() + "</td>"
                                + "<td>" + c.getCourseName() + "</td>"
                                + "<td>" + c.getLecture() + "</td>"
                                + "<td>" + c.getRoom() + "</td>"
                                + "</tr>"
                        );
                    }
                %>
            </tbody>
        </table>
        <br>
        <button onclick="window.location.href = 'course.jsp';">Add
            Course</button>
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