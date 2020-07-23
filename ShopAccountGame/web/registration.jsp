<%-- 
    Document   : REGISTRATION
    Created on : Jul 18, 2020, 10:17:39 PM
    Author     : NhatCuong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Colorlib Templates">
        <meta name="author" content="Colorlib">
        <meta name="keywords" content="Colorlib Templates">

        <!-- Title Page-->
        <title>Au Register Forms by Colorlib</title>

        <!-- Icons font CSS-->
        <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
        <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
        <!-- Font special for pages-->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

        <!-- Vendor CSS-->
        <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
        <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

        <!-- Main CSS-->
        <link href="css/main.css" rel="stylesheet" media="all">

    </head>
    <body>
        <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
            <div class="wrapper wrapper--w790">
                <div class="card card-5">
                    <div class="card-heading">
                        <h2 class="title">Event Registration Form</h2>
                    </div>
                    <div class="card-body">
                        <form method="POST" action="/LoginController">
                            <input type="hidden" name="page" value="registration">
                            <input type="hidden" name="role" value="2">
                            
                            <div class="form-row">
                                <div class="name">Full Name</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="text" name="fullname" required>
                                        <label class="label--desc">Full Name</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="name">User Name</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="text" name="username" required>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="name">PassWord</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="password" name="pass1"required>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="name">Confirm Passowrd</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="password" name="pass2"required>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="name">Age</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="text" name="age"required>
                                    </div>
                                </div>
                            </div>
                              <div class="form-row">
                                <div class="name">Birthday</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="date" name="birthday"required>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="name">Phone</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="text" name="phone"required>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="name">Email</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="email" name="email"required>
                                    </div>
                                </div>
                            </div>
                             <div class="form-row">
                                <div class="name">Address</div>
                                <div class="value">
                                    <div class="input-group">
                                        <input class="input--style-5" type="text" name="address" required>
                                    </div>
                                </div>
                            </div>
                            <div>
                                <button class="btn btn--radius-2 btn--red" type="submit">Register</button>
                                <button class="btn btn--radius-2 btn--red" type="reset">Reset</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Jquery JS-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <!-- Vendor JS-->
        <script src="vendor/select2/select2.min.js"></script>
        <script src="vendor/datepicker/moment.min.js"></script>
        <script src="vendor/datepicker/daterangepicker.js"></script>

        <!-- Main JS-->
        <script src="js/global.js"></script>

    </body>
</html>
