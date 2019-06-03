<%@page import="util.StringUtil"%>
<%@page import="dao.UserDAO"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<!-- start the middle column -->

<section>
	<h1><%= StringUtil.getString(request.getAttribute("error")) %></h1>
	<a href="pwchanger.jsp">Change Password</a><br>
	<a href="deleteAcc.jsp">Delete Account</a><br>
</section>
<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
