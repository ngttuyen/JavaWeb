<%-- 
    Document   : newjsp
    Created on : Jun 23, 2019, 9:18:59 AM
    Author     : Quynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>JSP-Servlet Upload file</title>
</head>
<body>
  <h2>Demo JSP-Servlet Upload File</h2>
  <form method="post" action="UploadFileServlet" enctype="multipart/form-data">
    Select file to upload: <input type="file" name="file" size="60" /><br /><br /> 
    <input type="submit" value="Upload" />
  </form>
</body>
</html>
