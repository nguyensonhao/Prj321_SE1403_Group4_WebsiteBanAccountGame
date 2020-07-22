<%-- 
    Document   : tesst
    Created on : Jul 17, 2020, 11:23:40 PM
    Author     : Hao Nguyen 
--%>

<%@page import="Model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html dir="ltr" lang="vi">

        <head>
        <jsp:include page="header/header1.jsp"></jsp:include>
        </head>

        <body>
            <noscript>
            <iframe src="https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM" height="0" width="0"
                    style="display:none;visibility:hidden"></iframe>
            </noscript>
            <div class="top-header" style="background-color: #088A08">
                <div class="container">
                    <div class="row" style="opacity: 0.7">
                        <div class="slide-news">
                            <div class="w3-content w3-section">

                                <a class="left carousel-control" role="button">
                                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>

                                <a class="right carousel-control" role="button">
                                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>

                                <div class="marquee-slide">
                                    <a href="#" class="mySlides" id="new-slide-0">
                                        <i class="fab fa-hotjar"></i>
                                        Liên Quân              </a>
                                    <a href="#" class="mySlides" id="new-slide-1">
                                        <i class="fab fa-hotjar"></i>
                                        Liên Minh              </a>
                                    <a href="#" class="mySlides" id="new-slide-2">
                                        <i class="fab fa-hotjar"></i>
                                        Fifa              </a>
                                </div>
                            </div>
                        </div>
                        <div class="text-right" style="padding:5px 0;float: right">
                            Hỗ trợ 0337470726
                        </div>
                    </div>
                </div>
            </div>

            <header>
           
        </c:choose>
            </header>

            <script src="https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/bigshop/js/jquery.autocomplete.js" type="text/javascript"></script>

            <script>
                var time_run_link = '5' * 1000;
                var timeout_handle = null;

                var myIndex = 0;
                carousel();

                function carousel() {
                    var i;
                    var x = document.getElementsByClassName("mySlides");
                    if (x.length > 0) {
                        for (i = 0; i < x.length; i++) {
                            x[i].style.display = "none";
                        }
                        myIndex++;
                        if (myIndex > x.length) {
                            myIndex = 1
                        }
                        x[myIndex - 1].style.display = "block";

                        timeout_handle = setTimeout(carousel, time_run_link); // Change image every 2 seconds

                        $('.w3-content .mySlides').removeClass('animate-down');
                        $('.w3-content .mySlides').addClass('animate-up');
                    }
                }

                // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải sang trái
                $(".left").click(function (e) {
                    var i;
                    var x = document.getElementsByClassName("mySlides");
                    if (x.length > 0) {
                        for (i = 0; i < x.length; i++) {
                            x[i].style.display = "none";
                        }
                        myIndex--;
                        if (myIndex < 0) {
                            myIndex = x.length - 1;
                        }
                        x[myIndex].style.display = "block";

                        $('.w3-content .mySlides').removeClass('animate-up');
                        $('.w3-content .mySlides').addClass('animate-down');

                        clearTimeout(timeout_handle);
                        timeout_handle = setTimeout(carousel, time_run_link);
                    }
                });

                // Khi click nút chuyển slide trái thì thêm hiệu ứng chạy text từ phải trái sang phải
                $(".right").click(function (e) {
                    var i;
                    var x = document.getElementsByClassName("mySlides");
                    if (x.length > 0) {
                        for (i = 0; i < x.length; i++) {
                            x[i].style.display = "none";
                        }
                        myIndex++;
                        if (myIndex > x.length) {
                            myIndex = 1
                        }
                        x[myIndex - 1].style.display = "block";

                        $('.w3-content .mySlides').removeClass('animate-down');
                        $('.w3-content .mySlides').addClass('animate-up');

                        clearTimeout(timeout_handle);
                        timeout_handle = setTimeout(carousel, time_run_link);
                    }
                });
            </script>

            <script>
                $(".login-fplus").click(function () {
                    $.ajax({
                        url: 'index.php?route=account/login/check_rules_facebook',
                        type: 'POST',
                        success: function (json) {
                            if (json['havent_rules'] == 1) {
                                $('#modal-accept-facebook').modal('show');
                            }

                            if (json.href) {
                                window.location.href = json.href;
                            }
                        }
                    });
                });

                $('#checked_rules_facebook').on('click', function () {
                    var check_rules = 1;
                    $.ajax({
                        url: 'index.php?route=account/login/check_rules_facebook',
                        type: 'POST',
                        data: {
                            check_rules: check_rules
                        },
                        success: function (json) {
                            if (json.href) {
                                window.location.href = json.href;
                            }
                        }
                    });
                });

                $(".login-gplus").click(function () {
                    $.ajax({
                        url: 'index.php?route=extension/module/check_rules_login_google/index',
                        type: 'POST',
                        success: function (json) {
                            if (json['havent_rules'] == 1) {
                                $('#modal-accept-rules').modal('show');
                            }

                            if (json.href) {
                                window.location.href = json.href;
                            }
                        }
                    });
                });

                $('#checked_rules').on('click', function () {
                    var check_rules = 1;
                    $.ajax({
                        url: 'index.php?route=extension/module/check_rules_login_google/index',
                        type: 'POST',
                        data: {
                            check_rules: check_rules
                        },
                        success: function (json) {
                            if (json.href) {
                                window.location.href = json.href;
                            }
                        }
                    });
                });

                $('.btn-close-modal').on('click', function () {
                    $('#modal-accept-rules').modal('hide');
                    $('#modal-accept-facebook').modal('hide');
                });
            </script>

            <script type="text/javascript">
                $(document).ready(function () {
                    $("#filter_name").autocomplete("getdata.php?lan=vi", {
                        width: 450,
                        resultsClass: "ac_results col-lg-7",
                        matchContains: true
                    });

                    $("#home-cart").hover(
                            function () {
                                $('#dropdown-detail-cart').css("display", "block");
                                $('body').append('<style>#home-cart:after{display: block;}</style>');
                            },
                            function () {
                                $('#dropdown-detail-cart').css("display", "none");
                                $('body').append('<style>#home-cart:after{display: none;}</style>');
                            }
                    );

                    $(".home-mini-profile").hover(
                            function () {
                                $('.drop-mini-profile').css("display", "block");
                            }, function () {
                        $('.drop-mini-profile').css("display", "none");
                    }
                    );

                    $("#mini-login").hover(
                            function () {
                                $('.drop-mini-login').css("display", "block");
                            },
                            function () {
                                $('.drop-mini-login').css("display", "none");
                            }
                    );

                    $("#notification").on('click', function () {
                        $('#count_unread').text('');
                        $('.notification span').removeClass('visible');

                        updateCountNotification();
                    });

                    $('#show-list-notification').on('click', function () {
                        $('.drop-mini-notification').toggle();
                    });

                    window.addEventListener('click', function (e) {
                        var check_login = "";

                        if (check_login == 1 && !document.getElementById('notification').contains(e.target)) {
                            $('.drop-mini-notification').hide();
                        }
                    });
                });
            </script>

            <script type="text/javascript">
                $(document).ready(function () {
                    $('#dismiss, .overlay').on('click', function () {
                        $('#sidebar').removeClass('active');
                        $('.overlay').removeClass('active');
                        $('body').css('position', 'unset');
                    });

                    $('#sidebarCollapse').on('click', function () {
                        $('#sidebar').addClass('active');
                        $('.overlay').addClass('active');
                        $('.collapse.in').toggleClass('in');
                        $('a[aria-expanded=true]').attr('aria-expanded', 'false');
                        $('body').css('position', 'fixed');
                    });
                });
            </script>
