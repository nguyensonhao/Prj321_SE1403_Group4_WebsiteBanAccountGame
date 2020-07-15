package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <h1>\n");
      out.write("                Welcome admin\n");
      out.write("            </h1>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"IndexADM.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"AddProduct.jsp\">Add Product</a></li>\n");
      out.write("                    <li><a href=\"#\">Settings</a></li>\n");
      out.write("                    <li><a href=\"#\">Pages</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"signup-header\">\n");
      out.write("            <h2>Add Product</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"AdminProduce\">\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"page\" value=\"add_product\">\n");
      out.write("\n");
      out.write("            <div class=\"signup-group\">\n");
      out.write("                <label>Name</label>\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"product name goes here\"  required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"signup-group\">\n");
      out.write("                <label>Price</label>\n");
      out.write("                <input type=\"text\" name=\"price\" placeholder=\"product price\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"signup-group\">\n");
      out.write("                <label>Type</label>\n");
      out.write("                <input type=\"text\" name=\"type\" placeholder=\"product Type\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"signup-group\">\n");
      out.write("                <label>Description</label>\n");
      out.write("                <input type=\"text\" name=\"description\" placeholder=\"product Description\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"signup-group\">\n");
      out.write("                <label>Code Produce</label>\n");
      out.write("                <input type=\"text\" name=\"codeproduce\" placeholder=\"product Code Produce\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"signup-group\">\n");
      out.write("                <label for=\"fileupload\"> Select an image to upload</label>\n");
      out.write("                <input type=\"file\" name=\"image\" required><br>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"signup-group\">\n");
      out.write("                <label>Price Sale</label>\n");
      out.write("                <input type=\"text\" name=\"Sale\" placeholder=\"product price Sale\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"signup-group\">\n");
      out.write("                <input type=\"submit\" value=\"Process\">\t \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <footer style=\"position: absolute;left: 0;bottom: 0;width: 100%;\">\n");
      out.write("            <div class=\"footer\"> &copy; 2020 Copyright:\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
