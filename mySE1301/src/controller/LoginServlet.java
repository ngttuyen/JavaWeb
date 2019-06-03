package controller;


import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import validate.Validate;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = null;
	public LoginServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user  = request.getParameter("username");
		String pass = request.getParameter("password");
		if(Validate.checkUser(user, pass)==true) {
			request.getRequestDispatcher("info.jsp").forward(request, response);
			
		}else {
			request.getRequestDispatcher("failedjsp.jsp").forward(request, response);
		}
	}
}
