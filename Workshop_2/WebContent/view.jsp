<%@page import="model.StudentList"%>
<%@page import="util.StringUtil"%>
<%@page import="model.Student"%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/header.jsp"%>
<%@ include file="/includes/column_left_home.jsp"%>

<section>
	<h1>Student View</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Full Name</th>
				<th scope="col">Gender</th>
				<th scope="col">Date Of Birth</th>
			</tr>
		</thead>
		<tbody>
			<%
            StudentList sList = (StudentList) request.getServletContext().getAttribute("SLIST");
            for (Student student : sList.getAll()) {
                out.print("<tr>\n" +
                        "            <th scope=\"row\">" + student.getId() + "</th>\n" +
                        "            <td>" + student.getName() + "</td>\n" +
                        "            <td>" + (student.isGender() ? "Male" : "Female") + "</td>\n" +
                        "            <td>" +  student.getDob() + "</td>\n" +
                        "            <td></td>\n" +
                        "        </tr>");
            } 
                       
        %>
		</tbody>
	</table>
</section>
<%@ include file="/includes/column_right_news.jsp"%>
<%@ include file="/includes/footer.jsp"%>
