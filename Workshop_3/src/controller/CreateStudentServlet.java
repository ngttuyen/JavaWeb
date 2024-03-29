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
		String name = request.getParameter("name");
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		Date date = null;
		try {
			date = sdf.parse(request.getParameter("DOB"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
