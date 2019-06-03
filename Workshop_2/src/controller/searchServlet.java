package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import model.StudentList;

/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public searchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = request.getParameter("search");
		StudentList sList = (StudentList) request.getServletContext().getAttribute("SLIST");
		Student s = sList.searchID(Integer.parseInt(search));
		if(s!=null) {
			request.setAttribute("ID", s.getId());
			request.setAttribute("Name", s.getName());
			request.setAttribute("Gender", (s.isGender()==true?"Male":"Female"));
			request.setAttribute("dob", s.getDob());
			request.getRequestDispatcher("search.jsp").forward(request, response);
		}else {
			request.setAttribute("MSG", "Student not found");
			request.getRequestDispatcher("search.jsp").forward(request, response);
		}
		
	}
}




