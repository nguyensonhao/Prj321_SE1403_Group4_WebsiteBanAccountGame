<%-- 
    Document   : AddProduct
    Created on : Jul 9, 2020, 6:24:21 PM
    Author     : Quang Hiển
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">  
        <title>Visual Admin Dashboard - Home</title>
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
        <!-- Left column -->
        <div class="templatemo-flex-row">
            <div class="templatemo-sidebar">
                <header class="templatemo-site-header">
                    <div class="square"></div>
                    <h1>Add Product</h1>
                </header>
                <div class="profile-photo-container">
                    <img src="images/profile-photo.jpg" alt="Profile Photo" class="img-responsive">
                    <div class="profile-photo-overlay"></div>
                </div>
                <div class="mobile-menu-icon">
                    <i class="fa fa-bars"></i>
                </div>
                <nav class="templatemo-left-nav">
                    <ul>
                        <li><a href="IndexADM.jsp"><i class="fa fa-home fa-fw"></i>Home</a></li>
                        <li><a href="AddProduct.jsp"><i class="fa fa-database fa-fw"></i>ADD Product</a></li>
                        <li><a href="User.jsp" class="active"><i class="fa fa-users fa-fw"></i>Manage Users</a></li>
                        <li><a href="#">Settings</a></li>
                        <li><a href="#">Pages</a></li>
                        <li><a href="login.html"><i class="fa fa-eject fa-fw"></i>Sign Out</a></li>
                    </ul>
                </nav>
            </div>
            <!-- Main content -->
            <div class="templatemo-content col-1 light-gray-bg">
                <div class="templatemo-top-nav-container">
                    <div class="row">
                        <nav class="templatemo-top-nav col-lg-12 col-md-12">
                            <ul class="text-uppercase">
                                <li><a href="" class="active">Admin panel</a></li>
                                <li><a href="">Dashboard</a></li>
                                <li><a href="">Overview</a></li>
                                <li><a href="login.html">Sign in form</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="templatemo-content-container">
                    <tbody>
                    <div class="templatemo-content-widget white-bg">
                        <h2 class="margin-bottom-10">Add Product</h2>
                        <p>Here goes another form and form controls.</p>
                        
                        <form method="post" action="/ADMController">
                            <input type="hidden" name="page" value="add_product">
                            <div class="row form-group">
                                <div class="col-lg-6 col-md-6 form-group">                  
                                    <label>Name</label>
                                    <input type="text" class="form-control" name="name" placeholder="product name goes here">                  
                                </div>
                                <div class="col-lg-6 col-md-6 form-group">                  
                                    <label>Price</label>
                                    <input type="text" class="form-control" name="price" placeholder="product price">                  
                                </div> 
                            </div>
                            <div class="row form-group">
                                <div class="col-lg-6 col-md-6 form-group">                  
                                    <label >Type</label>
                                    <input type="text" class="form-control" name="type"  placeholder="product Type">                  
                                </div>
                                <div class="col-lg-6 col-md-6 form-group">                  
                                    <label>Description</label>
                                    <input type="text" class="form-control" name="description" placeholder="product Description">                  
                                </div> 
                            </div>                      
                            <div class="row form-group">
                                <div class="col-lg-6 col-md-6 form-group">                     
                                    <label class="control-label">Price Sale</label>
                                    <input type="text"  name="Sale" class="form-control " placeholder="product price Sale" >
                                </div>
                            </div>
                            
                            <div class="row form-group">
                                <div class="col-lg-12 form-group">                   
                                    <label>Code Produce</label>
                                    <textarea <input type="text" name="codeproduce" placeholder="product Code Produce" 
                                                     class="form-control" rows="3" required></textarea>
                                </div>
                            </div>


                            <div class="row form-group">
                                <div class="col-lg-12">
                                    <label >File Input</label> 
                                    <!-- <input type="file" name="fileToUpload" id="fileToUpload" class="margin-bottom-10"> -->
                                    <input type="text"  name="image" class="filestyle">
                                    <p>Maximum upload size is 5 MB.</p>                  
                                </div>
                            </div>
                            <div class="form-group text-right">
                                <button type="submit" class="templatemo-blue-button" value="Process">Upload</button>
                                <button type="reset" class="templatemo-white-button">Reset</button>
                            </div>                           
                        </form>
                    </div>
                </tbody>
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