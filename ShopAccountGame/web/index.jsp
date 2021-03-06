
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="vi">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Trang Chủ</title>
        <link rel="icon" href="http://www.domain.com/favicon.ico" type="image/x-icon" />
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
                    <div class="text-right " style="padding:5px 0;float: right">
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
        <style>
            @media (max-width: 992px) {
                body .container {
                    width: 100%;
                }
            }

            @media (max-width: 415px) {
                .col-xs-6 {
                    width: 50%;
                }
            }

            @media (max-width: 500px) {
                .col-xs-6 {
                    width: 50%;
                }
            }

            @media (max-width: 1199px) {
                body .container .list-title a {
                    right: 15px;
                }

                .container .list-title {
                    padding: 0 15px 0 15px;
                }
            }

            @media (width: 992px) {
                .slider-container .col-md-8 {
                    width:  100%
                }
            }

            @media (min-width: 1200px) {
                .list_discovery {
                    margin-left: -15px !important;
                    margin-right: -15px !important;
                }

                .text-md-center {
                    margin-left: -15px;
                    margin-right: -15px;
                }

                .menu-tab-all {
                    margin-left: -5px;
                    margin-right: -5px
                }

                .col-lg-7 {
                    width: 63%;
                }

                .col-lg-5 {
                    width: 37%;
                }

                .product-price-well .col-lg-2 {
                    width: 20%;
                }

                .product-price-well .col-md-3 {
                    width: 20%;
                }
            }

            @media (min-width: 992px) {
                .product-price-well .col-lg-2 {
                    width: 20%;
                }

                .product-price-well .col-md-3 {
                    width: 20%;
                }
            }

            .border-radius-left {
                border-bottom-left-radius: 4px;
                border-top-left-radius: 4px;
            }

            .border-radius-right {
                border-bottom-right-radius: 4px;
                border-top-right-radius: 4px;
            }

            @media (min-width: 320px) and (max-width: 570px) {
                .p-5-only {
                    padding: 5px;
                }
            }

            .menu-2 .tab-content .item-text a {
                color: #000;
            }

            .cut_string {
                color: #fff;
            }

            h4.cut_string {
                color: #000;
            }

            .btn-aqua {
                display: flex;
                justify-content: center;
                align-items: center;
                color: #21beff;
                cursor: pointer;
                border: unset;
                font-family: 'Roboto-Condensed-Bold'; }
            .btn-aqua:hover {
                color: #279cff;
                background-color: unset;
            }

            .img-banner {
                width: 266px;
                height: 156px;
            }
        </style>

        <div class="home-page banner-home" style="background-color: #f7f7f7">
            <div class="menu-2" style="margin-top: 0">
                <div class="container padd-0" style="margin-top: 6px;">
                    <div id="alert-position"></div>
                    <div class="menu-catalog">
                        <div class="header-menu">
                            <div class="bar-btn">
                                <i class="fas fa-bars"></i><span>Danh mục sản phẩm</span>
                            </div>
                            <div class="nav-menu">
                                <ul>
                                    <li>
                                        <a href="accountLienQuan.jsp"><i class="fab fa-steam-symbol"></i>
                                            <span>Liên Quân</span></a>
                                    </li>
                                    <li>
                                        <a href="accountLienMinh.jsp"><i class="fas fa-trophy"></i>
                                            <span>Liên Minh</span></a>
                                    </li>
                                    <li>
                                        <a href="accountFifa.jsp"><i class="icon icon-origin-svg"></i>
                                            <span>Fifa online 4</span></a>
                                    </li>           
                                </ul>
                            </div>
                        </div>
                        <!--chon san pham mua nhieu tat ca san pham ..-->
                        <div class="right-menu">
                            <div class="row menu-tab-all service">
                                <div class="quick-menu head-link">
                                    <a href="bestsellers.jsp" target="_blank"><i class="fab fa-hotjar"></i><span>Sản Phẩm Hot</span></a>
                                </div>
                                <div class="quick-menu head-link">
                                    <a href="AccSale.jsp" target="_blank"><i class="fas fa-award"></i><span>Đang Khuyến Mãi</span></a>
                                </div>
                                <div class="quick-menu head-link">
                                    <a href="#" target="_blank"><i class="far fa-credit-card"></i><span>Hình thức thanh toán</span></a>
                                </div>
                                <div class="quick-menu head-link">
                                    <a href="#" target="_blank"><i class="fas fa-gamepad"></i><span>Hướng dẫn mua hàng</span></a>
                                </div>
                            </div>
                            <div class="row slider-container" style="max-width: 797px;">
                                <div class="col col-md-8 col-sm-12 col-xs-12 col-lg-8">
                                    <div class="home-slider">
                                        <div>
                                            <!--  Link hình chạy, link hình  -->
                                            <a href="index.jsp"><img class="check_img_errs" src="img/Ys12.jpg" alt="#"></a>
                                        </div>
                                        <div>
                                            <a href="accountFifa.jsp"><img class="check_img_errs" src="https://danongonline.com.vn/wp-content/uploads/2017/11/Fifa-Online-4-ra-m%E1%BA%AFt-v%E1%BB%9Bi-%C4%91%E1%BB%93-h%E1%BB%8Da-si%C3%AAu-kh%E1%BB%A7ng-1.jpg" alt="#	"></a>
                                        </div>
                                        <div>
                                            <a href="accountLienQuan.jsp"><img class="check_img_errs" src="https://gameviet.mobi/wp-content/uploads/2020/03/Hinh-Nen-Lien-Quan-Mobile-Wallpaper-Cho-Iphone-Android-1280x640.jpg" alt="#"></a>
                                        </div>
                                        <div>
                                            <a href="accountLienMinh.jsp"><img class="check_img_errs" src="https://s.dowload.vn/data/image/2018/09/26/lien-minh-huyen-thoai-doi-hinh-vuot-ai-co-truong-640.jpg" alt="#"></a>
                                        </div>
                                    </div>
                                </div>
                                <script type="text/javascript">
                                    $('.home-slider').slick({
                                        autoplay: true,
                                        autoplaySpeed: 5000,
                                        dots: true,
                                        infinite: true,
                                        speed: 500,
                                        arrows: true,
                                    });
                                </script>
                                 <div class="row sub-banner">
                            <div class="col col-md-4 col-sm-6 col-xs-6 col-lg-4">
                                <a class="w-100" href="https://lienminh.garena.vn/cong-dong-game/su-kien/ket-qua-su-kien-mua-the-garena-nhan-qua-thiet-da"><img class="check_img_errs" src="https://lienminh.garena.vn/images/Lan_h3lpm3/07_2018/APC_banner_luckydraw_LOL-290x163.jpg" alt="Garena Bonus"></a>
                            </div>
                                     <br>
                                     <br>
                            <div class="col col-md-4 col-sm-6 col-xs-6 col-lg-4">
                                <a class="w-100" href="https://lienquan.garena.vn/tin-tuc/hoi-quan-lien-quan"><img src="https://channel.mediacdn.vn/thumb_w/640/2019/8/15/photo-1-15658635296501879299040.jpg" class="height-banner-home check_img_errs img-banner" alt="Gói nạp Itunes"></a>
                            </div>
                        </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <hr>
       <div class="container padd-0">
        <div class="list-title">
            <h2>Sản phẩm giá tốt</h2>
            <p>Bạn có thể lựa chọn hiển thị theo giá sản phẩm phù hợp với túi tiền</p>
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
                        <div class="well-price">
                            <a href="search1.jsp?min=50000&max=100000"><strong>Dưới 100.000đ</strong></a>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-3 col-sm-6 col-xs-6">
                        <div class="well-price">
                            <a href="search1.jsp?min=100000&max=200000"><strong>Dưới 200.000đ</strong></a>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-3 col-sm-6 col-xs-6">
                        <div class="well-price">
                            <a href="search1.jsp?min=200000&max=500000"><strong>Dưới 500.000đ</strong></a>
                        </div>
                    </div>
                    
                    <div class="col-lg-2 col-md-3 col-sm-12 col-xs-12" style="padding-left: 15px;padding-right:15px">
                        <div class="well-price">
                            <a href="search1.jsp?min=500000&max=1000000"><strong>Dưới 500.000đ</strong></a>
                        </div>
                    </div>
                    
                    
                </div>
            </div>
            <div class="row service" id="max-price"></div>
            <hr>
        </div>
    </div>
