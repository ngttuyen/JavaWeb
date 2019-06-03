<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.Student"%>
<%@page import="dao.StudentDAO"%>
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
			for (Student st : StudentDAO.getListStudent()) {
				out.print("<tr>\n" + "            <th scope=\"row\">" + st.getId() + "</th>\n" + "<td>"
						+ st.getName() + "</td>\n" + "            <td>" + (st.isGender() ? "Male" : "Female")
						+ "</td>\n" + "            <td>" + st.getDob() + "</td>\n"
						+ "            <td><a href='update.jsp?id="+st.getId()+"&name="+st.getName()+"&dob="+st.getDob()+"'>Update</a></td>\n"
						+ "            <td><a href='DeleteStudentServlet?id="+st.getId()+"'>Delete</a></td>\n" 
						+ "</tr>");
			}
		%>
		
	</table>
	<a href="create.jsp">Create</a>
 </body>
</html>