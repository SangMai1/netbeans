package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_002demployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Danh sach sinh vien</h2>           \n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th>ID</th>\n");
      out.write("                  <th>NAME</th>\n");
      out.write("                  <th>GENDER</th>\n");
      out.write("                  <th>ACTION</th>\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1</td>\n");
      out.write("                  <td>Sang</td>\n");
      out.write("                  <td>Nam</td>\n");
      out.write("                  <td>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">EDIT</a>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-danger\">DEL</a>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>2</td>\n");
      out.write("                  <td>Hoa</td>\n");
      out.write("                  <td>Nu</td>\n");
      out.write("                  <td>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">EDIT</a>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-danger\">DEL</a>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>3</td>\n");
      out.write("                  <td>Son</td>\n");
      out.write("                  <td>Nam</td>\n");
      out.write("                  <td>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">EDIT</a>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-danger\">DEL</a>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
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
