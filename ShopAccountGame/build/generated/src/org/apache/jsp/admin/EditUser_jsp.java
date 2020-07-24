package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  \r\n");
      out.write("        < <title>Edit User</title>\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  \r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"templatemo\">\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/templatemo-style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"templatemo-flex-row\">\r\n");
      out.write("            <div class=\"templatemo-sidebar\">\r\n");
      out.write("                <header class=\"templatemo-site-header\">\r\n");
      out.write("                    <div class=\"square\"></div>\r\n");
      out.write("                    <h1>Edit User</h1>\r\n");
      out.write("                </header>\r\n");
      out.write("                <div class=\"profile-photo-container\">\r\n");
      out.write("                    <img src=\"images/profile-photo.jpg\" alt=\"Profile Photo\" class=\"img-responsive\">\r\n");
      out.write("                    <div class=\"profile-photo-overlay\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Search box -->\r\n");
      out.write("                <form class=\"templatemo-search-form\" role=\"search\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <button type=\"submit\" class=\"fa fa-search\"></button>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <div class=\"mobile-menu-icon\">\r\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <nav class=\"templatemo-left-nav\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"IndexADM.jsp\"><i class=\"fa fa-home fa-fw\"></i>Home</a></li>\r\n");
      out.write("                        <li><a href=\"AddProduct.jsp\"><i class=\"fa fa-database fa-fw\"></i>Add Product</a></li>\r\n");
      out.write("                        <li><a href=\"ManageUsers.jsp\" class=\"active\"><i class=\"fa fa-users fa-fw\"></i>Manage Users</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Settings</a></li>\r\n");
      out.write("                        <li><a href=\"/ADMController?page=home\">Pages</a></li>\r\n");
      out.write("                        <li><a href=\"/ADMController?page=logout\"><i class=\"fa fa-eject fa-fw\"></i>Sign Out</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--Main-->\r\n");
      out.write("            <div class=\"templatemo-content col-1 light-gray-bg\">\r\n");
      out.write("                <div class=\"templatemo-top-nav-container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <nav class=\"templatemo-top-nav col-lg-12 col-md-12\">\r\n");
      out.write("                            <ul class=\"text-uppercase\">\r\n");
      out.write("                                <li><a href=\"IndexADM.jsp\">Admin panel</a></li>\r\n");
      out.write("                                <li><a href=\"ManageUsers.jsp\"class=\"active\">Overview</a></li>\r\n");
      out.write("                                <li><a href=\"/ADMController?page=logout\">Sign in form</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"templatemo-content-container\">\r\n");
      out.write("                   <div class=\"templatemo-content-widget white-bg\">\r\n");
      out.write("                        <h2 class=\"margin-bottom-10\">Edit User</h2>\r\n");
      out.write("                        <p></p>\r\n");
      out.write("                        <form method=\"post\" action=\"/ADMController\">\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"hidden\" name=\"page\" value=\"edit_user\">\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"hidden\" name=\"id\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"row form-group\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\">   \r\n");
      out.write("                                        <label>User Name</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\"  name=\"username\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" required >\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\">  \r\n");
      out.write("                                        <label>PassWord</label>\r\n");
      out.write("                                        <input type=\"text\"class=\"form-control\" name=\"password\"value=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\"  required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row form-group\">\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\">   \r\n");
      out.write("                                        <label>Full Name</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\"  name=\"fullname\" value=\"");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\" required >\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\"> \r\n");
      out.write("                                        <label>BirthDay</label>\r\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" name=\"birthDay\" value=\"");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("\"  required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row form-group\">\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\">  \r\n");
      out.write("                                        <label>Age</label>\r\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" name=\"age\" value=\"");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\">  \r\n");
      out.write("                                        <label>Role</label>\r\n");
      out.write("                                        <input type=\"text\"  class=\"form-control\" name=\"role\" value=\"");
      if (_jspx_meth_c_out_6(_jspx_page_context))
        return;
      out.write("\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row form-group\">\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\"> \r\n");
      out.write("                                        <label>Phone Number</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\"name=\"phone\" value=\"");
      if (_jspx_meth_c_out_7(_jspx_page_context))
        return;
      out.write("\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\"> \r\n");
      out.write("                                        <label>Email</label>\r\n");
      out.write("                                        <input type=\"email\"class=\"form-control\" name=\"email\" value=\"");
      if (_jspx_meth_c_out_8(_jspx_page_context))
        return;
      out.write("\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row form-group\">\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 form-group\"> \r\n");
      out.write("                                        <label>Address</label>\r\n");
      out.write("                                        <input type=\"text\"class=\"form-control\" name=\"address\" value=\"");
      if (_jspx_meth_c_out_9(_jspx_page_context))
        return;
      out.write("\" required>\r\n");
      out.write("                                </div> \r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                                    <div class=\"form-group text-right\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"templatemo-blue-button\" value=\"Process\">Edit</button>\r\n");
      out.write("                                        <button type=\"reset\" class=\"templatemo-white-button\">Reset</button>\r\n");
      out.write("                                    </div>   \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <footer class=\"text-right\">\r\n");
      out.write("                            <p>Copyright &copy; 2020 Company Name \r\n");
      out.write("                                | Designed by <a href=\"https://www.facebook.com/quanghien1107/\" target=\"_parent\">Development</a></p>\r\n");
      out.write("                        </footer>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- JS -->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/jquery-1.11.2.min.js\"></script>        <!-- jQuery -->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/bootstrap-filestyle.min.js\"></script>  <!-- http://markusslima.github.io/bootstrap-filestyle/ -->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/templatemo-script.js\"></script>        <!-- Templatemo Script -->\r\n");
      out.write("        </body>\r\n");
      out.write("        =======\r\n");
      out.write("        <label>Phone Number</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\"name=\"phone\" value=\"");
      if (_jspx_meth_c_out_10(_jspx_page_context))
        return;
      out.write("\" required>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-lg-6 col-md-6 form-group\"> \r\n");
      out.write("        <label>Email</label>\r\n");
      out.write("        <input type=\"email\"class=\"form-control\" name=\"email\" value=\"");
      if (_jspx_meth_c_out_11(_jspx_page_context))
        return;
      out.write("\" required>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row form-group\">\r\n");
      out.write("    <div class=\"col-lg-6 col-md-6 form-group\"> \r\n");
      out.write("        <label>Address</label>\r\n");
      out.write("        <input type=\"text\"class=\"form-control\" name=\"address\" value=\"");
      if (_jspx_meth_c_out_12(_jspx_page_context))
        return;
      out.write("\" required>\r\n");
      out.write("</div> \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"form-group text-right\">\r\n");
      out.write("    <button type=\"submit\" class=\"templatemo-blue-button\" value=\"Process\">Edit</button>\r\n");
      out.write("    <button type=\"reset\" class=\"templatemo-white-button\">Reset</button>\r\n");
      out.write("</div>   \r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"text-right\">\r\n");
      out.write("    <p>Copyright &copy; 2020 Company Name \r\n");
      out.write("        | Designed by <a href=\"https://www.facebook.com/quanghien1107/\" target=\"_parent\">Development</a></p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- JS -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.2.min.js\"></script>        <!-- jQuery -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-filestyle.min.js\"></script>  <!-- http://markusslima.github.io/bootstrap-filestyle/ -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/templatemo-script.js\"></script>        <!-- Templatemo Script -->\r\n");
      out.write("</body>\r\n");
      out.write(">>>>>>> Hiển\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuId()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getUserName()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getPasWord()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuFullName()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuBirthday()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent(null);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuAge() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent(null);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getRoles() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent(null);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuPhone() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_out_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent(null);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuEmail() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_out_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent(null);
    _jspx_th_c_out_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuAdrress() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_c_out_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent(null);
    _jspx_th_c_out_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuPhone() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }

  private boolean _jspx_meth_c_out_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_11.setPageContext(_jspx_page_context);
    _jspx_th_c_out_11.setParent(null);
    _jspx_th_c_out_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuEmail() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
    if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
    return false;
  }

  private boolean _jspx_meth_c_out_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_12.setPageContext(_jspx_page_context);
    _jspx_th_c_out_12.setParent(null);
    _jspx_th_c_out_12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getuAdrress() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
    if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
    return false;
  }
}
