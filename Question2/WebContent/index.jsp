<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		
		<form action="CalServlet" method="GET">
		<table>
			<tr>
				<td>First: </td>
				<td><input type="text" name="first" value=${ first }> </td>
			</tr>
			<tr>
				<td>Second: </td>
				<td><input type="text" name="second" value=${ second }> </td>
			</tr>
			<tr>
				<td>Operator: </td>
				<td><select name="operator">
					<option value="+">+</option>
					<option value="-">-</option>
					<option value="*">*</option>
					<option value="/">/</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Result:</td>
				<td><input type="text" name="result" value=${ result }></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Compute"/></td>
			</tr>
		</table>
		</form>
		 
	
</body>
</html>