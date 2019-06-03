package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

/**
 * Servlet implementation class ProcessSignUp
 */
public class ProcessSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcessSignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String uid = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		if(dob.contains("-")) {
			dob = dob.replaceAll("-", "/");
		}
		if(dob.contains(".")) {
			dob = dob.replaceAll(".", "/");
		}
		try {
			MemberDAO dao = new MemberDAO();
			boolean kq  = dao.signUp(name, email, uid, pw, (gender.equalsIgnoreCase("Male")?true:false), sdf.parse(dob));
			if(kq==true) {
				request.setAttribute("nof", "Sign Up Successfully");
			}
			response.sendRedirect("login.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}



	}

}
