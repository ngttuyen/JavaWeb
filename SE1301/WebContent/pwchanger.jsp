<%@page import="util.StringUtil"%>
<%@page import="dao.UserDAO"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<!-- start the middle column -->

<section>
	<form action="PasswordServlet" method="post">
	<label>New Password: </label><input type="password" name="newpw"><input type="submit" value="OK"><br>
	<%= StringUtil.getString(request.getAttribute("errorpw")) %>
	</form>
</section>
<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
