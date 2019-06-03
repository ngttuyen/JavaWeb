<%@page import="model.StudentList"%>
<%@page import="util.StringUtil"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<!-- start the middle column -->
<section>
	<form action="searchServlet" method="get">
		<label>Student Name or ID:</label><input type="text" name="search"><input
			type="submit" value="search"><br>
	</form>
	<h1>Student List</h1>

	<%=StringUtil.getString(request.getAttribute("ID"))%>
	<%=StringUtil.getString(request.getAttribute("Name"))%>
	<%=StringUtil.getString(request.getAttribute("Gender"))%>
	<%=StringUtil.getString(request.getAttribute("dob"))%>


</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
