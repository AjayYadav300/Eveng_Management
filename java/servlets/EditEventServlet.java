/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.EventDAOImpl;
import Databases.DBConnect;
import classes.EventDtls;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author arpit
 */
public class EditEventServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditEventServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            int id=Integer.parseInt(request.getParameter("id"));
             out.print("jdsl");
            String eventName=request.getParameter("ename");
            String eventDes=request.getParameter("edes");
//            String eventImage=request.getParameter("eimg");
            out.print("jdsl");
            EventDtls e=new EventDtls();
            out.print("jdsl");
            e.setEventId(id);
            e.setEventName(eventName);
            e.setEventDiscription(eventDes);
//            e.setPhotoName(eventImage);
            out.print("jdsl");
            EventDAOImpl dao=new EventDAOImpl(DBConnect.getConn());
            boolean f=dao.updateEditEvents(e);
            HttpSession session=request.getSession();
            if(f)
            {
                session.setAttribute("succMsg","Event Update Successfully...");
                response.sendRedirect("/mydemo/myjsp/eventList.jsp");
            }
            else{
                session.setAttribute("failedMsg","Something wrong on server");
                response.sendRedirect("/mydemo/myjsp/eventList.jsp");
            }
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