<!--end tim kiem theo gia-->
    
<!--start account lien quan-->
  <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="ds"/>

            <sql:query var="result" dataSource="${ds}">
               SELECT * FROM product WHERE pType='lienquan' LIMIT 4;
            </sql:query>
    <div class="container">
        <div class="list-title" style="margin-top: 15px;">
            <h2>Game Liên Quân</h2>
            <a href="accountLienQuan.jsp">Xem chi tiết</a>
        </div>
            <div class="next-page-product6" style="display:none;">1</div>
        <div class="list-container">
            <div class="row text-md-center">
                <c:forEach items="${result.rows}" var="row">
                <div class="col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <a href="ProductDetail?id=${row.pId}">
                            <div class="img">
                                <img class="check_img_errs" src="${row.pImage}" />
                            </div>
                        </a>
                        <div class="item-info">
                                <div class="item-title">
                                    <a href="ProductDetail?id=${row.pId}">${row.pName }</a>                                
                                       <marquee width="150"><font style="font-family:Bookman" color="green" >${row.pDescription}</font></marquee>
                                </div>
                            <!-- thông tin acc add vào sau -->
                            <div class="item-price">
                                <span class="cur-p">${row.pPrice} VNĐ</span>
                            </div>

                            <div class="item-btn-a">
                                <a href="/CartController?action=index&page=addtocart&id=${row.pId}" onclick="javascript:void(0);cart.add('188', '1', this);">
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
        <hr>
    </div>     
