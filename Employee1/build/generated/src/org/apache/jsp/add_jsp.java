package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Employee;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String action = request.getParameter("action");
    Employee ee = null;
    if (action == null || action.equals("")) {
            ee = new Employee("", "", true);
            action = "add";
        } else {
            ee = (Employee) request.getAttribute("EMPLOYEE");
            action = (String) request.getAttribute("ACTION");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Them Nhan Vien</h2>\n");
      out.write("            <form action=\"EmployeeServlet\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label>ID:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Enter Id\" name=\"id\" value=\"");
      out.print(ee.getId() );
      out.write("\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label>Name:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Enter name\" name=\"name\" value=\"");
      out.print(ee.getName() );
      out.write("\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label>Gioi Tinh:</label>\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                    <label class=\"form-check-label\">\n");
      out.write("                        ");

                            String s = "";
                            String b = "";
                            if (action == null || action.equals("")) {
                                    s = "checked";
                                } else {
                                if (ee.isGender()) {
                                        s = "checked";
                                    } else {
                                    b = "checked";
                                }
                            }
                        
      out.write("\n");
      out.write("                        <input type=\"radio\" class=\"form-check-input\" name=\"gender\" ");
      out.print(s );
      out.write(" value=\"Nam\">Nam\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <label class=\"form-check-label\">\n");
      out.write("                        <input type=\"radio\" class=\"form-check-input\" name=\"gender\" ");
      out.print(b );
      out.write(" value=\"Nữ\">Nữ\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\" name=\"action\" value=\"");
      out.print(action );
      out.write('"');
      out.write('>');
      out.print(action );
      out.write("</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
