<%-- 
    Document   : productdetails
    Created on : Jun 12, 2019, 9:34:50 PM
    Author     : Do Duong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>  
<jsp:useBean id="course" class="model.Course" scope="session"/>
<jsp:setProperty property="*" name="course" />
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Details</title>
    </head>
    <body>
        <form action="ProcessInsert" method="post">
            <label>Course ID:</label>
            <jsp:getProperty property="courseID" name="course"/>
            <br/>
            <label>Course Name:</label>
            <jsp:getProperty property="courseName" name="course"/>
            <br/>
            <label>Lecture:  </label>
            <jsp:getProperty property="lecture" name="course"/>
            <br/>
            <label>Room:  </label>
            <jsp:getProperty property="lecture" name="course"/>
            <br/>
            <hr>
            <input type="submit" value="ADD">
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
