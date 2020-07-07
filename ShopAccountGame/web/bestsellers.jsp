<%-- 
    Document   : bestseller
    Created on : Jul 6, 2020, 2:59:12 PM
    Author     : Hao Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    $(document).ready(function() {
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

      $(".home-mini-profile" ).hover(
        function() {
          $( '.drop-mini-profile' ).css("display","block");
        }, function() {
          $( '.drop-mini-profile' ).css("display","none");
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

      $("#notification" ).on('click', function() {
        $('#count_unread').text('');
        $('.notification span').removeClass('visible');

        updateCountNotification();
      });

      $('#show-list-notification').on('click', function () {
        $('.drop-mini-notification').toggle();
      });

      window.addEventListener('click', function(e){
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
        $('body').css('position','unset');
      });

      $('#sidebarCollapse').on('click', function () {
        $('#sidebar').addClass('active');
        $('.overlay').addClass('active');
        $('.collapse.in').toggleClass('in');
        $('a[aria-expanded=true]').attr('aria-expanded', 'false');
        $('body').css('position','fixed');
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

<style>
    .banner-home .menu-2 .header-menu div.nav-menu {
        display: none;
        height: auto;
        margin: auto;
        width: 100%;
    }
</style>

<script>
    $("#category-product" ).hover(
        function() {
            $(this).css("cursor","pointer");
            $('.drop-category').css("display","grid");
        }, function() {
            $( '.drop-category' ).css("display","none");
        }
    );
</script>
<div class="container">
    <div style="text-align:center;margin-bottom:22px;">
        <strong><h1>Được Mua Nhiều</h1></strong>
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
            <strong><h4>Sản phẩm thỏa điều kiện tìm kiếm (39 sản phẩm )</h4></strong>
        </div>
    </div>

    <div class="list-sp">
        <div class="next-page-product4" style="display:none;">1</div>
        <div class="list-container">
            <div class="row fix-margin">
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="hinh anh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">  
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>

                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>

                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>

                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="Link thanh toan">
                                <img class="check_img_errs" src="Link hinh" alt="ten kem gia" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="Link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">Gia</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="Link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="Link thanh toan">
                                <img class="check_img_errs" src="Link hinh" alt="Ten" title="Ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="Link thanh toan">Ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">Gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>

                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link">
                                <img class="check_img_errs" src="hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="Link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">gia cu
                                    <span class="cur-p">Gia hien tai</span>
                                    <span class="old-p"></span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                < <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
              <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                 <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                 <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                 <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
                 <div class="col-lg-3 col-md-4 col-sm-6 col-xs-6 item-frames">
                    <div class="item-game-wrapper">
                        <div class="img">
                            <a href="link thanh toan">
                                <img class="check_img_errs" src="link hinh" alt="ten" title="ten" />
                            </a>
                        </div>
                        <div class="item-info">
                            <div class="item-title">
                                <a href="link thanh toan">ten</a>
                            </div>
                            <div class="item-price">
                                <p class="price">
                                    <span class="cur-p">gia moi</span>
                                    <span class="old-p">gia cu</span>
                                </p>
                            </div>
                            <div class="item-btn-a">
                                    <i class="fas fa-shopping-cart"></i></a>
                            </div>
                            <div class="item-btn" style="margin-top: 10px">Mua ngay</div>
                        </div>
                    </div>
                </div>
                
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
