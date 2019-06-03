package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import model.StudentList;

/**
 * Servlet implementation class addStudentServlet
 */
@WebServlet("/addStudentServlet")
public class updateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public updateStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String gd = request.getParameter("gender");
		try {
		StudentList sList = (StudentList) request.getServletContext().getAttribute("SLIST");
		sList.addNew(new Student(id, name, gd, dob));
		request.setAttribute("MSG", "Added Student");
		}catch(Exception e) {
			request.setAttribute("MSG", "Add failed");
		}
		finally{
			request.getRequestDispatcher("addStudent.jsp").forward(request, response);
		}
		


	}
}
