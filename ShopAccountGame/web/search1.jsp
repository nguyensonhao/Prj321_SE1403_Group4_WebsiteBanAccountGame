<%-- 
    Document   : search1
    Created on : Jul 23, 2020, 12:37:14 AM
    Author     : Hao Nguyen 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html dir="ltr" lang="vi">

    <head>
        <jsp:include page="header/header1.jsp"></jsp:include>
        meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Search </title>
        <link rel="icon" href="http://www.domain.com/favicon.ico" type="image/x-icon" />
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
                                                <span>Fifa oline 4</span></a>

                                    </ul>
                                </div>
                            </div>

                            <div class="right-menu">
                                <div class="row menu-tab-all">
                                    <div class="quick-menu head-link">
                                        <a href="bestsellers.jsp"><i class="fab fa-hotjar"></i><span>Khác hàng mua nhiều</span></a>
                                    </div>
                                    <div class="quick-menu head-link">
                                        <a href="AccSale.jsp"><i class="fas fa-award"></i><span>ĐANG KHUYẾN MẠI</span></a>
                                    </div>
                                    <div class="quick-menu head-link">
                                        <a href="#"><i class="far fa-credit-card"></i><span>Hình thức thanh toán</span></a>
                                    </div>
                                    <div class="quick-menu head-link">
                                        <a href="#"><i class="fas fa-gamepad"></i><span>Hướng dẫn mua hàng</span></a>
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
<!--                    <strong><h1>Account Fifa online 4</h1></strong>-->
                </div>
                <!--thanh chon gia san pham-->
                 <div class="form-group set-price">
    </div>
                <!--******************-->

                <div class="row" style="margin-top:25px;margin-bottom:50px;">
                    <div class="col-lg-9 col-md-9 col-sm-9">
                        <strong><h4>Account phù hợp</h4></strong>
                    </div>
                </div>
            <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="ds"/>

            <sql:query var="result" dataSource="${ds}">
                SELECT * FROM `product` WHERE pPrice BETWEEN ? and ?
                <sql:param value="${param.min}"/>
                <sql:param value="${param.max}"/>
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

