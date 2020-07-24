<%-- 
    Document   : bestseller
    Created on : Jul 6, 2020, 2:59:12 PM
    Author     : Hao Nguyen
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html dir="ltr" lang="vi">

    <head>
        <jsp:include page="header/header1.jsp"></jsp:include>
        </head>

        <body>
            <!-- Google Tag Manager (noscript) -->
            <noscript>
            <iframe src="https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM" height="0" width="0"
                    style="display:none;visibility:hidden"></iframe>
            </noscript>
            <!-- End Google Tag Manager (noscript) -->

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
                                    <a href="accountLienQuan.jsp" class="mySlides" id="new-slide-0">
                                        <i class="fab fa-hotjar"></i>
                                        Liên Quân              </a>
                                    <a href="accountLienMinh.jsp" class="mySlides" id="new-slide-1">
                                        <i class="fab fa-hotjar"></i>
                                        Liên Minh              </a>
                                    <a href="accountFifa.jsp" class="mySlides" id="new-slide-2">
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
           <c:choose>
            <c:when test="${not empty User}">
                <%@include file="header/header2.jsp" %>
            </c:when>
            <c:when test="${User == username}">
                <%@include file="header/header3.jsp" %>
            </c:when>
            <c:otherwise>
                <%@include file="header/header3.jsp" %>
            </c:otherwise>
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

            <div class="home-page banner-home common-menu-top" style="background-color: #f7f7f7;margin-bottom: 15px;">
                <div class="menu-2" style="margin-top: 0">
                    <div class="container padd-0" style="margin-top: 6px;">
                        <div class="menu-catalog">
                            <div class="header-menu dropdown" id="category-product">
                                <div class="bar-btn">
                                    <i class="fas fa-bars"></i><span>Danh mục sản phẩm</span>
                                </div>
                                <div class="dropdown-menu drop-category nav-menu" aria-labelledby="dropdownMenuLink">
                                    <ul>
                                         <li>
                                            <a href="index.jsp"><i class="fab fa-google-play"></i>
                                                <span>Trang chủ</span></a>
                                        </li>
                                        <li>
                                            <a href="accountLienQuan.jsp"><i class="fab fa-steam-symbol"></i>
                                                <span>Liên quân</span></a>
                                        </li>
                                        <li>
                                            <a href="accountLienMinh.jsp"><i class="fas fa-trophy"></i>
                                                <span>Liên minh</span></a>
                                        </li>
                                        <li>
                                            <a href="accountFifa.jsp"><i class="icon icon-origin-svg"></i>
                                                <span>Fifa online 4</span></a>

                                    </ul>
                                </div>
                            </div>

                            <div class="right-menu">
                                <div class="row menu-tab-all">
                                    <div class="quick-menu head-link">
                                        <a href="bestsellers.jsp"><i class="fab fa-hotjar"></i><span>Sản Phẩm Hot</span></a>
                                    </div>
                                    <div class="quick-menu head-link">
                                        <a href="AccSale.jsp"><i class="fas fa-award"></i><span>Đang Khuyến Mãi</span></a>
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
                    <strong><h1>Được Mua Nhiều</h1></strong>
                </div>
                <div class="list-container">
                    <div class="row justify-content-md-center">
                        <div class="product-price-well">
                            <div class="col-lg-2 col-md-3 col-sm-6 col-xs-6">
                                <div class="well-price">
                                    <a href="search1.jsp?min=0&max=50000"><strong>Dưới 50.000đ</strong></a>
                                </div>
                            </div>
                            <div class="col-lg-2 col-md-3 col-sm-6 col-xs-6">
                                <div class="well-price" onclick="filterMaxPrice(this, 100000)">
                                    <a href="search1.jsp?min=50000&max=100000"><strong>Dưới 100.000đ</strong></a>
                                </div>
                            </div>
                            <div class="col-lg-2 col-md-3 col-sm-6 col-xs-6">
                                <div class="well-price" onclick="filterMaxPrice(this, 200000)">
                                    <a href="search1.jsp?min=100000&max=200000"><strong>Dưới 200.000đ</strong></a>
                                </div>
                            </div>
                            <div class="col-lg-2 col-md-3 col-sm-6 col-xs-6">
                                <div class="well-price" onclick="filterMaxPrice(this, 500000)">
                                    <a href="search1.jsp?min=200000&max=500000"><strong>Dưới 500.000đ</strong></a>
                                </div>
                            </div>
                            <div class="col-lg-2 col-md-3 col-sm-12 col-xs-12" style="padding-left: 15px;padding-right: 15px">
                                <div class="well-price">
                                    <a href="search1.jsp?min=500000&max=1000000"><strong>Trên 500.000đ</strong></a>
                                </div>
                            </div>

                            <div class="col-lg-2 col-md-3 col-sm-12 col-xs-12" style="padding-left: 15px;padding-right: 15px">
                                <div class="well-price">
                                    <a href="search1.jsp?min=1000000&max=3000000"><strong>Trên 1.000.000đ</strong></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row service" id="max-price"></div>
                    <hr>
                </div>


                <div class="row" style="margin-top:25px;margin-bottom:50px;">
                    <div class="col-lg-9 col-md-9 col-sm-9">
                        <strong><h4>Account hot tháng 7</h4></strong>
                    </div>
                </div>
            <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="ds"/>

            <sql:query var="result" dataSource="${ds}">
                select * from product where pType="bestseller"
            </sql:query>

            <div class="list-sp">
                <div class="next-page-product4" style="display:none;">1</div>
                <div class="list-container">
                    <div class="row fix-margin">


                        <c:forEach items="${result.rows}" var="row">
                            <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                                <div class="item-game-wrapper">
                                    <div class="img">
                                        <a href="ProductDetail?id=${row.pId}">
                                            <img class="check_img_errs" src="${row.pImage}" >
                                        </a>
                                    </div>
                                    <div class="item-info">
                                        <div class="item-title">
                                            <a href="ProductDetail?id=${row.pId}">${row.pName }</a>
                                             <marquee width="150"><font style="font-family:Bookman" color="green" >${row.pDescription}</font></marquee>
                                        </div>
                                        <div class="item-price">
                                            <p class="price">
                                                <span class="cur-p"> <td>${row.pPrice} VNĐ</span>
                                            </p>
                                        </div>

                                        <div class="item-btn-a">
                                             <a href="/CartController?action=index&page=addtocart&id=${row.pId}" onclick="">
                                                 <i class="fas fa-shopping-cart "></i>
                                             </a>
                                         </div>
                                         <div class="item-btn" style="margin-top: 10px" class="templatemo-edit-btn">
                                             <a href="/CartController?action=showcart&page=addtocart&id=${row.pId}">Mua ngay</a>       
                                         </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>

        <link rel="stylesheet" href="https://hgeqic7azi.vcdn.com.vn/assets/css/ranger_price.css">
        <footer>
            <jsp:include page="footer/footer1.jsp"></jsp:include>
        </footer>

    </body>
</html>
