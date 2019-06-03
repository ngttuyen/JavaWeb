package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

/**
 * Servlet implementation class PasswordServlet
 */
@WebServlet("/PasswordServlet")
public class PasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newpw = request.getParameter("newpw");
		if(newpw=="") {
			request.setAttribute("errorpw", "Please type new Password!");
			request.getRequestDispatcher("pwchanger.jsp").forward(request, response);
		}else {
			UserDAO.changePassword(newpw);
			request.setAttribute("errorpw", "Password changed!");
			request.getRequestDispatcher("pwchanger.jsp").forward(request, response);
		}
	}

}
