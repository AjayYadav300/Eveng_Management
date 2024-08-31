package org.apache.jsp.myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_remove_var_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("         <style>\n");
      out.write("  header {\n");
      out.write("    position:sticky;\n");
      out.write("    background-color: black;\n");
      out.write("    color: #fff;\n");
      out.write("    padding: 20px;\n");
      out.write("}    \n");
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
      out.write(" /* config.css */\n");
      out.write("\n");
      out.write("/* helpers/align.css */\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".grid {\n");
      out.write("  margin-left: auto;\n");
      out.write("  margin-right: auto;\n");
      out.write("  max-width: 320px;\n");
      out.write("  max-width: 20rem;\n");
      out.write("  width: 90%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* helpers/hidden.css */\n");
      out.write("\n");
      out.write(".hidden {\n");
      out.write("  border: 0;\n");
      out.write("  clip: rect(0 0 0 0);\n");
      out.write("  height: 1px;\n");
      out.write("  margin: -1px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  padding: 0;\n");
      out.write("  position: absolute;\n");
      out.write("  width: 1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* helpers/icon.css */\n");
      out.write("\n");
      out.write(".icons {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon {\n");
      out.write("  display: inline-block;\n");
      out.write("  fill: #606468;\n");
      out.write("  font-size: 16px;\n");
      out.write("  font-size: 1rem;\n");
      out.write("  height: 1em;\n");
      out.write("  vertical-align: middle;\n");
      out.write("  width: 1em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* layout/base.css */\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  -webkit-box-sizing: inherit;\n");
      out.write("          box-sizing: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("          box-sizing: border-box;\n");
      out.write("  font-size: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: #2c3338;\n");
      out.write("  color: #606468;\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-size: 0.875rem;\n");
      out.write("  font-weight: 400;\n");
      out.write("  height: 100%;\n");
      out.write("  line-height: 1.5;\n");
      out.write("  margin: 0;\n");
      out.write("  min-height: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* modules/anchor.css */\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  color: #eee;\n");
      out.write("  outline: 0;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:focus,\n");
      out.write("a:hover {\n");
      out.write("  text-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* modules/form.css */\n");
      out.write("\n");
      out.write("input {\n");
      out.write("  background-image: none;\n");
      out.write("  border: 0;\n");
      out.write("  color: inherit;\n");
      out.write("  font: inherit;\n");
      out.write("  margin: 0;\n");
      out.write("  outline: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  -webkit-transition: background-color 0.3s;\n");
      out.write("  transition: background-color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type='submit'] {\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form {\n");
      out.write("  margin: -14px;\n");
      out.write("  margin: -0.875rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form input[type='password'],\n");
      out.write(".form input[type='text'],\n");
      out.write(".form input[type='submit'] {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form__field {\n");
      out.write("  display: -webkit-box;\n");
      out.write("  display: -ms-flexbox;\n");
      out.write("  display: flex;\n");
      out.write("  margin: 14px;\n");
      out.write("  margin: 0.875rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form__input {\n");
      out.write("  -webkit-box-flex: 1;\n");
      out.write("      -ms-flex: 1;\n");
      out.write("          flex: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* modules/login.css */\n");
      out.write("\n");
      out.write(".login {\n");
      out.write("  color: #eee;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login label,\n");
      out.write(".login input[type='text'],\n");
      out.write(".login input[type='password'],\n");
      out.write(".login input[type='submit'] {\n");
      out.write("  border-radius: 0.25rem;\n");
      out.write("  padding: 16px;\n");
      out.write("  padding: 1rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login label {\n");
      out.write("  background-color: #363b41;\n");
      out.write("  border-bottom-right-radius: 0;\n");
      out.write("  border-top-right-radius: 0;\n");
      out.write("  padding-left: 20px;\n");
      out.write("  padding-left: 1.25rem;\n");
      out.write("  padding-right: 20px;\n");
      out.write("  padding-right: 1.25rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type='password'],\n");
      out.write(".login input[type='text'] {\n");
      out.write("  background-color: white;\n");
      out.write("  border-bottom-left-radius: 0;\n");
      out.write("  border-top-left-radius: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type='password']:focus,\n");
      out.write(".login input[type='password']:hover,\n");
      out.write(".login input[type='text']:focus,\n");
      out.write(".login input[type='text']:hover\n");
      out.write(".login input[type='number']:focus,\n");
      out.write(".login input[type='number']:hover {\n");
      out.write("  background-color: #434a52;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type='submit'] {\n");
      out.write("  background-color: #ea4c88;\n");
      out.write("  color: #eee;\n");
      out.write("  font-weight: 700;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type='submit']:focus,\n");
      out.write(".login input[type='submit']:hover {\n");
      out.write("  background-color: #d44179;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* modules/text.css */\n");
      out.write("\n");
      out.write("p {\n");
      out.write("  margin-bottom: 24px;\n");
      out.write("  margin-bottom: 1.5rem;\n");
      out.write("  margin-top: 24px;\n");
      out.write("  margin-top: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text--center {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("#arp{\n");
      out.write("  margin-left: 20px;\n");
      out.write("  margin-top: 0;\n");
      out.write("}\n");
      out.write("#tc{\n");
      out.write("  margin-top: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li  style=\"font-size: 25px;\">EVENT MANAGEMENT SYSTEM</li>\n");
      out.write("            <li  style=\"position: absolute; left: 40%; font-size: 20px;\"><a href=\"ok.html\">Home</a></li>\n");
      out.write("            <li  style=\"position: absolute; left: 45%; font-size: 20px;\"><a href=\"#\">About</a></li>\n");
      out.write("            <li  style=\"position: absolute; left: 50%; font-size: 20px;\"><a href=\"#\">Services</a></li>\n");
      out.write("            <li  style=\"position: absolute; left: 56%; font-size: 20px;\"><a href=\"#\">Contact</a></li>\n");
      out.write("            <li  style=\"position: absolute; right: 1%; top: 25%;\"><button id=\"navbutton\"><a href=\"login.html\">Login</a></button></li>\n");
      out.write("            <li  style=\"position: absolute; right: 8%; top: 25%;\"><button id=\"navbutton\"><a href=\"signup.html\">Sign Up</a></button></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>   \n");
      out.write("</header> \n");
      out.write("<br><br>\n");
      out.write("<center><h2 style=\"color: white; margin-bottom: 20px;\">SignUp Form</h2></center>\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <body class=\"align\">\n");
      out.write("\n");
      out.write("  <div class=\"grid\">\n");
      out.write("\n");
      out.write("    <form action=\"/mydemo/RegisterServlet\" method=\"POST\" class=\"form login\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"form__field\">\n");
      out.write("            <input id=\"login_name\" type=\"text\" name=\"fname\" class=\"form_input\" placeholder=\"Name\" required>\n");
      out.write("          </div> \n");
      out.write("  \n");
      out.write("\n");
      out.write("      <div class=\"form__field\">\n");
      out.write("        <input id=\"login_username\" type=\"text\" name=\"email\" class=\"form_input\" placeholder=\"Email\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form__field\">\n");
      out.write("        <input id=\"login_password\" type=\"password\" name=\"password\" class=\"form_input\" placeholder=\"Password\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form__field\">\n");
      out.write("        <input id=\"login_mob\" type=\"text\" name=\"phone\" class=\"form_input\" placeholder=\"Mob. no.\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form__field\">\n");
      out.write("        <input id=\"login_add\" type=\"text\" name=\"address\" class=\"form_input\" placeholder=\"Address\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form_field\">\n");
      out.write("        <input type=\"checkbox\" name=\"check\" id=\"tc\"><br>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      <label for=\"tc\" id=\"arp\">I agree of statement in Term of service</label><br>\n");
      out.write("\n");
      out.write("      <div class=\"form__field\">\n");
      out.write("        <input type=\"submit\" value=\"Sign Up\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <p class=\"text--center\">Already a member? <a href=\"login.jsp\">Login Now</a> \n");
      out.write("\n");
      out.write("  </div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty succMsg}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${succMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("        \n");
        out.write("        ");
        if (_jspx_meth_c_remove_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_remove_0.setVar("succMsg");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty failedMsg}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${failedMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("        ");
        if (_jspx_meth_c_remove_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_remove_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_1 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_1.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_remove_1.setVar("failedMsg");
    _jspx_th_c_remove_1.setScope("session");
    int _jspx_eval_c_remove_1 = _jspx_th_c_remove_1.doStartTag();
    if (_jspx_th_c_remove_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_1);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_1);
    return false;
  }
}
