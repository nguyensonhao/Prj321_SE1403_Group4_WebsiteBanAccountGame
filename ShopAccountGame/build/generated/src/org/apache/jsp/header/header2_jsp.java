package org.apache.jsp.header;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("           <header class=\"home-page fixed-header\" style=\"background-color: #5BBD2B\">\r\n");
      out.write("            <nav id=\"sidebar\" class=\"navbar\">\r\n");
      out.write("                <div id=\"dismiss\">\r\n");
      out.write("                    <i class=\"fas fa-times\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"menu-list\">\r\n");
      out.write("                    <ul id=\"menu-content\" class=\"menu-content\">\r\n");
      out.write("                        <li class=\"mt-0 collapsed\" style=\"background-color: #40AB57\">\r\n");
      out.write("                            <div class=\"header-btn text-white\">\r\n");
      out.write("                                <i class=\"fas fa-user-circle\" style=\"font-size: 30px;\"></i>\r\n");
      out.write("                                <span class=\"text-white\">\r\n");
      out.write("                                    <a href=\"#\" class=\"text-white\">Đăng nhập </a>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <small style=\"margin: 40px;\">Xem nhiều thông tin hơn</small>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-home icon-font18\"></i>Trang chủ</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li data-toggle=\"collapse\" data-target=\"#danh-muc\" class=\"collapsed\">\r\n");
      out.write("                            <a><i class=\"fa fa-bars icon-font18\"></i>Danh mục sản phẩm <i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <ul class=\"sub-menu collapse\" id=\"danh-muc\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fab fa-steam-symbol\"></i>\r\n");
      out.write("                                    Liên Quân              </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-trophy\"></i>\r\n");
      out.write("                                    Liên Minh              </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"icon icon-origin-svg\"></i>\r\n");
      out.write("                                    FiFa              </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-mobile-alt\"></i>\r\n");
      out.write("                                    Nạp Game Mobile              </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i\r\n");
      out.write("                                    class=\"fab fa-hotjar\"></i>Sản Phẩm Hot</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i\r\n");
      out.write("                                    class=\"fas fa-award\"></i>Sản Phẩm Tốt</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i\r\n");
      out.write("                                    class=\"far fa-credit-card\"></i>Hình thức thanh toán</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i\r\n");
      out.write("                                    class=\"fas fa-gamepad\"></i>Hướng dẫn mua hàng</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <!-- Link face và số đt-->\r\n");
      out.write("\r\n");
      out.write("                        <li style=\"margin: 0;\"><a href=\"#\" style=\"font-size: 17px;\"><i class=\"fa fa-phone\"></i>HOTLINE:\r\n");
      out.write("                                1900 123 456 </a></li>\r\n");
      out.write("                        <li style=\"margin: 0;\"><a href=\"#\" style=\"font-size: 17px;\" target=\"_blank\"><i\r\n");
      out.write("                                    class=\"fab fa-facebook-messenger\"></i>Nhắn tin cho Shop </a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"overlay\"></div>\r\n");
      out.write("            <script src=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/bigshop/js/jquery.autocomplete.js\" type=\"text/javascript\"></script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        $(\"#filter_name\").autocomplete(\"getdata.php?lan=vi\", {\r\n");
      out.write("                            width: 450,\r\n");
      out.write("                            resultsClass: \"ac_results col-lg-7\",\r\n");
      out.write("                            matchContains: true\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                        $(\"#home-cart\").hover(\r\n");
      out.write("                                function () {\r\n");
      out.write("                                    $('#dropdown-detail-cart').css(\"display\", \"block\");\r\n");
      out.write("                                },\r\n");
      out.write("                                function () {\r\n");
      out.write("                                    $('#dropdown-detail-cart').css(\"display\", \"none\");\r\n");
      out.write("                                }\r\n");
      out.write("                        );\r\n");
      out.write("\r\n");
      out.write("                        $(\".home-mini-profile\").hover(\r\n");
      out.write("                                function () {\r\n");
      out.write("                                    $('.drop-mini-profile').css(\"display\", \"block\");\r\n");
      out.write("                                },\r\n");
      out.write("                                function () {\r\n");
      out.write("                                    $('.drop-mini-profile').css(\"display\", \"none\");\r\n");
      out.write("                                }\r\n");
      out.write("                        );\r\n");
      out.write("\r\n");
      out.write("                    });\r\n");
      out.write("            </script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $(document).ready(function () {\r\n");
      out.write("                    $('#dismiss, .overlay').on('click', function () {\r\n");
      out.write("                        $('#sidebar').removeClass('active');\r\n");
      out.write("                        $('.overlay').removeClass('active');\r\n");
      out.write("                        $('body').css('position', 'unset');\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    $('#sidebarCollapse').on('click', function () {\r\n");
      out.write("                        $('#sidebar').addClass('active');\r\n");
      out.write("                        $('.overlay').addClass('active');\r\n");
      out.write("                        $('.collapse.in').toggleClass('in');\r\n");
      out.write("                        $('a[aria-expanded=true]').attr('aria-expanded', 'false');\r\n");
      out.write("                        $('body').css('position', 'fixed');\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("               <c:set var=\"x\" value=\"0\"></c:set>\r\n");
      out.write("\t<c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartlist }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"i\">\r\n");
      out.write("\t\t<c:set var=\"x\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></c:set>\r\n");
      out.write("\t</c:forEach>\r\n");
      out.write("            <div class=\"header-container container\">\r\n");
      out.write("                <div id=\"sidebarCollapse\" class=\"btn-menu\">\r\n");
      out.write("                    <i class=\"fas fa-bars\" style=\"font-size: 20px; vertical-align: middle\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"logo\"><a href=\"#\"><img style=\"margin-right: 10px;width: 60px\"\r\n");
      out.write("                                                                                                   src=\"#\" />\r\n");
      out.write("                        <img style=\"width: 100px;\" src=\"img/lucky.png\" /></a></div>\r\n");
      out.write("                <div class=\"search-form\">\r\n");
      out.write("                    <div class=\"search-control\" id=\"search\">\r\n");
      out.write("                        <input type=\"text\" id=\"filter_name\" class=\"search-box\" name=\"search\" value=\"\"\r\n");
      out.write("                               placeholder=\"Nhập sản phẩm cần tìm...\">\r\n");
      out.write("                        <div class=\"search-btn\" id=\"button-search-header\">\r\n");
      out.write("                            <i class=\"fas fa-search\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cart-mobile\">\r\n");
      out.write("                    <div class=\"align-items-center d-flex\" id=\"update-cart-mobile\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fas fa-shopping-cart cart-size-mobile\"></i> <span\r\n");
      out.write("                                class=\"quantity_mobile\">0</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"header-btn\">\r\n");
      out.write("                    <div class=\"header-btn d-flex flex-row\">\r\n");
      out.write("                        <div class=\"d-flex align-items-center ml-1\">\r\n");
      out.write("                            <i class=\"fas fa-user-circle\" style=\"font-size: 40px;\"></i>\r\n");
      out.write("                            <span>&#160</span>\r\n");
      out.write("                            <b style=\"font-size: 20px;\"> <c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></c:out>  </b>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"home-cart\" class=\"dropdown dropdown-header shopping-cart\">\r\n");
      out.write("                        <div data-toggle=\"dropdown\" data-loading-text=\"Đang tải...\" class=\"heading dropdown-toggle\"\r\n");
      out.write("                             aria-expanded=\"false\">\r\n");
      out.write("                            <div class=\"align-items-center d-flex\" id=\"update-cart\">\r\n");
      out.write("                                <i class=\"fas fa-shopping-cart cart-size text-white\"></i><a href=\"cart.jsp\"><b class=\"cart-text\">Giỏ hàng</b></a><span\r\n");
      out.write("                                    class=\"quantity\"><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></c:out></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("    </body>\r\n");
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
}
