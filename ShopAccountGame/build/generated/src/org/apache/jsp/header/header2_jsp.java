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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           <header class=\"home-page fixed-header\" style=\"background-color: #5BBD2B\">\n");
      out.write("            <nav id=\"sidebar\" class=\"navbar\">\n");
      out.write("                <div id=\"dismiss\">\n");
      out.write("                    <i class=\"fas fa-times\"></i>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"menu-list\">\n");
      out.write("                    <ul id=\"menu-content\" class=\"menu-content\">\n");
      out.write("                        <li class=\"mt-0 collapsed\" style=\"background-color: #40AB57\">\n");
      out.write("                            <div class=\"header-btn text-white\">\n");
      out.write("                                <i class=\"fas fa-user-circle\" style=\"font-size: 30px;\"></i>\n");
      out.write("                                <span class=\"text-white\">\n");
      out.write("                                    <a href=\"#\" class=\"text-white\">Đăng nhập </a>\n");
      out.write("                                    <br>\n");
      out.write("                                    <small style=\"margin: 40px;\">Xem nhiều thông tin hơn</small>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-home icon-font18\"></i>Trang chủ</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li data-toggle=\"collapse\" data-target=\"#danh-muc\" class=\"collapsed\">\n");
      out.write("                            <a><i class=\"fa fa-bars icon-font18\"></i>Danh mục sản phẩm <i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <ul class=\"sub-menu collapse\" id=\"danh-muc\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <i class=\"fab fa-steam-symbol\"></i>\n");
      out.write("                                    Liên Quân              </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-trophy\"></i>\n");
      out.write("                                    Liên Minh              </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <i class=\"icon icon-origin-svg\"></i>\n");
      out.write("                                    FiFa              </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-mobile-alt\"></i>\n");
      out.write("                                    Nạp Game Mobile              </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <hr>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i\n");
      out.write("                                    class=\"fab fa-hotjar\"></i>Sản Phẩm Hot</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i\n");
      out.write("                                    class=\"fas fa-award\"></i>Sản Phẩm Tốt</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i\n");
      out.write("                                    class=\"far fa-credit-card\"></i>Hình thức thanh toán</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i\n");
      out.write("                                    class=\"fas fa-gamepad\"></i>Hướng dẫn mua hàng</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <hr>\n");
      out.write("                        <!-- Link face và số đt-->\n");
      out.write("\n");
      out.write("                        <li style=\"margin: 0;\"><a href=\"#\" style=\"font-size: 17px;\"><i class=\"fa fa-phone\"></i>HOTLINE:\n");
      out.write("                                1900 123 456 </a></li>\n");
      out.write("                        <li style=\"margin: 0;\"><a href=\"#\" style=\"font-size: 17px;\" target=\"_blank\"><i\n");
      out.write("                                    class=\"fab fa-facebook-messenger\"></i>Nhắn tin cho Shop </a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"overlay\"></div>\n");
      out.write("            <script src=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/bigshop/js/jquery.autocomplete.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("                        $(\"#filter_name\").autocomplete(\"getdata.php?lan=vi\", {\n");
      out.write("                            width: 450,\n");
      out.write("                            resultsClass: \"ac_results col-lg-7\",\n");
      out.write("                            matchContains: true\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        $(\"#home-cart\").hover(\n");
      out.write("                                function () {\n");
      out.write("                                    $('#dropdown-detail-cart').css(\"display\", \"block\");\n");
      out.write("                                },\n");
      out.write("                                function () {\n");
      out.write("                                    $('#dropdown-detail-cart').css(\"display\", \"none\");\n");
      out.write("                                }\n");
      out.write("                        );\n");
      out.write("\n");
      out.write("                        $(\".home-mini-profile\").hover(\n");
      out.write("                                function () {\n");
      out.write("                                    $('.drop-mini-profile').css(\"display\", \"block\");\n");
      out.write("                                },\n");
      out.write("                                function () {\n");
      out.write("                                    $('.drop-mini-profile').css(\"display\", \"none\");\n");
      out.write("                                }\n");
      out.write("                        );\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("            </script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $('#dismiss, .overlay').on('click', function () {\n");
      out.write("                        $('#sidebar').removeClass('active');\n");
      out.write("                        $('.overlay').removeClass('active');\n");
      out.write("                        $('body').css('position', 'unset');\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $('#sidebarCollapse').on('click', function () {\n");
      out.write("                        $('#sidebar').addClass('active');\n");
      out.write("                        $('.overlay').addClass('active');\n");
      out.write("                        $('.collapse.in').toggleClass('in');\n");
      out.write("                        $('a[aria-expanded=true]').attr('aria-expanded', 'false');\n");
      out.write("                        $('body').css('position', 'fixed');\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <div class=\"header-container container\">\n");
      out.write("                <div id=\"sidebarCollapse\" class=\"btn-menu\">\n");
      out.write("                    <i class=\"fas fa-bars\" style=\"font-size: 20px; vertical-align: middle\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"logo\"><a href=\"#\"><img style=\"margin-right: 10px;width: 60px\"\n");
      out.write("                                                                                                   src=\"#\" />\n");
      out.write("                        <img style=\"width: 100px;\" src=\"#\" /></a></div>\n");
      out.write("                <div class=\"search-form\">\n");
      out.write("                    <div class=\"search-control\" id=\"search\">\n");
      out.write("                        <input type=\"text\" id=\"filter_name\" class=\"search-box\" name=\"search\" value=\"\"\n");
      out.write("                               placeholder=\"Nhập sản phẩm cần tìm...\">\n");
      out.write("                        <div class=\"search-btn\" id=\"button-search-header\">\n");
      out.write("                            <i class=\"fas fa-search\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cart-mobile\">\n");
      out.write("                    <div class=\"align-items-center d-flex\" id=\"update-cart-mobile\">\n");
      out.write("                        <a href=\"#\"><i class=\"fas fa-shopping-cart cart-size-mobile\"></i> <span\n");
      out.write("                                class=\"quantity_mobile\">0</span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-btn\">\n");
      out.write("                    <div class=\"header-btn d-flex flex-row\">\n");
      out.write("                        <div class=\"d-flex align-items-center ml-1\">\n");
      out.write("                            <a href=\"#\" class=\"text-white\">Đăng nhập </a>\n");
      out.write("                            <span>/</span>\n");
      out.write("                            <a href=\"#\" class=\"text-white\">Đăng kí</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("  <!--gio hang-->\n");
      out.write("<div id=\"home-cart\" class=\"dropdown dropdown-header shopping-cart mg-cart\">\n");
      out.write("                      <div data-toggle=\"dropdown\" data-loading-text=\"Đang tải...\" class=\"heading dropdown-toggle\"\n");
      out.write("              aria-expanded=\"false\">\n");
      out.write("              <div class=\"align-items-center d-flex\" id=\"update-cart\">\n");
      out.write("                <i class=\"fas fa-shopping-cart cart-size text-white\"></i><b class=\"cart-text\">Giỏ hàng</b><span\n");
      out.write("                  class=\"quantity\">1</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              <ul class=\"dropdown-menu drop-mini-cart\" id=\"dropdown-detail-cart\">\n");
      out.write("                <div class=\"text-cart-current\">\n");
      out.write("                  Giỏ hàng hiện tại\n");
      out.write("                </div>\n");
      out.write("                                <li class=\"dropdown-item padding-table-cart\">\n");
      out.write("                  <table class=\"table\" id=\"detail_cart\">\n");
      out.write("                    <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                        <td class=\"text-left hide-text-option-cart\">\n");
      out.write("                                                    <a\n");
      out.write("                            href=\"https://divineshop.vn/index.php?route=product/product&product_id=\">Left 4 Dead 2</a>\n");
      out.write("                          \n");
      out.write("                                                                            </td>\n");
      out.write("                        <td class=\"text-right\"><i style=\"color: black\">Số lượng: 1</i></td>\n");
      out.write("                        <td class=\"text-right\">119,000 VNĐ</td>\n");
      out.write("                        <td class=\"text-center\"><button type=\"button\"\n");
      out.write("                            onclick=\"cart.remove('3099992');\" title=\"Loại bỏ\"\n");
      out.write("                            class=\"btn btn-danger btn-xs remove\"><i class=\"fa fa-times text-remove\"></i>\n");
      out.write("                          </button></td>\n");
      out.write("                      </tr>\n");
      out.write("                                          </tbody>\n");
      out.write("                  </table>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"dropdown-item padding-table-cart\">\n");
      out.write("                  <div class=\"total-cart\">\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                      <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"text-right\"><strong>Thành tiền</strong></td>\n");
      out.write("                          <td class=\"text-right\">119,000 VNĐ</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"text-right\"><strong>Tổng đơn hàng</strong></td>\n");
      out.write("                          <td class=\"text-right\">119,000 VNĐ</td>\n");
      out.write("                        </tr>\n");
      out.write("                                                                        <tr>\n");
      out.write("                          <td class=\"text-right\"><strong>Tổng tiền phải nạp thêm</strong></td>\n");
      out.write("                          <td class=\"text-right\">\n");
      out.write("                            119,000                            <i class=\"icon-coin-dollar\" style=\"color: black\"></i></td>\n");
      out.write("                        </tr>\n");
      out.write("                                              </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <p class=\"checkout\">\n");
      out.write("                      \n");
      out.write("                      <a class=\"btn btn_cart_bottom\" href=\"https://divineshop.vn/index.php?route=checkout/cart\" style=\"width: 50%;\"><i\n");
      out.write("                          class=\"fa fa-eye icon-cart-bottom\"></i> Xem\n");
      out.write("                        chi tiết giỏ hàng\n");
      out.write("                      </a>\n");
      out.write("\n");
      out.write("                      <a class=\"btn btn-primary\"\n");
      out.write("                        style=\"color:#fff; width: 50%; padding: 6px 30px 6px 30px; background-image:linear-gradient(to right, #5db8ec 0%, #2584e4 51%) !important \"\n");
      out.write("                        href=\"index.php?route=account/recharge\"><i class=\"fa fa-wallet\"></i>\n");
      out.write("                        Nạp tiền\n");
      out.write("                      </a>\n");
      out.write("                      <br>\n");
      out.write("                                          </p>\n");
      out.write("                  </div>\n");
      out.write("                </li>\n");
      out.write("                              </ul>\n");
      out.write("          </div>\n");
      out.write("        <!-------->\n");
      out.write("  \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                  \n");
      out.write("        </header>\n");
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