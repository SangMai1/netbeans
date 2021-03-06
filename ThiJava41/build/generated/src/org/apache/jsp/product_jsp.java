package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body\n");
      out.write("        <div class=\"container\" style=\"margin-top: 10px;\">\n");
      out.write("            <div class=\"row\" style=\"border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;\" >\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <h2>San Pham</h2>\n");
      out.write("                    <form action=\"ProductServlet\">\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ACTION == null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <c:set var=\"ACTION\" value=\"SaveOrUpdate\"/>\n");
      out.write("                        </c:if>\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"action\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ACTION}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Ma SP</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"maSp\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PRODUCT.maSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Enter Ma SP\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Ten SP</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"tenSp\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PRODUCT.tenSp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Enter Ten SP\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Ngay nhap</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" name=\"ngayNhap\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PRODUCT.ngayNhap}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Enter ngay nhap\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>So Luong</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" name=\"soLuong\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PRODUCT.soLuong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Enter So Luong\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Gia Tien</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"giaTien\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PRODUCT.giaTien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Enter Gia Tien\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-primary\">Cancel</button>\n");
      out.write("                        <a href=\"ProductServlet?action=List\" class=\"btn btn-primary\">Display product</a>\n");
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
