package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_update_var_sql_dataSource_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_update_var_sql_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_sql_update_var_sql_dataSource_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE]><![endif]-->\n");
      out.write("<!--[if IE 8 ]><html dir=\"ltr\" lang=\"vi\" class=\"ie8\"><![endif]-->\n");
      out.write("<!--[if IE 9 ]><html dir=\"ltr\" lang=\"vi\" class=\"ie9\"><![endif]-->\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!-->\n");
      out.write("<html dir=\"ltr\" lang=\"vi\">\n");
      out.write("    <!--<![endif]-->\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header1.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("         <noscript>\n");
      out.write("        <iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM\" height=\"0\" width=\"0\"\n");
      out.write("                style=\"display:none;visibility:hidden\"></iframe>\n");
      out.write("        </noscript>\n");
      out.write("        <div class=\"top-header\" style=\"background-color: #088A08\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" style=\"opacity: 0.7\">\n");
      out.write("                    <div class=\"slide-news\">\n");
      out.write("                        <div class=\"w3-content w3-section\">\n");
      out.write("\n");
      out.write("                            <a class=\"left carousel-control\" role=\"button\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                                <span class=\"sr-only\">Previous</span>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <a class=\"right carousel-control\" role=\"button\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                                <span class=\"sr-only\">Next</span>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"marquee-slide\">\n");
      out.write("                                <a href=\"accountLienQuan.jsp\" class=\"mySlides\" id=\"new-slide-0\">\n");
      out.write("                                    <i class=\"fab fa-hotjar\"></i>\n");
      out.write("                                    Liên Quân              </a>\n");
      out.write("                                <a href=\"accountLienMinh.jsp\" class=\"mySlides\" id=\"new-slide-1\">\n");
      out.write("                                    <i class=\"fab fa-hotjar\"></i>\n");
      out.write("                                    Liên Minh              </a>\n");
      out.write("                                <a href=\"accountFifa.jsp\" class=\"mySlides\" id=\"new-slide-2\">\n");
      out.write("                                    <i class=\"fab fa-hotjar\"></i>\n");
      out.write("                                    Fifa              </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text-right \" style=\"padding:5px 0;float: right\">\n");
      out.write("                        Hỗ trợ 1900 123456\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <header class=\"home-page fixed-header\">\n");
      out.write("              ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</header>\n");
      out.write("<script src=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/bigshop/js/jquery.autocomplete.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("                    var time_run_link = \"5\" * 1000;\n");
      out.write("                    var lang = \"vi\";\n");
      out.write("                    var check_login = true;\n");
      out.write("</script>\n");
      out.write("<script src=\"./assets/catalog/common/header.js?t=1594814390\"></script>\n");
      out.write("<div class=\"home-page banner-home common-menu-top\" style=\"background-color: #f7f7f7;margin-bottom: 15px;\">\n");
      out.write("    <div class=\"menu-2\" style=\"margin-top: 0\">\n");
      out.write("        <div class=\"container padd-0\" style=\"margin-top: 6px;\">\n");
      out.write("            <div class=\"menu-catalog\">\n");
      out.write("                <div class=\"header-menu dropdown\" id=\"category-product\">\n");
      out.write("                    <div class=\"bar-btn\">\n");
      out.write("                        <i class=\"fas fa-bars\"></i><span>Danh mục sản phẩm</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dropdown-menu drop-category nav-menu\" aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"/index.php?route=product/category&amp;path=59&amp;filter_price_from=0&amp;filter_price_to=15000000&amp;sort=op.quantity&amp;order=DESC&amp;limit=12\"><i class=\"fab fa-steam-symbol\"></i>\n");
      out.write("                                    <span>Game trên Steam</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"/index.php?route=product/search&amp;search=pubg\"><i class=\"fas fa-trophy\"></i>\n");
      out.write("                                    <span>PUBG</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"/Origin\"><i class=\"icon icon-origin-svg\"></i>\n");
      out.write("                                    <span>Game trên Origin</span></a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"right-menu\">\n");
      out.write("                    <div class=\"row menu-tab-all\">\n");
      out.write("                        <div class=\"quick-menu head-link\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-hotjar\"></i><span>Mua nhiều trong 24h</span></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"quick-menu head-link\">\n");
      out.write("                            <a href=\"#\"><i class=\"fas fa-award\"></i><span>ĐANG KHUYẾN MẠI</span></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"quick-menu head-link\">\n");
      out.write("                            <a href=\"#\"><i class=\"far fa-credit-card\"></i><span>Hình thức thanh toán</span></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"quick-menu head-link\">\n");
      out.write("                            <a href=\"#\"><i class=\"fas fa-gamepad\"></i><span>Hướng dẫn mua hàng</span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .banner-home .menu-2 .header-menu div.nav-menu {\n");
      out.write("        display: none;\n");
      out.write("        height: auto;\n");
      out.write("        margin: auto;\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("                    $(\"#category-product\").hover(\n");
      out.write("                            function () {\n");
      out.write("                                $(this).css(\"cursor\", \"pointer\");\n");
      out.write("                                $('.drop-category').css(\"display\", \"grid\");\n");
      out.write("                            }, function () {\n");
      out.write("                        $('.drop-category').css(\"display\", \"none\");\n");
      out.write("                    }\n");
      out.write("                    );\n");
      out.write("</script><style xmlns=\"\">\n");
      out.write("    @media (max-width: 415px) {\n");
      out.write("        .col-xs-6 {\n");
      out.write("            width: 50%;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .text-center-col {\n");
      out.write("        text-align: center !important;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .text-left-col {\n");
      out.write("        text-align: left !important;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.trang-sp .container .container-title {\n");
      out.write("        display: flex;\n");
      out.write("        align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.trang-sp .container .container-title h2 {\n");
      out.write("        font-size: 20px;\n");
      out.write("        font-weight: bold;\n");
      out.write("        margin: 0px;\n");
      out.write("        display: inline-block;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.trang-sp .container .container-title .count-sp-thanhtoan {\n");
      out.write("        color: #21beff;\n");
      out.write("        margin-left: 5px;\n");
      out.write("        margin-top: 3px;\n");
      out.write("        font-size: 14px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.trang-sp .container .container-title .sort {\n");
      out.write("        margin-left: auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    div.trang-sp .container .container-title .sort .btn {\n");
      out.write("        width: 150px;\n");
      out.write("        height: 32px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .alert {\n");
      out.write("        padding: 8px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .ver-middle {\n");
      out.write("        vertical-align: middle !important;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .text-color {\n");
      out.write("        color: red;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #form_address_other {\n");
      out.write("        display: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #my_address {\n");
      out.write("        display: none;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!--Main show sản pam-->\n");
      out.write("<div class=\"trang-sp\">\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div id=\"alert-position\"></div>\n");
      out.write("        <div class=\"container-title\">\n");
      out.write("            <h2 class=\"thanh-toan-title\">Thanh Toán</h2><span class=\"count-san-pham\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${temp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("        </br>\n");
      out.write("        <div class=\"row cart-detail\">\n");
      out.write("            <table id=\"cart\" class=\"table table-hover table-condensed\" > \n");
      out.write("                <thead> \n");
      out.write("                    <tr> \n");
      out.write("                        <th style=\"width:50%\">Tên sản phẩm</th> \n");
      out.write("                        <th style=\"width:10%\">Giá</th> \n");
      out.write("                        <th style=\"width:8%\">Số lượng</th> \n");
      out.write("                        <th style=\"width:22%\" class=\"text-center\">Thành tiền</th> \n");
      out.write("                        <th style=\"width:10%\"> </th> \n");
      out.write("                    </tr> \n");
      out.write("                </thead> \n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                   ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                   ");
      if (_jspx_meth_sql_update_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                   ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                     \n");
      out.write("                     ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                <tfoot> \n");
      out.write("                    <tr> \n");
      out.write("                        \n");
      out.write("                        <td><a href=\"index.jsp\" class=\"btn btn-warning\"><i class=\"fa fa-angle-left\"></i> Tiếp tục mua hàng</a>\n");
      out.write("                        </td> \n");
      out.write("                        <td colspan=\"2\" class=\"hidden-xs\"> </td> \n");
      out.write("                        <td class=\"hidden-xs text-center\"><strong>Tổng tiền ");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("</strong>\n");
      out.write("                        </td> \n");
      out.write("                        <td><a href=\"\" class=\"btn btn-success btn-block\">Thanh toán <i class=\"fa fa-angle-right\"></i></a>\n");
      out.write("                        </td> \n");
      out.write("                    </tr> \n");
      out.write("                </tfoot> \n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("        </div>              \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"mb15\"></div>\n");
      out.write("\n");
      out.write("    <input type=\"hidden\" value=\"0\" id=\"product_physical\">\n");
      out.write("\n");
      out.write("    <div class=\"mb15\"></div>\n");
      out.write("    <div class=\"thanh-toan\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 col-xs-12 padd-0\">\n");
      out.write("                <div class=\"col-md-6 col-xs-12 padd-0\">\n");
      out.write("\n");
      out.write("                    <div class=\"mb15\"></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!--------------------------------------------------------------------------------------------------->\n");
      out.write("<div id=\"payment-confirm-data\"></div>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"footer-top\" style=\"margin-top:20px;\">\n");
      out.write("        <div class=\"container mt-0\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-sm-12 flex-row\">\n");
      out.write("                    <div class=\"img\">\n");
      out.write("                        <img src=\"https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service1.png\" style=\"max-width:50px;\" alt=\"GIAO HÀNG SIÊU TỐC\">\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"margin-left: 20px;\">\n");
      out.write("                        <span style=\"font-size:13px;font-weight:bold;text-transform:uppercase;\">GIAO HÀNG SIÊU TỐC</span>\n");
      out.write("                        <p style=\"font-size:13px;\">Hệ thống giao hàng tự động chỉ trong 3 phút</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-12 flex-row\">\n");
      out.write("                    <div class=\"img\">\n");
      out.write("                        <img src=\"https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service2.png\" style=\"max-width:50px;\" alt=\"BẢO HÀNH NHANH CHÓNG\">\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"margin-left: 20px;\">\n");
      out.write("                        <span style=\"font-size:13px;font-weight:bold;text-transform:uppercase;\">BẢO HÀNH NHANH CHÓNG</span>\n");
      out.write("                        <p style=\"font-size:13px;\">Mọi yêu cầu hỗ trợ sẽ được đội ngũ tư vấn giải quyết trực tiếp.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-12 flex-row\">\n");
      out.write("                    <div class=\"img\">\n");
      out.write("                        <img src=\"https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service3.png\" style=\"max-width:50px;\" alt=\"UY TÍN 5 SAO\">\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"margin-left: 20px;\">\n");
      out.write("                        <span style=\"font-size:13px;font-weight:bold;text-transform:uppercase;\">UY TÍN 5 SAO</span>\n");
      out.write("                        <p style=\"font-size:13px;\">Được cộng đồng bình chọn là shop game uy tín nhất VN</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-12 flex-row\">\n");
      out.write("                    <div class=\"img\">\n");
      out.write("                        <img src=\"https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service4.png\" style=\"max-width:50px;\" alt=\"HỖ TRỢ TẬN TÌNH\">\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"margin-left: 20px;\">\n");
      out.write("                        <span style=\"font-size:13px;font-weight:bold;text-transform:uppercase;\">HỖ TRỢ TẬN TÌNH</span>\n");
      out.write("                        <p style=\"font-size:13px;\">Hệ thống hỗ trợ online liên tục từ 8h - 24h</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"notification_footer\" class=\"notification_footer\">\n");
      out.write("        <div class=\"nt-content\"></div>\n");
      out.write("        <div class=\"nt-close\"><i class=\"far fa-times-circle\"></i></div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<a id=\"messenger-button\" href=\"https://m.me/divineshop.vn\" alt=\"Hỗ Trợ DivineShop\" title=\"Hỗ Trợ DivineShop\">\n");
      out.write("    <img style=\"position: fixed;bottom: 35px;right: 25px;z-index:2;\" src=\"https://hgeqic7azi.vcdn.com.vn/image/banner_v2/messager.svg\">\n");
      out.write("</a>\n");
      out.write("<script src=\"./assets/catalog/common/footer.js?t=1594814390\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
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
        out.write("\n");
        out.write("                ");
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
        out.write("                                <i class=\"fas fa-shopping-cart cart-size text-white\"></i><b class=\"cart-text\">Giỏ hàng</b><span\r\n");
        out.write("                                    class=\"quantity\">0</span>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        \r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </header>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\n");
        out.write("            ");
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
        out.write("\n");
        out.write("                ");
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
        out.write("        <header class=\"home-page fixed-header\" style=\"background-color: #5BBD2B\">\n");
        out.write("            <nav id=\"sidebar\" class=\"navbar\">\n");
        out.write("                <div id=\"dismiss\">\n");
        out.write("                    <i class=\"fas fa-times\"></i>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"menu-list\">\n");
        out.write("                    <ul id=\"menu-content\" class=\"menu-content\">\n");
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
        out.write("                                    Liên Quân 123123132             </a>\n");
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
        out.write("                $(document).ready(function () {\n");
        out.write("                    $(\"#filter_name\").autocomplete(\"getdata.php?lan=vi\", {\n");
        out.write("                        width: 450,\n");
        out.write("                        resultsClass: \"ac_results col-lg-7\",\n");
        out.write("                        matchContains: true\n");
        out.write("                    });\n");
        out.write("\n");
        out.write("                    $(\"#home-cart\").hover(\n");
        out.write("                            function () {\n");
        out.write("                                $('#dropdown-detail-cart').css(\"display\", \"block\");\n");
        out.write("                            },\n");
        out.write("                            function () {\n");
        out.write("                                $('#dropdown-detail-cart').css(\"display\", \"none\");\n");
        out.write("                            }\n");
        out.write("                    );\n");
        out.write("\n");
        out.write("                    $(\".home-mini-profile\").hover(\n");
        out.write("                            function () {\n");
        out.write("                                $('.drop-mini-profile').css(\"display\", \"block\");\n");
        out.write("                            },\n");
        out.write("                            function () {\n");
        out.write("                                $('.drop-mini-profile').css(\"display\", \"none\");\n");
        out.write("                            }\n");
        out.write("                    );\n");
        out.write("\n");
        out.write("                });\n");
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
        out.write("            ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <div class=\"header-container container\">\n");
        out.write("                <div id=\"sidebarCollapse\" class=\"btn-menu\">\n");
        out.write("                    <i class=\"fas fa-bars\" style=\"font-size: 20px; vertical-align: middle\"></i>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"logo\"><a href=\"#\"><img style=\"margin-right: 10px;width: 60px\"\n");
        out.write("                                                   src=\"#\" />\n");
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
        out.write("                            <i class=\"fas fa-user-circle\" style=\"font-size: 40px;\"></i>\n");
        out.write("                            <span>&#160</span>\n");
        out.write("                            <a href=\"login.jsp\" class=\"text-white\">Đăng nhập </a>\n");
        out.write("                            <span>/</span>\n");
        out.write("                            <a href=\"REGISTRATION.jsp\" class=\"text-white\">Đăng kí</a>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                    <div id=\"home-cart\" class=\"dropdown dropdown-header shopping-cart\">\n");
        out.write("                        <div data-toggle=\"dropdown\" data-loading-text=\"Đang tải...\" class=\"heading dropdown-toggle\"\n");
        out.write("                             aria-expanded=\"false\">\n");
        out.write("                            <div class=\"align-items-center d-flex\" id=\"update-cart\">\n");
        out.write("                                <i class=\"fas fa-shopping-cart cart-size text-white\"></i> <a href=\"/CartController?page=showcart\"><b class=\"cart-text\">Gio Hang</b></a><span\n");
        out.write("                                    class=\"quantity\">");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("</span>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        </header>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartlist }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("            ");
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

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
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
        out.write("\n");
        out.write("                ");
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
        out.write("        <header class=\"home-page fixed-header\" style=\"background-color: #5BBD2B\">\n");
        out.write("            <nav id=\"sidebar\" class=\"navbar\">\n");
        out.write("                <div id=\"dismiss\">\n");
        out.write("                    <i class=\"fas fa-times\"></i>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"menu-list\">\n");
        out.write("                    <ul id=\"menu-content\" class=\"menu-content\">\n");
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
        out.write("                                    Liên Quân 123123132             </a>\n");
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
        out.write("                $(document).ready(function () {\n");
        out.write("                    $(\"#filter_name\").autocomplete(\"getdata.php?lan=vi\", {\n");
        out.write("                        width: 450,\n");
        out.write("                        resultsClass: \"ac_results col-lg-7\",\n");
        out.write("                        matchContains: true\n");
        out.write("                    });\n");
        out.write("\n");
        out.write("                    $(\"#home-cart\").hover(\n");
        out.write("                            function () {\n");
        out.write("                                $('#dropdown-detail-cart').css(\"display\", \"block\");\n");
        out.write("                            },\n");
        out.write("                            function () {\n");
        out.write("                                $('#dropdown-detail-cart').css(\"display\", \"none\");\n");
        out.write("                            }\n");
        out.write("                    );\n");
        out.write("\n");
        out.write("                    $(\".home-mini-profile\").hover(\n");
        out.write("                            function () {\n");
        out.write("                                $('.drop-mini-profile').css(\"display\", \"block\");\n");
        out.write("                            },\n");
        out.write("                            function () {\n");
        out.write("                                $('.drop-mini-profile').css(\"display\", \"none\");\n");
        out.write("                            }\n");
        out.write("                    );\n");
        out.write("\n");
        out.write("                });\n");
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
        out.write("            ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <div class=\"header-container container\">\n");
        out.write("                <div id=\"sidebarCollapse\" class=\"btn-menu\">\n");
        out.write("                    <i class=\"fas fa-bars\" style=\"font-size: 20px; vertical-align: middle\"></i>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"logo\"><a href=\"#\"><img style=\"margin-right: 10px;width: 60px\"\n");
        out.write("                                                   src=\"#\" />\n");
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
        out.write("                            <i class=\"fas fa-user-circle\" style=\"font-size: 40px;\"></i>\n");
        out.write("                            <span>&#160</span>\n");
        out.write("                            <a href=\"login.jsp\" class=\"text-white\">Đăng nhập </a>\n");
        out.write("                            <span>/</span>\n");
        out.write("                            <a href=\"REGISTRATION.jsp\" class=\"text-white\">Đăng kí</a>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                    <div id=\"home-cart\" class=\"dropdown dropdown-header shopping-cart\">\n");
        out.write("                        <div data-toggle=\"dropdown\" data-loading-text=\"Đang tải...\" class=\"heading dropdown-toggle\"\n");
        out.write("                             aria-expanded=\"false\">\n");
        out.write("                            <div class=\"align-items-center d-flex\" id=\"update-cart\">\n");
        out.write("                                <i class=\"fas fa-shopping-cart cart-size text-white\"></i> <a href=\"/CartController?page=showcart\"><b class=\"cart-text\">Gio Hang</b></a><span\n");
        out.write("                                    class=\"quantity\">");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("</span>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        </header>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartlist }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ");
          if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
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

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("conn");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost/shopacc");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    _jspx_th_sql_setDataSource_0.setScope("page");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_update_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:update
    org.apache.taglibs.standard.tag.rt.sql.UpdateTag _jspx_th_sql_update_0 = (org.apache.taglibs.standard.tag.rt.sql.UpdateTag) _jspx_tagPool_sql_update_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.UpdateTag.class);
    _jspx_th_sql_update_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_update_0.setParent(null);
    _jspx_th_sql_update_0.setVar("delete");
    _jspx_th_sql_update_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_update_0.setSql((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("DELETE FROM `bill` WHERE bId='${param.bId}'", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_update_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_update_0 = _jspx_th_sql_update_0.doStartTag();
      if (_jspx_th_sql_update_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_update_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_update_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_update_0.doFinally();
      _jspx_tagPool_sql_update_var_sql_dataSource_nobody.reuse(_jspx_th_sql_update_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("result");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                         SELECT * FROM `bill`\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("row");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr> \n");
          out.write("                        <td data-th=\"Product\"> \n");
          out.write("                            <div class=\"row\"> \n");
          out.write("                                <div class=\"col-sm-2 hidden-xs\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"img-responsive\" width=\"100\">\n");
          out.write("                                </div> \n");
          out.write("                                <div class=\"col-sm-10\"> \n");
          out.write("                                    <h4 class=\"nomargin\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4> \n");
          out.write("                                    <p> </p> \n");
          out.write("                                </div> \n");
          out.write("                            </div> \n");
          out.write("                        </td> \n");
          out.write("                        <td data-th=\"Price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \n");
          out.write("                        <td data-th=\"Quantity\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.bQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                        </td> \n");
          out.write("                        <td data-th=\"Subtotal\" class=\"text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.bQuantity * row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \n");
          out.write("                        <td  > \n");
          out.write("                            <button class=\"btn btn-danger btn-sm\"  onclick=\"window.location.href='cart.jsp?bId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.bId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\"><i class=\"far fa-times-circle\"></i>                                     \n");
          out.write("                                   </button>    \n");
          out.write("                                   <!--<button onclick=\"window.location.href='cart.jsp?bId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.bId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\">Delete</button>-->\n");
          out.write("                        </td> \n");
          out.write("                    </tr>\n");
          out.write("                    ");
          if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                      ");
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

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_set_4.setVar("total");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total + row.pPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
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
    _jspx_th_c_set_5.setVar("temp");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${temp + row.bQuantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_5);
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
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
