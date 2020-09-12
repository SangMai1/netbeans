package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.DateHelper;
import model.User;

public final class register_002duser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String action = (String) request.getAttribute("ACTION");
    User u = (User)request.getAttribute("USER");
    if (action == null) {
            action = "SaveOrUpdate";
        }
    if (u == null) {
            u = new User("", "", "", 0, DateHelper.now(), true);
        }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" style=\"margin-top: 10px;\">\n");
      out.write("            <div class=\"row\" style=\"border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;\" >\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <h2>Register</h2>\n");
      out.write("                    <form action=\"UserServlet\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"action\" value=\"");
      out.print(action );
      out.write("\" >\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>UserName</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"username\" value=\"");
      out.print( u.getUsername() );
      out.write("\" placeholder=\"Enter UserName\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Password:</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"password\" value=\"");
      out.print( u.getPassword() );
      out.write("\" placeholder=\"Enter password\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>FullName</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"fullname\" value=\"");
      out.print( u.getFullname() );
      out.write("\" placeholder=\"Enter fullname\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Age</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" name=\"age\" value=\"");
      out.print( u.getAge() );
      out.write("\" placeholder=\"Enter age\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Birthday</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" name=\"birthday\" value=\"");
      out.print( u.getBirthday() );
      out.write("\" style=\"padding: 0px 12px\" placeholder=\"Enter Birthday\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Gender</label>\n");
      out.write("                            <div class=\"radio\"><!--value = 1 => Nam| 0 =>Nu -->\n");
      out.write("                                <label class=\"checkbox-inline\"><input type=\"radio\" name=\"gender\"  value=\"1\" ");
if (u.isGender()) {out.print("checked");}
      out.write(">Male</label>\n");
      out.write("                                <label class=\"checkbox-inline\"><input type=\"radio\" name=\"gender\"  value=\"0\" ");
if (!u.isGender()) {out.print("checked");} 
      out.write("> Female</label>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-primary\">Cancel</button>\n");
      out.write("                        <a href=\"UserServlet?action=List\" class=\"btn btn-primary\">Display Users</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
