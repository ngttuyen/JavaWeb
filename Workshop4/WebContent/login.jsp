<%@page import="util.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if(session.getAttribute("message")!=null){
			request.getRequestDispatcher("WelcomeServlet").forward(request, response);
		}
	%>
	<form action="LoginServlet" method="post">
		<table>
			<tr>
				<td><label>Username : </label></td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><label>Password : </label></td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="remember">Remember Me</td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
	${sessionScope.message}
</body>
</html>