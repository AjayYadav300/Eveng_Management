/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author arpit
 */
public class VenueServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Connection con=null;
    PreparedStatement pmt=null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VenueServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           String eventype=request.getParameter("eventtype");
           String capacity=request.getParameter("capacity");
           String cost=request.getParameter("cost");
           String location=request.getParameter("location");
           String contact=request.getParameter("contact");
           String db=request.getParameter("date");
//           out.print(db);
//           Date date1=(Date) new SimpleDateFormat("DD/MM/YYYY").parse(db);
//           java.sql.Date sqlDate=new java.sql.Date(date1.getTime());
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydemo","root","root");
           pmt=con.prepareStatement("insert into vanue(eventtype,capacity,cost,location,contact,date) values(?,?,?,?,?,?)");
           pmt.setString(1,eventype);
           pmt.setString(2,capacity);
           pmt.setString(3,cost);
           pmt.setString(4,location);
           pmt.setString(5,contact);
           pmt.setString(6, db);
          int f=pmt.executeUpdate();
            HttpSession session=request.getSession(); 
          if(f==1)
         {
             session.setAttribute("succMsg","Venue Added Successsfully..");
             response.sendRedirect("myjsp/venue.jsp");
         }
         else{
             session.setAttribute("failedMsg","Something wrong on server..");
             response.sendRedirect("myjsp/venue.jsp");
         }
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VenueServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VenueServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VenueServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VenueServlet.class.getName()).log(Level.SEVERE, null, ex);
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
