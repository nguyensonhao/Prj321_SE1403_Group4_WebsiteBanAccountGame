package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header/header2.jsp");
    _jspx_dependants.add("/header/header3.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header1.jsp", out, false);
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <!-- Google Tag Manager (noscript) -->\r\n");
      out.write("            <noscript>\r\n");
      out.write("            <iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM\" height=\"0\" width=\"0\"\r\n");
      out.write("                    style=\"display:none;visibility:hidden\"></iframe>\r\n");
      out.write("            </noscript>\r\n");
      out.write("            <!-- End Google Tag Manager (noscript) -->\r\n");
      out.write("\r\n");
      out.write("           <div class=\"top-header\" style=\"background-color: #088A08\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\" style=\"opacity: 0.7\">\r\n");
      out.write("                        <div class=\"slide-news\">\r\n");
      out.write("                            <div class=\"w3-content w3-section\">\r\n");
      out.write("\r\n");
      out.write("                                <a class=\"left carousel-control\" role=\"button\">\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                                <a class=\"right carousel-control\" role=\"button\">\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                    <span class=\"sr-only\">Next</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"marquee-slide\">\r\n");
      out.write("                                    <a href=\"accountLienQuan.jsp\" class=\"mySlides\" id=\"new-slide-0\">\r\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                        Liên Quân              </a>\r\n");
      out.write("                                    <a href=\"accountLienMinh.jsp\" class=\"mySlides\" id=\"new-slide-1\">\r\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                        Liên Minh              </a>\r\n");
      out.write("                                    <a href=\"accountFifa.jsp\" class=\"mySlides\" id=\"new-slide-2\">\r\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                        Fifa              </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"text-right\" style=\"padding:5px 0;float: right\">\r\n");
      out.write("                            Hỗ trợ 1900 633 305\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <header>\r\n");
      out.write("            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        <script>\r\n");
      out.write("            var time_run_link = \"5\" * 1000;\r\n");
      out.write("            var lang = \"vi\";\r\n");
      out.write("            var check_login = true;\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            .banner-home .menu-2 .header-menu div.nav-menu {\r\n");
      out.write("                display: none;\r\n");
      out.write("                height: auto;\r\n");
      out.write("                margin: auto;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $(\"#category-product\").hover(\r\n");
      out.write("                    function () {\r\n");
      out.write("                        $(this).css(\"cursor\", \"pointer\");\r\n");
      out.write("                        $('.drop-category').css(\"display\", \"grid\");\r\n");
      out.write("                    }, function () {\r\n");
      out.write("                $('.drop-category').css(\"display\", \"none\");\r\n");
      out.write("            }\r\n");
      out.write("            );\r\n");
      out.write("        </script><link rel=\"stylesheet\" href=\"./assets/catalog/checkout/cart.css\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"trang-sp\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div id=\"alert-position\"></div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container-title\">\r\n");
      out.write("                    <h2 class=\"thanh-toan-title\">Giỏ Hàng</h2><span class=\"count-san-pham\">(1 sản phẩm)</span>\r\n");
      out.write("                    <div class=\"sort\">\r\n");
      out.write("                        <a href=\"index.jsp\"><div class=\"btn btn-aqua-bg\">Tiếp tục mua hàng</div></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr>\r\n");
      out.write("                  <div class=\"row cart-detail\">\r\n");
      out.write("                    <table id=\"cart\" class=\"table table-hover table-condensed\" > \r\n");
      out.write("                        <thead> \r\n");
      out.write("                            <tr> \r\n");
      out.write("                                <th style=\"width:50% \">Tên sản phẩm</th> \r\n");
      out.write("                                <th style=\"width:10%\">Giá</th> \r\n");
      out.write("                                <th style=\"width:8%\">Số lượng</th> \r\n");
      out.write("                                \r\n");
      out.write("                                <th style=\"width:22%\" class=\"text-center\">Thể Loại</th> \r\n");
      out.write("                                <th style=\"width:10%\"> </th> \r\n");
      out.write("                            </tr> \r\n");
      out.write("                        </thead> \r\n");
      out.write("                        <tbody>\r\n");
      out.write("                      \r\n");
      out.write("                            ");
      if (_jspx_meth_c_set_6(_jspx_page_context))
        return;
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </form\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                     \r\n");
      out.write("                    </table>\r\n");
      out.write("                </div> \r\n");
      out.write("                                <hr>\r\n");
      out.write("                        <div class=\"mb15\"></div>\r\n");
      out.write("                        <div class=\"thanh-toan\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-12 col-xs-12 padd-0\">\r\n");
      out.write("                                    <div class=\"col-md-6 col-xs-12 padd-0\">\r\n");
      out.write("                                        <div class=\"panel-group\" id=\"accordion\">\r\n");
      out.write("                                            <div class=\"panel panel-default\">\r\n");
      out.write("                                                <div class=\"panel-heading\">\r\n");
      out.write("                                                    <h4 class=\"panel-title\"><a href=\"#collapse-coupon\" class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#accordion\"><strong>Nhập Email Để Mua Hàng</strong></a></h4>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"panel-body\">\r\n");
      out.write("                                                    <div class=\"input-group\">\r\n");
      out.write("                                                        <input type=\"text\" name=\"coupon\" value=\"\" placeholder=\"Nhập Email để mua hàng\" id=\"input-coupon\" class=\"form-control\" />\r\n");
      out.write("                                                        <span class=\"input-group-btn\">\r\n");
      out.write("                                                            <input type=\"button\" value=\"Sử dụng\" id=\"button-coupon\" data-loading-text=\"Đang tải...\" style=\"color: #fff;background-color: #21beff;border-color: #21beff;\" class=\"btn btn-primary\"  />\r\n");
      out.write("                                                        </span></div>\r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-6 col-sm-12 col-xs-12 padd-0\">\r\n");
      out.write("                                        <div class=\"order-total\">\r\n");
      out.write("                                            <div class=\"panel panel-default\">\r\n");
      out.write("                                                <div class=\"panel-heading\" style=\"border-color: transparent;\">\r\n");
      out.write("                                                    <h4 class=\"panel-title\"><strong>THÔNG TIN THANH TOÁN</strong></h4>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"panel-body\">\r\n");
      out.write("                                                    <div class=\"row\">\r\n");
      out.write("                                                        <!-- Thành Tiền -->\r\n");
      out.write("                                                        <div class=\"col-md-12col-sm-12 col-xs-12 padd-0 margin-item\">\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0\">\r\n");
      out.write("                                                                <span class=\"text-gray\">Thành tiền sản phẩm</span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0 text-right\">\r\n");
      out.write("                                                                <span class=\"thanh-tien\">");
      if (_jspx_meth_c_out_9(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        <!-- Border Bottom Nét Đứt -->\r\n");
      out.write("                                                        <div class=\"col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash\"></div>\r\n");
      out.write("\r\n");
      out.write("                                                        <!-- Tổng Tiền -->\r\n");
      out.write("                                                        <div class=\"col-md-12 col-sm-12 col-xs-12 padd-0 margin-item\">\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0\">\r\n");
      out.write("                                                                <div class=\"h16-md-26 text-gray-900\">TỔNG TIỀN</div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0 text-right\">\r\n");
      out.write("                                                                <div class=\"h16-bo-26 text-primary\">");
      if (_jspx_meth_c_out_10(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                                        <!-- Border Bottom Nét Đứt -->\r\n");
      out.write("                                                        <div class=\"col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash\"></div>\r\n");
      out.write("                                                        <!-- Thưởng Tiền + Số Dư Hiện Tại -->\r\n");
      out.write("                                                        <div class=\"col-md-12 col-sm-12 col-xs-12 padd-0 margin-item\">\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0\">\r\n");
      out.write("                                                                <span class=\"text-gray\">Mã giảm giá</span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0 text-right\">\r\n");
      out.write("                                                                <span class=\"thanh-tien\">0%</span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"col-md-12 col-sm-12 col-xs-12 padd-0 margin-item\">\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0\">\r\n");
      out.write("                                                                <span class=\"text-gray\">Giảm giá</span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0 text-right\">\r\n");
      out.write("                                                                <span class=\"thanh-tien\"><b style=\"color:#000;\">VNĐ</b></i></span>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                                        <!-- Border Bottom Nét Đứt -->\r\n");
      out.write("                                                        <div class=\"col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash\"></div>\r\n");
      out.write("                                                        <!-- Số Tiền Cần Nạp Thêm -->\r\n");
      out.write("                                                        <div class=\"col-md-12 col-sm-12 col-xs-12 padd-0 margin-item\">\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0\">\r\n");
      out.write("                                                                <div class=\"h16-md-26 text-gray-900\">Số Tiền Bạn Cần Chi Trả</div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"col-md-6 col-sm-6 col-xs-6 padd-0 text-right\">\r\n");
      out.write("                                                                <div class=\"h16-bo-26 text-primary\">");
      if (_jspx_meth_c_out_11(_jspx_page_context))
        return;
      out.write(" <b style=\"color:#000;\">VNĐ</b></div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <a href=\"/\">\r\n");
      out.write("                                                            <button type=\"button\" class=\"btn btn-danger col-md-12 col-sm-12 col-xs-12\"><strong style=\"color:#fff;\">Thanh Toán</strong></button>\r\n");
      out.write("                                                        </a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <div class=\"buttons clearfix\">\r\n");
      out.write("                            <div class=\"pull-left\"><a href=\"index.jsp\" class=\"btn btn-default\">Tiếp tục mua hàng</a></div>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"./assets/catalog/checkout/cart.js\"></script>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"footer-top\" style=\"margin-top:20px;\">\r\n");
      out.write("                <div class=\"container mt-0\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 flex-row\">\r\n");
      out.write("                            <div class=\"img\">\r\n");
      out.write("                                <img src=\"https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service1.png\" style=\"max-width:50px;\" alt=\"GIAO HÀNG SIÊU TỐC\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"margin-left: 20px;\">\r\n");
      out.write("                                <span style=\"font-size:13px;font-weight:bold;text-transform:uppercase;\">GIAO HÀNG SIÊU TỐC</span>\r\n");
      out.write("                                <p style=\"font-size:13px;\">Hệ thống giao hàng tự động chỉ trong 3 phút</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 flex-row\">\r\n");
      out.write("                            <div class=\"img\">\r\n");
      out.write("                                <img src=\"https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service2.png\" style=\"max-width:50px;\" alt=\"BẢO HÀNH NHANH CHÓNG\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"margin-left: 20px;\">\r\n");
      out.write("                                <span style=\"font-size:13px;font-weight:bold;text-transform:uppercase;\">BẢO HÀNH NHANH CHÓNG</span>\r\n");
      out.write("                                <p style=\"font-size:13px;\">Mọi yêu cầu hỗ trợ sẽ được đội ngũ tư vấn giải quyết trực tiếp.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 flex-row\">\r\n");
      out.write("                            <div class=\"img\">\r\n");
      out.write("                                <img src=\"https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service3.png\" style=\"max-width:50px;\" alt=\"UY TÍN 5 SAO\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"margin-left: 20px;\">\r\n");
      out.write("                                <span style=\"font-size:13px;font-weight:bold;text-transform:uppercase;\">UY TÍN 5 SAO</span>\r\n");
      out.write("                                <p style=\"font-size:13px;\">Được cộng đồng bình chọn là shop game uy tín nhất VN</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 flex-row\">\r\n");
      out.write("                            <div class=\"img\">\r\n");
      out.write("                                <img src=\"https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service4.png\" style=\"max-width:50px;\" alt=\"HỖ TRỢ TẬN TÌNH\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"margin-left: 20px;\">\r\n");
      out.write("                                <span style=\"font-size:13px;font-weight:bold;text-transform:uppercase;\">HỖ TRỢ TẬN TÌNH</span>\r\n");
      out.write("                                <p style=\"font-size:13px;\">Hệ thống hỗ trợ online liên tục từ 8h - 24h</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <div id=\"notification_footer\" class=\"notification_footer\">\r\n");
      out.write("                <div class=\"nt-content\"></div>\r\n");
      out.write("                <div class=\"nt-close\"><i class=\"far fa-times-circle\"></i></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </footer>\r\n");
      out.write("        <a id=\"messenger-button\" href=\"https://m.me/divineshop.vn\" alt=\"Hỗ Trợ DivineShop\" title=\"Hỗ Trợ DivineShop\">\r\n");
      out.write("            <img style=\"position: fixed;bottom: 35px;right: 25px;z-index:2;\" src=\"https://hgeqic7azi.vcdn.com.vn/image/banner_v2/messager.svg\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script><script>\r\n");
      out.write("          var time_show_notification = 5000;\r\n");
      out.write("          var time_next_notification = 12000;\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"./assets/catalog/common/footer.js\"></script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty User}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
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
        out.write("               ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            <div class=\"header-container container\">\r\n");
        out.write("                <div id=\"sidebarCollapse\" class=\"btn-menu\">\r\n");
        out.write("                    <i class=\"fas fa-bars\" style=\"font-size: 20px; vertical-align: middle\"></i>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div class=\"logo\"><a href=\"#\"><img style=\"margin-right: 10px;width: 60px\"\r\n");
        out.write("                                                                                                   src=\"#\" />\r\n");
        out.write("                        <img style=\"width: 100px;\" src=\"#\" /></a></div>\r\n");
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
        out.write("                            <b style=\"font-size: 20px;\"> ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("  </b>\r\n");
        out.write("                           \r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("\r\n");
        out.write("                    <div id=\"home-cart\" class=\"dropdown dropdown-header shopping-cart\">\r\n");
        out.write("                        <div data-toggle=\"dropdown\" data-loading-text=\"Đang tải...\" class=\"heading dropdown-toggle\"\r\n");
        out.write("                             aria-expanded=\"false\">\r\n");
        out.write("                            <div class=\"align-items-center d-flex\" id=\"update-cart\">\r\n");
        out.write("                                <i class=\"fas fa-shopping-cart cart-size text-white\"></i><a href=\"cart.jsp\"><b class=\"cart-text\">Giỏ hàng</b></a><span\r\n");
        out.write("                                    class=\"quantity\">");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        \r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </header>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_0.setVar("x");
    _jspx_th_c_set_0.setValue(new String("0"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartlist }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("x");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x+1 }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${User == username}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>JSP Page</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <header class=\"home-page fixed-header\" style=\"background-color: #5BBD2B\">\r\n");
        out.write("            <nav id=\"sidebar\" class=\"navbar\">\r\n");
        out.write("                <div id=\"dismiss\">\r\n");
        out.write("                    <i class=\"fas fa-times\"></i>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div class=\"menu-list\">\r\n");
        out.write("                    <ul id=\"menu-content\" class=\"menu-content\">\r\n");
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
        out.write("                $(document).ready(function () {\r\n");
        out.write("                    $(\"#filter_name\").autocomplete(\"getdata.php?lan=vi\", {\r\n");
        out.write("                        width: 450,\r\n");
        out.write("                        resultsClass: \"ac_results col-lg-7\",\r\n");
        out.write("                        matchContains: true\r\n");
        out.write("                    });\r\n");
        out.write("\r\n");
        out.write("                    $(\"#home-cart\").hover(\r\n");
        out.write("                            function () {\r\n");
        out.write("                                $('#dropdown-detail-cart').css(\"display\", \"block\");\r\n");
        out.write("                            },\r\n");
        out.write("                            function () {\r\n");
        out.write("                                $('#dropdown-detail-cart').css(\"display\", \"none\");\r\n");
        out.write("                            }\r\n");
        out.write("                    );\r\n");
        out.write("\r\n");
        out.write("                    $(\".home-mini-profile\").hover(\r\n");
        out.write("                            function () {\r\n");
        out.write("                                $('.drop-mini-profile').css(\"display\", \"block\");\r\n");
        out.write("                            },\r\n");
        out.write("                            function () {\r\n");
        out.write("                                $('.drop-mini-profile').css(\"display\", \"none\");\r\n");
        out.write("                            }\r\n");
        out.write("                    );\r\n");
        out.write("\r\n");
        out.write("                });\r\n");
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
        out.write("            ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            <div class=\"header-container container\">\r\n");
        out.write("                <div id=\"sidebarCollapse\" class=\"btn-menu\">\r\n");
        out.write("                    <i class=\"fas fa-bars\" style=\"font-size: 20px; vertical-align: middle\"></i>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div class=\"logo\"><a href=\"#\"><img style=\"margin-right: 10px;width: 60px\"\r\n");
        out.write("                                                   src=\"#\" />\r\n");
        out.write("                        <img style=\"width: 100px;\" src=\"#\" /></a></div>\r\n");
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
        out.write("                            <a href=\"login.jsp\" class=\"text-white\">Đăng nhập </a>\r\n");
        out.write("                            <span>/</span>\r\n");
        out.write("                            <a href=\"registration.jsp\" class=\"text-white\">Đăng kí</a>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("\r\n");
        out.write("                    <div id=\"home-cart\" class=\"dropdown dropdown-header shopping-cart\">\r\n");
        out.write("                        <div data-toggle=\"dropdown\" data-loading-text=\"Đang tải...\" class=\"heading dropdown-toggle\"\r\n");
        out.write("                             aria-expanded=\"false\">\r\n");
        out.write("                            <div class=\"align-items-center d-flex\" id=\"update-cart\">\r\n");
        out.write("                                <i class=\"fas fa-shopping-cart cart-size text-white\"></i><a href=\"cart.jsp\"><b class=\"cart-text\">Giỏ hàng</b></a><span\r\n");
        out.write("                                    class=\"quantity\">");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </header>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_set_2.setVar("x");
    _jspx_th_c_set_2.setValue(new String("0"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartlist }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_3.setVar("x");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x+1 }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>JSP Page</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <header class=\"home-page fixed-header\" style=\"background-color: #5BBD2B\">\r\n");
        out.write("            <nav id=\"sidebar\" class=\"navbar\">\r\n");
        out.write("                <div id=\"dismiss\">\r\n");
        out.write("                    <i class=\"fas fa-times\"></i>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div class=\"menu-list\">\r\n");
        out.write("                    <ul id=\"menu-content\" class=\"menu-content\">\r\n");
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
        out.write("                $(document).ready(function () {\r\n");
        out.write("                    $(\"#filter_name\").autocomplete(\"getdata.php?lan=vi\", {\r\n");
        out.write("                        width: 450,\r\n");
        out.write("                        resultsClass: \"ac_results col-lg-7\",\r\n");
        out.write("                        matchContains: true\r\n");
        out.write("                    });\r\n");
        out.write("\r\n");
        out.write("                    $(\"#home-cart\").hover(\r\n");
        out.write("                            function () {\r\n");
        out.write("                                $('#dropdown-detail-cart').css(\"display\", \"block\");\r\n");
        out.write("                            },\r\n");
        out.write("                            function () {\r\n");
        out.write("                                $('#dropdown-detail-cart').css(\"display\", \"none\");\r\n");
        out.write("                            }\r\n");
        out.write("                    );\r\n");
        out.write("\r\n");
        out.write("                    $(\".home-mini-profile\").hover(\r\n");
        out.write("                            function () {\r\n");
        out.write("                                $('.drop-mini-profile').css(\"display\", \"block\");\r\n");
        out.write("                            },\r\n");
        out.write("                            function () {\r\n");
        out.write("                                $('.drop-mini-profile').css(\"display\", \"none\");\r\n");
        out.write("                            }\r\n");
        out.write("                    );\r\n");
        out.write("\r\n");
        out.write("                });\r\n");
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
        out.write("            ");
        if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            <div class=\"header-container container\">\r\n");
        out.write("                <div id=\"sidebarCollapse\" class=\"btn-menu\">\r\n");
        out.write("                    <i class=\"fas fa-bars\" style=\"font-size: 20px; vertical-align: middle\"></i>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div class=\"logo\"><a href=\"#\"><img style=\"margin-right: 10px;width: 60px\"\r\n");
        out.write("                                                   src=\"#\" />\r\n");
        out.write("                        <img style=\"width: 100px;\" src=\"#\" /></a></div>\r\n");
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
        out.write("                            <a href=\"login.jsp\" class=\"text-white\">Đăng nhập </a>\r\n");
        out.write("                            <span>/</span>\r\n");
        out.write("                            <a href=\"registration.jsp\" class=\"text-white\">Đăng kí</a>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("\r\n");
        out.write("                    <div id=\"home-cart\" class=\"dropdown dropdown-header shopping-cart\">\r\n");
        out.write("                        <div data-toggle=\"dropdown\" data-loading-text=\"Đang tải...\" class=\"heading dropdown-toggle\"\r\n");
        out.write("                             aria-expanded=\"false\">\r\n");
        out.write("                            <div class=\"align-items-center d-flex\" id=\"update-cart\">\r\n");
        out.write("                                <i class=\"fas fa-shopping-cart cart-size text-white\"></i><a href=\"cart.jsp\"><b class=\"cart-text\">Giỏ hàng</b></a><span\r\n");
        out.write("                                    class=\"quantity\">");
        if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </header>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_set_4.setVar("x");
    _jspx_th_c_set_4.setValue(new String("0"));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartlist }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_set_5.setVar("x");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x+1 }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_set_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent(null);
    _jspx_th_c_set_6.setVar("total");
    _jspx_th_c_set_6.setValue(new String("0"));
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartlist }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("                                        <tr> \r\n");
          out.write("                                            <td data-th=\"Product\"> \r\n");
          out.write("                                                <div class=\"row\"> \r\n");
          out.write("                                                    <div class=\"col-sm-2 hidden-xs\"><img src=\"");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\" alt=\"\" class=\"portrait-crop\"width=\"125\">\r\n");
          out.write("                                                    </div> \r\n");
          out.write("                                                    <div class=\"col-sm-10\"> \r\n");
          out.write("                                                        <h4 class=\"col-sm-10 col-xs-10\">");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("</h4> \r\n");
          out.write("                                                        <p> </p> \r\n");
          out.write("                                                    </div> \r\n");
          out.write("                                                </div> \r\n");
          out.write("                                            </td> \r\n");
          out.write("                                            <td data-th=\"Price\">");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("</td>\r\n");
          out.write("                                            <td data-th=\"Quantity\">");
          if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("</td>\r\n");
          out.write("                                            <td data-th=\"Type\">");
          if (_jspx_meth_c_out_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("                                            </td> \r\n");
          out.write("                                          \r\n");
          out.write("                                            <td  > \r\n");
          out.write("                                       \r\n");
          out.write("                                        \r\n");
          out.write("                                        ");
          if (_jspx_meth_c_set_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("                                \r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getcLImage() }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getcName()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getcPrice()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getcQuantity()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getcType()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_set_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_set_7.setVar("total");
    _jspx_th_c_set_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total +  i.getcPrice()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_7);
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
    _jspx_th_c_out_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
    if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
    return false;
  }
}