<!--*******************************-->
            <div class="home-page banner-home common-menu-top" style="background-color: #f7f7f7;margin-bottom: 15px;">
                <div class="menu-2" style="margin-top: 0">
                    <div class="container padd-0" style="margin-top: 6px;">
                        <div class="menu-catalog">
                            
                            <!--chon 3 loai account game-->
                            <div class="header-menu dropdown" id="category-product">
                                <div class="bar-btn">
                                    <i class="fas fa-bars"></i><span>Danh mục sản phẩm</span>
                                </div>
                                <div class="dropdown-menu drop-category nav-menu" aria-labelledby="dropdownMenuLink">
                                    <ul>
                                        <li>
                                            <a href="link duong dan lien quan"><i class="fab fa-steam-symbol"></i>
                                                <span>Liên quân</span></a>
                                        </li>
                                        <li>
                                            <a href="link duong dan lien minh"><i class="fas fa-trophy"></i>
                                                <span>Liên minh</span></a>
                                        </li>
                                        <li>
                                            <a href="Link duong dan fifa"><i class="icon icon-origin-svg"></i>
                                                <span>Fifa oline 4</span></a>

                                    </ul>
                                </div>
                            </div>
<!--****************************-->
                            <div class="right-menu">
                                <div class="row menu-tab-all">
                                    <div class="quick-menu head-link">
                                        <a href="bestsellers.jsp"><i class="fab fa-hotjar"></i><span>Khác hàng mua nhiều</span></a>
                                    </div>
                                    <div class="quick-menu head-link">
                                        <a href=""><i class="fas fa-award"></i><span>ĐANG KHUYẾN MẠI</span></a>
                                    </div>
                                    <div class="quick-menu head-link">
                                        <a href="/index.php?route=account/topup"><i class="far fa-credit-card"></i><span>Hình thức thanh toán</span></a>
                                    </div>
                                    <div class="quick-menu head-link">
                                        <a href="Link huong dan mua hang"><i class="fas fa-gamepad"></i><span>Hướng dẫn mua hàng</span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
