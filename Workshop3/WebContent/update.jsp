<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UpdateStudentServlet" method="get">
		<label>Name: </label><input type="text" name="name" value="<%=request.getParameter("name")%>"><br>
		<label>Gender:</label> <input type="radio" name="gender">Male<input
			type="radio" name="gender">Female<br> <label>Date:
		</label><input type="date" name="DOB" value="<%=request.getParameter("dob")%>"><br> <input type="submit"
			value="Update">
			<input hidden type="text" name="id" value="${param.id}">
	</form>
${sessionScope}
</body>
</html>