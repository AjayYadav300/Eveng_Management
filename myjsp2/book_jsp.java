package org.apache.jsp.myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classes.VanueDtls;
import java.util.List;
import DAO.VanueDAOImpl;
import Databases.DBConnect;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             table,tr,td,th{\n");
      out.write("            border: 1px solid black;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("        /*@import url('https://fonts.googleapis.com/css?family=Montserrat|Open+Sans|Roboto');*/\n");
      out.write("*{\n");
      out.write(" margin:0;\n");
      out.write(" padding: 0;\n");
      out.write(" outline: 0;\n");
      out.write("}\n");
      out.write(".filter{\n");
      out.write(" position: absolute;\n");
      out.write(" left: 0;\n");
      out.write(" top: 0;\n");
      out.write(" bottom: 0;\n");
      out.write(" right: 0;\n");
      out.write("/* z-index: 1;*/\n");
      out.write("/* background: rgb(233,76,161);*/\n");
      out.write(" background: white;\n");
      out.write("/*background: -moz-linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);\n");
      out.write("background: -webkit-linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);\n");
      out.write("background: linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient(startColorstr=\"#e94ca1\",endColorstr=\"#c74ae9\",GradientType=1);\n");
      out.write("opacity: .7;*/\n");
      out.write("}\n");
      out.write("table{\n");
      out.write(" position: absolute;\n");
      out.write(" z-index: 2;\n");
      out.write(" left: 50%;\n");
      out.write(" top: 50%;\n");
      out.write(" transform: translate(-50%,-50%);\n");
      out.write(" width: 60%; \n");
      out.write(" border-collapse: collapse;\n");
      out.write(" border-spacing: 0;\n");
      out.write(" box-shadow: 0 2px 15px rgba(64,64,64,.7);\n");
      out.write(" border-radius: 12px 12px 0 0;\n");
      out.write(" overflow: hidden;\n");
      out.write("\n");
      out.write("}\n");
      out.write("td , th{\n");
      out.write(" padding: 15px 20px;\n");
      out.write(" text-align: center;\n");
      out.write(" \n");
      out.write("\n");
      out.write("}\n");
      out.write("th{\n");
      out.write("/* background-color: #ba68c8;*/\n");
      out.write(" background-color: black;\n");
      out.write(" color: #fafafa;\n");
      out.write(" font-family: 'Open Sans',Sans-serif;\n");
      out.write(" font-weight: 200;\n");
      out.write(" text-transform: uppercase;\n");
      out.write("\n");
      out.write("}\n");
      out.write("tr{\n");
      out.write(" width: 100%;\n");
      out.write(" background-color: #fafafa;\n");
      out.write(" font-family: 'Montserrat', sans-serif;\n");
      out.write("}\n");
      out.write("tr:nth-child(even){\n");
      out.write(" background-color: #eeeeee;\n");
      out.write("}\n");
      out.write("h2{\n");
      out.write("    color: red;\n");
      out.write("    margin-top:  10px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("             body {                   \n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: 100%;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("         \n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            overflow: hidden;\n");
      out.write("            \n");
      out.write("            z-index: -1;\n");
      out.write("            }        \n");
      out.write("        header {\n");
      out.write("            position:sticky;\n");
      out.write("            background-color: black;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("        }      \n");
      out.write("        .fixed-button {\n");
      out.write("            position: absolute;\n");
      out.write("            right: 0;\n");
      out.write("            top: 50%; /* Adjust the top value as needed to center vertically */\n");
      out.write("            transform: translateY(-50%); /* Center vertically */\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;    \n");
      out.write("        }       \n");
      out.write("        a {\n");
      out.write("  color: #eee;\n");
      out.write("  outline: 0;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("list-style-type: none;\n");
      out.write("margin: 0;\n");
      out.write("padding: 0;\n");
      out.write("}\n");
      out.write("li \n");
      out.write("{\n");
      out.write("display: inline;\n");
      out.write("}\n");
      out.write("a \n");
      out.write("{\n");
      out.write("color: white;\n");
      out.write("text-decoration: none;\n");
      out.write("padding: 10px 10px;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("\n");
      out.write("transition: all 0.2s ease;\n");
      out.write("color: rgb(240, 240, 69);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navbutton {   \n");
      out.write("background-color: #007bff; \n");
      out.write("color: #fff;\n");
      out.write("padding: 10px 20px; \n");
      out.write("border: none;\n");
      out.write("border-radius: 5px;\n");
      out.write("cursor: pointer;\n");
      out.write("font-size: 14px;\n");
      out.write("border-radius: 5px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#navbutton:hover {\n");
      out.write("background-color: #0056b3;\n");
      out.write("transition: all 0.2s ease;\n");
      out.write("}\n");
      out.write("nav:hover{\n");
      out.write("transition: all 0.2s ease;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li  style=\"font-size: 25px;\">EVENT MANAGEMENT SYSTEM</li>\n");
      out.write("            <li  style=\"position: absolute; left: 30%; font-size: 20px;\"><a href=\"Book.jsp\">Book</a></li>\n");
      out.write("            <li  style=\"position: absolute; left: 37%; font-size: 20px;\"><a href=\"bookHis1.jsp\">Booking History</a></li>\n");
      out.write("            <li  style=\"position: absolute; left: 48%; font-size: 20px;\"><a href=\"#\">Contact.jsp</a></li>\n");
      out.write("            <!--<li  style=\"position: absolute; left: 56%; font-size: 20px;\"><a href=\"eventList.jsp\">Event List</a></li>-->\n");
      out.write("            <!--<li  style=\"position: absolute; left: 63%; font-size: 20px;\"><a href=\"venue.jsp\">Venue</a></li>-->\n");
      out.write("            <li  style=\"position: absolute; right: 2%; top: 25%;\"><button id=\"navbutton\"><a href=\"index.html\">Log out</a></button></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>   \n");
      out.write("</header> \n");
      out.write("        \n");
      out.write("<!--        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty userobj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <h1>Name:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userobj.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("            <h1>Email:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userobj.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        </c:if>-->\n");
      out.write("    <center><h1>Booking</h1></center>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Event type.</th>\n");
      out.write("                    <th>Capacity</th>\n");
      out.write("                    <th>Cost</th>\n");
      out.write("                    <th>Location</th>\n");
      out.write("                    <th>Contact</th>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    VanueDAOImpl dao=new VanueDAOImpl(DBConnect.getConn());
                    List<VanueDtls>list=dao.getAllVanue();
                    for(VanueDtls e:list)
                    {
      out.write("\n");
      out.write("                     <tr>\n");
      out.write("                         <td>");
      out.print(e.geteType());
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(e.getCapacity());
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(e.getCost());
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(e.getLocation() );
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(e.getContact() );
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(e.getDate() );
      out.write("</td>\n");
      out.write("<!--                         <td><a href=\"payment.jsp?id=\">Edit</a><a href=\"#\">Delete</a></td>-->\n");
      out.write("                         <td><a href=\"payment.jsp\">Book&Pay</a>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
                
      out.write("\n");
      out.write("               \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
