/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.ConnectionProvider;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Knight
 */
public class Basic extends HttpServlet {

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
            String uname = request.getParameter("name");
            String upass = request.getParameter("password");
            String uemail = request.getParameter("email");
            String mobile = request.getParameter("mobile");
            out.print("Welcome");
            try {
                Connection conn = ConnectionProvider.getCon();
                String query = "insert into BASIC(PK_ID,Name,Email,Mobile,Status,Password) values(?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, 1);
                ps.setString(2, uname);
                ps.setString(3, uemail);
                ps.setString(4, mobile);
                ps.setString(5, "D");
                ps.setString(6, upass);
                ps.executeUpdate();
               ps.close();
               conn.close();
                
            } catch (Exception e) {
                out.print(e);
            }
            try {
                uemail = request.getParameter("email");
                Connection conn = ConnectionProvider.getCon();
                String query = "insert into INFO_TEMP(FATHER_NAME,EMAIL) values(?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1,uemail);
               ps.setString(2,uemail);
                ps.executeUpdate();
               out.print(uemail);
                response.sendRedirect("Personal.jsp");
            } catch (Exception e) {
                out.print(e);
            }
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
