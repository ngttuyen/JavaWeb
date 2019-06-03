<%@page import="util.StringUtil"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<!-- start the middle column -->

<section>
	<h1>Update Information</h1>
	<form action="UpdateInfo" method="post">
		<label>User ID: </label><input type="text" name="userID"><br>
		<label>Full Name: </label><input type="text" name="fullName"><br>
		<label>Email: </label><input type="text" name="email"><br>
		<input type="submit" value="Ok">
		<%= StringUtil.getString(request.getAttribute("error-1")) %>
	</form>
</section>	
<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
