<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/includes/head.jsp"%>
<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<div id="logo_text">
					<!-- class="logo_colour", allows you to change the colour of the text -->
					<h1>
						<a href="index.jsp">doduong<span class="logo_colour">bookStore</span></a>
					</h1>
					<h2>Bring knowledge around the world.</h2>
				</div>
			</div>
			<div id="menubar">
				<ul id="menu">
					<!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
					<li class="selected"><a href="UserHome">Home</a></li>
					<li><a href="UserProfile">Profile</a></li>
					<li><a href="UserCart">My Cart</a></li>
					<li><a href="UserBook">Book List</a></li>
					<li><a href="ProcessLogout"
						style="text-decoration-line: underline; text-decoration-style: solid;: ">Logout</a></li>
				</ul>
				<form method="get" action="" id="searchForm">
					<input type="text" name="search" id="search-input"
						class="styled-input">
					<button class="button">Search</button>
				</form>
			</div>
		</div>
		<div id="site_content">
			<%@ include file="user-info/user-sidebar.jsp"%>
			<div id="content">
				<!-- -------------------------your code here---------------------- --->









				<!-- -------------------------your code here---------------------- --->
			</div>
		</div>
		<div id="footer">
			<!---footer here --->
			<%@ include file="/includes/footer.jsp"%>
		</div>
	</div>
</body>
</html>
