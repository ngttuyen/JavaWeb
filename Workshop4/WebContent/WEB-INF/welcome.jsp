<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
	
	<%
		out.print("<h1>Hello " + session.getAttribute("message") + "!</h1>");
	%>
	<%
		if (session.getAttribute("user") != null) {
	%>
	<a href="LogoutServlet">Log out</a>
	<%
		}
	%>
	
</body>
</html>