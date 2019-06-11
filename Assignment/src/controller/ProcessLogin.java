package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserDAO;
import model.Users;

/**
 * Servlet implementation class ProcessLogin
 */
public class ProcessLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ProcessLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("passsword");
		UserDAO userDAO = new UserDAO();
		Users u = userDAO.login(username, password);
		HttpSession session = request.getSession();
		if(u!=null) {
			session.setAttribute("user", u);
			response.sendRedirect("WelcomeServlet");
		}else {
			session.setAttribute("message", "Please Login");
			response.sendRedirect("login.jsp");
		}
	}

}
