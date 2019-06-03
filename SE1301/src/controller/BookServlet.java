package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import model.Book;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookID = request.getParameter("bookID");
		if(BookDAO.search(bookID)==true) {
			request.setAttribute("id", Book.getBookID());
			request.setAttribute("title", Book.getTitle());
			request.setAttribute("author", Book.getAuthor());
			request.setAttribute("category", Book.getCategory());
			request.setAttribute("keyword", Book.getKeyword());
			request.getRequestDispatcher("bookSearch.jsp").forward(request, response);
		}else {
			request.setAttribute("error-1", "Book not found");
			request.getRequestDispatcher("bookSearch.jsp").forward(request, response);
		}
		
	}

}
