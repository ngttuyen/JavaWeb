<%@page import="util.StringUtil"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<!-- start the middle column -->

<section>
	<h1>Search Book</h1>
	<form action="BookServlet" method="post">
		<label>Enter Book's ID: </label><input type="text" name="bookID"><br>
		<input type="submit" value="Search">
		<%= StringUtil.getString(request.getAttribute("error-1")) %>
	</form>
	<table border="1">
			<tr>
				<td>Book ID</td>
				<td>Title</td>
				<td>Author</td>
				<td>Category</td>
				<td>Keyword</td>
			</tr>
			<tr>
				<td><%= StringUtil.getString(request.getAttribute("id")) %></td>
				<td><%= StringUtil.getString(request.getAttribute("title")) %></td>
				<td><%= StringUtil.getString(request.getAttribute("author")) %></td>
				<td><%= StringUtil.getString(request.getAttribute("category")) %></td>
				<td><%= StringUtil.getString(request.getAttribute("keyword")) %></td>
			</tr>
		</table>
</section>
<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
