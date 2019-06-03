<%@page import="dao.StudentDAO"%>
<%@page import="model.Student"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Gender</td>
			<td>DOB</td>
		</tr>
		<%
			StudentDAO s = (StudentDAO) request.getServletContext().getAttribute("StudentList");
			for (Student st : s.getListStudent()) {
				out.print("<tr>\n" + "            <th scope=\"row\">" + st.getId() + "</th>\n" + "<td>"
						+ st.getName() + "</td>\n" + "            <td>" + (st.isGender() ? "Male" : "Female")
						+ "</td>\n" + "            <td>" + st.getDob() + "</td>\n"
						+ "            <td><a href='create.jsp'>Update</a></td>\n"
						+ "            <td><a href='DeleteStudentServlet'>Delete</a></td>\n" 
						+ "</tr>");
			}
		%>
	</table>
</body>
</html>