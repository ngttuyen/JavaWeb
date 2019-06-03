<%@page import="util.StringUtil"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<!-- start the middle column -->

<section>
	<h1>User Login</h1>
	<form action="LoginServlet" method="post">
		<label>Username: </label><input type="text" name="username"><br>
		<label>Password: </label><input type="password" name="password"><br>
		<input type="submit" value="Login">
		<%= StringUtil.getString(request.getAttribute("error-1")) %>
	</form>
</section>	
<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
