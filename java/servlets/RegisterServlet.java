/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.UserDAOImpl;
import Databases.DBConnect;
import classes.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author arpit
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 
     */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        try { 
           
           String name=request.getParameter("fname");
           String email=request.getParameter("email");
           String phone=request.getParameter("phone");
           String password=request.getParameter("password");
           String check=request.getParameter("check");
           
           User us=new User();
           us.setName(name);
           us.setEmail(email);
           us.setPhone(phone);
           us.setPassword(password);
           HttpSession session=request.getSession(); 
         if(check!=null)
         {
         UserDAOImpl dao=new UserDAOImpl(DBConnect.getConn());
         boolean f=dao.userRegister(us);
         
         if(f)
         {
             session.setAttribute("succMsg","Registration Successsfully..");
             response.sendRedirect("myjsp/register.jsp");
         }
         else{
             session.setAttribute("failedMsg","Something wrong on server..");
             response.sendRedirect("myjsp/register.jsp");
         }
         }
         else{
             session.setAttribute("failedMsg","Please Check Agree & Terms Condition");
             response.sendRedirect("myjsp/register.jsp");
         }
        }
        catch(Exception e){
            e.printStackTrace();
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
