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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html dir=\"ltr\" lang=\"vi\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header1.jsp", out, false);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <noscript>\r\n");
      out.write("        <iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM\" height=\"0\" width=\"0\"\r\n");
      out.write("                style=\"display:none;visibility:hidden\"></iframe>\r\n");
      out.write("        </noscript>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"top-header\" style=\"background-color: #088A08\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\" style=\"opacity: 0.7\">\r\n");
      out.write("                    <div class=\"slide-news\">\r\n");
      out.write("                        <div class=\"w3-content w3-section\">\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"left carousel-control\" role=\"button\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"right carousel-control\" role=\"button\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                <span class=\"sr-only\">Next</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"marquee-slide\">\r\n");
      out.write("                                <a href=\"accountLienQuan.jsp\" class=\"mySlides\" id=\"new-slide-0\">\r\n");
      out.write("                                    <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                    Liên Quân              </a>\r\n");
      out.write("                                <a href=\"accountLienMinh.jsp\" class=\"mySlides\" id=\"new-slide-1\">\r\n");
      out.write("                                    <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                    Liên Minh              </a>\r\n");
      out.write("                                <a href=\"accountFifa.jsp\" class=\"mySlides\" id=\"new-slide-2\">\r\n");
      out.write("                                    <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                    Fifa              </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"text-right \" style=\"padding:5px 0;float: right\">\r\n");
      out.write("                        Hỗ trợ 1900 123456\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <header>\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header2.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            var time_run_link = '5' * 1000;\r\n");
      out.write("            var timeout_handle = null;\r\n");
      out.write("\r\n");
      out.write("            var myIndex = 0;\r\n");
      out.write("            carousel();\r\n");
      out.write("\r\n");
      out.write("            function carousel() {\r\n");
      out.write("                var i;\r\n");
      out.write("                var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("                if (x.length > 0) {\r\n");
      out.write("                    for (i = 0; i < x.length; i++) {\r\n");
      out.write("                        x[i].style.display = \"none\";\r\n");
      out.write("                    }\r\n");
      out.write("                    myIndex++;\r\n");
      out.write("                    if (myIndex > x.length) {\r\n");
      out.write("                        myIndex = 1\r\n");
      out.write("                    }\r\n");
      out.write("                    x[myIndex - 1].style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("                    timeout_handle = setTimeout(carousel, time_run_link); // Change image every 2 seconds\r\n");
      out.write("\r\n");
      out.write("                    $('.w3-content .mySlides').removeClass('animate-down');\r\n");
      out.write("                    $('.w3-content .mySlides').addClass('animate-up');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải sang trái\r\n");
      out.write("            $(\".left\").click(function (e) {\r\n");
      out.write("                var i;\r\n");
      out.write("                var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("                if (x.length > 0) {\r\n");
      out.write("                    for (i = 0; i < x.length; i++) {\r\n");
      out.write("                        x[i].style.display = \"none\";\r\n");
      out.write("                    }\r\n");
      out.write("                    myIndex--;\r\n");
      out.write("                    if (myIndex < 0) {\r\n");
      out.write("                        myIndex = x.length - 1;\r\n");
      out.write("                    }\r\n");
      out.write("                    x[myIndex].style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("                    $('.w3-content .mySlides').removeClass('animate-up');\r\n");
      out.write("                    $('.w3-content .mySlides').addClass('animate-down');\r\n");
      out.write("\r\n");
      out.write("                    clearTimeout(timeout_handle);\r\n");
      out.write("                    timeout_handle = setTimeout(carousel, time_run_link);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải trái sang phải\r\n");
      out.write("            $(\".right\").click(function (e) {\r\n");
      out.write("                var i;\r\n");
      out.write("                var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("                if (x.length > 0) {\r\n");
      out.write("                    for (i = 0; i < x.length; i++) {\r\n");
      out.write("                        x[i].style.display = \"none\";\r\n");
      out.write("                    }\r\n");
      out.write("                    myIndex++;\r\n");
      out.write("                    if (myIndex > x.length) {\r\n");
      out.write("                        myIndex = 1\r\n");
      out.write("                    }\r\n");
      out.write("                    x[myIndex - 1].style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("                    $('.w3-content .mySlides').removeClass('animate-down');\r\n");
      out.write("                    $('.w3-content .mySlides').addClass('animate-up');\r\n");
      out.write("\r\n");
      out.write("                    clearTimeout(timeout_handle);\r\n");
      out.write("                    timeout_handle = setTimeout(carousel, time_run_link);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <style>\r\n");
      out.write("            @media (max-width: 992px) {\r\n");
      out.write("                body .container {\r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (max-width: 415px) {\r\n");
      out.write("                .col-xs-6 {\r\n");
      out.write("                    width: 50%;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (max-width: 500px) {\r\n");
      out.write("                .col-xs-6 {\r\n");
      out.write("                    width: 50%;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (max-width: 1199px) {\r\n");
      out.write("                body .container .list-title a {\r\n");
      out.write("                    right: 15px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .container .list-title {\r\n");
      out.write("                    padding: 0 15px 0 15px;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (width: 992px) {\r\n");
      out.write("                .slider-container .col-md-8 {\r\n");
      out.write("                    width:  100%\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (min-width: 1200px) {\r\n");
      out.write("                .list_discovery {\r\n");
      out.write("                    margin-left: -15px !important;\r\n");
      out.write("                    margin-right: -15px !important;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .text-md-center {\r\n");
      out.write("                    margin-left: -15px;\r\n");
      out.write("                    margin-right: -15px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .menu-tab-all {\r\n");
      out.write("                    margin-left: -5px;\r\n");
      out.write("                    margin-right: -5px\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .col-lg-7 {\r\n");
      out.write("                    width: 63%;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .col-lg-5 {\r\n");
      out.write("                    width: 37%;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .product-price-well .col-lg-2 {\r\n");
      out.write("                    width: 20%;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .product-price-well .col-md-3 {\r\n");
      out.write("                    width: 20%;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (min-width: 992px) {\r\n");
      out.write("                .product-price-well .col-lg-2 {\r\n");
      out.write("                    width: 20%;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .product-price-well .col-md-3 {\r\n");
      out.write("                    width: 20%;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .border-radius-left {\r\n");
      out.write("                border-bottom-left-radius: 4px;\r\n");
      out.write("                border-top-left-radius: 4px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .border-radius-right {\r\n");
      out.write("                border-bottom-right-radius: 4px;\r\n");
      out.write("                border-top-right-radius: 4px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (min-width: 320px) and (max-width: 570px) {\r\n");
      out.write("                .p-5-only {\r\n");
      out.write("                    padding: 5px;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .menu-2 .tab-content .item-text a {\r\n");
      out.write("                color: #000;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .cut_string {\r\n");
      out.write("                color: #fff;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            h4.cut_string {\r\n");
      out.write("                color: #000;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn-aqua {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                color: #21beff;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                border: unset;\r\n");
      out.write("                font-family: 'Roboto-Condensed-Bold'; }\r\n");
      out.write("            .btn-aqua:hover {\r\n");
      out.write("                color: #279cff;\r\n");
      out.write("                background-color: unset;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .img-banner {\r\n");
      out.write("                width: 266px;\r\n");
      out.write("                height: 156px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"home-page banner-home\" style=\"background-color: #f7f7f7\">\r\n");
      out.write("            <div class=\"menu-2\" style=\"margin-top: 0\">\r\n");
      out.write("                <div class=\"container padd-0\" style=\"margin-top: 6px;\">\r\n");
      out.write("                    <div id=\"alert-position\"></div>\r\n");
      out.write("                    <div class=\"menu-catalog\">\r\n");
      out.write("                        <div class=\"header-menu\">\r\n");
      out.write("                            <div class=\"bar-btn\">\r\n");
      out.write("                                <i class=\"fas fa-bars\"></i><span>Danh mục sản phẩm</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"nav-menu\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"accountLienQuan.jsp\"><i class=\"fab fa-steam-symbol\"></i>\r\n");
      out.write("                                            <span>Liên Quân</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"accountLienMinh.jsp\"><i class=\"fas fa-trophy\"></i>\r\n");
      out.write("                                            <span>Liên Minh</span></a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"accountFifa.jsp\"><i class=\"icon icon-origin-svg\"></i>\r\n");
      out.write("                                            <span>Fifa online 4</span></a>\r\n");
      out.write("                                    </li>           \r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--chon san pham mua nhieu tat ca san pham ..-->\r\n");
      out.write("                        <div class=\"right-menu\">\r\n");
      out.write("                            <div class=\"row menu-tab-all service\">\r\n");
      out.write("                                <div class=\"quick-menu head-link\">\r\n");
      out.write("                                    <a href=\"bestsellers.jsp\" target=\"_blank\"><i class=\"fab fa-hotjar\"></i><span>Sản Phẩm Hot</span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"quick-menu head-link\">\r\n");
      out.write("                                    <a href=\"#\" target=\"_blank\"><i class=\"fas fa-award\"></i><span>Đang Khuyến Mãi</span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"quick-menu head-link\">\r\n");
      out.write("                                    <a href=\"#\" target=\"_blank\"><i class=\"far fa-credit-card\"></i><span>Hình thức thanh toán</span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"quick-menu head-link\">\r\n");
      out.write("                                    <a href=\"#\" target=\"_blank\"><i class=\"fas fa-gamepad\"></i><span>Hướng dẫn mua hàng</span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row slider-container\" style=\"max-width: 797px;\">\r\n");
      out.write("                                <div class=\"col col-md-8 col-sm-12 col-xs-12 col-lg-8\">\r\n");
      out.write("                                    <div class=\"home-slider\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <!--  Link hình chạy, link hình  -->\r\n");
      out.write("                                            <a href=\"index.jsp\"><img class=\"check_img_errs\" src=\"https://lh3.googleusercontent.com/NrqvieF6vnnrPQGKbAQLcEVrVPeA8rNiYbzxhkLAOqVarCjZCMufHV9aBRnqXhl0Sq0g3mB7zIgfJEcZpZKmdFmGCaOlvKo4zUFHRNZLxdE6OFtUrR5ocfhurqpob_ab6D511pI1bVJ10m2q5ZXQIJrWWmhp-hJN7vhTQagEig1DDwpBeBLv_5mvTxxOcgSOe4ZPkY3H1VLU6VlcU6m-slkAsBJ75koO0YIdu8u7IYX6dNFtRjYb0-AY0njw-XTUkUzX7DRtl-sbjOLsJcEbQmsi97aCj9lOIi_wDVFo0UOHlmhViwKq4h_A6zfeXdlzf6Rn3W5_5iuDAw6zdo_pBFTvfMnkwFyAfUmy7G-nCnUhRPbaQoHBgqOU2azzAe7NFqs0XXOy0Z5kDs4eO4cpfDrG0QOIq6bpu3ltFIAC7_Fl_N3wMJm7Ad4IM6TyYsSFvXBrN_fLnZ_dlEIFXwGvm3X_M50aA4ciIGGfObn0N0uqWDHnJafbz8oH-PvIOnljjyi23rKVYOf0g5uHM8AhGcAc441x3KvY5-L_iOnVH3u6yGHXCza4Sj5yNkw_fgtTu99Hkf-AXlPf_Rlu5TrfJgynKSFAycDdnPwSSxc2JRPGKFKdY1e_fpP3RT70N4GvO2M2rKS9YoBxQuCf7f8IDxUffbUrkZzShVu9kZzicm1Og6YbevXDCN7nwTw=w1677-h943-no?authuser=1\" alt=\"#\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <a href=\"accountFifa.jsp\"><img class=\"check_img_errs\" src=\"https://danongonline.com.vn/wp-content/uploads/2017/11/Fifa-Online-4-ra-m%E1%BA%AFt-v%E1%BB%9Bi-%C4%91%E1%BB%93-h%E1%BB%8Da-si%C3%AAu-kh%E1%BB%A7ng-1.jpg\" alt=\"#\t\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <a href=\"accountLienQuan.jsp\"><img class=\"check_img_errs\" src=\"https://gameviet.mobi/wp-content/uploads/2020/03/Hinh-Nen-Lien-Quan-Mobile-Wallpaper-Cho-Iphone-Android-1280x640.jpg\" alt=\"#\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <a href=\"accountLienMinh.jsp\"><img class=\"check_img_errs\" src=\"https://s.dowload.vn/data/image/2018/09/26/lien-minh-huyen-thoai-doi-hinh-vuot-ai-co-truong-640.jpg\" alt=\"#\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <script type=\"text/javascript\">\r\n");
      out.write("                                    $('.home-slider').slick({\r\n");
      out.write("                                        autoplay: true,\r\n");
      out.write("                                        autoplaySpeed: 5000,\r\n");
      out.write("                                        dots: true,\r\n");
      out.write("                                        infinite: true,\r\n");
      out.write("                                        speed: 500,\r\n");
      out.write("                                        arrows: true,\r\n");
      out.write("                                    });\r\n");
      out.write("                                </script>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("    <div class=\"container padd-0\">\r\n");
      out.write("        <div class=\"list-title\">\r\n");
      out.write("            <h2>Sản phẩm giá tốt</h2>\r\n");
      out.write("            <p>Bạn có thể lựa chọn hiển thị theo giá sản phẩm phù hợp với túi tiền</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"list-container\">\r\n");
      out.write("            <div class=\"row justify-content-md-center\">\r\n");
      out.write("                <div class=\"product-price-well\">\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 50000)\">\r\n");
      out.write("                            <strong>Dưới 50.000đ</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 100000)\">\r\n");
      out.write("                            <strong>Dưới 100.000đ</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 200000)\">\r\n");
      out.write("                            <strong>Dưới 200.000đ</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 500000)\">\r\n");
      out.write("                            <strong>Dưới 500.000đ</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-12 col-xs-12\" style=\"padding-left: 15px;padding-right: 15px\">\r\n");
      out.write("                        <div class=\"well-price\" onclick=\"filterMaxPrice(this, 1000000)\">\r\n");
      out.write("                            <strong>Dưới 1.000.000đ</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row service\" id=\"max-price\"></div>\r\n");
      out.write("            <hr>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<!--end tim kiem theo gia-->\r\n");
      out.write("    \r\n");
      out.write("<!--start account lien quan-->\r\n");
      out.write("  ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"list-title\" style=\"margin-top: 15px;\">\r\n");
      out.write("            <h2>Game Liên Quân</h2>\r\n");
      out.write("            <a href=\"#\">Xem chi tiết</a>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div class=\"next-page-product6\" style=\"display:none;\">1</div>\r\n");
      out.write("        <div class=\"list-container\">\r\n");
      out.write("            <div class=\"row text-md-center\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"view-more btn-aqua\" id=\"loadMoreProduct6\" onclick=\"loadMore($('.next-page-product6').text(), 6, this);\r\n");
      out.write("                    $('.next-page-product6').text(Number($('.next-page-product6').text()) + 1);\">Tải thêm sản phẩm</div>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("<!--end account lien quan-->\r\n");
      out.write("\r\n");
      out.write("<!--satrt account lien minh-->\r\n");
      if (_jspx_meth_sql_setDataSource_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_sql_query_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"list-title\" style=\"margin-top: 15px;\">\r\n");
      out.write("            <h2>Game Liên Minh</h2>\r\n");
      out.write("            <a href=\"#\">Xem chi tiết</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("                    <div class=\"next-page-product6\" style=\"display:none;\">1</div>\r\n");
      out.write("                    \r\n");
      out.write("        <div class=\"list-container\">\r\n");
      out.write("            <div class=\"row text-md-center\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                                    \r\n");
      out.write("\r\n");
      out.write("        <div class=\"view-more btn-aqua\" id=\"loadMoreProduct6\" onclick=\"loadMore($('.next-page-product6').text(), 6, this);\r\n");
      out.write("                    $('.next-page-product6').text(Number($('.next-page-product6').text()) + 1);\">Tải thêm sản phẩm</div>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("<!--end account lien minh-->\r\n");
      out.write("\r\n");
      out.write("<!--start account fifa 4-->\r\n");
      if (_jspx_meth_sql_setDataSource_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_sql_query_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"list-title\" style=\"margin-top: 15px;\">\r\n");
      out.write("            <h2>Game Fifa</h2>\r\n");
      out.write("            <a href=\"#\">Xem chi tiết</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"next-page-product6\" style=\"display:none;\">1</div>\r\n");
      out.write("        <div class=\"list-container\">\r\n");
      out.write("            <div class=\"row text-md-center\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"view-more btn-aqua\" id=\"loadMoreProduct6\" onclick=\"loadMore($('.next-page-product6').text(), 6, this);\r\n");
      out.write("                    $('.next-page-product6').text(Number($('.next-page-product6').text()) + 1);\">Tải thêm sản phẩm\r\n");
      out.write("        </div>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"high-line-container high-line-2\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"text-line-though\"><span>Bạn là người mới?</span></div>\r\n");
      out.write("            <div class=\"text\">Hãy đăng kí tài khoản để cập nhật những ưu đãi mới nhất từ Shop</div>\r\n");
      out.write("            <a href=\"#\"><button class=\"btn-aqua-bg\">Đăng ký ngay</button></a>\r\n");
      out.write("            <div class=\"text\">Hoặc <a href=\"#\"><b style=\"color: #fff\">đăng nhập</b></a> nếu bạn đã có tài khoản</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        function hide_banner() {\r\n");
      out.write("            $(window).width() < 1420 ? $(\".banner-home-sidebar\").hide() : $(\".banner-home-sidebar\").show()\r\n");
      out.write("        }\r\n");
      out.write("        $(window).resize(function () {\r\n");
      out.write("            hide_banner()\r\n");
      out.write("        }), $(document).ready(function () {\r\n");
      out.write("            hide_banner()\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var isMobile = false; //initiate as false\r\n");
      out.write("        var isDesktop = true;\r\n");
      out.write("\r\n");
      out.write("        // device detection\r\n");
      out.write("        if (/(android|bb\\d+|meego).+mobile|avantgo|bada\\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|ipad|iris|kindle|Android|Silk|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i.test(navigator.userAgent)\r\n");
      out.write("                || /1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\\-(n|u)|c55\\/|capi|ccwa|cdm\\-|cell|chtm|cldc|cmd\\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\\-s|devi|dica|dmob|do(c|p)o|ds(12|\\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\\-|_)|g1 u|g560|gene|gf\\-5|g\\-mo|go(\\.w|od)|gr(ad|un)|haie|hcit|hd\\-(m|p|t)|hei\\-|hi(pt|ta)|hp( i|ip)|hs\\-c|ht(c(\\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\\-(20|go|ma)|i230|iac( |\\-|\\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\\/)|klon|kpt |kwc\\-|kyo(c|k)|le(no|xi)|lg( g|\\/(k|l|u)|50|54|\\-[a-w])|libw|lynx|m1\\-w|m3ga|m50\\/|ma(te|ui|xo)|mc(01|21|ca)|m\\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\\-2|po(ck|rt|se)|prox|psio|pt\\-g|qa\\-a|qc(07|12|21|32|60|\\-[2-7]|i\\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\\-|oo|p\\-)|sdk\\/|se(c(\\-|0|1)|47|mc|nd|ri)|sgh\\-|shar|sie(\\-|m)|sk\\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\\-|v\\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\\-|tdg\\-|tel(i|m)|tim\\-|t\\-mo|to(pl|sh)|ts(70|m\\-|m3|m5)|tx\\-9|up(\\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\\-|your|zeto|zte\\-/i.test(navigator.userAgent.substr(0, 4))) {\r\n");
      out.write("\r\n");
      out.write("            isMobile = true;\r\n");
      out.write("            isDesktop = false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var showSelectorPopup = function (popup_id, content_type, content, href, width, height, animation, prevent_closing, cssSelector, close_after) {\r\n");
      out.write("            var overlay_close = true;\r\n");
      out.write("            var escape_close = true;\r\n");
      out.write("            if (prevent_closing == 1) {\r\n");
      out.write("                overlay_close = false;\r\n");
      out.write("                escape_close = null;\r\n");
      out.write("            } else {\r\n");
      out.write("                overlay_close = true;\r\n");
      out.write("                escape_close = [27];\r\n");
      out.write("            }\r\n");
      out.write("            $(cssSelector).fancybox({\r\n");
      out.write("                content: content,\r\n");
      out.write("                width: width,\r\n");
      out.write("                height: height,\r\n");
      out.write("                autoSize: false,\r\n");
      out.write("                openEffect: 'fade',\r\n");
      out.write("                openSpeed: 150,\r\n");
      out.write("                closeBtn: true,\r\n");
      out.write("                wrapCSS: 'animated ' + animation + ' popup-id-' + popup_id,\r\n");
      out.write("                href: href.replace(new RegExp(\"watch\\\\?v=\", \"i\"), 'v/'),\r\n");
      out.write("                type: content_type === \"youtube\" ? 'swf' : null,\r\n");
      out.write("                swf: {\r\n");
      out.write("                    'wmode': 'transparent',\r\n");
      out.write("                    'allowfullscreen': 'true'\r\n");
      out.write("                },\r\n");
      out.write("\r\n");
      out.write("                helpers: {\r\n");
      out.write("                    overlay: {closeClick: overlay_close}\r\n");
      out.write("                },\r\n");
      out.write("                keys: {\r\n");
      out.write("                    close: escape_close\r\n");
      out.write("                },\r\n");
      out.write("                afterShow: function () {\r\n");
      out.write("                    if (close_after > 0)\r\n");
      out.write("                        setTimeout(closePopup.bind(null, close_after * 1000));\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        //url: '',\r\n");
      out.write("                        type: 'GET',\r\n");
      out.write("                        data: {popup_id: popup_id},\r\n");
      out.write("                        dataType: 'json',\r\n");
      out.write("                        success: function (response) {\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var closePopup = function (cssSelector) {\r\n");
      out.write("            if (cssSelector == '')\r\n");
      out.write("                $.fancybox.close();\r\n");
      out.write("            else\r\n");
      out.write("                $(cssSelector).fancybox.close();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var showPopup = function (popup_id, content_type, content, href, width, height, animation, prevent_closing, auto_size, auto_resize, aspect_ratio, delay, close_after) {\r\n");
      out.write("            var timeout = 500;\r\n");
      out.write("            if (delay > 0) {\r\n");
      out.write("                timeout += (delay * 1000);\r\n");
      out.write("            }\r\n");
      out.write("            var overlay_close = true;\r\n");
      out.write("            var escape_close = true;\r\n");
      out.write("            if (prevent_closing == 1) {\r\n");
      out.write("                overlay_close = false;\r\n");
      out.write("                escape_close = null;\r\n");
      out.write("            } else {\r\n");
      out.write("                overlay_close = true;\r\n");
      out.write("                escape_close = [27];\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            setTimeout(function () {\r\n");
      out.write("                $.fancybox.open({\r\n");
      out.write("                    content: content,\r\n");
      out.write("                    width: width,\r\n");
      out.write("                    height: height,\r\n");
      out.write("                    autoSize: false,\r\n");
      out.write("                    openEffect: 'fade',\r\n");
      out.write("                    openSpeed: 150,\r\n");
      out.write("                    closeBtn: true,\r\n");
      out.write("                    wrapCSS: 'animated ' + animation + ' popup-id-' + popup_id,\r\n");
      out.write("                    autoResize: auto_resize === \"false\" ? false : true,\r\n");
      out.write("                    aspectRatio: aspect_ratio === \"false\" ? false : true,\r\n");
      out.write("                    href: href.replace(new RegExp(\"watch\\\\?v=\", \"i\"), 'v/'),\r\n");
      out.write("                    type: content_type === \"youtube\" ? 'swf' : null,\r\n");
      out.write("                    swf: {\r\n");
      out.write("                        'wmode': 'transparent',\r\n");
      out.write("                        'allowfullscreen': 'true'\r\n");
      out.write("                    },\r\n");
      out.write("\r\n");
      out.write("                    helpers: {\r\n");
      out.write("                        overlay: {closeClick: overlay_close}\r\n");
      out.write("                    },\r\n");
      out.write("                    keys: {\r\n");
      out.write("                        close: escape_close\r\n");
      out.write("                    },\r\n");
      out.write("                    afterShow: function () {\r\n");
      out.write("                        if (close_after > 0)\r\n");
      out.write("                            setTimeout(closePopup, close_after * 1000);\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("                            //url: '',\r\n");
      out.write("                            type: 'GET',\r\n");
      out.write("                            data: {popup_id: popup_id},\r\n");
      out.write("                            dataType: 'json',\r\n");
      out.write("                            success: function (response) {\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            }, timeout);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var uri = location.pathname + location.search;\r\n");
      out.write("        var documentReady = false;\r\n");
      out.write("        var windowLoad = false;\r\n");
      out.write("        var isBodyClicked = false;\r\n");
      out.write("\r\n");
      out.write("        var isExitEvent = false;\r\n");
      out.write("        var alreadyscrolled = false;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            documentReady = true;\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(window).load(function () {\r\n");
      out.write("            windowLoad = true;\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //var exitEvent = function (){\r\n");
      out.write("\r\n");
      out.write("        //\t};\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            //url: '',\r\n");
      out.write("            type: 'GET',\r\n");
      out.write("            data: {'uri': uri},\r\n");
      out.write("            dataType: 'json',\r\n");
      out.write("            success: function (response) {\r\n");
      out.write("\r\n");
      out.write("                for (entry in response) {\r\n");
      out.write("                    // Check if the current popup should be visible on mobile devices\r\n");
      out.write("                    if (response[entry].show_on_mobile == '0' && isMobile) {\r\n");
      out.write("                        continue;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    if (response[entry].show_on_desktop == '0' && isDesktop) {\r\n");
      out.write("                        continue;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    if (response[entry].match) {\r\n");
      out.write("                        repeat = response[entry].repeat;\r\n");
      out.write("                        popup_id = response[entry].id;\r\n");
      out.write("\r\n");
      out.write("                        if (response[entry].event == 0) { // Document ready event  \t\t\r\n");
      out.write("                            if (documentReady) {\r\n");
      out.write("                                showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\r\n");
      out.write("                            } else {\r\n");
      out.write("                                $(document).ready(function () {\r\n");
      out.write("                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        if (response[entry].event == 1) { // Window load event\r\n");
      out.write("                            if (windowLoad) {\r\n");
      out.write("                                showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\r\n");
      out.write("                            } else {\r\n");
      out.write("                                $(window).load(function () {\r\n");
      out.write("\r\n");
      out.write("                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        if (response[entry].event == 2) { // Body click event\r\n");
      out.write("                            $('body').click(function () {\r\n");
      out.write("                                if (isBodyClicked == false) {\r\n");
      out.write("                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\r\n");
      out.write("                                    isBodyClicked = true;\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        if (response[entry].event == 3) { // Exit intent\r\n");
      out.write("                            var p_id = response[entry].popup_id;\r\n");
      out.write("                            var p_content = response[entry].content;\r\n");
      out.write("                            var p_width = response[entry].width;\r\n");
      out.write("                            var p_height = response[entry].height;\r\n");
      out.write("                            var p_animation = response[entry].animation;\r\n");
      out.write("                            var p_prevent_closing = response[entry].prevent_closing;\r\n");
      out.write("                            var p_auto_size = response[entry].auto_size;\r\n");
      out.write("                            var p_auto_resize = response[entry].auto_resize;\r\n");
      out.write("                            var p_aspect_ratio = response[entry].aspect_ratio;\r\n");
      out.write("                            var p_content_type = response[entry].content_type;\r\n");
      out.write("                            var p_video_href = response[entry].video_href;\r\n");
      out.write("\r\n");
      out.write("                            var bootstrap_enabled = (typeof $().modal == 'function');\r\n");
      out.write("\r\n");
      out.write("                            if (!bootstrap_enabled) {\r\n");
      out.write("                                $('head').append('<link rel=\"stylesheet\" type=\"text/css\" href=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/popupwindow/modal/dol_bootstrap.min.css\" />');\r\n");
      out.write("                                $('head').append('<script type=\"text/javascript\" src=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/popupwindow/modal/dol_bootstrap.min.js\"><' + '/script>');\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            var prevY = -1;\r\n");
      out.write("\r\n");
      out.write("                            $(document).bind(\"mouseout\", function (e) {\r\n");
      out.write("                                e.preventDefault();\r\n");
      out.write("                                e.stopPropagation();\r\n");
      out.write("                                if (prevY == -1) {\r\n");
      out.write("                                    prevY = e.pageY;\r\n");
      out.write("\r\n");
      out.write("                                    return;\r\n");
      out.write("                                }\r\n");
      out.write("                                if (!isExitEvent && (e.pageY < prevY) && (e.pageY - $(window).scrollTop() <= 1)) {\r\n");
      out.write("\r\n");
      out.write("                                    prevY = -1;\r\n");
      out.write("                                    showPopup(p_id, p_content_type, p_content, p_video_href, p_width, p_height, p_animation, p_prevent_closing, p_auto_size, p_auto_resize, p_aspect_ratio, response[entry].seconds, response[entry].close_after);\r\n");
      out.write("                                    isExitEvent = true;\r\n");
      out.write("                                    //showPopup(response[entry].popup_id, response[entry].content, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing);\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    prevY = e.pageY;\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        if (response[entry].event == 4) { // Scroll from top event\r\n");
      out.write("                            $(window).scroll(function () {\r\n");
      out.write("\r\n");
      out.write("                                //variables to be used\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                                var startDistance = 0;\r\n");
      out.write("                                var percentageValue = response[entry].percentage_value;\r\n");
      out.write("                                var scrollAmount = $(window).scrollTop();\r\n");
      out.write("                                var documentHeight = $(window).height();\r\n");
      out.write("\r\n");
      out.write("                                // calculate the percentage the user has scrolled down the page\r\n");
      out.write("                                var scrollPercent = (scrollAmount / documentHeight) * 100;\r\n");
      out.write("\r\n");
      out.write("                                // detecting the percentage scrolled and calling the pop up\t\r\n");
      out.write("                                if (!alreadyscrolled && scrollPercent > percentageValue && scrollPercent < percentageValue + 1) {\r\n");
      out.write("                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);\r\n");
      out.write("                                    alreadyscrolled = true;\r\n");
      out.write("\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        if (response[entry].event == 5) { // CSS Selector\r\n");
      out.write("\r\n");
      out.write("                            $(response[entry].css_selector).addClass('fancybox');\r\n");
      out.write("                            $(response[entry].css_selector).addClass('fancybox.iframe');\r\n");
      out.write("                            showSelectorPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].css_selector, response[entry].close_after);\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .popup-id-1{}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .popup-id-2{}                                                                                                                                                                                                                                                                                                                                                                                                                                                                           .popup-id-3{}                                                                                                                                                                                                                                                                                                                                                                                                                              .popup-id-4{}                                                                                                                                                                                                                        </style>\r\n");
      out.write("    <footer>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer/footer1.jsp", out, false);
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("    <a id=\"messenger-button\" href=\"#\" alt=\"Hỗ Trợ Shop ACC Game\" title=\"Hỗ Trợ Shop ACC Game\">\r\n");
      out.write("        <img style=\"position: fixed;bottom: 35px;right: 25px;z-index:2;\" src=\"#\">\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script></body>\r\n");
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
          out.write("\r\n");
          out.write("                select * from product where pType=\"lienquan\"\r\n");
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
          out.write("\r\n");
          out.write("                <div class=\"col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames\">\r\n");
          out.write("                    <div class=\"item-game-wrapper\">\r\n");
          out.write("                        <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            <div class=\"img\">\r\n");
          out.write("                                <img class=\"check_img_errs\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </a>\r\n");
          out.write("                        <div class=\"item-info\">\r\n");
          out.write("                                <div class=\"item-title\">\r\n");
          out.write("                                    <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>                                \r\n");
          out.write("                                </div>\r\n");
          out.write("                            <!-- thông tin acc add vào sau -->\r\n");
          out.write("                            <div class=\"item-price\">\r\n");
          out.write("                                <span class=\"cur-p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"item-btn-a\">\r\n");
          out.write("                                <a href=\"javascript:void(0);\" onclick=\"javascript:void(0);cart.add('188', '1', this);\">\r\n");
          out.write("                                    <i class=\"fas fa-shopping-cart \"></i>\r\n");
          out.write("                                </a>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"item-btn\" style=\"margin-top: 10px\" class=\"templatemo-edit-btn\">\r\n");
          out.write("                                 <a href=\"CartController?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&sl=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Mua ngay</a>\r\n");
          out.write("                                \r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
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
          out.write("\r\n");
          out.write("                select * from product where pType=\"lienminh\"\r\n");
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
          out.write("\r\n");
          out.write("                <div class=\"col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames\">\r\n");
          out.write("                    <div class=\"item-game-wrapper\">\r\n");
          out.write("                        <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            <div class=\"img\">\r\n");
          out.write("                                <img class=\"check_img_errs\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\r\n");
          out.write("                            </div></a>\r\n");
          out.write("                        <div class=\"item-info\">\r\n");
          out.write("                            <div class=\"item-title\">\r\n");
          out.write("                                    <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>                                \r\n");
          out.write("                             </div>\r\n");
          out.write("                            <!-- thông tin acc add vào sau -->\r\n");
          out.write("                            <div class=\"item-price\">\r\n");
          out.write("                                <span class=\"cur-p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"item-btn-a\">\r\n");
          out.write("                                <a href=\"javascript:void(0);\" onclick=\"javascript:void(0);cart.add('188', '1', this);\">\r\n");
          out.write("                                    <i class=\"fas fa-shopping-cart \"></i>\r\n");
          out.write("                                </a>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"item-btn\" onclick=\"cart.buyNow('188', '1', this);\" style=\"margin-top: 10px\">Mua ngay</div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
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
          out.write("\r\n");
          out.write("                select * from product where pType=\"fifa4\"\r\n");
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
          out.write("\r\n");
          out.write("                       <div class=\"col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames\">\r\n");
          out.write("                    <div class=\"item-game-wrapper\">\r\n");
          out.write("                        <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            <div class=\"img\">\r\n");
          out.write("                                <img class=\"check_img_errs\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\r\n");
          out.write("                            </div></a>\r\n");
          out.write("                        <div class=\"item-info\">\r\n");
          out.write("                          <div class=\"item-title\">\r\n");
          out.write("                                    <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>                                \r\n");
          out.write("                                </div>\r\n");
          out.write("                            <!-- thông tin acc add vào sau -->\r\n");
          out.write("                            <div class=\"item-price\">\r\n");
          out.write("                                <span class=\"cur-p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"item-btn-a\">\r\n");
          out.write("                                <a href=\"\" onclick=\"\">\r\n");
          out.write("                                    <i class=\"fas fa-shopping-cart \"></i>\r\n");
          out.write("                                </a>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"item-btn\" onclick=\"\" style=\"margin-top: 10px\">Mua ngay</div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
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
