<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="includes/head.jsp"%>
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
					<li><a href="home">Home</a></li>
					<li><a href="signup">Sign Up</a></li>
					<li><a href="login">Login</a></li>
					<li><a href="book">Book List</a></li>
					<li class="selected"><a href="about">About</a></li>
				</ul>
				<form method="get" action="" id="searchForm">
					<input type="text" name="search" id="search-input"
						class="styled-input">
					<button class="button">Search</button>
				</form>
			</div>
		</div>
		<div id="site_content">
			<%@ include file="/includes/sidebar.jsp"%>
			<div id="content">
				<!-- -------------------------your code here---------------------- --->
				<h1>About the developer</h1>
				<h3>Hello ! My name is Duong and i'm from Vietnam</h3>
				<h4>Sunset is the time of day when our sky meets the outer
					space solar winds. There are blue, pink, and purple swirls,
					spinning and twisting, like clouds of balloons caught in a
					whirlwind. The sun moves slowly to hide behind the line of horizon,
					while the moon races to take its place in prominence atop the night
					sky. People slow to a crawl, entranced, fully forgetting the deeds
					that must still be done. There is a coolness, a calmness, when the
					sun does set.</h4>
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
