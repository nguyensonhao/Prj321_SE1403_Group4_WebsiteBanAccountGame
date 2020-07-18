<%-- 
    Document   : accountFifa
    Created on : Jul 15, 2020, 7:00:38 PM
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
            <jsp:include page= "header/header2.jsp"></jsp:include>
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
                                            <a href="link duong dan lien quan"><i class="fab fa-steam-symbol"></i>
                                                <span>Liên quân</span></a>
                                        </li>
                                        <li>
                                            <a href="link duong dan lien minh"><i class="fas fa-trophy"></i>
                                                <span>Liên minh</span></a>
                                        </li>
                                        <li>
                                            <a href="Link duong dan fifa"><i class="icon icon-origin-svg"></i>
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
                                        <a href=""><i class="fas fa-award"></i><span>Đang Khuyến Mãi</span></a>
                                    </div>
                                    <div class="quick-menu head-link">
                                        <a href=""><i class="far fa-credit-card"></i><span>Hình thức thanh toán</span></a>
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
                    <strong><h1>Account Fifa online 4</h1></strong>
                </div>
                <div class="search-header" id="content">
                    <div class="row">
                        <div class="col-lg-4 col-md-4 mb-15 col-filter-price">
                            <input type="text" name="search" value="" placeholder="Nhập từ khóa tìm kiếm..." class="form-control">
                        </div>
                        <div class="col-lg-2 col-md-2 mb-15 col-filter-price">
                            <select name="category_id" class="form-control">
                                <option value="0">Tất cả danh mục</option>
                                <option value="1">Liên minh huyền thoại </option>
                                <option value="2">Liên quân</option>
                                <option value="3">Fifa oline 4</option>
                            </select>
                        </div>
                        <div class="col-lg-2 col-md-2 mb-15 col-filter-price">
                            <select id="input-sort" class="form-control">
                                <option value="" selected="selected" data-order="">Mặc định</option>
                                <option value="p.price"  data-order="ASC">Giá (Thấp &gt; Cao)</option>
                                <option value="p.price"  data-order="DESC">Giá (Cao &gt; Thấp)</option>
                                <option value="pd.name"  data-order="ASC">Tên (A - Z)</option>
                                <option value="pd.name"  data-order="DESC">Tên (Z - A)</option>
                            </select>
                        </div>

                        <div class="col-lg-2 col-md-2 mb-15 col-filter-price">
                            <select id="input-tag" class="form-control" name="filter_tag">
                                <option value="">---- Tag ---</option>
                                <option value="lienminh">lienminh</option>
                                <option value="lienquan">lienquan</option>
                                <option value="fifaonline4">fifaonline4</option>
                            </select>
                        </div>

                        <div class="col-lg-2 col-md-2 col-sm-2 text-right col-filter-price">
                            <select id="input-limit" style="font-weight: bold;color: #656262;" class="form-control">
                                <option value="1" selected="selected">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                            </select>
                        </div>
                    </div>
                </div>


                <div class="row" style="margin-top:25px;margin-bottom:50px;">
                    <div class="col-lg-9 col-md-9 col-sm-9">
                        <strong><h4>Fifa Online 4</h4></strong>
                    </div>
                </div>
            <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="ds"/>

            <sql:query var="result" dataSource="${ds}">
                select * from product where pType="fifa4"
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
                                            <a href="ProductDetail?id=${row.pId}"><font style="font-family:Bookman ; font-size:14pt">${row.pName }</a>
                                            <marquee width="150"><font style="font-family:Bookman" color="green" >${row.pDescription}</font></marquee>
                                        </div>
                                        <div class="item-price">
                                            <p class="price">
                                                <span class="cur-p"> <td>${row.pPrice}</td></span>
                                            </p>
                                        </div>

                                        <div class="item-btn-a">  
                                            <i class="fas fa-shopping-cart">${pDescription}</i></a>
                                        </div>
                                        <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>


                    </div>
                </div>
                <div class="view-more btn-aqua">
                    Xem thêm
                </div>
            </div>
        </div>

        <link rel="stylesheet" href="https://hgeqic7azi.vcdn.com.vn/assets/css/ranger_price.css">
        <footer>
            <jsp:include page="footer/footer1.jsp"></jsp:include>
        </footer>

    </body>
</html>
