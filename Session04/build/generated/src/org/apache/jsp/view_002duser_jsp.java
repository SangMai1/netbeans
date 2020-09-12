package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User1DAO;
import model.User;
import java.util.List;
import model.UserDAO;

public final class view_002duser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            User1DAO dao = new User1DAO();
            List<User> ls = dao.getAll();
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>List Users 4</h2>\n");
      out.write("            <a href=\"UserServlet?action=AddOrEdit\" class=\"btn btn-primary\">Add Users</a>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>UserName</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th>FullName</th>\n");
      out.write("                        <th>Age</th>\n");
      out.write("                        <th>Birthday</th>\n");
      out.write("                        <th>Gender</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 for (int i = 0; i < ls.size(); i++) { 
                        User u = ls.get(i);
                        //in thong tin ra
                    
      out.write("\n");
      out.write("                           \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(u.getUsername() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(u.getPassword() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(u.getFullname() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(u.getAge() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(u.getBirthday() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(u.isGender() );
      out.write("</td>\n");
      out.write("                        <td><a class=\"btn btn-primary btn-sm\" href=\"UserServlet?action=AddOrEdit&username=");
      out.print(u.getUsername() );
      out.write("\">Edit</a> |\n");
      out.write("                            <a class=\"btn btn-danger btn-sm\" href=\"UserServlet?action=Delete&username=");
      out.print(u.getUsername() );
      out.write("\">Del</a></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");
} 
      out.write("\n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
