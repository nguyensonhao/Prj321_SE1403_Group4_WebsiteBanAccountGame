<%-- 
    Document   : EditProduct
    Created on : Jul 9, 2020, 6:35:23 PM
    Author     : Quang Hiển
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">  
        <title>Edit User</title>
        <meta name="description" content="">
        <meta name="author" content="templatemo">
        <!-- 
        Visual Admin Template
        http://www.templatemo.com/preview/templatemo_455_visual_admin
        -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/templatemo-style.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="templatemo-flex-row">
            <div class="templatemo-sidebar">
                <header class="templatemo-site-header">
                    <div class="square"></div>
                    <h1>Edit User</h1>
                </header>
                <div class="profile-photo-container">
                    <img src="images/profile-photo.jpg" alt="Profile Photo" class="img-responsive">
                    <div class="profile-photo-overlay"></div>
                </div>
                <!-- Search box -->
                <form class="templatemo-search-form" role="search">
                    <div class="input-group">
                        <button type="submit" class="fa fa-search"></button>
                        <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
                    </div>
                </form>
                <div class="mobile-menu-icon">
                    <i class="fa fa-bars"></i>
                </div>
                <nav class="templatemo-left-nav">
                    <ul>
                        <li><a href="IndexADM.jsp"><i class="fa fa-home fa-fw"></i>Home</a></li>
                        <li><a href="AddProduct.jsp"><i class="fa fa-database fa-fw"></i>Product</a></li>
                        <li><a href="ManageUsers.jsp" class="active"><i class="fa fa-users fa-fw"></i>Manage Users</a></li>
                        <li><a href="#">Settings</a></li>
                        <li><a href="/ADMController?page=home">Pages</a></li>
                        <li><a href="/ADMController?page=logout"><i class="fa fa-eject fa-fw"></i>Sign Out</a></li>
                    </ul>
                </nav>
            </div>
            <!--Main-->
            <div class="templatemo-content col-1 light-gray-bg">
                <div class="templatemo-top-nav-container">
                    <div class="row">
                        <nav class="templatemo-top-nav col-lg-12 col-md-12">
                            <ul class="text-uppercase">
                                <li><a href="" class="active">Admin panel</a></li>
                                <li><a href="">Dashboard</a></li>
                                <li><a href="">Overview</a></li>
                                <li><a href="login.jsp">Sign in form</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="templatemo-content-container">

                    <div class="templatemo-content-widget white-bg">
                        <h2 class="margin-bottom-10">Edit User</h2>
                        <p>Here goes another form and form controls.</p>
                        <form method="post" action="/ADMController">

                            <input type="hidden" name="page" value="edit_user">

                            <input type="hidden" name="id" value="<c:out value="${u.getuId()}"></c:out>"/>

                                <div class="row form-group">

                                    <div class="col-lg-6 col-md-6 form-group">   
                                        <label>User Name</label>
                                        <input type="text" class="form-control"  name="username" value="<c:out value="${u.getUserName()}"></c:out>" required >
                                    </div>
                                    <div class="col-lg-6 col-md-6 form-group">  
                                        <label>PassWord</label>
                                        <input type="text"class="form-control" name="password"value="<c:out value="${u.getPasWord()}"></c:out>"  required>
                                    </div>
                                </div>
                                <div class="row form-group">
                                    <div class="col-lg-6 col-md-6 form-group">   
                                        <label>Full Name</label>
                                        <input type="text" class="form-control"  name="fullname" value="<c:out value="${u.getuFullName()}"></c:out>" required >
                                    </div>
                                    <div class="col-lg-6 col-md-6 form-group"> 
                                        <label>BirthDay</label>
                                        <input type="date" class="form-control" name="birthDay" value="<c:out value="${u.getuBirthday()}"></c:out>"  required>
                                    </div>


                                </div>
                                <div class="row form-group">
                                    <div class="col-lg-6 col-md-6 form-group">  
                                        <label>Age</label>
                                        <input type="text"  class="form-control" name="age" value="<c:out value="${u.getuAge() }"></c:out>" required>
                                    </div>
                                    <div class="col-lg-6 col-md-6 form-group">  
                                        <label>Role</label>
                                        <input type="text"  class="form-control" name="role" value="<c:out value="${u.getRoles() }"></c:out>" required>
                                    </div>
                                </div>
                                <div class="row form-group">
                                    <div class="col-lg-6 col-md-6 form-group"> 
                                        <label>Phone Number</label>
                                        <input type="text" class="form-control"name="phone" value="<c:out value="${u.getuPhone() }"></c:out>" required>
                                    </div>
                                    <div class="col-lg-6 col-md-6 form-group"> 
                                        <label>Email</label>
                                        <input type="email"class="form-control" name="email" value="<c:out value="${u.getuEmail() }"></c:out>" required>
                                    </div>
                                </div>
                                <div class="row form-group">
                                    <div class="col-lg-6 col-md-6 form-group"> 
                                        <label>Address</label>
                                        <input type="text"class="form-control" name="address" value="<c:out value="${u.getuAdrress() }"></c:out>" required>
                                </div> 
                            </div>
                    </div>
                    <div class="form-group text-right">
                        <button type="submit" class="templatemo-blue-button" value="Process">Edit</button>
                        <button type="reset" class="templatemo-white-button">Reset</button>
                    </div>   
                    </form>
                </div>


                <footer class="text-right">
                    <p>Copyright &copy; 2020 Company Name 
                        | Designed by <a href="https://www.facebook.com/quanghien1107/" target="_parent">Development</a></p>
                </footer>

            </div>
        </div>
    </div>
    <!-- JS -->
    <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>        <!-- jQuery -->
    <script type="text/javascript" src="js/bootstrap-filestyle.min.js"></script>  <!-- http://markusslima.github.io/bootstrap-filestyle/ -->
    <script type="text/javascript" src="js/templatemo-script.js"></script>        <!-- Templatemo Script -->
</body>
</html>
