package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserDAO;

/**
 * Servlet implementation class Process
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pw = request.getParameter("password");
		String check = request.getParameter("remember");
		if(check.equalsIgnoreCase("ON")) {
			Cookie c1 = new Cookie("username", user);
			Cookie c2 = new Cookie("password", pw);
			c1.setMaxAge(60);
			c2.setMaxAge(60);
			response.addCookie(c1);
			response.addCookie(c2);
		}
		HttpSession session = request.getSession();
		User us = UserDAO.checkLogin(user, pw);
		if(us!=null) {
			session.setAttribute("user", us);
			session.setAttribute("message", us.getName());
			response.sendRedirect("WelcomeServlet");
		}else {
			session.setAttribute("message", "Please Login");
			response.sendRedirect("login.jsp");
		}
	}
}
