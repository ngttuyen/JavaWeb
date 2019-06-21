package controller;

import dao.UserDAO;
import model.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Do Duong
 */
public class ProcessRegister extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        if ((UserDAO.checkUsersName(username) == true) && (UserDAO.checkEmail(email) == true)) {
            request.setAttribute("error", "Username and Email is alrady in use");
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else if (UserDAO.checkUsersName(username) == true) {
            request.setAttribute("error", "Username is alrady in use");
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else if (UserDAO.checkEmail(email) == true) {
            request.setAttribute("error", "Email is alrady in use");
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            User usr = UserDAO.register(username, password, email);
            if (usr != null) {
                try {
                    session.setAttribute("user", usr);
                } catch (Exception e) {
                    throw new ServletException(e.getMessage());
                }
            }
            response.sendRedirect("updateinfo.jsp");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
