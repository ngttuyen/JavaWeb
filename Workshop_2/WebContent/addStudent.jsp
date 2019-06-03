<%@page import="util.StringUtil"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<!-- start the middle column -->

<section>
	<h1>Add new Student</h1>
	<form action="addStudentServlet" method="post">
		<label>ID</label><input type="text" name="id" /><br> <label>Name</label><input
			type="text" name="name" /><br> <label>Date of birth</label><input
			type="date" name="dob" /><br> <label>Gender</label> <input
			type="radio" name="gender" value="male" checked> Male <input
			type="radio" name="gender" value="female"> Female<br> <input
			type="submit" value="Add" />
	</form>
	<%= StringUtil.getString(request.getAttribute("MSG")) %>
</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
