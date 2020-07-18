package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html dir=\"ltr\" lang=\"vi\">\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header1.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <noscript>\n");
      out.write("        <iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM\" height=\"0\" width=\"0\"\n");
      out.write("                style=\"display:none;visibility:hidden\"></iframe>\n");
      out.write("        </noscript>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                <a href=\"#\" class=\"mySlides\" id=\"new-slide-0\">\n");
      out.write("                                    <i class=\"fab fa-hotjar\"></i>\n");
      out.write("                                    Liên Quân              </a>\n");
      out.write("                                <a href=\"#\" class=\"mySlides\" id=\"new-slide-1\">\n");
      out.write("                                    <i class=\"fab fa-hotjar\"></i>\n");
      out.write("                                    Liên Minh              </a>\n");
      out.write("                                <a href=\"#\" class=\"mySlides\" id=\"new-slide-2\">\n");
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
      out.write("        <header>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header2.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var time_run_link = '5' * 1000;\n");
      out.write("            var timeout_handle = null;\n");
      out.write("\n");
      out.write("            var myIndex = 0;\n");
      out.write("            carousel();\n");
      out.write("\n");
      out.write("            function carousel() {\n");
      out.write("                var i;\n");
      out.write("                var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                if (x.length > 0) {\n");
      out.write("                    for (i = 0; i < x.length; i++) {\n");
      out.write("                        x[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                    myIndex++;\n");
      out.write("                    if (myIndex > x.length) {\n");
      out.write("                        myIndex = 1\n");
      out.write("                    }\n");
      out.write("                    x[myIndex - 1].style.display = \"block\";\n");
      out.write("\n");
      out.write("                    timeout_handle = setTimeout(carousel, time_run_link); // Change image every 2 seconds\n");
      out.write("\n");
      out.write("                    $('.w3-content .mySlides').removeClass('animate-down');\n");
      out.write("                    $('.w3-content .mySlides').addClass('animate-up');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải sang trái\n");
      out.write("            $(\".left\").click(function (e) {\n");
      out.write("                var i;\n");
      out.write("                var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                if (x.length > 0) {\n");
      out.write("                    for (i = 0; i < x.length; i++) {\n");
      out.write("                        x[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                    myIndex--;\n");
      out.write("                    if (myIndex < 0) {\n");
      out.write("                        myIndex = x.length - 1;\n");
      out.write("                    }\n");
      out.write("                    x[myIndex].style.display = \"block\";\n");
      out.write("\n");
      out.write("                    $('.w3-content .mySlides').removeClass('animate-up');\n");
      out.write("                    $('.w3-content .mySlides').addClass('animate-down');\n");
      out.write("\n");
      out.write("                    clearTimeout(timeout_handle);\n");
      out.write("                    timeout_handle = setTimeout(carousel, time_run_link);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải trái sang phải\n");
      out.write("            $(\".right\").click(function (e) {\n");
      out.write("                var i;\n");
      out.write("                var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                if (x.length > 0) {\n");
      out.write("                    for (i = 0; i < x.length; i++) {\n");
      out.write("                        x[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                    myIndex++;\n");
      out.write("                    if (myIndex > x.length) {\n");
      out.write("                        myIndex = 1\n");
      out.write("                    }\n");
      out.write("                    x[myIndex - 1].style.display = \"block\";\n");
      out.write("\n");
      out.write("                    $('.w3-content .mySlides').removeClass('animate-down');\n");
      out.write("                    $('.w3-content .mySlides').addClass('animate-up');\n");
      out.write("\n");
      out.write("                    clearTimeout(timeout_handle);\n");
      out.write("                    timeout_handle = setTimeout(carousel, time_run_link);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            @media (max-width: 992px) {\n");
      out.write("                body .container {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (max-width: 415px) {\n");
      out.write("                .col-xs-6 {\n");
      out.write("                    width: 50%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (max-width: 500px) {\n");
      out.write("                .col-xs-6 {\n");
      out.write("                    width: 50%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (max-width: 1199px) {\n");
      out.write("                body .container .list-title a {\n");
      out.write("                    right: 15px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .container .list-title {\n");
      out.write("                    padding: 0 15px 0 15px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (width: 992px) {\n");
      out.write("                .slider-container .col-md-8 {\n");
      out.write("                    width:  100%\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 1200px) {\n");
      out.write("                .list_discovery {\n");
      out.write("                    margin-left: -15px !important;\n");
      out.write("                    margin-right: -15px !important;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .text-md-center {\n");
      out.write("                    margin-left: -15px;\n");
      out.write("                    margin-right: -15px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .menu-tab-all {\n");
      out.write("                    margin-left: -5px;\n");
      out.write("                    margin-right: -5px\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .col-lg-7 {\n");
      out.write("                    width: 63%;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .col-lg-5 {\n");
      out.write("                    width: 37%;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .product-price-well .col-lg-2 {\n");
      out.write("                    width: 20%;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .product-price-well .col-md-3 {\n");
      out.write("                    width: 20%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 992px) {\n");
      out.write("                .product-price-well .col-lg-2 {\n");
      out.write("                    width: 20%;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .product-price-well .col-md-3 {\n");
      out.write("                    width: 20%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .border-radius-left {\n");
      out.write("                border-bottom-left-radius: 4px;\n");
      out.write("                border-top-left-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .border-radius-right {\n");
      out.write("                border-bottom-right-radius: 4px;\n");
      out.write("                border-top-right-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 320px) and (max-width: 570px) {\n");
      out.write("                .p-5-only {\n");
      out.write("                    padding: 5px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu-2 .tab-content .item-text a {\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .cut_string {\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h4.cut_string {\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-aqua {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                color: #21beff;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border: unset;\n");
      out.write("                font-family: 'Roboto-Condensed-Bold'; }\n");
      out.write("            .btn-aqua:hover {\n");
      out.write("                color: #279cff;\n");
      out.write("                background-color: unset;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .img-banner {\n");
      out.write("                width: 266px;\n");
      out.write("                height: 156px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <div class=\"home-page banner-home\" style=\"background-color: #f7f7f7\">\n");
      out.write("            <div class=\"menu-2\" style=\"margin-top: 0\">\n");
      out.write("                <div class=\"container padd-0\" style=\"margin-top: 6px;\">\n");
      out.write("                    <div id=\"alert-position\"></div>\n");
      out.write("                    <div class=\"menu-catalog\">\n");
      out.write("                        <div class=\"header-menu\">\n");
      out.write("                            <div class=\"bar-btn\">\n");
      out.write("                                <i class=\"fas fa-bars\"></i><span>Danh mục sản phẩm</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"nav-menu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\"><i class=\"fab fa-steam-symbol\"></i>\n");
      out.write("                                            <span>Liên Quân</span></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\"><i class=\"fas fa-trophy\"></i>\n");
      out.write("                                            <span>Liên Minh</span></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\"><i class=\"icon icon-origin-svg\"></i>\n");
      out.write("                                            <span>Fifa online 4</span></a>\n");
      out.write("                                    </li>           \n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--chon san pham mua nhieu tat ca san pham ..-->\n");
      out.write("                        <div class=\"right-menu\">\n");
      out.write("                            <div class=\"row menu-tab-all service\">\n");
      out.write("                                <div class=\"quick-menu head-link\">\n");
      out.write("                                    <a href=\"bestsellers.jsp\" target=\"_blank\"><i class=\"fab fa-hotjar\"></i><span>Sản Phẩm Hot</span></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"quick-menu head-link\">\n");
      out.write("                                    <a href=\"#\" target=\"_blank\"><i class=\"fas fa-award\"></i><span>Đang Khuyến Mãi</span></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"quick-menu head-link\">\n");
      out.write("                                    <a href=\"#\" target=\"_blank\"><i class=\"far fa-credit-card\"></i><span>Hình thức thanh toán</span></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"quick-menu head-link\">\n");
      out.write("                                    <a href=\"#\" target=\"_blank\"><i class=\"fas fa-gamepad\"></i><span>Hướng dẫn mua hàng</span></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row slider-container\" style=\"max-width: 797px;\">\n");
      out.write("                                <div class=\"col col-md-8 col-sm-12 col-xs-12 col-lg-8\">\n");
      out.write("                                    <div class=\"home-slider\">\n");
      out.write("                                        <div>\n");
      out.write("                                            <!--  Link hình chạy, link hình  -->\n");
      out.write("                                            <a href=\"#\"><img class=\"check_img_errs\" src=\"#\" alt=\"#\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <a href=\"#\"><img class=\"check_img_errs\" src=\"#\" alt=\"#\t\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <a href=\"#\"><img class=\"check_img_errs\" src=\"#\" alt=\"#\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <a href=\"#\"><img class=\"check_img_errs\" src=\"#\" alt=\"#\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <a href=\"/#\"><img class=\"check_img_errs\" src=\"#\" alt=\"#\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <a href=\"#\"><img class=\"check_img_errs\" src=\"#\" alt=\"#\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <a href=\"#\"><img class=\"check_img_errs\" src=\"#\" alt=\"#\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <script type=\"text/javascript\">\n");
      out.write("                                    $('.home-slider').slick({\n");
      out.write("                                        autoplay: true,\n");
      out.write("                                        autoplaySpeed: 5000,\n");
      out.write("                                        dots: true,\n");
      out.write("                                        infinite: true,\n");
      out.write("                                        speed: 500,\n");
      out.write("                                        arrows: true,\n");
      out.write("                                    });\n");
      out.write("                                </script>\n");
      out.write("                                <div class=\"row sub-banner\">\n");
      out.write("                                    <div class=\"col col-md-4 col-sm-6 col-xs-6 col-lg-4\">\n");
      out.write("                                        <a class=\"w-100\" href=\"#\"><img class=\"check_img_errs\" src=\"#\" alt=\"#\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col col-md-4 col-sm-6 col-xs-6 col-lg-4\">\n");
      out.write("                                        <a class=\"w-100\" href=\"#\"><img src=\"#\" class=\"height-banner-home check_img_errs img-banner\" alt=\"#\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Một số acc nổi bật ở giao diện chính-->\n");
      out.write("                                <div class=\"row banner_bottom\">\n");
      out.write("                                    <div class=\"col col-md-4 col-sm-4 col-xs-4 col-lg-4\">\n");
      out.write("                                        <a href=\"#\"><img src=\"#\" alt=\"#\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col col-md-4 col-sm-4 col-xs-4 col-lg-4\">\n");
      out.write("                                        <a href=\"#\"><img src=\"#\" alt=\"#\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col col-md-4 col-sm-4 col-xs-4 col-lg-4\">\n");
      out.write("                                        <a href=\"#\"><img src=\"#\" alt=\"#l\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"view-more btn-aqua\" id=\"loadMoreProduct4\" onclick=\"loadMore($('.next-page-product4').text(), 4, this);$('.next-page-product4').text(Number($('.next-page-product4').text()) + 1);\">Tải thêm sản phẩm</div>\n");
      out.write("        <hr>\n");
      out.write("    <div class=\"container padd-0\">\n");
      out.write("        <div class=\"list-title\">\n");
      out.write("            <h2>Sản phẩm giá tốt</h2>\n");
      out.write("            <p>Bạn có thể lựa chọn hiển thị theo giá sản phẩm phù hợp với túi tiền</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"list-container\">\n");
      out.write("            <div class=\"row justify-content-md-center\">\n");
      out.write("                <div class=\"product-price-well\">\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 50000)\">\n");
      out.write("                            <strong>Dưới 50.000đ</strong>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 100000)\">\n");
      out.write("                            <strong>Dưới 100.000đ</strong>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 200000)\">\n");
      out.write("                            <strong>Dưới 200.000đ</strong>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 500000)\">\n");
      out.write("                            <strong>Dưới 500.000đ</strong>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-12 col-xs-12\" style=\"padding-left: 15px;padding-right: 15px\">\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 1000000)\">\n");
      out.write("                            <strong>Dưới 1.000.000đ</strong>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row service\" id=\"max-price\"></div>\n");
      out.write("            <hr>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!--end tim kiem theo gia-->\n");
      out.write("    \n");
      out.write("<!--start account lien quan-->\n");
      out.write("  ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"list-title\" style=\"margin-top: 15px;\">\n");
      out.write("            <h2>Game Liên Quân</h2>\n");
      out.write("            <a href=\"#\">Xem chi tiết</a>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"next-page-product6\" style=\"display:none;\">1</div>\n");
      out.write("        <div class=\"list-container\">\n");
      out.write("            <div class=\"row text-md-center\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"view-more btn-aqua\" id=\"loadMoreProduct6\" onclick=\"loadMore($('.next-page-product6').text(), 6, this);\n");
      out.write("                    $('.next-page-product6').text(Number($('.next-page-product6').text()) + 1);\">Tải thêm sản phẩm</div>\n");
      out.write("        <hr>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!--end account lien quan-->\n");
      out.write("\n");
      out.write("<!--satrt account lien minh-->\n");
      if (_jspx_meth_sql_setDataSource_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_sql_query_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"list-title\" style=\"margin-top: 15px;\">\n");
      out.write("            <h2>Game Liên Minh</h2>\n");
      out.write("            <a href=\"#\">Xem chi tiết</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                    <div class=\"next-page-product6\" style=\"display:none;\">1</div>\n");
      out.write("                    \n");
      out.write("        <div class=\"list-container\">\n");
      out.write("            <div class=\"row text-md-center\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("        <div class=\"view-more btn-aqua\" id=\"loadMoreProduct6\" onclick=\"loadMore($('.next-page-product6').text(), 6, this);\n");
      out.write("                    $('.next-page-product6').text(Number($('.next-page-product6').text()) + 1);\">Tải thêm sản phẩm</div>\n");
      out.write("        <hr>\n");
      out.write("    </div>\n");
      out.write("<!--end account lien minh-->\n");
      out.write("\n");
      out.write("<!--start account fifa 4-->\n");
      if (_jspx_meth_sql_setDataSource_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_sql_query_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"list-title\" style=\"margin-top: 15px;\">\n");
      out.write("            <h2>Game Fifa</h2>\n");
      out.write("            <a href=\"#\">Xem chi tiết</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"next-page-product6\" style=\"display:none;\">1</div>\n");
      out.write("        <div class=\"list-container\">\n");
      out.write("            <div class=\"row text-md-center\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"view-more btn-aqua\" id=\"loadMoreProduct6\" onclick=\"loadMore($('.next-page-product6').text(), 6, this);\n");
      out.write("                    $('.next-page-product6').text(Number($('.next-page-product6').text()) + 1);\">Tải thêm sản phẩm\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"high-line-container high-line-2\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-line-though\"><span>Bạn là người mới?</span></div>\n");
      out.write("            <div class=\"text\">Hãy đăng kí tài khoản để cập nhật những ưu đãi mới nhất từ Shop</div>\n");
      out.write("            <a href=\"#\"><button class=\"btn-aqua-bg\">Đăng ký ngay</button></a>\n");
      out.write("            <div class=\"text\">Hoặc <a href=\"#\"><b style=\"color: #fff\">đăng nhập</b></a> nếu bạn đã có tài khoản</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        function hide_banner() {\n");
      out.write("            $(window).width() < 1420 ? $(\".banner-home-sidebar\").hide() : $(\".banner-home-sidebar\").show()\n");
      out.write("        }\n");
      out.write("        $(window).resize(function () {\n");
      out.write("            hide_banner()\n");
      out.write("        }), $(document).ready(function () {\n");
      out.write("            hide_banner()\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        var isMobile = false; //initiate as false\n");
      out.write("        var isDesktop = true;\n");
      out.write("\n");
      out.write("        // device detection\n");
      out.write("        if (/(android|bb\\d+|meego).+mobile|avantgo|bada\\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|ipad|iris|kindle|Android|Silk|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i.test(navigator.userAgent)\n");
      out.write("                || /1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\\-(n|u)|c55\\/|capi|ccwa|cdm\\-|cell|chtm|cldc|cmd\\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\\-s|devi|dica|dmob|do(c|p)o|ds(12|\\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\\-|_)|g1 u|g560|gene|gf\\-5|g\\-mo|go(\\.w|od)|gr(ad|un)|haie|hcit|hd\\-(m|p|t)|hei\\-|hi(pt|ta)|hp( i|ip)|hs\\-c|ht(c(\\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\\-(20|go|ma)|i230|iac( |\\-|\\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\\/)|klon|kpt |kwc\\-|kyo(c|k)|le(no|xi)|lg( g|\\/(k|l|u)|50|54|\\-[a-w])|libw|lynx|m1\\-w|m3ga|m50\\/|ma(te|ui|xo)|mc(01|21|ca)|m\\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\\-2|po(ck|rt|se)|prox|psio|pt\\-g|qa\\-a|qc(07|12|21|32|60|\\-[2-7]|i\\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\\-|oo|p\\-)|sdk\\/|se(c(\\-|0|1)|47|mc|nd|ri)|sgh\\-|shar|sie(\\-|m)|sk\\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\\-|v\\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\\-|tdg\\-|tel(i|m)|tim\\-|t\\-mo|to(pl|sh)|ts(70|m\\-|m3|m5)|tx\\-9|up(\\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\\-|your|zeto|zte\\-/i.test(navigator.userAgent.substr(0, 4))) {\n");
      out.write("\n");
      out.write("            isMobile = true;\n");
      out.write("            isDesktop = false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var showSelectorPopup = function (popup_id, content_type, content, href, width, height, animation, prevent_closing, cssSelector, close_after) {\n");
      out.write("            var overlay_close = true;\n");
      out.write("            var escape_close = true;\n");
      out.write("            if (prevent_closing == 1) {\n");
      out.write("                overlay_close = false;\n");
      out.write("                escape_close = null;\n");
      out.write("            } else {\n");
      out.write("                overlay_close = true;\n");
      out.write("                escape_close = [27];\n");
      out.write("            }\n");
      out.write("            $(cssSelector).fancybox({\n");
      out.write("                content: content,\n");
      out.write("                width: width,\n");
      out.write("                height: height,\n");
      out.write("                autoSize: false,\n");
      out.write("                openEffect: 'fade',\n");
      out.write("                openSpeed: 150,\n");
      out.write("                closeBtn: true,\n");
      out.write("                wrapCSS: 'animated ' + animation + ' popup-id-' + popup_id,\n");
      out.write("                href: href.replace(new RegExp(\"watch\\\\?v=\", \"i\"), 'v/'),\n");
      out.write("                type: content_type === \"youtube\" ? 'swf' : null,\n");
      out.write("                swf: {\n");
      out.write("                    'wmode': 'transparent',\n");
      out.write("                    'allowfullscreen': 'true'\n");
      out.write("                },\n");
      out.write("\n");
      out.write("                helpers: {\n");
      out.write("                    overlay: {closeClick: overlay_close}\n");
      out.write("                },\n");
      out.write("                keys: {\n");
      out.write("                    close: escape_close\n");
      out.write("                },\n");
      out.write("                afterShow: function () {\n");
      out.write("                    if (close_after > 0)\n");
      out.write("                        setTimeout(closePopup.bind(null, close_after * 1000));\n");
      out.write("                    $.ajax({\n");
      out.write("                        //url: '',\n");
      out.write("                        type: 'GET',\n");
      out.write("                        data: {popup_id: popup_id},\n");
      out.write("                        dataType: 'json',\n");
      out.write("                        success: function (response) {\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var closePopup = function (cssSelector) {\n");
      out.write("            if (cssSelector == '')\n");
      out.write("                $.fancybox.close();\n");
      out.write("            else\n");
      out.write("                $(cssSelector).fancybox.close();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var showPopup = function (popup_id, content_type, content, href, width, height, animation, prevent_closing, auto_size, auto_resize, aspect_ratio, delay, close_after) {\n");
      out.write("            var timeout = 500;\n");
      out.write("            if (delay > 0) {\n");
      out.write("                timeout += (delay * 1000);\n");
      out.write("            }\n");
      out.write("            var overlay_close = true;\n");
      out.write("            var escape_close = true;\n");
      out.write("            if (prevent_closing == 1) {\n");
      out.write("                overlay_close = false;\n");
      out.write("                escape_close = null;\n");
      out.write("            } else {\n");
      out.write("                overlay_close = true;\n");
      out.write("                escape_close = [27];\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            setTimeout(function () {\n");
      out.write("                $.fancybox.open({\n");
      out.write("                    content: content,\n");
      out.write("                    width: width,\n");
      out.write("                    height: height,\n");
      out.write("                    autoSize: false,\n");
      out.write("                    openEffect: 'fade',\n");
      out.write("                    openSpeed: 150,\n");
      out.write("                    closeBtn: true,\n");
      out.write("                    wrapCSS: 'animated ' + animation + ' popup-id-' + popup_id,\n");
      out.write("                    autoResize: auto_resize === \"false\" ? false : true,\n");
      out.write("                    aspectRatio: aspect_ratio === \"false\" ? false : true,\n");
      out.write("                    href: href.replace(new RegExp(\"watch\\\\?v=\", \"i\"), 'v/'),\n");
      out.write("                    type: content_type === \"youtube\" ? 'swf' : null,\n");
      out.write("                    swf: {\n");
      out.write("                        'wmode': 'transparent',\n");
      out.write("                        'allowfullscreen': 'true'\n");
      out.write("                    },\n");
      out.write("\n");
      out.write("                    helpers: {\n");
      out.write("                        overlay: {closeClick: overlay_close}\n");
      out.write("                    },\n");
      out.write("                    keys: {\n");
      out.write("                        close: escape_close\n");
      out.write("                    },\n");
      out.write("                    afterShow: function () {\n");
      out.write("                        if (close_after > 0)\n");
      out.write("                            setTimeout(closePopup, close_after * 1000);\n");
      out.write("                        $.ajax({\n");
      out.write("                            //url: '',\n");
      out.write("                            type: 'GET',\n");
      out.write("                            data: {popup_id: popup_id},\n");
      out.write("                            dataType: 'json',\n");
      out.write("                            success: function (response) {\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            }, timeout);\n");
      out.write("\n");
      out.write("\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var uri = location.pathname + location.search;\n");
      out.write("        var documentReady = false;\n");
      out.write("        var windowLoad = false;\n");
      out.write("        var isBodyClicked = false;\n");
      out.write("\n");
      out.write("        var isExitEvent = false;\n");
      out.write("        var alreadyscrolled = false;\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            documentReady = true;\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(window).load(function () {\n");
      out.write("            windowLoad = true;\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        //var exitEvent = function (){\n");
      out.write("\n");
      out.write("        //\t};\t\n");
      out.write("\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            //url: '',\n");
      out.write("            type: 'GET',\n");
      out.write("            data: {'uri': uri},\n");
      out.write("            dataType: 'json',\n");
      out.write("            success: function (response) {\n");
      out.write("\n");
      out.write("                for (entry in response) {\n");
      out.write("                    // Check if the current popup should be visible on mobile devices\n");
      out.write("                    if (response[entry].show_on_mobile == '0' && isMobile) {\n");
      out.write("                        continue;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (response[entry].show_on_desktop == '0' && isDesktop) {\n");
      out.write("                        continue;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (response[entry].match) {\n");
      out.write("                        repeat = response[entry].repeat;\n");
      out.write("                        popup_id = response[entry].id;\n");
      out.write("\n");
      out.write("                        if (response[entry].event == 0) { // Document ready event  \t\t\n");
      out.write("                            if (documentReady) {\n");
      out.write("                                showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\n");
      out.write("                            } else {\n");
      out.write("                                $(document).ready(function () {\n");
      out.write("                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("                        if (response[entry].event == 1) { // Window load event\n");
      out.write("                            if (windowLoad) {\n");
      out.write("                                showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\n");
      out.write("                            } else {\n");
      out.write("                                $(window).load(function () {\n");
      out.write("\n");
      out.write("                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        if (response[entry].event == 2) { // Body click event\n");
      out.write("                            $('body').click(function () {\n");
      out.write("                                if (isBodyClicked == false) {\n");
      out.write("                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\n");
      out.write("                                    isBodyClicked = true;\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        if (response[entry].event == 3) { // Exit intent\n");
      out.write("                            var p_id = response[entry].popup_id;\n");
      out.write("                            var p_content = response[entry].content;\n");
      out.write("                            var p_width = response[entry].width;\n");
      out.write("                            var p_height = response[entry].height;\n");
      out.write("                            var p_animation = response[entry].animation;\n");
      out.write("                            var p_prevent_closing = response[entry].prevent_closing;\n");
      out.write("                            var p_auto_size = response[entry].auto_size;\n");
      out.write("                            var p_auto_resize = response[entry].auto_resize;\n");
      out.write("                            var p_aspect_ratio = response[entry].aspect_ratio;\n");
      out.write("                            var p_content_type = response[entry].content_type;\n");
      out.write("                            var p_video_href = response[entry].video_href;\n");
      out.write("\n");
      out.write("                            var bootstrap_enabled = (typeof $().modal == 'function');\n");
      out.write("\n");
      out.write("                            if (!bootstrap_enabled) {\n");
      out.write("                                $('head').append('<link rel=\"stylesheet\" type=\"text/css\" href=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/popupwindow/modal/dol_bootstrap.min.css\" />');\n");
      out.write("                                $('head').append('<script type=\"text/javascript\" src=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/popupwindow/modal/dol_bootstrap.min.js\"><' + '/script>');\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            var prevY = -1;\n");
      out.write("\n");
      out.write("                            $(document).bind(\"mouseout\", function (e) {\n");
      out.write("                                e.preventDefault();\n");
      out.write("                                e.stopPropagation();\n");
      out.write("                                if (prevY == -1) {\n");
      out.write("                                    prevY = e.pageY;\n");
      out.write("\n");
      out.write("                                    return;\n");
      out.write("                                }\n");
      out.write("                                if (!isExitEvent && (e.pageY < prevY) && (e.pageY - $(window).scrollTop() <= 1)) {\n");
      out.write("\n");
      out.write("                                    prevY = -1;\n");
      out.write("                                    showPopup(p_id, p_content_type, p_content, p_video_href, p_width, p_height, p_animation, p_prevent_closing, p_auto_size, p_auto_resize, p_aspect_ratio, response[entry].seconds, response[entry].close_after);\n");
      out.write("                                    isExitEvent = true;\n");
      out.write("                                    //showPopup(response[entry].popup_id, response[entry].content, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing);\n");
      out.write("                                } else {\n");
      out.write("                                    prevY = e.pageY;\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        if (response[entry].event == 4) { // Scroll from top event\n");
      out.write("                            $(window).scroll(function () {\n");
      out.write("\n");
      out.write("                                //variables to be used\t\t\t\t\n");
      out.write("\n");
      out.write("                                var startDistance = 0;\n");
      out.write("                                var percentageValue = response[entry].percentage_value;\n");
      out.write("                                var scrollAmount = $(window).scrollTop();\n");
      out.write("                                var documentHeight = $(window).height();\n");
      out.write("\n");
      out.write("                                // calculate the percentage the user has scrolled down the page\n");
      out.write("                                var scrollPercent = (scrollAmount / documentHeight) * 100;\n");
      out.write("\n");
      out.write("                                // detecting the percentage scrolled and calling the pop up\t\n");
      out.write("                                if (!alreadyscrolled && scrollPercent > percentageValue && scrollPercent < percentageValue + 1) {\n");
      out.write("                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\n");
      out.write("                                    alreadyscrolled = true;\n");
      out.write("\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("                        if (response[entry].event == 5) { // CSS Selector\n");
      out.write("\n");
      out.write("                            $(response[entry].css_selector).addClass('fancybox');\n");
      out.write("                            $(response[entry].css_selector).addClass('fancybox.iframe');\n");
      out.write("                            showSelectorPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].css_selector, response[entry].close_after);\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        .popup-id-1{}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .popup-id-2{}                                                                                                                                                                                                                                                                                                                                                                                                                                                                           .popup-id-3{}                                                                                                                                                                                                                                                                                                                                                                                                                              .popup-id-4{}                                                                                                                                                                                                                        </style>\n");
      out.write("    <footer>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer/footer1.jsp", out, false);
      out.write("\n");
      out.write("    </footer>\n");
      out.write("    <a id=\"messenger-button\" href=\"#\" alt=\"Hỗ Trợ Shop ACC Game\" title=\"Hỗ Trợ Shop ACC Game\">\n");
      out.write("        <img style=\"position: fixed;bottom: 35px;right: 25px;z-index:2;\" src=\"#\">\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script></body>\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/shopacc");
    _jspx_th_sql_setDataSource_0.setVar("ds");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
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
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ds}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
          out.write("                select * from product where pType=\"lienquan\"\n");
          out.write("            ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("row");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames\">\n");
          out.write("                    <div class=\"item-game-wrapper\">\n");
          out.write("                        <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <div class=\"img\">\n");
          out.write("                                <img class=\"check_img_errs\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                            </div>\n");
          out.write("                        </a>\n");
          out.write("                        <div class=\"item-info\">\n");
          out.write("                                <div class=\"item-title\">\n");
          out.write("                                    <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>                                \n");
          out.write("                                </div>\n");
          out.write("                            <!-- thông tin acc add vào sau -->\n");
          out.write("                            <div class=\"item-price\">\n");
          out.write("                                <span class=\"cur-p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"item-btn-a\">\n");
          out.write("                                <a href=\"javascript:void(0);\" onclick=\"javascript:void(0);cart.add('188', '1', this);\">\n");
          out.write("                                    <i class=\"fas fa-shopping-cart \"></i>\n");
          out.write("                                </a>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"item-btn\" onclick=\"cart.buyNow('188', '1', this);\" style=\"margin-top: 10px\">Mua ngay</div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                            ");
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

  private boolean _jspx_meth_sql_setDataSource_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_1 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_1.setParent(null);
    _jspx_th_sql_setDataSource_1.setUser("root");
    _jspx_th_sql_setDataSource_1.setPassword("");
    _jspx_th_sql_setDataSource_1.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_1.setUrl("jdbc:mysql://localhost:3306/shopacc");
    _jspx_th_sql_setDataSource_1.setVar("ds");
    int _jspx_eval_sql_setDataSource_1 = _jspx_th_sql_setDataSource_1.doStartTag();
    if (_jspx_th_sql_setDataSource_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_1);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent(null);
    _jspx_th_sql_query_1.setVar("result");
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ds}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                select * from product where pType=\"lienminh\"\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("row");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames\">\n");
          out.write("                    <div class=\"item-game-wrapper\">\n");
          out.write("                        <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <div class=\"img\">\n");
          out.write("                                <img class=\"check_img_errs\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                            </div></a>\n");
          out.write("                        <div class=\"item-info\">\n");
          out.write("                            <div class=\"item-title\">\n");
          out.write("                                    <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>                                \n");
          out.write("                             </div>\n");
          out.write("                            <!-- thông tin acc add vào sau -->\n");
          out.write("                            <div class=\"item-price\">\n");
          out.write("                                <span class=\"cur-p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"item-btn-a\">\n");
          out.write("                                <a href=\"javascript:void(0);\" onclick=\"javascript:void(0);cart.add('188', '1', this);\">\n");
          out.write("                                    <i class=\"fas fa-shopping-cart \"></i>\n");
          out.write("                                </a>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"item-btn\" onclick=\"cart.buyNow('188', '1', this);\" style=\"margin-top: 10px\">Mua ngay</div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("              ");
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

  private boolean _jspx_meth_sql_setDataSource_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_2 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_2.setParent(null);
    _jspx_th_sql_setDataSource_2.setUser("root");
    _jspx_th_sql_setDataSource_2.setPassword("");
    _jspx_th_sql_setDataSource_2.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_2.setUrl("jdbc:mysql://localhost:3306/shopacc");
    _jspx_th_sql_setDataSource_2.setVar("ds");
    int _jspx_eval_sql_setDataSource_2 = _jspx_th_sql_setDataSource_2.doStartTag();
    if (_jspx_th_sql_setDataSource_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_2);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_2);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent(null);
    _jspx_th_sql_query_2.setVar("result");
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ds}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                select * from product where pType=\"fifa4\"\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_2);
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
          out.write("                       <div class=\"col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames\">\n");
          out.write("                    <div class=\"item-game-wrapper\">\n");
          out.write("                        <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <div class=\"img\">\n");
          out.write("                                <img class=\"check_img_errs\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                            </div></a>\n");
          out.write("                        <div class=\"item-info\">\n");
          out.write("                          <div class=\"item-title\">\n");
          out.write("                                    <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>                                \n");
          out.write("                                </div>\n");
          out.write("                            <!-- thông tin acc add vào sau -->\n");
          out.write("                            <div class=\"item-price\">\n");
          out.write("                                <span class=\"cur-p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"item-btn-a\">\n");
          out.write("                                <a href=\"\" onclick=\"\">\n");
          out.write("                                    <i class=\"fas fa-shopping-cart \"></i>\n");
          out.write("                                </a>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"item-btn\" onclick=\"\" style=\"margin-top: 10px\">Mua ngay</div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                ");
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
}
