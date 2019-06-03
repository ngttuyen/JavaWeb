package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import model.Member;

/**
 * Servlet implementation class ProcessLogin
 */
public class ProcessLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("id");
		String pw = request.getParameter("pw");
		HttpSession session = request.getSession();
		Member m  = MemberDAO.login(user, pw);
		if(m!=null) {
			session.setAttribute("user", m);
			session.setAttribute("message", m.getFullName());
			response.sendRedirect("UserHome");
		}else {
			session.setAttribute("error", "Please Login");
			response.sendRedirect("login");
		}
	}

}
