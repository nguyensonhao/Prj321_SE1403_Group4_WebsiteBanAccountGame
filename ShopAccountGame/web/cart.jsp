<%-- 
    Document   : Test
    Created on : Jul 15, 2020, 7:01:10 PM
    Author     : Quang Hiển
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if IE]><![endif]-->
<!--[if IE 8 ]><html dir="ltr" lang="vi" class="ie8"><![endif]-->
<!--[if IE 9 ]><html dir="ltr" lang="vi" class="ie9"><![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html dir="ltr" lang="vi">
    <!--<![endif]-->

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
                        Hỗ trợ 1900 123456
                    </div>
                </div>
            </div>
        </div>
        <header class="home-page fixed-header">
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
                    var time_run_link = "5" * 1000;
                    var lang = "vi";
                    var check_login = true;
</script>
<script src="./assets/catalog/common/header.js?t=1594814390"></script>
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
                                <a href="/index.php?route=product/category&amp;path=59&amp;filter_price_from=0&amp;filter_price_to=15000000&amp;sort=op.quantity&amp;order=DESC&amp;limit=12"><i class="fab fa-steam-symbol"></i>
                                    <span>Game trên Steam</span></a>
                            </li>
                            <li>
                                <a href="/index.php?route=product/search&amp;search=pubg"><i class="fas fa-trophy"></i>
                                    <span>PUBG</span></a>
                            </li>
                            <li>
                                <a href="/Origin"><i class="icon icon-origin-svg"></i>
                                    <span>Game trên Origin</span></a>
                            </li>

                        </ul>
                    </div>
                </div>

                <div class="right-menu">
                    <div class="row menu-tab-all">
                        <div class="quick-menu head-link">
                            <a href="#"><i class="fab fa-hotjar"></i><span>Mua nhiều trong 24h</span></a>
                        </div>
                        <div class="quick-menu head-link">
                            <a href="#"><i class="fas fa-award"></i><span>ĐANG KHUYẾN MẠI</span></a>
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
</script><style xmlns="">
    @media (max-width: 415px) {
        .col-xs-6 {
            width: 50%;
        }
    }

    .text-center-col {
        text-align: center !important;
    }

    .text-left-col {
        text-align: left !important;
    }

    div.trang-sp .container .container-title {
        display: flex;
        align-items: center;
    }

    div.trang-sp .container .container-title h2 {
        font-size: 20px;
        font-weight: bold;
        margin: 0px;
        display: inline-block;
    }

    div.trang-sp .container .container-title .count-sp-thanhtoan {
        color: #21beff;
        margin-left: 5px;
        margin-top: 3px;
        font-size: 14px;
    }

    div.trang-sp .container .container-title .sort {
        margin-left: auto;
    }

    div.trang-sp .container .container-title .sort .btn {
        width: 150px;
        height: 32px;
    }

    .alert {
        padding: 8px;
    }

    .ver-middle {
        vertical-align: middle !important;
    }

    .text-color {
        color: red;
    }

    #form_address_other {
        display: none;
    }

    #my_address {
        display: none;
    }
</style>

<!--Main show sản pam-->
 <style type="text/csss">.table &amp;amp;gt;tbody&amp;amp;gt;tr&amp;amp;gt;td, .table&amp;amp;gt;tfoot&amp;amp;gt;tr&amp;amp;gt;td {  
            vertical-align: middle;
        }

        @media screen and (max-width: 600px) { 
            table#cart tbody td .form-control { 
                width:20%; 
                display: inline !important;
            } 

            .actions .btn { 
                width:36%; 
                margin:1.5em 0;
            } 

            .actions .btn-info { 
                float:left;
            } 

            .actions .btn-danger { 
                float:right;
            } 

            table#cart thead {
                display: none;
            } 

            table#cart tbody td {
                display: block;
                padding: .6rem;
                min-width:320px;
            } 

            table#cart tbody tr td:first-child {
                background: #333;
                color: #fff;
            } 

            table#cart tbody td:before { 
                content: attr(data-th);
                font-weight: bold; 
                display: inline-block;
                width: 8rem;
            } 

            table#cart tfoot td {
                display:block;
            } 
            table#cart tfoot td .btn {
                display:block;
            }
        }</style>
