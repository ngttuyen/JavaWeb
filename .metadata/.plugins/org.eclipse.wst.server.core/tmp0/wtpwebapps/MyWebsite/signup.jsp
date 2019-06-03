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
					<li class="selected"><a href="signup">Sign Up</a></li>
					<li><a href="login">Login</a></li>
					<li><a href="book">Book List</a></li>
					<li><a href="about">About</a></li>
				</ul>
				<form method="get" action="" id="searchForm">
					<input type="text" name="search" class="styled-input">
					<button class="button" type="submit">Search</button>
				</form>
			</div>

		</div>
		<div id="site_content">
			<%@ include file="/includes/sidebar.jsp"%>
			<div id="content">
				<!-- -------------------------your code here---------------------- --->
				<form method="post" action="ProcessSignUp">
					<table class="login-signup">
						<tr>
							<td><label>Your Name</label></td>
							<td class="right"><input type="text" name="name"
								class="styled-input"></td>
						</tr>
						<tr>
							<td><label>Your Email</label></td>
							<td class="right"><input type="text" name="email"
								class="styled-input"></td>
						</tr>
						<tr>
							<td><label>Account Name</label></td>
							<td class="right"><input type="text" name="id"
								class="styled-input"></td>
						</tr>
						<tr>
							<td><label>Password</label></td>
							<td class="right"><input type="password" name="pw"
								class="styled-input"></td>
						</tr>
						<tr>
							<td><label>Gender</label></td>
							<td class="right"><input class="gender-radio" type="radio"
								name="gender" value="male"> Male <input
								class="gender-radio" type="radio" name="gender" value="female">
									Female</td>
						</tr>
						<tr>
							<td><label>Birth Day</label></td>
							<td class="right"><input type="text" name="dob"
								class="styled-input" placeholder="dd-MM-yyyy"></td>
						</tr>
						<tr>
							<td colspan="2"><input type="checkbox" required name="terms">
							<h5>
									I accept the <u>Terms and Conditions</u>
								</h5>
								</p></td>
						</tr>
					</table>
					<button class="button" type="submit">Sign Up</button>
				</form>
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