<!--end account lien quan-->

<!--satrt account lien minh-->
<sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="ds"/>

            <sql:query var="result" dataSource="${ds}">
                select * from product where pType="lienminh"
            </sql:query>
    <div class="container">
        <div class="list-title" style="margin-top: 15px;">
            <h2>Game Liên Minh</h2>
            <a href="accountLienMinh.jsp">Xem chi tiết</a>
        </div>
        
                    <div class="next-page-product6" style="display:none;">1</div>
                    
        <div class="list-container">
            <div class="row text-md-center">
                <c:forEach items="${result.rows}" var="row">
                <div class="col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <a href="ProductDetail?id=${row.pId}">
                            <div class="img">
                                <img class="check_img_errs" src="${row.pImage}" />
                            </div></a>
                        <div class="item-info">
                            <div class="item-title">
                                    <a href="ProductDetail?id=${row.pId}">${row.pName }</a>
                                       <marquee width="150"><font style="font-family:Bookman" color="green" >${row.pDescription}</font></marquee>
                             </div>
                            <!-- thông tin acc add vào sau -->
                            <div class="item-price">
                                <span class="cur-p">${row.pPrice} VNĐ</span>
                            </div>

                            <div class="item-btn-a">
                                <a href="/CartController?action=index&page=addtocart&id=${row.pId}" onclick="javascript:void(0);cart.add('188', '1', this);">
                                    <i class="fas fa-shopping-cart "></i>
                                </a>
                            </div>

                            <div class="item-btn" style="margin-top: 10px" class="templatemo-edit-btn">
                                 <a href="CartController?action=showcart&page=addtocart&id=${row.pId}">Mua ngay</a>
                                
                            </div>
                        </div>
                    </div>
                </div>
              </c:forEach>
            </div>
        </div>
                                    

                    <hr>
    </div>
<!--end account lien minh-->

