<%-- 
    Document   : header2
    Created on : Jul 1, 2020, 4:24:44 PM
    Author     : Hao Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
           <header class="home-page fixed-header" style="background-color: #5BBD2B">
            <nav id="sidebar" class="navbar">
                <div id="dismiss">
                    <i class="fas fa-times"></i>
                </div>

                <div class="menu-list">
                    <ul id="menu-content" class="menu-content">
                        <li class="mt-0 collapsed" style="background-color: #40AB57">
                            <div class="header-btn text-white">
                                <i class="fas fa-user-circle" style="font-size: 30px;"></i>
                                <span class="text-white">
                                    <a href="#" class="text-white">Đăng nhập </a>
                                    <br>
                                    <small style="margin: 40px;">Xem nhiều thông tin hơn</small>
                                </span>
                            </div>
                        </li>

                        <li>
                            <a href="#"><i class="fa fa-home icon-font18"></i>Trang chủ</a>
                        </li>


                        <li data-toggle="collapse" data-target="#danh-muc" class="collapsed">
                            <a><i class="fa fa-bars icon-font18"></i>Danh mục sản phẩm <i class="fa fa-angle-down"></i></a>
                        </li>
                        <ul class="sub-menu collapse" id="danh-muc">
                            <li>
                                <a href="#">
                                    <i class="fab fa-steam-symbol"></i>
                                    Liên Quân              </a>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="fas fa-trophy"></i>
                                    Liên Minh              </a>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="icon icon-origin-svg"></i>
                                    FiFa              </a>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="fas fa-mobile-alt"></i>
                                    Nạp Game Mobile              </a>
                            </li>
                        </ul>

                        <hr>
                        <li>
                            <a href="#"><i
                                    class="fab fa-hotjar"></i>Sản Phẩm Hot</a>
                        </li>
                        <li>
                            <a href="#"><i
                                    class="fas fa-award"></i>Sản Phẩm Tốt</a>
                        </li>
                        <li>
                            <a href="#"><i
                                    class="far fa-credit-card"></i>Hình thức thanh toán</a>
                        </li>
                        <li>
                            <a href="#"><i
                                    class="fas fa-gamepad"></i>Hướng dẫn mua hàng</a>
                        </li>

                        <hr>
                        <!-- Link face và số đt-->

                        <li style="margin: 0;"><a href="#" style="font-size: 17px;"><i class="fa fa-phone"></i>HOTLINE:
                                1900 123 456 </a></li>
                        <li style="margin: 0;"><a href="#" style="font-size: 17px;" target="_blank"><i
                                    class="fab fa-facebook-messenger"></i>Nhắn tin cho Shop </a></li>

                    </ul>
                </div>

            </nav>

            <div class="overlay"></div>
            <script src="https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/bigshop/js/jquery.autocomplete.js" type="text/javascript"></script>
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
                                },
                                function () {
                                    $('#dropdown-detail-cart').css("display", "none");
                                }
                        );

                        $(".home-mini-profile").hover(
                                function () {
                                    $('.drop-mini-profile').css("display", "block");
                                },
                                function () {
                                    $('.drop-mini-profile').css("display", "none");
                                }
                        );

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
               <c:set var="x" value="0"></c:set>
	<c:forEach items="${cartlist }" var="i">
		<c:set var="x" value="${x+1 }"></c:set>
	</c:forEach>
            <div class="header-container container">
                <div id="sidebarCollapse" class="btn-menu">
                    <i class="fas fa-bars" style="font-size: 20px; vertical-align: middle"></i>
                </div>
                <div class="logo"><a href="#"><img style="margin-right: 10px;width: 60px"
                                                                                                   src="#" />
                        <img style="width: 100px;" src="#" /></a></div>
                <div class="search-form">
                    <div class="search-control" id="search">
                        <input type="text" id="filter_name" class="search-box" name="search" value=""
                               placeholder="Nhập sản phẩm cần tìm...">
                        <div class="search-btn" id="button-search-header">
                            <i class="fas fa-search"></i>
                        </div>
                    </div>
                </div>
                <div class="cart-mobile">
                    <div class="align-items-center d-flex" id="update-cart-mobile">
                        <a href="#"><i class="fas fa-shopping-cart cart-size-mobile"></i> <span
                                class="quantity_mobile">0</span></a>
                    </div>
                </div>
                <div class="header-btn">
                    <div class="header-btn d-flex flex-row">
                        <div class="d-flex align-items-center ml-1">
                            <i class="fas fa-user-circle" style="font-size: 40px;"></i>
                            <span>&#160</span>
                            <b style="font-size: 20px;"> <c:out value="${username}"></c:out>  </b>
                           
                        </div>
                    </div>

                    <div id="home-cart" class="dropdown dropdown-header shopping-cart">
                        <div data-toggle="dropdown" data-loading-text="Đang tải..." class="heading dropdown-toggle"
                             aria-expanded="false">
                            <div class="align-items-center d-flex" id="update-cart">
                                <i class="fas fa-shopping-cart cart-size text-white"></i><a href="cart.jsp"><b class="cart-text">Giỏ hàng</b></a><span
                                    class="quantity"><c:out value="${x}"></c:out></span>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>
        </header>
    </body>
</html>
