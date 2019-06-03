<%@page import="util.StringUtil"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<!-- start the middle column -->

<section>
	<form action="DeleteAccount" method="post">
		<input type="password" name="pw"><br>
		<input type="submit" value="Delete">
		<%= StringUtil.getString(request.getAttribute("MSG")) %>
	</form>
</section>
<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
