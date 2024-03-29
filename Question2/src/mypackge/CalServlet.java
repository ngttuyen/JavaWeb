package mypackge;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/CalServlet")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int first = Integer.parseInt(request.getParameter("first"));
		int second = Integer.parseInt(request.getParameter("second"));
		int result = 0;
		
		String operator = request.getParameter("operator");
		switch(operator) {
		case "+":
			result = first+second;
			break;
		case "-":
			result = first-second;
			break;
		case "*":
			result = first*second;
			break;
		case "/":
			result = first/second;
			break;
		}
		request.setAttribute("result", result);
		request.setAttribute("first", first);
		request.setAttribute("second", second);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
