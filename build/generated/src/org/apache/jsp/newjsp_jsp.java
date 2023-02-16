package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"CoreUI - Open Source Bootstrap Admin Template\">\n");
      out.write("        <meta name=\"author\" content=\"?ukasz Holeczek\">\n");
      out.write("        <meta name=\"keyword\" content=\"Bootstrap,Admin,Template,Open,Source,jQuery,CSS,HTML,RWD,Dashboard\">\n");
      out.write("        <title>CoreUI Free Bootstrap Admin Template</title>\n");
      out.write("        <link rel=\"manifest\" href=\"assets/favicon/manifest.json\">\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\n");
      out.write("        <meta name=\"msapplication-TileImage\" content=\"assets/favicon/ms-icon-144x144.png\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("        <!-- Main styles for this application-->\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Global site tag (gtag.js) - Google Analytics-->\n");
      out.write("        <script async=\"\" src=\"https://www.googletagmanager.com/gtag/js?id=UA-118965717-3\"></script>\n");
      out.write("        <link href=\"vendors/pace-progress/css/pace.css\" rel=\"stylesheet\">\n");
      out.write("        <style type=\"text/css\">/* Chart.js */\n");
      out.write("            /*\n");
      out.write("             * DOM element rendering detection\n");
      out.write("             * https://davidwalsh.name/detect-node-insertion\n");
      out.write("             */\n");
      out.write("            @keyframes chartjs-render-animation {\n");
      out.write("                from { opacity: 0.99; }\n");
      out.write("                to { opacity: 1; }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chartjs-render-monitor {\n");
      out.write("                animation: chartjs-render-animation 0.001s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*\n");
      out.write("             * DOM element resizing detection\n");
      out.write("             * https://github.com/marcj/css-element-queries\n");
      out.write("             */\n");
      out.write("            .chartjs-size-monitor,\n");
      out.write("            .chartjs-size-monitor-expand,\n");
      out.write("            .chartjs-size-monitor-shrink {\n");
      out.write("                position: absolute;\n");
      out.write("                direction: ltr;\n");
      out.write("                left: 0;\n");
      out.write("                top: 0;\n");
      out.write("                right: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                pointer-events: none;\n");
      out.write("                visibility: hidden;\n");
      out.write("                z-index: -1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chartjs-size-monitor-expand > div {\n");
      out.write("                position: absolute;\n");
      out.write("                width: 1000000px;\n");
      out.write("                height: 1000000px;\n");
      out.write("                left: 0;\n");
      out.write("                top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chartjs-size-monitor-shrink > div {\n");
      out.write("                position: absolute;\n");
      out.write("                width: 200%;\n");
      out.write("                height: 200%;\n");
      out.write("                left: 0;\n");
      out.write("                top: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            window.dataLayer = window.dataLayer || [];\n");
      out.write("\n");
      out.write("            function gtag() {\n");
      out.write("                dataLayer.push(arguments);\n");
      out.write("            }\n");
      out.write("            gtag('js', new Date());\n");
      out.write("            // Shared ID\n");
      out.write("            gtag('config', 'UA-118965717-3');\n");
      out.write("            // Bootstrap ID\n");
      out.write("            gtag('config', 'UA-118965717-5');\n");
      out.write("        </script>\n");
      out.write("        <link href=\"node_modules/@coreui/chartjs/dist/css/coreui-chartjs.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"c-app\">\n");
      out.write("         <div class=\"c-sidebar c-sidebar-dark c-sidebar-fixed c-sidebar-lg-show\" id=\"sidebar\">\n");
      out.write("            <div class=\"c-sidebar-brand d-lg-down-none\">\n");
      out.write("                <svg class=\"c-sidebar-brand-full\" width=\"118\" height=\"46\" alt=\"CoreUI Logo\">\n");
      out.write("                <use xlink:href=\"assets/brand/coreui.svg#full\"></use>\n");
      out.write("                </svg>\n");
      out.write("                <svg class=\"c-sidebar-brand-minimized\" width=\"46\" height=\"46\" alt=\"CoreUI Logo\">\n");
      out.write("                <use xlink:href=\"assets/brand/coreui.svg#signet\"></use>\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"c-sidebar-nav\">\n");
      out.write("                <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"index.html\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-speedometer\"></use>\n");
      out.write("                        </svg> Dashboard<span class=\"badge badge-info\">NEW</span></a></li>\n");
      out.write("                <li class=\"c-sidebar-nav-title\">Theme</li>\n");
      out.write("                <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"colors.html\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-drop\"></use>\n");
      out.write("                        </svg> Colors</a></li>\n");
      out.write("                <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"typography.html\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-pencil\"></use>\n");
      out.write("                        </svg> Typography</a></li>\n");
      out.write("                <li class=\"c-sidebar-nav-title\">Components</li>\n");
      out.write("                <li class=\"c-sidebar-nav-item c-sidebar-nav-dropdown\"><a class=\"c-sidebar-nav-link c-sidebar-nav-dropdown-toggle\" href=\"#\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-puzzle\"></use>\n");
      out.write("                        </svg> Base</a>\n");
      out.write("                    <ul class=\"c-sidebar-nav-dropdown-items\">\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/breadcrumb.html\"><span class=\"c-sidebar-nav-icon\"></span> Breadcrumb</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/cards.html\"><span class=\"c-sidebar-nav-icon\"></span> Cards</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/carousel.html\"><span class=\"c-sidebar-nav-icon\"></span> Carousel</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/collapse.html\"><span class=\"c-sidebar-nav-icon\"></span> Collapse</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/forms.html\"><span class=\"c-sidebar-nav-icon\"></span> Forms</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/jumbotron.html\"><span class=\"c-sidebar-nav-icon\"></span> Jumbotron</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/list-group.html\"><span class=\"c-sidebar-nav-icon\"></span> List group</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/navs.html\"><span class=\"c-sidebar-nav-icon\"></span> Navs</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/pagination.html\"><span class=\"c-sidebar-nav-icon\"></span> Pagination</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/popovers.html\"><span class=\"c-sidebar-nav-icon\"></span> Popovers</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/progress.html\"><span class=\"c-sidebar-nav-icon\"></span> Progress</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/scrollspy.html\"><span class=\"c-sidebar-nav-icon\"></span> Scrollspy</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/switches.html\"><span class=\"c-sidebar-nav-icon\"></span> Switches</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/tables.html\"><span class=\"c-sidebar-nav-icon\"></span> Tables</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/tabs.html\"><span class=\"c-sidebar-nav-icon\"></span> Tabs</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"base/tooltips.html\"><span class=\"c-sidebar-nav-icon\"></span> Tooltips</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"c-sidebar-nav-item c-sidebar-nav-dropdown\"><a class=\"c-sidebar-nav-link c-sidebar-nav-dropdown-toggle\" href=\"#\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-cursor\"></use>\n");
      out.write("                        </svg> Buttons</a>\n");
      out.write("                    <ul class=\"c-sidebar-nav-dropdown-items\">\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"buttons/buttons.html\"><span class=\"c-sidebar-nav-icon\"></span> Buttons</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"buttons/button-group.html\"><span class=\"c-sidebar-nav-icon\"></span> Buttons Group</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"buttons/dropdowns.html\"><span class=\"c-sidebar-nav-icon\"></span> Dropdowns</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"buttons/brand-buttons.html\"><span class=\"c-sidebar-nav-icon\"></span> Brand Buttons</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"charts.html\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-chart-pie\"></use>\n");
      out.write("                        </svg> Charts</a></li>\n");
      out.write("                <li class=\"c-sidebar-nav-dropdown\"><a class=\"c-sidebar-nav-dropdown-toggle\" href=\"#\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-star\"></use>\n");
      out.write("                        </svg> Icons</a>\n");
      out.write("                    <ul class=\"c-sidebar-nav-dropdown-items\">\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"icons/coreui-icons-free.html\"> CoreUI Icons<span class=\"badge badge-success\">Free</span></a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"icons/coreui-icons-brand.html\"> CoreUI Icons - Brand</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"icons/coreui-icons-flag.html\"> CoreUI Icons - Flag</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"c-sidebar-nav-item c-sidebar-nav-dropdown\"><a class=\"c-sidebar-nav-link c-sidebar-nav-dropdown-toggle\" href=\"#\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-bell\"></use>\n");
      out.write("                        </svg> Notifications</a>\n");
      out.write("                    <ul class=\"c-sidebar-nav-dropdown-items\">\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"notifications/alerts.html\"><span class=\"c-sidebar-nav-icon\"></span> Alerts</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"notifications/badge.html\"><span class=\"c-sidebar-nav-icon\"></span> Badge</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"notifications/modals.html\"><span class=\"c-sidebar-nav-icon\"></span> Modals</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"widgets.html\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-calculator\"></use>\n");
      out.write("                        </svg> Widgets<span class=\"badge badge-info\">NEW</span></a></li>\n");
      out.write("                <li class=\"c-sidebar-nav-divider\"></li>\n");
      out.write("                <li class=\"c-sidebar-nav-title\">Extras</li>\n");
      out.write("                <li class=\"c-sidebar-nav-item c-sidebar-nav-dropdown\"><a class=\"c-sidebar-nav-link c-sidebar-nav-dropdown-toggle\" href=\"#\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-star\"></use>\n");
      out.write("                        </svg> Pages</a>\n");
      out.write("                    <ul class=\"c-sidebar-nav-dropdown-items\">\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"login.html\" target=\"_top\">\n");
      out.write("                                <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                                <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-account-logout\"></use>\n");
      out.write("                                </svg> Login</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"register.html\" target=\"_top\">\n");
      out.write("                                <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                                <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-account-logout\"></use>\n");
      out.write("                                </svg> Register</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"404.html\" target=\"_top\">\n");
      out.write("                                <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                                <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-bug\"></use>\n");
      out.write("                                </svg> Error 404</a></li>\n");
      out.write("                        <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link\" href=\"500.html\" target=\"_top\">\n");
      out.write("                                <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                                <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-bug\"></use>\n");
      out.write("                                </svg> Error 500</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"c-sidebar-nav-item mt-auto\"><a class=\"c-sidebar-nav-link c-sidebar-nav-link-success\" href=\"https://coreui.io\" target=\"_top\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-cloud-download\"></use>\n");
      out.write("                        </svg> Download CoreUI</a></li>\n");
      out.write("                <li class=\"c-sidebar-nav-item\"><a class=\"c-sidebar-nav-link c-sidebar-nav-link-danger\" href=\"https://coreui.io/pro/\" target=\"_top\">\n");
      out.write("                        <svg class=\"c-sidebar-nav-icon\">\n");
      out.write("                        <use xlink:href=\"node_modules/@coreui/icons/sprites/free.svg#cil-layers\"></use>\n");
      out.write("                        </svg> Try CoreUI<strong>PRO</strong></a></li>\n");
      out.write("            </ul>\n");
      out.write("            <button class=\"c-sidebar-minimizer c-class-toggler\" type=\"button\" data-target=\"_parent\" data-class=\"c-sidebar-minimized\"></button>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("      ");
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