<!--*************-->
            <style>
                .banner-home .menu-2 .header-menu div.nav-menu {
                    display: none;
                    height: auto;
                    margin: auto;
                    width: 100%;
                }
            </style>

            <script>
                $("#category-product").hover(
                        function () {
                            $(this).css("cursor", "pointer");
                            $('.drop-category').css("display", "grid");
                        }, function () {
                    $('.drop-category').css("display", "none");
                }
                );
            </script>
            <div class="container">
                <div style="text-align:center;margin-bottom:22px;">
                    <strong><h1>Infor</h1></strong>
                </div>
                <%
                    Product product = (Product)request.getAttribute("product");
                %>

             <div class="container-title title-detail-product">
                     <div class="fontSize-title"><% out.print(product.getpName());%></div>
            </div>
                <div class="container-body">
                    <div class="slider-container">
                    <div class="slider sp-slider-big">
                        <div class="img-item">
                                <div class="click_show_slide" onclick="click_show_slide()" style="height: 100%;width: 100%;">
                                    <img src="${product.pLImage}" 
                                          class="slide-product-big check_img_errs"/>
                                </div>
                            </div>
                                            </div>
                </div>
                </div>
                
                <div class="sp-info">

                    <div class="sp-price-text">
                        <b><h5><% out.print(product.getpPrice());%> VNĐ</h5></b>
                    </div>
                    <div id="product">
                        <hr>

                        <div id="product-affiliate" style="margin-top: 20px;">
                            <hr>

                            <div class="row bar-info-product d-flex">
                                <div class="col-md-3 col-xs-12" style="padding: 0 0 10px 15px;">
                                    <label>Số lượng:</label>
                                    <br>
                                    <div class="qty" style="display: -webkit-inline-box;">
                                        <a class="qtyBtn mines" href="javascript:void(0);">-</a>
                                        <input type="text" name="quantity" value="1" size="2"
                                               id="input-quantity" class="form-control"
                                               style="width:46px;height:26px;font-weight: bold;text-align: center;border-radius:0"/>
                                        <a class="qtyBtn plus" href="javascript:void(0);">+</a>
                                        <input type="hidden" name="product_id" value="8036">
                                    </div>
                                </div>
                                <div class="col-md-9 col-xs-12 bar-buy-product">
                                    <div id="button-cart-redirect" data-loading-text="Đang tải..." class="btn btn-green-bg col-md-5" style="margin-top: 12px;width: 144px"
                                          onclick="window.location.href='CartController?id=${product.pId}&sl=${product.quantity}'">
                                        Mua Ngay                                       
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>
                
                <div class="description-container">
                    <h5><p><% out.print(product.getDescription());%></p></h5>
                </div>

        <link rel="stylesheet" href="https://hgeqic7azi.vcdn.com.vn/assets/css/ranger_price.css">
    </body>
</html>


