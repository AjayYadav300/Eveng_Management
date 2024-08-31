package org.apache.jsp.myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import classes.User;
import Databases.DBConnect;
import DAO.UserDAOImpl;

public final class userDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        table,tr,td,th{\n");
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
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h2>UserList</h2></center>\n");
      out.write("        \n");
      out.write("<!--        <div class=\"filter\"></div>-->\n");
      out.write("         <table>\n");
      out.write("        <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Id</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Phone NO</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("        ");

            UserDAOImpl udo=new UserDAOImpl(DBConnect.getConn());
            List<User>list=udo.getAllUser();
            for(User u:list)
            {
      out.write("\n");
      out.write("                \n");
      out.write("    <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(u.getId());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(u.getName());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(u.getEmail());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(u.getPhone());
      out.write("</td>\n");
      out.write("            <td>Delete</td>\n");
      out.write("        </tr>\n");
      out.write("    <br>\n");
      out.write("    </tbody>          \n");
      out.write("            ");
}
        
      out.write("\n");
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
