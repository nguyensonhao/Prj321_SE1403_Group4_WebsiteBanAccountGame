package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Product;

public final class productDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html dir=\"ltr\" lang=\"vi\">\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Detail</title>\r\n");
      out.write("        <link rel=\"icon\" href=\"http://www.domain.com/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header1.jsp", out, false);
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            <noscript>\r\n");
      out.write("            <iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM\" height=\"0\" width=\"0\"\r\n");
      out.write("                    style=\"display:none;visibility:hidden\"></iframe>\r\n");
      out.write("            </noscript>\r\n");
      out.write("            <div class=\"top-header\" style=\"background-color: #088A08\">\r\n");
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
      out.write("                                <div class=\"marquee-slide\">\r\n");
      out.write("                                    <a href=\"#\" class=\"mySlides\" id=\"new-slide-0\">\r\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                        Liên Quân              </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"mySlides\" id=\"new-slide-1\">\r\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                        Liên Minh              </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"mySlides\" id=\"new-slide-2\">\r\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\r\n");
      out.write("                                        Fifa              </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"text-right\" style=\"padding:5px 0;float: right\">\r\n");
      out.write("                            Hỗ trợ 0337470726\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <header>\r\n");
      out.write("                 ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <script src=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/bigshop/js/jquery.autocomplete.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                var time_run_link = '5' * 1000;\r\n");
      out.write("                var timeout_handle = null;\r\n");
      out.write("\r\n");
      out.write("                var myIndex = 0;\r\n");
      out.write("                carousel();\r\n");
      out.write("\r\n");
      out.write("                function carousel() {\r\n");
      out.write("                    var i;\r\n");
      out.write("                    var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("                    if (x.length > 0) {\r\n");
      out.write("                        for (i = 0; i < x.length; i++) {\r\n");
      out.write("                            x[i].style.display = \"none\";\r\n");
      out.write("                        }\r\n");
      out.write("                        myIndex++;\r\n");
      out.write("                        if (myIndex > x.length) {\r\n");
      out.write("                            myIndex = 1\r\n");
      out.write("                        }\r\n");
      out.write("                        x[myIndex - 1].style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("                        timeout_handle = setTimeout(carousel, time_run_link); // Change image every 2 seconds\r\n");
      out.write("\r\n");
      out.write("                        $('.w3-content .mySlides').removeClass('animate-down');\r\n");
      out.write("                        $('.w3-content .mySlides').addClass('animate-up');\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải sang trái\r\n");
      out.write("                $(\".left\").click(function (e) {\r\n");
      out.write("                    var i;\r\n");
      out.write("                    var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("                    if (x.length > 0) {\r\n");
      out.write("                        for (i = 0; i < x.length; i++) {\r\n");
      out.write("                            x[i].style.display = \"none\";\r\n");
      out.write("                        }\r\n");
      out.write("                        myIndex--;\r\n");
      out.write("                        if (myIndex < 0) {\r\n");
      out.write("                            myIndex = x.length - 1;\r\n");
      out.write("                        }\r\n");
      out.write("                        x[myIndex].style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("                        $('.w3-content .mySlides').removeClass('animate-up');\r\n");
      out.write("                        $('.w3-content .mySlides').addClass('animate-down');\r\n");
      out.write("\r\n");
      out.write("                        clearTimeout(timeout_handle);\r\n");
      out.write("                        timeout_handle = setTimeout(carousel, time_run_link);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải trái sang phải\r\n");
      out.write("                $(\".right\").click(function (e) {\r\n");
      out.write("                    var i;\r\n");
      out.write("                    var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("                    if (x.length > 0) {\r\n");
      out.write("                        for (i = 0; i < x.length; i++) {\r\n");
      out.write("                            x[i].style.display = \"none\";\r\n");
      out.write("                        }\r\n");
      out.write("                        myIndex++;\r\n");
      out.write("                        if (myIndex > x.length) {\r\n");
      out.write("                            myIndex = 1\r\n");
      out.write("                        }\r\n");
      out.write("                        x[myIndex - 1].style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("                        $('.w3-content .mySlides').removeClass('animate-down');\r\n");
      out.write("                        $('.w3-content .mySlides').addClass('animate-up');\r\n");
      out.write("\r\n");
      out.write("                        clearTimeout(timeout_handle);\r\n");
      out.write("                        timeout_handle = setTimeout(carousel, time_run_link);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                $(\".login-fplus\").click(function () {\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        url: 'index.php?route=account/login/check_rules_facebook',\r\n");
      out.write("                        type: 'POST',\r\n");
      out.write("                        success: function (json) {\r\n");
      out.write("                            if (json['havent_rules'] == 1) {\r\n");
      out.write("                                $('#modal-accept-facebook').modal('show');\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            if (json.href) {\r\n");
      out.write("                                window.location.href = json.href;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#checked_rules_facebook').on('click', function () {\r\n");
      out.write("                    var check_rules = 1;\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        url: 'index.php?route=account/login/check_rules_facebook',\r\n");
      out.write("                        type: 'POST',\r\n");
      out.write("                        data: {\r\n");
      out.write("                            check_rules: check_rules\r\n");
      out.write("                        },\r\n");
      out.write("                        success: function (json) {\r\n");
      out.write("                            if (json.href) {\r\n");
      out.write("                                window.location.href = json.href;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $(\".login-gplus\").click(function () {\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        url: 'index.php?route=extension/module/check_rules_login_google/index',\r\n");
      out.write("                        type: 'POST',\r\n");
      out.write("                        success: function (json) {\r\n");
      out.write("                            if (json['havent_rules'] == 1) {\r\n");
      out.write("                                $('#modal-accept-rules').modal('show');\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            if (json.href) {\r\n");
      out.write("                                window.location.href = json.href;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#checked_rules').on('click', function () {\r\n");
      out.write("                    var check_rules = 1;\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        url: 'index.php?route=extension/module/check_rules_login_google/index',\r\n");
      out.write("                        type: 'POST',\r\n");
      out.write("                        data: {\r\n");
      out.write("                            check_rules: check_rules\r\n");
      out.write("                        },\r\n");
      out.write("                        success: function (json) {\r\n");
      out.write("                            if (json.href) {\r\n");
      out.write("                                window.location.href = json.href;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('.btn-close-modal').on('click', function () {\r\n");
      out.write("                    $('#modal-accept-rules').modal('hide');\r\n");
      out.write("                    $('#modal-accept-facebook').modal('hide');\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
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
      out.write("                                $('body').append('<style>#home-cart:after{display: block;}</style>');\r\n");
      out.write("                            },\r\n");
      out.write("                            function () {\r\n");
      out.write("                                $('#dropdown-detail-cart').css(\"display\", \"none\");\r\n");
      out.write("                                $('body').append('<style>#home-cart:after{display: none;}</style>');\r\n");
      out.write("                            }\r\n");
      out.write("                    );\r\n");
      out.write("\r\n");
      out.write("                    $(\".home-mini-profile\").hover(\r\n");
      out.write("                            function () {\r\n");
      out.write("                                $('.drop-mini-profile').css(\"display\", \"block\");\r\n");
      out.write("                            }, function () {\r\n");
      out.write("                        $('.drop-mini-profile').css(\"display\", \"none\");\r\n");
      out.write("                    }\r\n");
      out.write("                    );\r\n");
      out.write("\r\n");
      out.write("                    $(\"#mini-login\").hover(\r\n");
      out.write("                            function () {\r\n");
      out.write("                                $('.drop-mini-login').css(\"display\", \"block\");\r\n");
      out.write("                            },\r\n");
      out.write("                            function () {\r\n");
      out.write("                                $('.drop-mini-login').css(\"display\", \"none\");\r\n");
      out.write("                            }\r\n");
      out.write("                    );\r\n");
      out.write("\r\n");
      out.write("                    $(\"#notification\").on('click', function () {\r\n");
      out.write("                        $('#count_unread').text('');\r\n");
      out.write("                        $('.notification span').removeClass('visible');\r\n");
      out.write("\r\n");
      out.write("                        updateCountNotification();\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    $('#show-list-notification').on('click', function () {\r\n");
      out.write("                        $('.drop-mini-notification').toggle();\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    window.addEventListener('click', function (e) {\r\n");
      out.write("                        var check_login = \"\";\r\n");
      out.write("\r\n");
      out.write("                        if (check_login == 1 && !document.getElementById('notification').contains(e.target)) {\r\n");
      out.write("                            $('.drop-mini-notification').hide();\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
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
      out.write("<!--*******************************-->\r\n");
      out.write("            <div class=\"home-page banner-home common-menu-top\" style=\"background-color: #f7f7f7;margin-bottom: 15px;\">\r\n");
      out.write("                <div class=\"menu-2\" style=\"margin-top: 0\">\r\n");
      out.write("                    <div class=\"container padd-0\" style=\"margin-top: 6px;\">\r\n");
      out.write("                        <div class=\"menu-catalog\">\r\n");
      out.write("                            \r\n");
      out.write("                            <!--chon 3 loai account game-->\r\n");
      out.write("                            <div class=\"header-menu dropdown\" id=\"category-product\">\r\n");
      out.write("                                <div class=\"bar-btn\">\r\n");
      out.write("                                    <i class=\"fas fa-bars\"></i><span>Danh mục sản phẩm</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"dropdown-menu drop-category nav-menu\" aria-labelledby=\"dropdownMenuLink\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"link duong dan lien quan\"><i class=\"fab fa-steam-symbol\"></i>\r\n");
      out.write("                                                <span>Liên quân</span></a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"link duong dan lien minh\"><i class=\"fas fa-trophy\"></i>\r\n");
      out.write("                                                <span>Liên minh</span></a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"Link duong dan fifa\"><i class=\"icon icon-origin-svg\"></i>\r\n");
      out.write("                                                <span>Fifa oline 4</span></a>\r\n");
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("<!--****************************-->\r\n");
      out.write("                            <div class=\"right-menu\">\r\n");
      out.write("                                <div class=\"row menu-tab-all\">\r\n");
      out.write("                                    <div class=\"quick-menu head-link\">\r\n");
      out.write("                                        <a href=\"bestsellers.jsp\"><i class=\"fab fa-hotjar\"></i><span>Khác hàng mua nhiều</span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"quick-menu head-link\">\r\n");
      out.write("                                        <a href=\"AccSale.jsp\"><i class=\"fas fa-award\"></i><span>ĐANG KHUYẾN MẠI</span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"quick-menu head-link\">\r\n");
      out.write("                                        <a href=\"#\"><i class=\"far fa-credit-card\"></i><span>Hình thức thanh toán</span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"quick-menu head-link\">\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fas fa-gamepad\"></i><span>Hướng dẫn mua hàng</span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("<!--*************-->\r\n");
      out.write("            <style>\r\n");
      out.write("                .banner-home .menu-2 .header-menu div.nav-menu {\r\n");
      out.write("                    display: none;\r\n");
      out.write("                    height: auto;\r\n");
      out.write("                    margin: auto;\r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                }\r\n");
      out.write("            </style>\r\n");
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                $(\"#category-product\").hover(\r\n");
      out.write("                        function () {\r\n");
      out.write("                            $(this).css(\"cursor\", \"pointer\");\r\n");
      out.write("                            $('.drop-category').css(\"display\", \"grid\");\r\n");
      out.write("                        }, function () {\r\n");
      out.write("                    $('.drop-category').css(\"display\", \"none\");\r\n");
      out.write("                }\r\n");
      out.write("                );\r\n");
      out.write("            </script>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div style=\"text-align:center;margin-bottom:22px;\">\r\n");
      out.write("                    <strong><h1>Infor</h1></strong>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    Product product = (Product)request.getAttribute("product");
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("             <div class=\"container-title title-detail-product\">\r\n");
      out.write("                     <div class=\"fontSize-title\">");
 out.print(product.getpName());
      out.write("</div>\r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"container-body\">\r\n");
      out.write("                    <div class=\"slider-container\">\r\n");
      out.write("                    <div class=\"slider sp-slider-big\">\r\n");
      out.write("                        <div class=\"img-item\">\r\n");
      out.write("                                <div class=\"click_show_slide\" onclick=\"click_show_slide()\" style=\"height: 100%;width: 100%;\">\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.pLImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \r\n");
      out.write("                                          class=\"slide-product-big check_img_errs\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"sp-info\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"sp-price-text\">\r\n");
      out.write("                        <b><h5>");
 out.print(product.getpPrice());
      out.write(" VNĐ</h5></b>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"product\">\r\n");
      out.write("                        <hr>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"product-affiliate\" style=\"margin-top: 20px;\">\r\n");
      out.write("                            <hr>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row bar-info-product d-flex\">\r\n");
      out.write("                                <div class=\"col-md-3 col-xs-12\" style=\"padding: 0 0 10px 15px;\">\r\n");
      out.write("                                    <label>Số lượng:</label>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <div class=\"qty\" style=\"display: -webkit-inline-box;\">\r\n");
      out.write("                                        <a class=\"qtyBtn mines\" href=\"javascript:void(0);\">-</a>\r\n");
      out.write("                                        <input type=\"text\" name=\"quantity\" value=\"1\" size=\"2\"\r\n");
      out.write("                                               id=\"input-quantity\" class=\"form-control\"\r\n");
      out.write("                                               style=\"width:46px;height:26px;font-weight: bold;text-align: center;border-radius:0\"/>\r\n");
      out.write("                                        <a class=\"qtyBtn plus\" href=\"javascript:void(0);\">+</a>\r\n");
      out.write("                                        <input type=\"hidden\" name=\"product_id\" value=\"8036\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-9 col-xs-12 bar-buy-product\">\r\n");
      out.write("                                    <div id=\"button-cart-redirect\" data-loading-text=\"Đang tải...\" class=\"btn btn-green-bg col-md-5\" style=\"margin-top: 12px;width: 144px\">\r\n");
      out.write("                                         <a href=\"/CartController?action=showcart&page=addtocart&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> Mua ngay </a>                                       \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"description-container\">\r\n");
      out.write("                    <h5><p>");
 out.print(product.getDescription());
      out.write("</p></h5>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://hgeqic7azi.vcdn.com.vn/assets/css/ranger_price.css\">\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
        out.write("            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
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
        out.write("\r\n");
        out.write("                ");
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
}
