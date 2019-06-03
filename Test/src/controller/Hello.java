package controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part part = request.getPart("upload");
		int rs = 0;
		if(part!=null) {
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Test","sa","duong");
				PreparedStatement ps = c.prepareStatement("insert into Table values(?,?)");
				InputStream is = part.getInputStream();
				ps.setInt(1, 1);
				ps.setBlob(2, is);
				rs = ps.executeUpdate();
				if(rs>0) {
					response.sendRedirect("view.jsp");
				}else {
					response.sendRedirect("index.jsp");
				}
				ps.close();
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
