package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

/**
 * Servlet implementation class DeleteAccount
 */
@WebServlet("/DeleteAccount")
public class DeleteAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAccount() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pw  = request.getParameter("pw");
		if(pw=="") {
			request.setAttribute("MSG", "Please type your password");
			request.getRequestDispatcher("deleteAcc.jsp").forward(request, response);
		}else {
			UserDAO.deleteAccount(pw);
			request.setAttribute("MSG", "Account Deleted!");
			request.getRequestDispatcher("deleteAcc.jsp").forward(request, response);
		}
	}

}
