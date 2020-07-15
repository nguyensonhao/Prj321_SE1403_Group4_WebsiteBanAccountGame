<%-- 
    Document   : CreateAccount
    Created on : Jul 10, 2020, 7:52:10 PM
    Author     : Nhat Cuong
--%>

<%@page import="java.util.Objects"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.User"%>
<%@page import="ModelDao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
        <title>Create Account</title>
        <script type="text/javascript">


//check validation
            $(document).ready(function () {
                $("#form").validate({
                    rules: {
                        //check username input cannot null, min length 2 and max length 30
                        txtUser: {
                            required: true,
                            minlength: 2,
                            maxlength: 30,
                        },
                        /**
                         * check password input cannot null, min length 8 and max length 30, 
                         * and check password must have a lowercase, a uppercase letter, a digit and special characters
                         */
                        password: {
                            required: true,
                            minlength: 8,
                            maxlength: 20,
                            checkpass: true
                        },
                        //check re_password
                        ConfirmPassword: {
                            required: true,
                            equalTo: "#password"
                        },
                        //check email not null and must valid email
                        email: {
                            required: true,
                            checkemail: true
                        },
                        //check firstname not null
                        fname: {
                            required: true
                        },
                        //cehck lastname not null
                        lname: {
                            required: true
                        },
                        //check website valid
                        website: {
                            required: true,
                            checkwebsite: true
                        },
                    },
                    messages: {
                        //message warning input username
                        txtUser: {
                            required: "Please enter username",
                            minlength: "Username must be greater than 1 character",
                            maxlength: "Username must be smailler than 30 characters"
                        },
                        //message warning input password
                        password: {
                            required: "Please enter password",
                            minlength: "Password must be greater than 8 characters",
                            maxlength: "Password must be smaller than 20 characters",
                            checkpass: "Password must have a lowercase, a uppercase letter, a digit and special characters!"
                        },
                        //message warning input re-password
                        ConfirmPassword: {
                            required: "Please enter re-password",
                            equalTo: "Re-password incorrect"
                        },
                        //message warning input email
                        email: {
                            required: "Please enter email",
                            checkemail: "Email invalid please enter again"
                        },
                        //message warning input first name
                        fname: {
                            required: "Please enter first name"
                        },
                        //message warning input last name
                        lname: {
                            required: "Please enter last name"
                        },
                        //message warning input website:
                        website: {
                            required: "Please enter website",
                            checkwebsite: "Invalid web"
                        },
                    }
                });
                //check password
                $.validator.addMethod("checkpass", function (value) {
                    return /^[A-Za-z0-9\d=!\-@._*]*$/.test(value) // check consists of only these
                            && /[A-Z]/.test(value) //check uppercase letter
                            && /\d/.test(value) // check has a digit
                            && /[a-z]/.test(value) //check lowercase letter
                });
                //check email valid
                $.validator.addMethod("checkemail", function (value) {
                    var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/; // regex check email
                    return emailReg.test(value);
                });
                //check website valid
                $.validator.addMethod("checkwebsite", function (value) {
                    var websiteReg = /^(https?:\/\/)?([\da-z\.-]+)\.([a-z\.]{2,6})([\/\w \.-]*)*\/?$/; // regex check website
                    return websiteReg.test(value);
                });
                //create check click checkbox send or not 
                $("#send").click(function (evt) {
                    if ($("input[type=checkbox]").is(":unchecked")) {
                        document.getElementById("send-error").style.display = "block";
                        evt.preventDefault();
                    }
                });
                function validateMyForm() {
                    if ($("input[type=checkbox]").is(":unchecked")) {
                        return false;
                    }
                    return true;
                }
            });
        </script>
        <style>
            #txtUser-error{
                font-weight: normal;
                color: red;
            }
            #email-error{
                font-weight: normal;
                color: red;
            }
            #fname-error{
                font-weight: normal;
                color: red;
            }
            #lname-error{
                font-weight: normal;
                color: red;
            }
            #password-error{
                font-weight: normal;
                color: red;
            }
            #RepPassword-error{
                font-weight: normal;
                color: red;
            }
            #website-error{
                font-weight: normal;
                color: red;
            }
            #send-error{
                font-weight: normal;
                color: red;
            }
            #ConfirmPassword-error {
                font-weight: normal;
                color: red;
            }
        </style>
        <style>
            .img{
                width: 64px;
                height: 64px;
            }
            @-webkit-keyframes example {
                0%   {color: #1CDCE2FF;}
                25%  {color: #EDDB11FF;}
                50%  {color: #CB0FEFFF;}
                100% {color: green;}
            }
            @-webkit-keyframes exampleq {
                0%   {background-color: #1CDCE2FF;}
                25%  {background-color: #EDDB11FF;}
                50%  {background-color: #CB0FEFFF;}
                100% {background-color: green;}
            }
            .hihi{
                display: block;
                font-size: 30px;
                font-weight: 700;
                letter-spacing: 18px;
                -webkit-animation-name: example;
                animation-name: example;
                -webkit-transform-origin: center bottom;
                transform-origin: center bottom;
                animation-duration: 2s;
                animation-iteration-count: infinite;
            }
        </style>    
    </head>
    <body>
        <div class="container" style="background-image: url('Asset/images/bg-2.jpg'); background-position: center;">

            <div class="jumbotron" style="background-color: #b2eddb;">
                <a class="black-text" href="index.jsp">Trang chủ</a>
                <h2 style="text-align: center; color: #cc0099;font-size: 50px" class="hihi">Đăng Ký Tài Khoản</h2>            </div>

            <form onsubmit="validateMyForm();" class="form-horizontal" id="form" action="add-new-user.jsp" method="POST">
                <fieldset>
                    <div id="legend">

                    </div>
                    <div class="control-group">
                        <!-- Username -->
                        <label class="control-label"  for="uFullName">Họ và Tên</label>
                        <div class="controls">
                            <input type="text" id="fname" name="uFullName" placeholder="" class="input-xlarge" value="<%=   Objects.isNull(session.getAttribute("uFullName")) ? "" : session.getAttribute("uFullName")%>">
                        </div>
                    </div>
                    <div class="control-group">

                        <!-- Username -->
                        <label class="control-label"  for="userName">Tài Khoản</label>
                        <div class="controls">
                            <input type="text" id="txtUser" name="userName" placeholder="" class="input-xlarge" value="<%=Objects.isNull(session.getAttribute("txtUser")) ? "" : session.getAttribute("txtUser")%>">
                            <font color='red'><label id="send-error-user" class="error" for="checksend" style="display: none"></label></font>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Password-->
                        <label class="control-label" for="password">Mật Khẩu</label>
                        <div class="controls">
                            <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Password -->
                        <label class="control-label"  for="password_confirm">Nhập Lại Mật Khẩu</label>
                        <div class="controls">
                            <input type="password" id="ConfirmPassword" name="ConfirmPassword" placeholder="" class="input-xlarge">
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Username -->
                        <label class="control-label"  for="age">Tuổi</label>
                        <div class="controls">
                            <input type="number" id="website" name="age" placeholder="" class="input-xlarge" value="<%=Objects.isNull(session.getAttribute("uAge")) ? "" : session.getAttribute("uAge")%>">
                            <font color='red'><label id="send-error" class="error" for="checksend" style="display: none"></label></font>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Username -->
                        <label class="control-label"  for="phone">Số điện thoại</label>
                        <div class="controls">
                            <input type="number" id="website" name="phone" placeholder="" class="input-xlarge" value="<%=Objects.isNull(session.getAttribute("uPhone")) ? "" : session.getAttribute("uPhone")%>">
                            <font color='red'><label id="send-error" class="error" for="checksend" style="display: none"></label></font>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Email -->
                        <label class="control-label" for="email">Email</label>
                        <div class="controls">
                            <input type="email" id="email" name="email" placeholder="" class="input-xlarge" value="<%=Objects.isNull(session.getAttribute("uEmail")) ? "" : session.getAttribute("uEmail")%>">
                            <font color='red'><label id="send-error-email" class="error" for="checksend" style="display: none"></label></font>
                        </div>
                    </div>
                    <div class="control-group">

                        <!-- Username -->
                        <label class="control-label"  for="address">Địa Chỉ</label>
                        <div class="controls">
                            <input type="text" id="txtUser" name="txtUser" placeholder="" class="input-xlarge" value="<%=Objects.isNull(session.getAttribute("uAddress")) ? "" : session.getAttribute("uAddress")%>">
                            <font color='red'><label id="send-error-user" class="error" for="checksend" style="display: none"></label></font>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Email -->
                        <label class="control-label" for="birthday">Ngày Sinh</label>
                        <div class="controls">
                            <input type="date" id="birthday" name="birthday" placeholder="" class="input-xlarge" value="<%=Objects.isNull(session.getAttribute("uBirthday")) ? "" : session.getAttribute("uBirthday")%>">
                            <font color='red'><label id="send-error-email" class="error" for="checksend" style="display: none"></label></font>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Button add-->
                        <div class="controls">
                            <button class="btn btn-success" id="send">Đăng Ký</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
        <%
            //check if create account username was exist!
            if (request.getParameter("checkUser") != null) {
        %>
        <script type="text/javascript">

            document.getElementById("send-error-user").innerHTML = "Username is exist already.";
            document.getElementById("send-error-user").style.display = "block";

        </script>
        <%
        } else if (request.getParameter("checkEmail") != null) {
        %>

        <script  type = "text/javascript" >

            document.getElementById("send-error-email").innerHTML = "Email is exist already.";
            document.getElementById("send-error-email").style.display = "block";

        </script>

        <%
            }
        %>
    </body>
</html>


