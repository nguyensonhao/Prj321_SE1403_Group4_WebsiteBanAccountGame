package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bestsellers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header1.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <!-- Google Tag Manager (noscript) -->\n");
      out.write("            <noscript>\n");
      out.write("            <iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM\" height=\"0\" width=\"0\"\n");
      out.write("                    style=\"display:none;visibility:hidden\"></iframe>\n");
      out.write("            </noscript>\n");
      out.write("            <!-- End Google Tag Manager (noscript) -->\n");
      out.write("\n");
      out.write("            <div class=\"top-header\" style=\"background-color: #088A08\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\" style=\"opacity: 0.7\">\n");
      out.write("                        <div class=\"slide-news\">\n");
      out.write("                            <div class=\"w3-content w3-section\">\n");
      out.write("\n");
      out.write("                                <a class=\"left carousel-control\" role=\"button\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <a class=\"right carousel-control\" role=\"button\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                                    <span class=\"sr-only\">Next</span>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <div class=\"marquee-slide\">\n");
      out.write("                                    <a href=\"accountLienQuan.jsp\" class=\"mySlides\" id=\"new-slide-0\">\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\n");
      out.write("                                        Liên Quân              </a>\n");
      out.write("                                    <a href=\"accountLienMinh.jsp\" class=\"mySlides\" id=\"new-slide-1\">\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\n");
      out.write("                                        Liên Minh              </a>\n");
      out.write("                                    <a href=\"accountFifa.jsp\" class=\"mySlides\" id=\"new-slide-2\">\n");
      out.write("                                        <i class=\"fab fa-hotjar\"></i>\n");
      out.write("                                        Fifa              </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-right\" style=\"padding:5px 0;float: right\">\n");
      out.write("                            Hỗ trợ 0337470726\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header2.jsp", out, false);
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <script src=\"https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/bigshop/js/jquery.autocomplete.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                var time_run_link = '5' * 1000;\n");
      out.write("                var timeout_handle = null;\n");
      out.write("\n");
      out.write("                var myIndex = 0;\n");
      out.write("                carousel();\n");
      out.write("\n");
      out.write("                function carousel() {\n");
      out.write("                    var i;\n");
      out.write("                    var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                    if (x.length > 0) {\n");
      out.write("                        for (i = 0; i < x.length; i++) {\n");
      out.write("                            x[i].style.display = \"none\";\n");
      out.write("                        }\n");
      out.write("                        myIndex++;\n");
      out.write("                        if (myIndex > x.length) {\n");
      out.write("                            myIndex = 1\n");
      out.write("                        }\n");
      out.write("                        x[myIndex - 1].style.display = \"block\";\n");
      out.write("\n");
      out.write("                        timeout_handle = setTimeout(carousel, time_run_link); // Change image every 2 seconds\n");
      out.write("\n");
      out.write("                        $('.w3-content .mySlides').removeClass('animate-down');\n");
      out.write("                        $('.w3-content .mySlides').addClass('animate-up');\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải sang trái\n");
      out.write("                $(\".left\").click(function (e) {\n");
      out.write("                    var i;\n");
      out.write("                    var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                    if (x.length > 0) {\n");
      out.write("                        for (i = 0; i < x.length; i++) {\n");
      out.write("                            x[i].style.display = \"none\";\n");
      out.write("                        }\n");
      out.write("                        myIndex--;\n");
      out.write("                        if (myIndex < 0) {\n");
      out.write("                            myIndex = x.length - 1;\n");
      out.write("                        }\n");
      out.write("                        x[myIndex].style.display = \"block\";\n");
      out.write("\n");
      out.write("                        $('.w3-content .mySlides').removeClass('animate-up');\n");
      out.write("                        $('.w3-content .mySlides').addClass('animate-down');\n");
      out.write("\n");
      out.write("                        clearTimeout(timeout_handle);\n");
      out.write("                        timeout_handle = setTimeout(carousel, time_run_link);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải trái sang phải\n");
      out.write("                $(\".right\").click(function (e) {\n");
      out.write("                    var i;\n");
      out.write("                    var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                    if (x.length > 0) {\n");
      out.write("                        for (i = 0; i < x.length; i++) {\n");
      out.write("                            x[i].style.display = \"none\";\n");
      out.write("                        }\n");
      out.write("                        myIndex++;\n");
      out.write("                        if (myIndex > x.length) {\n");
      out.write("                            myIndex = 1\n");
      out.write("                        }\n");
      out.write("                        x[myIndex - 1].style.display = \"block\";\n");
      out.write("\n");
      out.write("                        $('.w3-content .mySlides').removeClass('animate-down');\n");
      out.write("                        $('.w3-content .mySlides').addClass('animate-up');\n");
      out.write("\n");
      out.write("                        clearTimeout(timeout_handle);\n");
      out.write("                        timeout_handle = setTimeout(carousel, time_run_link);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                $(\".login-fplus\").click(function () {\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'index.php?route=account/login/check_rules_facebook',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        success: function (json) {\n");
      out.write("                            if (json['havent_rules'] == 1) {\n");
      out.write("                                $('#modal-accept-facebook').modal('show');\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            if (json.href) {\n");
      out.write("                                window.location.href = json.href;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $('#checked_rules_facebook').on('click', function () {\n");
      out.write("                    var check_rules = 1;\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'index.php?route=account/login/check_rules_facebook',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        data: {\n");
      out.write("                            check_rules: check_rules\n");
      out.write("                        },\n");
      out.write("                        success: function (json) {\n");
      out.write("                            if (json.href) {\n");
      out.write("                                window.location.href = json.href;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(\".login-gplus\").click(function () {\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'index.php?route=extension/module/check_rules_login_google/index',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        success: function (json) {\n");
      out.write("                            if (json['havent_rules'] == 1) {\n");
      out.write("                                $('#modal-accept-rules').modal('show');\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            if (json.href) {\n");
      out.write("                                window.location.href = json.href;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $('#checked_rules').on('click', function () {\n");
      out.write("                    var check_rules = 1;\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'index.php?route=extension/module/check_rules_login_google/index',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        data: {\n");
      out.write("                            check_rules: check_rules\n");
      out.write("                        },\n");
      out.write("                        success: function (json) {\n");
      out.write("                            if (json.href) {\n");
      out.write("                                window.location.href = json.href;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $('.btn-close-modal').on('click', function () {\n");
      out.write("                    $('#modal-accept-rules').modal('hide');\n");
      out.write("                    $('#modal-accept-facebook').modal('hide');\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\n");
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
      out.write("                                $('body').append('<style>#home-cart:after{display: block;}</style>');\n");
      out.write("                            },\n");
      out.write("                            function () {\n");
      out.write("                                $('#dropdown-detail-cart').css(\"display\", \"none\");\n");
      out.write("                                $('body').append('<style>#home-cart:after{display: none;}</style>');\n");
      out.write("                            }\n");
      out.write("                    );\n");
      out.write("\n");
      out.write("                    $(\".home-mini-profile\").hover(\n");
      out.write("                            function () {\n");
      out.write("                                $('.drop-mini-profile').css(\"display\", \"block\");\n");
      out.write("                            }, function () {\n");
      out.write("                        $('.drop-mini-profile').css(\"display\", \"none\");\n");
      out.write("                    }\n");
      out.write("                    );\n");
      out.write("\n");
      out.write("                    $(\"#mini-login\").hover(\n");
      out.write("                            function () {\n");
      out.write("                                $('.drop-mini-login').css(\"display\", \"block\");\n");
      out.write("                            },\n");
      out.write("                            function () {\n");
      out.write("                                $('.drop-mini-login').css(\"display\", \"none\");\n");
      out.write("                            }\n");
      out.write("                    );\n");
      out.write("\n");
      out.write("                    $(\"#notification\").on('click', function () {\n");
      out.write("                        $('#count_unread').text('');\n");
      out.write("                        $('.notification span').removeClass('visible');\n");
      out.write("\n");
      out.write("                        updateCountNotification();\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $('#show-list-notification').on('click', function () {\n");
      out.write("                        $('.drop-mini-notification').toggle();\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    window.addEventListener('click', function (e) {\n");
      out.write("                        var check_login = \"\";\n");
      out.write("\n");
      out.write("                        if (check_login == 1 && !document.getElementById('notification').contains(e.target)) {\n");
      out.write("                            $('.drop-mini-notification').hide();\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("            <div class=\"home-page banner-home common-menu-top\" style=\"background-color: #f7f7f7;margin-bottom: 15px;\">\n");
      out.write("                <div class=\"menu-2\" style=\"margin-top: 0\">\n");
      out.write("                    <div class=\"container padd-0\" style=\"margin-top: 6px;\">\n");
      out.write("                        <div class=\"menu-catalog\">\n");
      out.write("                            <div class=\"header-menu dropdown\" id=\"category-product\">\n");
      out.write("                                <div class=\"bar-btn\">\n");
      out.write("                                    <i class=\"fas fa-bars\"></i><span>Danh mục sản phẩm</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"dropdown-menu drop-category nav-menu\" aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"accountLienQuan.jsp\"><i class=\"fab fa-steam-symbol\"></i>\n");
      out.write("                                                <span>Liên quân</span></a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"accountLienMinh.jsp\"><i class=\"fas fa-trophy\"></i>\n");
      out.write("                                                <span>Liên minh</span></a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"accountFifa.jsp\"><i class=\"icon icon-origin-svg\"></i>\n");
      out.write("                                                <span>Fifa online 4</span></a>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"right-menu\">\n");
      out.write("                                <div class=\"row menu-tab-all\">\n");
      out.write("                                    <div class=\"quick-menu head-link\">\n");
      out.write("                                        <a href=\"bestsellers.jsp\"><i class=\"fab fa-hotjar\"></i><span>Sản Phẩm Hot</span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"quick-menu head-link\">\n");
      out.write("                                        <a href=\"\"><i class=\"fas fa-award\"></i><span>Đang Khuyến Mãi</span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"quick-menu head-link\">\n");
      out.write("                                        <a href=\"/index.php?route=account/topup\"><i class=\"far fa-credit-card\"></i><span>Hình thức thanh toán</span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"quick-menu head-link\">\n");
      out.write("                                        <a href=\"Link huong dan mua hang\"><i class=\"fas fa-gamepad\"></i><span>Hướng dẫn mua hàng</span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("                .banner-home .menu-2 .header-menu div.nav-menu {\n");
      out.write("                    display: none;\n");
      out.write("                    height: auto;\n");
      out.write("                    margin: auto;\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                $(\"#category-product\").hover(\n");
      out.write("                        function () {\n");
      out.write("                            $(this).css(\"cursor\", \"pointer\");\n");
      out.write("                            $('.drop-category').css(\"display\", \"grid\");\n");
      out.write("                        }, function () {\n");
      out.write("                    $('.drop-category').css(\"display\", \"none\");\n");
      out.write("                }\n");
      out.write("                );\n");
      out.write("            </script>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div style=\"text-align:center;margin-bottom:22px;\">\n");
      out.write("                    <strong><h1>Được Mua Nhiều</h1></strong>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-header\" id=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-4 mb-15 col-filter-price\">\n");
      out.write("                            <input type=\"text\" name=\"search\" value=\"\" placeholder=\"Nhập từ khóa tìm kiếm...\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-2 col-md-2 mb-15 col-filter-price\">\n");
      out.write("                            <select name=\"category_id\" class=\"form-control\">\n");
      out.write("                                <option value=\"0\">Tất cả danh mục</option>\n");
      out.write("                                <option value=\"1\">Liên minh huyền thoại </option>\n");
      out.write("                                <option value=\"2\">Liên quân</option>\n");
      out.write("                                <option value=\"3\">Fifa oline 4</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-2 col-md-2 mb-15 col-filter-price\">\n");
      out.write("                            <select id=\"input-sort\" class=\"form-control\">\n");
      out.write("                                <option value=\"\" selected=\"selected\" data-order=\"\">Mặc định</option>\n");
      out.write("                                <option value=\"p.price\"  data-order=\"ASC\">Giá (Thấp &gt; Cao)</option>\n");
      out.write("                                <option value=\"p.price\"  data-order=\"DESC\">Giá (Cao &gt; Thấp)</option>\n");
      out.write("                                <option value=\"pd.name\"  data-order=\"ASC\">Tên (A - Z)</option>\n");
      out.write("                                <option value=\"pd.name\"  data-order=\"DESC\">Tên (Z - A)</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-2 col-md-2 mb-15 col-filter-price\">\n");
      out.write("                            <select id=\"input-tag\" class=\"form-control\" name=\"filter_tag\">\n");
      out.write("                                <option value=\"\">---- Tag ---</option>\n");
      out.write("                                <option value=\"lienminh\">lienminh</option>\n");
      out.write("                                <option value=\"lienquan\">lienquan</option>\n");
      out.write("                                <option value=\"fifaonline4\">fifaonline4</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-2 col-md-2 col-sm-2 text-right col-filter-price\">\n");
      out.write("                            <select id=\"input-limit\" style=\"font-weight: bold;color: #656262;\" class=\"form-control\">\n");
      out.write("                                <option value=\"1\" selected=\"selected\">1</option>\n");
      out.write("                                <option value=\"2\">2</option>\n");
      out.write("                                <option value=\"3\">3</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\" style=\"margin-top:25px;margin-bottom:50px;\">\n");
      out.write("                    <div class=\"col-lg-9 col-md-9 col-sm-9\">\n");
      out.write("                        <strong><h4>Sản phẩm thỏa điều kiện tìm kiếm (39 sản phẩm )</h4></strong>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"list-sp\">\n");
      out.write("                <div class=\"next-page-product4\" style=\"display:none;\">1</div>\n");
      out.write("                <div class=\"list-container\">\n");
      out.write("                    <div class=\"row fix-margin\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"view-more btn-aqua\">\n");
      out.write("                    Xem thêm\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://hgeqic7azi.vcdn.com.vn/assets/css/ranger_price.css\">\n");
      out.write("        <footer>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer/footer1.jsp", out, false);
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
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
          out.write("                select * from product where pType=\"bestseller\"\n");
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
          out.write("                            <div class=\"col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames\">\n");
          out.write("                                <div class=\"item-game-wrapper\">\n");
          out.write("                                    <div class=\"img\">\n");
          out.write("                                        <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <img class=\"check_img_errs\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\n");
          out.write("                                        </a>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"item-info\">\n");
          out.write("                                        <div class=\"item-title\">\n");
          out.write("                                            <a href=\"ProductDetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"item-price\">\n");
          out.write("                                            <p class=\"price\">\n");
          out.write("                                                <span class=\"cur-p\"> <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td></span>\n");
          out.write("                                            </p>\n");
          out.write("                                        </div>\n");
          out.write("\n");
          out.write("                                        <div class=\"item-btn-a\">  \n");
          out.write("                                            <i class=\"fas fa-shopping-cart\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</i></a>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"item-btn\" style=\"margin-top: 10px\">Mua ngay</div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
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
}
