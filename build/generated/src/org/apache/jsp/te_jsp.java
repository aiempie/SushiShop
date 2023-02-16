package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class te_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/yourServletURL\" method=\"post\">\n");
      out.write("            <p>Normal text field.        \n");
      out.write("                <input type=\"text\" name=\"name\" /></p>\n");
      out.write("\n");
      out.write("            <p>Secret text field.        \n");
      out.write("                <input type=\"password\" name=\"pass\" /></p>\n");
      out.write("\n");
      out.write("            <p>Single-selection radiobuttons.        \n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"M\" /> Male\n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"F\" /> Female</p>\n");
      out.write("\n");
      out.write("            <p>Single-selection checkbox.\n");
      out.write("                <input type=\"checkbox\" name=\"agree\" /> Agree?</p>\n");
      out.write("\n");
      out.write("            <p>Multi-selection checkboxes.\n");
      out.write("                <input type=\"checkbox\" name=\"role\" value=\"USER\" /> User\n");
      out.write("                <input type=\"checkbox\" name=\"role\" value=\"ADMIN\" /> Admin</p>\n");
      out.write("\n");
      out.write("            <p>Single-selection dropdown.\n");
      out.write("                <select name=\"countryCode\">\n");
      out.write("                    <option value=\"NL\">Netherlands</option>\n");
      out.write("                    <option value=\"US\">United States</option>\n");
      out.write("                </select></p>\n");
      out.write("\n");
      out.write("            <p>Multi-selection listbox.\n");
      out.write("                <select name=\"animalId\" multiple=\"true\" size=\"2\">\n");
      out.write("                    <option value=\"1\">Cat</option>\n");
      out.write("                    <option value=\"2\">Dog</option>\n");
      out.write("                </select></p>\n");
      out.write("\n");
      out.write("            <p>Text area.\n");
      out.write("                <textarea name=\"message\"></textarea></p>\n");
      out.write("\n");
      out.write("            <p>Submit button.\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"submit\" /></p>\n");
      out.write("        </form>\n");
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