<div class="trang-sp">

    <div class="container">

        <div id="alert-position"></div>
        <div class="container-title">
            <h2 class="thanh-toan-title">Thanh Toán</h2><span class="count-san-pham">${temp}</span>
                    </div>
        </br>
        <div class="row cart-detail">
            <table id="cart" class="table table-hover table-condensed" > 
                <thead> 
                    <tr> 
                        <th style="width:50% ">Tên sản phẩm</th> 
                        <th style="width:10%">Giá</th> 
                        <th style="width:8%">Số lượng</th> 
                        <th style="width:22%" class="text-center">Thành tiền</th> 
                        <th style="width:10%"> </th> 
                    </tr> 
                </thead> 
                
                <tbody>

                   <sql:setDataSource var="conn" driver = "com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/shopacc"
                           user="root" password="" scope="page"/>
                   <sql:update var="delete" dataSource="${conn}" sql="DELETE FROM `bill` WHERE bId='${param.bId}'"/> 
                   <sql:query var="result" dataSource="${conn}">
                         SELECT * FROM `bill`
                    </sql:query>
                     
                     <c:forEach items="${result.rows}" var="row">
                    <tr> 
                        <td data-th="Product"> 
                            <div class="row"> 
                                <div class="col-sm-2 hidden-xs"><img src="${row.pImage}" alt="" class="portrait-crop"width="125">
                                </div> 
                                <div class="col-sm-10"> 
                                    <h4 class="col-sm-10 col-xs-10"> ${row.pName}</h4> 
                                    <p> </p> 
                                </div> 
                            </div> 
                        </td> 
                        <td data-th="Price">${row.pPrice}</td> 
                        <td data-th="Quantity">${row.bQuantity}
                        </td> 
                        <td data-th="Subtotal" class="text-center">${row.bQuantity * row.pPrice}</td> 
                        <td  > 
                            <button class="btn btn-danger btn-sm"  onclick="window.location.href='cart.jsp?bId=${row.bId}'"><i class="far fa-times-circle"></i>                                     
                                   </button>    
                                   <!--<button onclick="window.location.href='cart.jsp?bId=${row.bId}'">Delete</button>-->
                        </td> 
                    </tr>
                    <c:set var="total" value="${total + row.pPrice}"></c:set>
                    <c:set var="temp" value="${temp + row.bQuantity}"></c:set>
                      </c:forEach>
                </tbody>
                <tfoot> 
                    <tr> 
                        
                        <td><a href="index.jsp" class="btn btn-warning"><i class="fa fa-angle-left"></i> Tiếp tục mua hàng</a>
                        </td> 
                        <td colspan="2" class="hidden-xs"> </td> 
                        <td class="hidden-xs text-center"><strong>Tổng tiền <c:out value="${total}"/></strong>
                        </td> 
                        <td><a href="" class="btn btn-success btn-block">Thanh toán <i class="fa fa-angle-right"></i></a>
                        </td> 
                    </tr> 
                </tfoot> 
               
            </table>
        </div>              

    </div>
    <div class="mb15"></div>

    <input type="hidden" value="0" id="product_physical">

    <div class="mb15"></div>
    <div class="thanh-toan">
        <div class="row">
            <div class="col-md-12 col-xs-12 padd-0">
                <div class="col-md-6 col-xs-12 padd-0">

                    <div class="mb15"></div>

                </div>

            </div>
        </div>
    </div>
    <hr>
    
</div>
</div>
<!--------------------------------------------------------------------------------------------------->
<div id="payment-confirm-data"></div>
<footer>
    <jsp:include page="footer/footer1.jsp"></jsp:include>
</footer>

<a id="messenger-button" href="https://m.me/divineshop.vn" alt="Hỗ Trợ DivineShop" title="Hỗ Trợ DivineShop">
    <img style="position: fixed;bottom: 35px;right: 25px;z-index:2;" src="https://hgeqic7azi.vcdn.com.vn/image/banner_v2/messager.svg">
</a>
<script src="./assets/catalog/common/footer.js?t=1594814390"></script>
</body>
</html>

