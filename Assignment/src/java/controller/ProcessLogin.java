package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import model.User;
import dao.UserDAO;

public class ProcessLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessLogin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProcessLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        // Lưu user vào session
        User user = UserDAO.checkLogin(username, password);
        if (user != null) {
            session.setAttribute("user", user);
            Cookie uidCk = new Cookie("uid", String.valueOf(user.getUid()));
            Cookie usrCk = new Cookie("username", user.getUserName());
            uidCk.setMaxAge(-1);
            usrCk.setMaxAge(-1);
            response.addCookie(uidCk);
            response.addCookie(usrCk);
            if (user.getStatus() == 2) {
                request.getRequestDispatcher("updateinfo.jsp").forward(request, response);
            } else if (user.getStatus() == 1) {
               // Chuyển người dùng tới trang xác nhận email
            } else {
                // Xác nhận đầy đủ rồi thì chuyển vào trang chính
                response.sendRedirect("chat.jsp");
            }
        }
    }
}