<!--start account fifa 4-->
<sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="ds"/>

            <sql:query var="result" dataSource="${ds}">
                select * from product where pType="fifa4" LIMIT 4  
            </sql:query>
    <div class="container">
        <div class="list-title" style="margin-top: 15px;">
            <h2>Game Fifa</h2>
            <a href="accountFifa.jsp">Xem chi tiết</a>
        </div>
        
        <div class="next-page-product6" style="display:none;">1</div>
        <div class="list-container">
            <div class="row text-md-center">
                <c:forEach items="${result.rows}" var="row">
                       <div class="col-md-6 col-lg-3 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <a href="ProductDetail?id=${row.pId}">
                            <div class="img">
                                <img class="check_img_errs" src="${row.pImage}" />
                            </div></a>
                        <div class="item-info">
                          <div class="item-title">
                                    <a href="ProductDetail?id=${row.pId}">${row.pName }</a> 
                                       <marquee width="150"><font style="font-family:Bookman" color="green" >${row.pDescription}</font></marquee>
                                </div>
                            <!-- thông tin acc add vào sau -->
                            <div class="item-price">
                                <span class="cur-p">${row.pPrice} VNĐ</span>
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
        <hr>
    </div>

    
    <div class="high-line-container high-line-2">
        <div class="container">
            <div class="text-line-though"><span>Bạn là người mới?</span></div>
            <div class="text">Hãy đăng kí tài khoản để cập nhật những ưu đãi mới nhất từ Shop</div>
            <button class="btn-aqua-bg"><a href="registration.jsp">Đăng ký ngay</a></button>
            <div class="text">Hoặc <a href="login.jsp"><b style="color: #fff">đăng nhập</b></a> nếu bạn đã có tài khoản</div>
        </div>
    </div>
    <script>
        function hide_banner() {
            $(window).width() < 1420 ? $(".banner-home-sidebar").hide() : $(".banner-home-sidebar").show()
        }
        $(window).resize(function () {
            hide_banner()
        }), $(document).ready(function () {
            hide_banner()
        });
    </script>
    <script type="text/javascript">
        var isMobile = false; //initiate as false
        var isDesktop = true;

        // device detection
        if (/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|ipad|iris|kindle|Android|Silk|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i.test(navigator.userAgent)
                || /1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(navigator.userAgent.substr(0, 4))) {

            isMobile = true;
            isDesktop = false;
        }

        var showSelectorPopup = function (popup_id, content_type, content, href, width, height, animation, prevent_closing, cssSelector, close_after) {
            var overlay_close = true;
            var escape_close = true;
            if (prevent_closing == 1) {
                overlay_close = false;
                escape_close = null;
            } else {
                overlay_close = true;
                escape_close = [27];
            }
            $(cssSelector).fancybox({
                content: content,
                width: width,
                height: height,
                autoSize: false,
                openEffect: 'fade',
                openSpeed: 150,
                closeBtn: true,
                wrapCSS: 'animated ' + animation + ' popup-id-' + popup_id,
                href: href.replace(new RegExp("watch\\?v=", "i"), 'v/'),
                type: content_type === "youtube" ? 'swf' : null,
                swf: {
                    'wmode': 'transparent',
                    'allowfullscreen': 'true'
                },

                helpers: {
                    overlay: {closeClick: overlay_close}
                },
                keys: {
                    close: escape_close
                },
                afterShow: function () {
                    if (close_after > 0)
                        setTimeout(closePopup.bind(null, close_after * 1000));
                    $.ajax({
                        //url: '',
                        type: 'GET',
                        data: {popup_id: popup_id},
                        dataType: 'json',
                        success: function (response) {
                        }
                    });
                }
            });
        }

        var closePopup = function (cssSelector) {
            if (cssSelector == '')
                $.fancybox.close();
            else
                $(cssSelector).fancybox.close();
        }

        var showPopup = function (popup_id, content_type, content, href, width, height, animation, prevent_closing, auto_size, auto_resize, aspect_ratio, delay, close_after) {
            var timeout = 500;
            if (delay > 0) {
                timeout += (delay * 1000);
            }
            var overlay_close = true;
            var escape_close = true;
            if (prevent_closing == 1) {
                overlay_close = false;
                escape_close = null;
            } else {
                overlay_close = true;
                escape_close = [27];
            }

            setTimeout(function () {
                $.fancybox.open({
                    content: content,
                    width: width,
                    height: height,
                    autoSize: false,
                    openEffect: 'fade',
                    openSpeed: 150,
                    closeBtn: true,
                    wrapCSS: 'animated ' + animation + ' popup-id-' + popup_id,
                    autoResize: auto_resize === "false" ? false : true,
                    aspectRatio: aspect_ratio === "false" ? false : true,
                    href: href.replace(new RegExp("watch\\?v=", "i"), 'v/'),
                    type: content_type === "youtube" ? 'swf' : null,
                    swf: {
                        'wmode': 'transparent',
                        'allowfullscreen': 'true'
                    },

                    helpers: {
                        overlay: {closeClick: overlay_close}
                    },
                    keys: {
                        close: escape_close
                    },
                    afterShow: function () {
                        if (close_after > 0)
                            setTimeout(closePopup, close_after * 1000);
                        $.ajax({
                            //url: '',
                            type: 'GET',
                            data: {popup_id: popup_id},
                            dataType: 'json',
                            success: function (response) {
                            }
                        });
                    }
                });

            }, timeout);


        };

        var uri = location.pathname + location.search;
        var documentReady = false;
        var windowLoad = false;
        var isBodyClicked = false;

        var isExitEvent = false;
        var alreadyscrolled = false;


        $(document).ready(function () {
            documentReady = true;
        });

        $(window).load(function () {
            windowLoad = true;
        });

        //var exitEvent = function (){

        //	};	


        $.ajax({
            //url: '',
            type: 'GET',
            data: {'uri': uri},
            dataType: 'json',
            success: function (response) {

                for (entry in response) {
                    // Check if the current popup should be visible on mobile devices
                    if (response[entry].show_on_mobile == '0' && isMobile) {
                        continue;
                    }

                    if (response[entry].show_on_desktop == '0' && isDesktop) {
                        continue;
                    }

                    if (response[entry].match) {
                        repeat = response[entry].repeat;
                        popup_id = response[entry].id;

                        if (response[entry].event == 0) { // Document ready event  		
                            if (documentReady) {
                                showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);
                            } else {
                                $(document).ready(function () {
                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);
                                });
                            }
                        }


                        if (response[entry].event == 1) { // Window load event
                            if (windowLoad) {
                                showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);
                            } else {
                                $(window).load(function () {

                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);
                                });
                            }

                        }

                        if (response[entry].event == 2) { // Body click event
                            $('body').click(function () {
                                if (isBodyClicked == false) {
                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);
                                    isBodyClicked = true;
                                }
                            });
                        }

                        if (response[entry].event == 3) { // Exit intent
                            var p_id = response[entry].popup_id;
                            var p_content = response[entry].content;
                            var p_width = response[entry].width;
                            var p_height = response[entry].height;
                            var p_animation = response[entry].animation;
                            var p_prevent_closing = response[entry].prevent_closing;
                            var p_auto_size = response[entry].auto_size;
                            var p_auto_resize = response[entry].auto_resize;
                            var p_aspect_ratio = response[entry].aspect_ratio;
                            var p_content_type = response[entry].content_type;
                            var p_video_href = response[entry].video_href;

                            var bootstrap_enabled = (typeof $().modal == 'function');

                            if (!bootstrap_enabled) {
                                $('head').append('<link rel="stylesheet" type="text/css" href="https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/popupwindow/modal/dol_bootstrap.min.css" />');
                                $('head').append('<script type="text/javascript" src="https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/popupwindow/modal/dol_bootstrap.min.js"><' + '/script>');
                            }

                            var prevY = -1;

                            $(document).bind("mouseout", function (e) {
                                e.preventDefault();
                                e.stopPropagation();
                                if (prevY == -1) {
                                    prevY = e.pageY;

                                    return;
                                }
                                if (!isExitEvent && (e.pageY < prevY) && (e.pageY - $(window).scrollTop() <= 1)) {

                                    prevY = -1;
                                    showPopup(p_id, p_content_type, p_content, p_video_href, p_width, p_height, p_animation, p_prevent_closing, p_auto_size, p_auto_resize, p_aspect_ratio, response[entry].seconds, response[entry].close_after);
                                    isExitEvent = true;
                                    //showPopup(response[entry].popup_id, response[entry].content, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing);
                                } else {
                                    prevY = e.pageY;
                                }
                            });

                        }

                        if (response[entry].event == 4) { // Scroll from top event
                            $(window).scroll(function () {

                                //variables to be used				

                                var startDistance = 0;
                                var percentageValue = response[entry].percentage_value;
                                var scrollAmount = $(window).scrollTop();
                                var documentHeight = $(window).height();

                                // calculate the percentage the user has scrolled down the page
                                var scrollPercent = (scrollAmount / documentHeight) * 100;

                                // detecting the percentage scrolled and calling the pop up	
                                if (!alreadyscrolled && scrollPercent > percentageValue && scrollPercent < percentageValue + 1) {
                                    showPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].auto_size, response[entry].auto_resize, response[entry].aspect_ratio, response[entry].seconds, response[entry].close_after);
                                    alreadyscrolled = true;

                                }

                            });
                        }


                        if (response[entry].event == 5) { // CSS Selector

                            $(response[entry].css_selector).addClass('fancybox');
                            $(response[entry].css_selector).addClass('fancybox.iframe');
                            showSelectorPopup(response[entry].popup_id, response[entry].content_type, response[entry].content, response[entry].video_href, response[entry].width, response[entry].height, response[entry].animation, response[entry].prevent_closing, response[entry].css_selector, response[entry].close_after);

                        }

                    }

                }

            }
        });
    </script>
    <style>
        .popup-id-1{}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .popup-id-2{}                                                                                                                                                                                                                                                                                                                                                                                                                                                                           .popup-id-3{}                                                                                                                                                                                                                                                                                                                                                                                                                              .popup-id-4{}                                                                                                                                                                                                                        </style>
    <footer>
        <jsp:include page="footer/footer1.jsp"></jsp:include>
    </footer>
    <script data-cfasync="false" src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script></body>
</html>
