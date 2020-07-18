<%-- 
    Document   : cart
    Created on : Jul 15, 2020, 6:48:41 PM
    Author     : Quang Hiển
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <link href="https://hgeqic7azi.vcdn.com.vn/image/catalog/home/divine-esport-100x100.png" rel="icon" />

        <meta property="og:title" content="Thanh Toán" />
        <meta property="og:description" content="" />
        <meta property="og:type" content="article" />
        <meta property="og:url" content="https://divineshop.vn/index.php?route=checkout/checkout" />
        <meta property='og:image' content='https://hgeqic7azi.vcdn.com.vn/image/catalog/Anh/Nho/divineshop ngang.png' />
        <meta property='fb:app_id' content='377077292740522' />
        <meta name="google-site-verification" content="GgBtZpspH1CNxHMj0_rrbg18lB0Vxy34KfTtkYpFI2w" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta property="article:author" content="https://www.facebook.com/divineshop.vn" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="format-detection" content="telephone=no" />
        <meta name="google-signin-client_id"
              content="935121321128-ev9v7e4i175srjc5k2mtnia3l5ndr9ee.apps.googleusercontent.com">

        <title>Thanh Toán</title>
        <link rel="stylesheet" href="https://hgeqic7azi.vcdn.com.vn/assets/css/header.css?t=1594872832">

        <base href="https://divineshop.vn/" />



        <!-- css-->
        <link rel="stylesheet" href="https://hgeqic7azi.vcdn.com.vn/assets/css/normalize.min.css?t=1594872832" />
        <link href="https://hgeqic7azi.vcdn.com.vn/assets/bootstrap-3.3.7/css/bootstrap.min.css?t=1594872832" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="assets/bootstrap-3.3.7/js/bootstrap.min.js?t=1594872832"></script>
        <link rel="stylesheet" href="assets/fontawesome/all.css">
        <!-- js-->
        <link rel="stylesheet" type="text/css"
              href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css?t=1594872832" />
        <link rel="stylesheet" href="https://hgeqic7azi.vcdn.com.vn/assets/css/slick-theme.css?t=1594872832" />
        <script type="text/javascript"
        src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous">
        </script>
        <link rel="stylesheet" href="https://hgeqic7azi.vcdn.com.vn/assets/css/common.css?t=1594872832">
        <link href="https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/dcoin/style.css?t=1594872832" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Anton&display=swap" rel="stylesheet">
        <link href="https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/jquery/datetimepicker/bootstrap-datetimepicker.min.css?t=1594872832" type="text/css" rel="stylesheet"
              media="screen" />
        <link href="https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/default/stylesheet/popupwindow/animate.css?t=1594872832" type="text/css" rel="stylesheet"
              media="screen" />
        <link href="https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/jquery/fancybox/jquery.fancybox.css?t=1594872832" type="text/css" rel="stylesheet"
              media="screen" />
        <link href="https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/default/stylesheet/popupwindow/popupwindow.css?t=1594872832" type="text/css" rel="stylesheet"
              media="screen" />
        <script src="https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/jquery/datetimepicker/moment.js?t=1594872832" type="text/javascript"></script>
        <script src="https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/jquery/datetimepicker/bootstrap-datetimepicker.min.js?t=1594872832" type="text/javascript"></script>
        <script src="https://hgeqic7azi.vcdn.com.vn/catalog/view/javascript/jquery/fancybox/jquery.fancybox.js?t=1594872832" type="text/javascript"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css"
              rel="stylesheet" />
        <script src="assets/js/common.min.js?t=1594872832"></script>
        <script src="assets/js/common.js?t=1594872832"></script>
        <link rel="stylesheet" href="assets/cropperjs/css/cropper.css?t=1594872832">

        <!-- Google Tag Manager -->
        <script>
                    (function (w, d, s, l, i) {
                        w[l] = w[l] || [];
                        w[l].push({
                            'gtm.start': new Date().getTime(),
                            event: 'gtm.js'
                        });
                        var f = d.getElementsByTagName(s)[0],
                                j = d.createElement(s),
                                dl = l != 'dataLayer' ? '&l=' + l : '';
                        j.async = true;
                        j.src = 'https://www.googletagmanager.com/gtm.js?id=' + i + dl;
                        f.parentNode.insertBefore(j, f);
                    })(window, document, 'script', 'dataLayer', 'GTM-NDLT8HM');
        </script>
        <!-- End Google Tag Manager -->
    </head>

    <body>
        <!-- Google Tag Manager (noscript) -->
        <noscript>
        <iframe src="https://www.googletagmanager.com/ns.html?id=GTM-NDLT8HM" height="0" width="0"
                style="display:none;visibility:hidden"></iframe>
        </noscript>
        <!-- End Google Tag Manager (noscript) -->

        <div class="top-header">
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
                                <a href="/gia-han-spotify-premium-6m" class="mySlides" id="new-slide-0">
                                    <i class="fab fa-hotjar"></i>
                                    Gia hạn Spotify Premium 12 tháng chỉ 120K              </a>
                                <a href="/playerunknowns-battlegrounds" class="mySlides" id="new-slide-1">
                                    <i class="fab fa-hotjar"></i>
                                    PUBG sale cực mạnh chỉ 240k              </a>
                                <a href="/goi-gia-han-adobe-1-thang" class="mySlides" id="new-slide-2">
                                    <i class="fab fa-hotjar"></i>
                                    Adobe Full App giá chỉ 690k/tháng              </a>
                            </div>
                        </div>
                    </div>
                    <div class="text-right" style="padding:5px 0;float: right">
                        Hỗ trợ 1900 633 305
                    </div>
                </div>
            </div>
        </div>
        <header class="home-page fixed-header">
            <nav id="sidebar" class="navbar">
                <div id="dismiss">
                    <i class="fas fa-times"></i>
                </div>

                <div class="menu-list">
                    <ul id="menu-content" class="menu-content">
                        <li class="mt-0 collapsed" style="background-color: #4267B2">
                            <div class="header-btn text-white">
                                <div class="row">
                                    <div class="col-xs-2 padd-0" style=" margin-top: 5px;">
                                        <img class="img-fit" id="avatar-profile2" style="border-radius: 50%;"
                                             src="image/default.png?rand=71387">
                                    </div>

                                    <div class="col-xs-10">
                                        <div class="text-white">
                                            <a href="index.php?route=account/account" class="text-white"
                                               style="text-transform: capitalize;">hiendbk</a>
                                            <a href="https://help.divineshop.vn/gioi-thieu/chinh-sach-vip" target="_blank" alt="Link tra cứu VIP" class="label-vip"><image src="https://divineshop.vn//image/catalog/Banner/vip/silver.png" style="height:15px;" title="Vip Bạc" /></a>                  </div>

                                        <div class="text-white">
                                            <a href="index.php?route=account/account" class="text-white">
                                                Số dư: 1,680                      <i class="icon-coin-dollar" style="position: unset"></i>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                        </li>

                        <li>
                            <a href="index.php?route=common/home"><i class="fa fa-home icon-font18"></i>Trang chủ</a>
                        </li>

                        <li>
                            <a href="index.php?route=account/recharge"><i class="fa fa-plus-circle icon-font18"></i>Nạp Dcoin</a>
                        </li>

                        <li>
                            <a href="index.php?route=account/order"><i class="fa fa-shopping-cart icon-font18"></i>Lịch sử đơn hàng</a>
                        </li>

                        <li>
                            <a href="index.php?route=account/transaction"><i class="fa fa-search-dollar"></i>Lịch sử giao dịch</a>
                        </li>

                        <li>
                            <a href="index.php?route=account/affiliate"><i class="fa fa-user-plus"></i>Giới thiệu bạn bè</a>
                        </li>

                        <li>
                            <a href="index.php?route=account/notification"><i class="fa fa-bell"></i>Thông báo của tôi</a>
                        </li>

                        <li data-toggle="collapse" data-target="#danh-muc" class="collapsed">
                            <a><i class="fa fa-bars icon-font18"></i>Danh mục sản phẩm <i class="fa fa-angle-down"></i></a>
                        </li>
                        <ul class="sub-menu collapse" id="danh-muc">
                            <li>
                                <a href="/index.php?route=product/category&amp;path=59&amp;filter_price_from=0&amp;filter_price_to=15000000&amp;sort=op.quantity&amp;order=DESC&amp;limit=12">
                                    <i class="fab fa-steam-symbol"></i>
                                    Game trên Steam              </a>
                            </li>
                            <li>
                                <a href="/index.php?route=product/search&amp;search=pubg">
                                    <i class="fas fa-trophy"></i>
                                    PUBG              </a>
                            </li>
                            <li>
                                <a href="/Origin">
                                    <i class="icon icon-origin-svg"></i>
                                    Game trên Origin              </a>
                            </li>
                            <li>
                                <a href="/battle-net">
                                    <i class="icon icon-battle-net-svg"></i>
                                    Game trên Battle.net              </a>
                            </li>
                            <li>
                                <a href="/index.php?route=product/category&amp;path=63&amp;filter_price_from=0&amp;filter_price_to=15000000&amp;sort=p.price&amp;order=ASC&amp;limit=24">
                                    <i class="fas fa-wallet"></i>
                                    Steam Wallet              </a>
                            </li>
                            <li>
                                <a href="https://divineshop.vn/index.php?route=product/search&amp;search=gnmobile&amp;filter_price_from=0&amp;filter_price_to=2906000&amp;sort=p.sort_order&amp;order=ASC&amp;limit=48">
                                    <i class="fas fa-mobile-alt"></i>
                                    Nạp Game Mobile              </a>
                            </li>
                            <li>
                                <a href="/index.php?route=product/search&amp;tag=garena">
                                    <i class="icon icon-garena-svg"></i>
                                    Gói nạp Garena              </a>
                            </li>
                            <li>
                                <a href="/index.php?route=product/search&amp;search=gift%20card">
                                    <i class="fab fa-google-play"></i>
                                    Google Play              </a>
                            </li>
                            <li>
                                <a href="/index.php?route=product/search&amp;search=moiviec&amp;filter_price_from=0&amp;filter_price_to=15000000&amp;sort=p.sort_order&amp;order=ASC&amp;limit=48">
                                    <i class="fas fa-magic"></i>
                                    Tiện ích              </a>
                            </li>
                            <li>
                                <a href="/Nintendo-Eshop-Prepaid-Card-20">
                                    <i class="fas fa-wallet"></i>
                                    Nintendo Eshop Card              </a>
                            </li>
                        </ul>

                        <hr>
                        <li>
                            <a href="/index.php?route=product/detail_product/bestsellers"><i
                                    class="fab fa-hotjar"></i>Mua nhiều trong 24h</a>
                        </li>
                        <li>
                            <a href="/index.php?route=product/detail_product/sale"><i
                                    class="fas fa-award"></i>ĐANG KHUYẾN MẠI</a>
                        </li>
                        <li>
                            <a href="/index.php?route=account/topup"><i
                                    class="far fa-credit-card"></i>Hình thức thanh toán</a>
                        </li>
                        <li>
                            <a href="https://help.divineshop.vn/huong-dan-mua-hang/huong-dan-tao-tai-khoan"><i
                                    class="fas fa-gamepad"></i>Hướng dẫn mua hàng</a>
                        </li>

                        <hr>
                        <li style="margin: 0;"><a href="tel:1900633305" style="font-size: 17px;"><i class="fa fa-phone"></i>HOTLINE:
                                1900 633 305 </a></li>
                        <li style="margin: 0;"><a href="https://m.me/divineshop.vn" style="font-size: 17px;" target="_blank"><i
                                    class="fab fa-facebook-messenger"></i>Nhắn tin cho Shop </a></li>

                        <hr>
                        <li>
                            <a href="index.php?route=account/logout"><i class="fa fa-sign-out-alt icon-font18"></i>Đăng xuất</a>
                        </li>
                    </ul>
                </div>
            </nav>

            <div class="overlay"></div>

            <div class="header-container container">
                <div id="sidebarCollapse" class="btn-menu">
                    <i class="fas fa-bars" style="font-size: 20px; vertical-align: middle"></i>
                </div>
                <div class="logo"><a href="https://divineshop.vn/index.php?route=common/home"><img style="margin-right: 10px;width: 60px" src="assets/resources/logo_divine_pure_white.png" />
                        <img style="width: 100px;" src="assets/resources/logo-1.png" /></a></div>
                <div class="search-form">
                    <div class="search-control" id="search">
                        <input type="text" id="filter_name" class="search-box" name="search" value="" placeholder="Nhập sản phẩm cần tìm...">
                        <div class="search-btn" id="button-search-header">
                            <i class="fas fa-search"></i>
                        </div>
                    </div>
                </div>
                <div class="cart-mobile">
                    <div class="align-items-center d-flex" id="update-cart-mobile">
                        <a href="index.php?route=checkout/cart"><i class="fas fa-shopping-cart cart-size-mobile"></i> <span class="quantity_mobile">2</span></a>
                    </div>
                </div>
                <div class="header-btn">
                    <div class="header-btn d-flex flex-row">
                        <div style="padding-left: 10px;" class="notification" id="notification">
                            <span class="label label-danger pull-left" id="count_unread"></span>
                            <div class="" style="padding: 10px 10px;" id="show-list-notification">
                                <i class="fa fa-bell" style="font-size: 25px;"></i>
                            </div>
                            <div class="dropdown-menu drop-mini-notification" id="drop-mini-notification">
                                <div class="menu-notification-head"></div>
                                <div id="drop-box-notificaiton" style="overflow-y: scroll;height: 500px;">
                                    <div id="list-notification"></div>
                                </div>
                            </div>
                        </div>

                        <div class="d-flex align-items-center ml-1">
                            <div class="dropdown home-mini-profile" style="width: 100%">
                                <div style="display: flex;align-items: center;text-align: center;vertical-align: middle;">
                                    <div class="avatar">
                                        <a href="index.php?route=account/account"><img class="header-avatar" id="header-avatar"
                                                                                       src="image/default.png?rand=449570" alt="Avatar"></a>
                                    </div>
                                    <a href="index.php?route=account/account" data-toggle="dropdown" class="dropdown-toggle text-white"
                                       id="dropdownMenuLink" aria-expanded="false"
                                       style="padding: 0 10px;text-transform: capitalize;">hiendbk                  </a>
                                    <a href="https://help.divineshop.vn/gioi-thieu/chinh-sach-vip" target="_blank" alt="Link tra cứu VIP"><image src="https://divineshop.vn//image/catalog/Banner/vip/silver.png" style="height:15px;" title="Vip Bạc" /></a>                </div>
                                <div class="dropdown-menu drop-mini-profile" aria-labelledby="dropdownMenuLink">
                                    <div class="menu-login-head">
                                        <b>SỐ DƯ TÀI KHOẢN</b>
                                        <br>
                                        <div class="menu-login-head-wallet">
                                            <div class="d-flex">
                                                <i class="icon-wallet icon-wallet-login"></i>
                                                <div class="balance">Số dư: 1.680 <i class="icon-coin-dollar" style="color:#000;"></i></div>
                                            </div>
                                        </div>
                                        <a href="index.php?route=account/recharge" class="btn btn_recharge">NẠP THÊM</a>

                                    </div>
                                    <a href="index.php?route=account/order">
                                        <div class="drop-link-menu-login">
                                            Lịch sử mua hàng
                                        </div>
                                    </a>

                                    <a href="index.php?route=account/account">
                                        <div class="drop-link-menu-login">
                                            Thông tin tài khoản
                                        </div>
                                    </a>

                                    <a href="index.php?route=account/wishlist">
                                        <div class="drop-link-menu-login">
                                            Sản phẩm yêu thích
                                        </div>
                                    </a>

                                    <a href="index.php?route=account/affiliate">
                                        <div class="drop-link-menu-login">
                                            Giới thiệu bạn bè
                                        </div>
                                    </a>

                                    <a href="https://www.facebook.com/pg/divineshop.vn/posts/?ref=page_internal" target="_blank">
                                        <div class="drop-link-menu-login">
                                            Liên hệ Fanpage <img src="assets/icon/icon-facebook-black.png" alt="">
                                        </div>
                                    </a>

                                    <a href="index.php?route=account/logout">
                                        <div class="menu-logout">
                                            Đăng xuất
                                        </div>
                                    </a>
                                </div>
                            </div>

                            <ul class="dropdown-menu dropdown-menu-right" style="display: none;">
                                <li><a href="index.php?route=account/order" style="color:black">Lịch sử đơn hàng</a></li>
                                <li><a href="index.php?route=account/transaction" style="color:black">Giao dịch</a></li>
                            </ul>

                        </div>
                    </div>

                    <div id="home-cart" class="dropdown dropdown-header shopping-cart">
                        <div data-toggle="dropdown" data-loading-text="Đang tải..." class="heading dropdown-toggle"
                             aria-expanded="false">
                            <div class="align-items-center d-flex" id="update-cart">
                                <i class="fas fa-shopping-cart cart-size text-white"></i><b class="cart-text">Giỏ hàng</b><span
                                    class="quantity">2</span>
                            </div>
                        </div>
                        <ul class="dropdown-menu drop-mini-cart" id="dropdown-detail-cart">
                            <div class="text-cart-current">
                                Giỏ hàng hiện tại
                            </div>
                            <li class="dropdown-item padding-table-cart">
                                <table class="table" id="detail_cart">
                                    <tbody>
                                        <tr>
                                            <td class="text-left hide-text-option-cart">
                                                <a
                                                    href="https://divineshop.vn/index.php?route=product/product&product_id=">Grand Theft Auto V -...</a>

                                            </td>
                                            <td class="text-right"><i style="color: black">Số lượng: 1</i></td>
                                            <td class="text-right">458,000 VNĐ</td>
                                            <td class="text-center"><button type="button"
                                                                            onclick="cart.remove('3105617');" title="Loại bỏ"
                                                                            class="btn btn-danger btn-xs remove"><i class="fa fa-times text-remove"></i>
                                                </button></td>
                                        </tr>
                                        <tr>
                                            <td class="text-left hide-text-option-cart">
                                                <a
                                                    href="https://divineshop.vn/index.php?route=product/product&product_id=">Tài khoản Netflix Pr...</a>

                                            </td>
                                            <td class="text-right"><i style="color: black">Số lượng: 1</i></td>
                                            <td class="text-right">49,000 VNĐ</td>
                                            <td class="text-center"><button type="button"
                                                                            onclick="cart.remove('3105622');" title="Loại bỏ"
                                                                            class="btn btn-danger btn-xs remove"><i class="fa fa-times text-remove"></i>
                                                </button></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </li>
                            <li class="dropdown-item padding-table-cart">
                                <div class="total-cart">
                                    <table class="table table-bordered">
                                        <tbody>
                                            <tr>
                                                <td class="text-right"><strong>Thành tiền</strong></td>
                                                <td class="text-right">507,000 VNĐ</td>
                                            </tr>
                                            <tr>
                                                <td class="text-right"><strong>Tổng đơn hàng</strong></td>
                                                <td class="text-right">507,000 VNĐ</td>
                                            </tr>
                                            <tr>
                                                <td class="text-right"><strong>Số dư hiện tại</strong></td>
                                                <td class="text-right">1,680 <i
                                                        class="icon-coin-dollar" style="color: black"></i></td>
                                            </tr>
                                            <tr>
                                                <td class="text-right"><strong>Tổng tiền phải nạp thêm</strong></td>
                                                <td class="text-right">
                                                    505,320                            <i class="icon-coin-dollar" style="color: black"></i></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <p class="checkout">

                                        <a class="btn btn_cart_bottom" href="https://divineshop.vn/index.php?route=checkout/cart" style="width: 50%;"><i
                                                class="fa fa-eye icon-cart-bottom"></i> Xem
                                            chi tiết giỏ hàng
                                        </a>

                                        <a class="btn btn-primary"
                                           style="color:#fff; width: 50%; padding: 6px 30px 6px 30px; background-image:linear-gradient(to right, #5db8ec 0%, #2584e4 51%) !important "
                                           href="index.php?route=account/recharge"><i class="fa fa-wallet"></i>
                                            Nạp tiền
                                        </a>
                                        <br>
                                    </p>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

            <div id="modal-accept-rules" class="modal" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close btn-close-modal">&times;</button>
                            <h4 class="modal-title">Vui lòng chấp nhận điều khoản để tiếp tục đăng nhập</h4>
                        </div>

                        <div class="modal-footer">
                            <div class="checkbox" id="checked_rules">
                                <label class="control control--radio">Tôi đã đọc và đồng ý với <a class="fancybox" href="https://divineshop.vn/index.php?route=information/information/agree&amp;information_id=5" alt="Điều khoản dịch vụ"><b>Điều khoản dịch vụ</b></a>                                <input type="checkbox" name="agree" value="1" />
                                    <div class="control__indicator"></div>
                                </label>
                            </div>
                            <button type="button" class="btn btn-default btn-close-modal">Quay lại</button>
                        </div>
                    </div>
                </div>
            </div>

            <div id="modal-accept-facebook" class="modal" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close btn-close-modal">&times;</button>
                            <h4 class="modal-title">Vui lòng chấp nhận điều khoản để tiếp tục đăng nhập</h4>
                        </div>

                        <div class="modal-footer">
                            <div class="checkbox" id="checked_rules_facebook">
                                <label class="control control--radio">Tôi đã đọc và đồng ý với <a class="fancybox" href="https://divineshop.vn/index.php?route=information/information/agree&amp;information_id=5" alt="Điều khoản dịch vụ"><b>Điều khoản dịch vụ</b></a>                                <input type="checkbox" name="agree_fb" value="1" />
                                    <div class="control__indicator"></div>
                                </label>
                            </div>
                            <button type="button" class="btn btn-default btn-close-modal">Quay lại</button>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <script src="https://hgeqic7azi.vcdn.com.vn/catalog/view/theme/bigshop/js/jquery.autocomplete.js" type="text/javascript"></script>

        <script>
                                                                                var time_run_link = "5" * 1000;
                                                                                var lang = "vi";
                                                                                var check_login = true;
        </script>
        <script src="./assets/catalog/common/header.js?t=1594872832"></script>
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
                                    <li>
                                        <a href="/battle-net"><i class="icon icon-battle-net-svg"></i>
                                            <span>Game trên Battle.net</span></a>
                                    </li>
                                    <li>
                                        <a href="/index.php?route=product/category&amp;path=63&amp;filter_price_from=0&amp;filter_price_to=15000000&amp;sort=p.price&amp;order=ASC&amp;limit=24"><i class="fas fa-wallet"></i>
                                            <span>Steam Wallet</span></a>
                                    </li>
                                    <li>
                                        <a href="https://divineshop.vn/index.php?route=product/search&amp;search=gnmobile&amp;filter_price_from=0&amp;filter_price_to=2906000&amp;sort=p.sort_order&amp;order=ASC&amp;limit=48"><i class="fas fa-mobile-alt"></i>
                                            <span>Nạp Game Mobile</span></a>
                                    </li>
                                    <li>
                                        <a href="/index.php?route=product/search&amp;tag=garena"><i class="icon icon-garena-svg"></i>
                                            <span>Gói nạp Garena</span></a>
                                    </li>
                                    <li>
                                        <a href="/index.php?route=product/search&amp;search=gift%20card"><i class="fab fa-google-play"></i>
                                            <span>Google Play</span></a>
                                    </li>
                                    <li>
                                        <a href="/index.php?route=product/search&amp;search=moiviec&amp;filter_price_from=0&amp;filter_price_to=15000000&amp;sort=p.sort_order&amp;order=ASC&amp;limit=48"><i class="fas fa-magic"></i>
                                            <span>Tiện ích</span></a>
                                    </li>
                                    <li>
                                        <a href="/Nintendo-Eshop-Prepaid-Card-20"><i class="fas fa-wallet"></i>
                                            <span>Nintendo Eshop Card</span></a>
                                    </li>
                                </ul>
                            </div>
                        </div>

                        <div class="right-menu">
                            <div class="row menu-tab-all">
                                <div class="quick-menu head-link">
                                    <a href="/index.php?route=product/detail_product/bestsellers"><i class="fab fa-hotjar"></i><span>Mua nhiều trong 24h</span></a>
                                </div>
                                <div class="quick-menu head-link">
                                    <a href="/index.php?route=product/detail_product/sale"><i class="fas fa-award"></i><span>ĐANG KHUYẾN MẠI</span></a>
                                </div>
                                <div class="quick-menu head-link">
                                    <a href="/index.php?route=account/topup"><i class="far fa-credit-card"></i><span>Hình thức thanh toán</span></a>
                                </div>
                                <div class="quick-menu head-link">
                                    <a href="https://help.divineshop.vn/huong-dan-mua-hang/huong-dan-tao-tai-khoan"><i class="fas fa-gamepad"></i><span>Hướng dẫn mua hàng</span></a>
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
        <div class="trang-sp">

            <div class="container">

                <div id="alert-position"></div>
                <div class="container-title">
                    <h2 class="thanh-toan-title">Thanh Toán</h2><span class="count-san-pham">(2 sản phẩm)</span>
                    <div class="sort">
                        <a href="index.php?route=common/home"><div class="btn btn-aqua-bg">Tiếp tục mua hàng</div></a>
                    </div>
                </div>
                <hr>
                <div class="thanh-toan-container" id="order-detail">
                    <div class="border-cart-top"></div>
                    <div class="row cart-detail">
                        <!--Co ban Nam o day -->
                       9
                        <!---------------------------------------------------->
                    </div>


                    <div class="mb15"></div>
                    <input type="hidden" value="0" id="product_physical">

                    <div class="mb15"></div>
                    <div class="thanh-toan">
                        <div class="row">
                            <div class="col-md-12 col-xs-12 padd-0">
                                <div class="col-md-6 col-xs-12 padd-0">
                                    <div class="panel-group" id="accordion">
                                        <div class="panel panel-default">
                                            <div class="panel-heading">
                                                <h4 class="panel-title"><a href="#collapse-coupon" class="accordion-toggle" data-toggle="collapse" data-parent="#accordion"><strong>MÃ GIẢM GIÁ</strong></a></h4>
                                            </div>
                                            <div class="panel-body">
                                                <div class="input-group">
                                                    <input type="text" name="coupon" value="" placeholder="Nhập mã giảm giá..." id="input-coupon" class="form-control" />
                                                    <span class="input-group-btn">
                                                        <input type="button" value="Sử dụng" id="button-coupon" data-loading-text="Đang tải..." style="color: #fff;background-color: #21beff;border-color: #21beff;" class="btn btn-primary"  />
                                                    </span></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mb15"></div>
                                    <div class="panel-group">
                                        <div class="panel panel-default">

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
                                                    <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-item">
                                                        <div class="col-md-6 col-sm-6 col-xs-6 padd-0">
                                                            <span class="text-gray">Thành tiền sản phẩm</span>
                                                        </div>
                                                        <div class="col-md-6 col-sm-6 col-xs-6 padd-0 text-right">
                                                            <span class="thanh-tien">507.000đ</span>
                                                        </div>
                                                    </div>
                                                    <!-- Border BottomNét Đứt -->
                                                    <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash"></div>

                                                    <!-- Tổng Tiền -->
                                                    <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-item">
                                                        <div class="col-md-6 col-sm-6 col-xs-6 padd-0">
                                                            <div class="h16-md-26 text-gray-900">TỔNG TIỀN</div>
                                                        </div>
                                                        <div class="col-md-6 col-sm-6 col-xs-6 padd-0 text-right">
                                                            <div class="h16-bo-26 text-primary">507.000đ</div>
                                                        </div>
                                                    </div>

                                                    <!-- Border Bottom Nét Đứt -->
                                                    <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash"></div>

                                                    <!-- Border Bottom Nét Đứt -->
                                                    <div class="col-md-12 col-sm-12 col-xs-12 padd-0 margin-border-dash border-bottom-dash"></div>
                                                    <!-- Số Tiền Cần Nạp Thêm -->
                                                    <div class="col-md-12 col-sm-12 col-xs-12 padd-0" id="payment-confirm">
                                                        <a href="index.php?route=account/recharge">
                                                            <button type="button" class="btn btn-danger col-md-12 col-sm-12 col-xs-12"><strong style="color:#fff;">Nạp Thêm Tiền</strong></button>
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr>
                    <div class="mb15"></div>
                    <div class="buttons clearfix">
                        <div class="pull-left">
                            <a href="index.php?route=checkout/cart" class="btn btn-default">Quay lại giỏ hàng</a>
                        </div>
                        <div class="pull-right" id="total_payment">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="payment-confirm-data"></div>
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
        <script src="./assets/catalog/common/footer.js?t=1594872832"></script>

    </body>
</html>
