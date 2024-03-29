package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;

/**
 * Servlet implementation class CreateStudentServlet
 */
public class CreateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreateStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String Name = request.getParameter("name");
		boolean Gender = Boolean.parseBoolean(request.getParameter("gender"));
		Date Date = null;
		try {
			Date = sdf.parse(request.getParameter("DOB"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(StudentDAO.createStudent(Name, Gender, Date)==true) {
			response.sendRedirect("list.jsp");
		}else {
			request.setAttribute("error", "Failed");
			response.sendRedirect("list.jsp");
		}
	}

}
