<%-- 
    Document   : Payment
    Created on : Jul 23, 2020, 9:25:18 PM
    Author     : Quang Hiển
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                            Hỗ trợ 1900 633 305
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
            var time_run_link = "5" * 1000;
            var lang = "vi";
            var check_login = true;
        </script>

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
        </script><link rel="stylesheet" href="./assets/catalog/checkout/cart.css">

        <div class="trang-sp">
            <div class="container">
                <div id="alert-position"></div>

                <div class="container-title">
                    <h2 class="thanh-toan-title">Giỏ Hàng</h2><span class="count-san-pham">(1 sản phẩm)</span>
                    <div class="sort">
                        <a href="index.jsp"><div class="btn btn-aqua-bg">Tiếp tục mua hàng</div></a>
                    </div>
                </div>
                <hr>
                  <div class="row cart-detail">
                    <table id="cart" class="table table-hover table-condensed" > 
                        <thead> 
                            <tr> 
                                <th style="width:50% ">Tên sản phẩm</th> 
                                <th style="width:10%">Giá</th> 
                                <th style="width:8%">Số lượng</th> 
                                
                                <th style="width:22%" class="text-center">Thể Loại</th> 
                                <th style="width:10%"> </th> 
                            </tr> 
                        </thead> 
                        <tbody>
                      
                            <c:set var="total" value="0"></c:set>     
    
                            <c:forEach items="${cartlist }" var="i">  
                                        <tr> 
                                            <td data-th="Product"> 
                                                <div class="row"> 
                                                    <div class="col-sm-2 hidden-xs"><img src="<c:out value="${i.getcLImage() }"></c:out>" alt="" class="portrait-crop"width="125">
                                                    </div> 
                                                    <div class="col-sm-10"> 
                                                        <h4 class="col-sm-10 col-xs-10"><c:out value="${i.getcName()}"></c:out></h4> 
                                                        <p> </p> 
                                                    </div> 
                                                </div> 
                                            </td> 
                                            <td data-th="Price"><c:out value="${i.getcPrice()}"></c:out></td>
                                            <td data-th="Quantity"><c:out value="${i.getcQuantity()}"></c:out></td>
                                            <td data-th="Type"><c:out value="${i.getcType()}"></c:out>
                                            </td> 
                                          
                                            <td  > 
                                       
                                        
                                        <c:set var="total" value="${total +  i.getcPrice()}"></c:set>                                
                            </c:forEach>
                        </form
                        </tbody>
                     
                    </table>
                </div> 
                                <hr>
                        <div class="mb15"></div>
                        <div class="thanh-toan">
                            <div class="row">
                                <div class="col-md-12 col-xs-12 padd-0">
                                    <div class="col-md-6 col-xs-12 padd-0">
                                        <div class="panel-group" id="accordion">
                                            <div class="panel panel-default">
                                                <div class="panel-heading">
                                                    <h4 class="panel-title"><a href="#collapse-coupon" class="accordion-toggle" data-toggle="collapse" data-parent="#accordion"><strong>Nhập Email Để Mua Hàng</strong></a></h4>
                                                </div>
                                                <div class="panel-body">
                                                    <div class="input-group">
                                                        <input type="text" name="coupon" value="" placeholder="Nhập Email để mua hàng" id="input-coupon" class="form-control" />
                                                        <span class="input-group-btn">
                                                            <input type="button" value="Sử dụng" id="button-coupon" data-loading-text="Đang tải..." style="color: #fff;background-color: #21beff;border-color: #21beff;" class="btn btn-primary"  />
                                                        </span></div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-sm-12 col-xs-12 padd-0">
                                        <div class="order-total">
                                            <div class="panel panel-default">
                                                <div class="panel-heading" style="border-color: transparent;">
                                                    <h4 class="panel-title"><strong>THÔNG TIN THANH TOÁN</strong></h4>
                                                </div>
                                                <div class="panel-body">
                                                    <div class="row">
                                                        <!-- Thành Tiền -->
                                                        <div class="col-md-12col-sm-12 col-xs-12 padd-0 margin-item">
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0">
                                                                <span class="text-gray">Thành tiền sản phẩm</span>
                                                            </div>
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0 text-right">
                                                                <span class="thanh-tien"><c:out value="${total}"/></span>
                                                            </div>
                                                        </div>


                                                        <!-- Border Bottom Nét Đứt -->
                                                        <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash"></div>

                                                        <!-- Tổng Tiền -->
                                                        <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-item">
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0">
                                                                <div class="h16-md-26 text-gray-900">TỔNG TIỀN</div>
                                                            </div>
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0 text-right">
                                                                <div class="h16-bo-26 text-primary"><c:out value="${total}"/></div>
                                                            </div>
                                                        </div>

                                                        <!-- Border Bottom Nét Đứt -->
                                                        <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash"></div>
                                                        <!-- Thưởng Tiền + Số Dư Hiện Tại -->
                                                        <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-item">
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0">
                                                                <span class="text-gray">Mã giảm giá</span>
                                                            </div>
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0 text-right">
                                                                <span class="thanh-tien">0%</span>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-item">
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0">
                                                                <span class="text-gray">Giảm giá</span>
                                                            </div>
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0 text-right">
                                                                <span class="thanh-tien"><b style="color:#000;">VNĐ</b></i></span>
                                                            </div>
                                                        </div>

                                                        <!-- Border Bottom Nét Đứt -->
                                                        <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash"></div>
                                                        <!-- Số Tiền Cần Nạp Thêm -->
                                                        <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-item">
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0">
                                                                <div class="h16-md-26 text-gray-900">Số Tiền Bạn Cần Chi Trả</div>
                                                            </div>
                                                            <div class="col-md-6 col-sm-6 col-xs-6 padd-0 text-right">
                                                                <div class="h16-bo-26 text-primary"><c:out value="${total}"/> <b style="color:#000;">VNĐ</b></div>
                                                            </div>
                                                        </div>
                                                        <a href="/">
                                                            <button type="button" class="btn btn-danger col-md-12 col-sm-12 col-xs-12"><strong style="color:#fff;">Thanh Toán</strong></button>
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="buttons clearfix">
                            <div class="pull-left"><a href="index.jsp" class="btn btn-default">Tiếp tục mua hàng</a></div>
                           
                        </div>
                </form>
            </div>
        </div>
        <script src="./assets/catalog/checkout/cart.js"></script>
        <footer>
            <div class="footer-top" style="margin-top:20px;">
                <div class="container mt-0">
                    <div class="row">
                        <div class="col-md-3 col-sm-12 flex-row">
                            <div class="img">
                                <img src="https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service1.png" style="max-width:50px;" alt="GIAO HÀNG SIÊU TỐC">
                            </div>
                            <div style="margin-left: 20px;">
                                <span style="font-size:13px;font-weight:bold;text-transform:uppercase;">GIAO HÀNG SIÊU TỐC</span>
                                <p style="font-size:13px;">Hệ thống giao hàng tự động chỉ trong 3 phút</p>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-12 flex-row">
                            <div class="img">
                                <img src="https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service2.png" style="max-width:50px;" alt="BẢO HÀNH NHANH CHÓNG">
                            </div>
                            <div style="margin-left: 20px;">
                                <span style="font-size:13px;font-weight:bold;text-transform:uppercase;">BẢO HÀNH NHANH CHÓNG</span>
                                <p style="font-size:13px;">Mọi yêu cầu hỗ trợ sẽ được đội ngũ tư vấn giải quyết trực tiếp.</p>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-12 flex-row">
                            <div class="img">
                                <img src="https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service3.png" style="max-width:50px;" alt="UY TÍN 5 SAO">
                            </div>
                            <div style="margin-left: 20px;">
                                <span style="font-size:13px;font-weight:bold;text-transform:uppercase;">UY TÍN 5 SAO</span>
                                <p style="font-size:13px;">Được cộng đồng bình chọn là shop game uy tín nhất VN</p>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-12 flex-row">
                            <div class="img">
                                <img src="https://hgeqic7azi.vcdn.com.vn/image/catalog/Footer/service4.png" style="max-width:50px;" alt="HỖ TRỢ TẬN TÌNH">
                            </div>
                            <div style="margin-left: 20px;">
                                <span style="font-size:13px;font-weight:bold;text-transform:uppercase;">HỖ TRỢ TẬN TÌNH</span>
                                <p style="font-size:13px;">Hệ thống hỗ trợ online liên tục từ 8h - 24h</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            

            <div id="notification_footer" class="notification_footer">
                <div class="nt-content"></div>
                <div class="nt-close"><i class="far fa-times-circle"></i></div>
            </div>

        </footer>
        <a id="messenger-button" href="https://m.me/divineshop.vn" alt="Hỗ Trợ DivineShop" title="Hỗ Trợ DivineShop">
            <img style="position: fixed;bottom: 35px;right: 25px;z-index:2;" src="https://hgeqic7azi.vcdn.com.vn/image/banner_v2/messager.svg">
        </a>

        <script data-cfasync="false" src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script>
          var time_show_notification = 5000;
          var time_next_notification = 12000;
        </script>
        <script src="./assets/catalog/common/footer.js"></script>

    </body>
</html>
