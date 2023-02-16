package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Vietnamese Cuisine</title>\n");
      out.write("        <link href=\"css/styleindex.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "logo.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "thanhcongcu.jsp", out, false);
      out.write("\n");
      out.write("    <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <table id=\"cart\" class=\"table table-condensed\"> \n");
      out.write("              <thead> \n");
      out.write("                   <tr> \n");
      out.write("                        <th style=\"width:45%\">Tên sản phẩm</th> \n");
      out.write("                        <th style=\"width:10%\">Giá</th> \n");
      out.write("                        <th style=\"width:8%\">Số lượng</th> \n");
      out.write("                        <th style=\"width:22%\" class=\"text-center\">Thành tiền</th> \n");
      out.write("                        <th style=\"width:15%\"> </th> \n");
      out.write("                       </tr> \n");
      out.write("                  </thead> \n");
      out.write("              <tbody>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  \n");
      out.write("              </tbody>\n");
      out.write("        <tfoot> \n");
      out.write("               <tr class=\"visible-xs\"> \n");
      out.write("                    <td class=\"text-center\"><strong>Tổng 200.000 đ</strong>\n");
      out.write("                        </td> \n");
      out.write("                   </tr> \n");
      out.write("               <tr> \n");
      out.write("                    <td><a href=\"menu\" class=\"btn btn-warning\"><i class=\"fa fa-angle-left\"></i> Tiếp tục mua hàng</a>\n");
      out.write("                        </td> \n");
      out.write("                    <td colspan=\"2\" class=\"hidden-xs\"> </td> \n");
      out.write("                    <td class=\"hidden-xs text-center\"><strong>Tổng tiền: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" đ</strong>\n");
      out.write("                        </td> \n");
      out.write("                    <td><a href=\"http://hocwebgiare.com/\" class=\"btn btn-success btn-block\">Thanh toán <i class=\"fa fa-angle-right\"></i></a>\n");
      out.write("                        </td> \n");
      out.write("                   </tr> \n");
      out.write("              </tfoot> \n");
      out.write("         </table>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ls");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr> \n");
          out.write("                       <td data-th=\"Product\"> \n");
          out.write("                            <div class=\"row\"> \n");
          out.write("                                 <div class=\"col-sm-2 hidden-xs\"><img src=\"image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ls.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"Sản phẩm 1\" class=\"img-responsive\" width=\"100\">\n");
          out.write("                                     </div> \n");
          out.write("                                 <div class=\"col-sm-10\"> \n");
          out.write("                                      <h4 class=\"nomargin\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ls.tenSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>  \n");
          out.write("                                     </div> \n");
          out.write("                                </div> \n");
          out.write("                           </td> \n");
          out.write("                       <td data-th=\"Price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ls.dongia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" đ</td> \n");
          out.write("                       <td data-th=\"Quantity\"><input class=\"form-control text-center\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ls.soluong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"number\">\n");
          out.write("                           </td> \n");
          out.write("                       <td data-th=\"Subtotal\" class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ls.thanhtien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" đ</td> \n");
          out.write("                       <td class=\"actions\" data-th=\"\">\n");
          out.write("                            <button class=\"btn btn-info btn-sm\" >Update</button> \n");
          out.write("                            <button class=\"btn btn-danger btn-sm\">Delete</button>\n");
          out.write("                           </td> \n");
          out.write("                    </tr> \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
