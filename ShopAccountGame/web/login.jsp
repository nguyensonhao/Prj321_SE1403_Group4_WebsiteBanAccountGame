<%-- 
    Document   : login
    Created on : Jul 8, 2020, 8:06:40 PM
    Author     : NhatCuong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Đăng Nhập</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="Asset/images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Asset/vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Asset/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Asset/fonts/iconic/css/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Asset/vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="Asset/vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Asset/vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Asset/vendor/select2/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="Asset/vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Asset/css/util.css">
        <link rel="stylesheet" type="text/css" href="Asset/css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100" style="background-image: url('images/bg-01.jpg');">
                <div class="wrap-login100">
                    <div class="login100-pic js-tilt" data-tilt>
                        <img src="Asset/images/img-01.png" alt="IMG">
                    </div>

                    <form class="login100-form validate-form" method="post" action="/LoginController">
                        <input type="hidden" name="page" value="login-form">
                        
                        <span class="login100-form-logo">
                            <i class="zmdi zmdi-landscape"></i>
                        </span>

                        <span class="login100-form-title p-b-34 p-t-27">
                            Đăng Nhập
                        </span>

                        <div class="wrap-input100 validate-input" data-validate = "Enter username">
                            <input class="input100" type="text" name="txtUser" placeholder="Tài Khoản">
                            <span class="focus-input100" data-placeholder="&#xf207;"></span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate="Password is required">
                            <input class="input100" type="password" name="txtPassword" placeholder="Mật Khẩu">
                            <span class="focus-input100" data-placeholder="&#xf191;"></span>
                        </div>

                        <div class="contact100-form-checkbox">
                            <input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
                            <label class="label-checkbox100" for="ckb1">
                                Nhớ Tài Khoản
                            </label>
                        </div>
                        <div align="center"><font color='red'><label id="send-error" class="error" for="checksend" style="display: block"></label></font></div><br>
                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn">
                                Đăng Nhập
                            </button>
                        </div>

                        <div class="text-center p-t-90">
                            <a class="txt1" href="/registration.jsp">
                                REGISTRATION
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>


        <div id="dropDownSelect1"></div>

        <!--===============================================================================================-->
        <script src="Asset/vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="Asset/vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="Asset/vendor/bootstrap/js/popper.js"></script>
        <script src="Asset/vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="Asset/vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="Asset/vendor/daterangepicker/moment.min.js"></script>
        <script src="Asset/vendor/daterangepicker/daterangepicker.js"></script>
        <!--===============================================================================================-->
        <script src="Asset/vendor/countdowntime/countdowntime.js"></script>
        <!--===============================================================================================-->
        <script src="Asset/js/main.js"></script>

    </body>
</html>

