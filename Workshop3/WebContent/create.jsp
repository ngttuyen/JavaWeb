<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CreateStudentServlet" method="post">
	<label>Name: </label><input type="text" name="name"><br>
	<label>Gender:</label> <input type="radio" name="gender">Male<input type="radio" name="gender">Female<br>
	<label>Date: </label><input type="date" name="DOB"><br>
	<input type="submit" value="Create">
	</form>
</body>
</html>