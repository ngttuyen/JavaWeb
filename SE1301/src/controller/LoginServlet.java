package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(UserDAO.login(username, password)==true) {
			request.setAttribute("error", "Welcome "+User.getFullName());
			request.getRequestDispatcher("sinfo.jsp").forward(request, response);
		}else{
			request.setAttribute("error-1", "Username or Password is invalid");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
