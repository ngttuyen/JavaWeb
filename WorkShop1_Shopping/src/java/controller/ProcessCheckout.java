/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDAO;
import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.OrderLine;
import util.GetCurrentDate;

/**
 *
 * @author quynh
 */
public class ProcessCheckout extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessCheckout</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProcessCheckout at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        HttpSession session = request.getSession();
        Customer m = (Customer) session.getAttribute("user");
        String date = GetCurrentDate.getCurrentTimeStamp();
        String method = request.getParameter("method");
        boolean insertOrder = false;
        boolean insertOrderLine = false;
        if (m == null) {
            response.sendRedirect("login.jsp");
        } else {
            HashMap<String, OrderLine> buyerList = (HashMap) session.getAttribute("List");
            String customerID = m.getCustomerID();   
            insertOrder = ProductDAO.insertOrder(date, method, customerID);
            for (String name : buyerList.keySet()) {
                int OrderID = OrderDAO.getOrderID(customerID);
                int quantity = buyerList.get(name).getQuantity();
                int price = buyerList.get(name).getPrice();
                insertOrderLine = ProductDAO.insertOrderLine(OrderID, 2, quantity, price);
            }
            if ((insertOrder == true) && (insertOrderLine == true)) {
                request.setAttribute("message", "Payment successfully");
            } else {
                request.setAttribute("message", "Payment failed");
            }
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
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
