package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

/**
 * Servlet implementation class SendServlet
 */
public class SendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User s1 =  new User("Duong");
		User s2 =  new User("Uyen");
		User s3 =  new User("Linh");
		request.setAttribute("s1", s1);
		request.setAttribute("s2", s2);
		request.setAttribute("s3", s3);
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
	}
}
