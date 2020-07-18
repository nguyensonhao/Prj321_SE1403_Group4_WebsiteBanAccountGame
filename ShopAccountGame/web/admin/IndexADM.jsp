<%-- 
    Document   : IndexADM
    Created on : Jul 9, 2020, 6:47:40 PM
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
        <div class="templatemo-flex-row">
            <div class="templatemo-sidebar">
                <header class="templatemo-site-header">
                    <div class="square"></div>
                    <h1>Admin</h1>
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
                        <li><a href="AddProduct.jsp"><i class="fa fa-database fa-fw"></i>Product</a></li>
                        <li><a href="User.jsp" class="active"><i class="fa fa-users fa-fw"></i>Manage Users</a></li>
                        <li><a href="#">Settings</a></li>
                        <li><a href="#">Pages</a></li>
                        <li><a href="login.html"><i class="fa fa-eject fa-fw"></i>Sign Out</a></li>
                    </ul>

                    <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="conn"/>
                    <sql:query var="result" dataSource="${conn }">
                        select * from product ORDER BY pId ASC

                    </sql:query>
                </nav>
            </div>
            <div class="templatemo-content col-1 light-gray-bg">
                <div class="templatemo-top-nav-container">
                    <div class="row">
                        <nav class="templatemo-top-nav col-lg-12 col-md-12">
                            <ul class="text-uppercase">
                                <li><a href="" class="active">Admin panel</a></li>
                                <li><a href="">Dashboard</a></li>
                                <li><a href="">Overview</a></li>
                                <li><a href="login.html">Sign in form</a></li>
                                <li><a href="?rs=">Sign in form</a></li>
                            </ul>  
                        </nav> 
                    </div>
                </div>
                <div class="templatemo-content-container-p10">
                    <div class="templatemo-content-widget no-padding">
                        <div class="panel panel-default table-responsive">

                            <table class="table table-striped table-bordered templatemo-user-table">
                                <thead>
                                    <tr>
                                        <td>Item id</td>
                                        <td>Name</td>
                                        <td>Price</td>
                                        <td>Quantity</td>
                                        <td>Type</td>
                                        <td>Description</td>
                                        <td>Description Detail</td>
                                        <td>Code Produce</td>
                                        <td>Image</td>
                                        <td>Price Sale</td>
                                        <td>Option</td>

                                    </tr>
                                </thead>

                                <tbody>
                                    <c:forEach items="${result.rows }" var="row">
                                        <tr>
                                            <td ><c:out value="${row.pId }"></c:out></td>
                                            <td ><c:out value="${row.pName }"></c:out></td>
                                            <td ><c:out value="${row.pPrice }"></c:out></td>
                                            <td ><c:out value="${row.quantity }"></c:out></td>
                                            <td ><c:out value="${row.pType}"/></td>
                                            <td ><c:out value="${row.pDescription}"/></td>
                                            <td ><c:out value="${row.dId }"></c:out></td>
                                            <td ><c:out value="${row.codeProduce}"/></td>
                                            <td ><img src="${row.pImage}" height="100" width="150" ></td>
                                            <td ><c:out value="${row.PpriceSale}"/></td>

                                            <td ><a href="/ADMController?page=edit&id=${row.pId}"class="templatemo-edit-btn">Edit</a>
                                                <hr>
                                                <a href="/ADMController?page=delete&id=${row.pId}" class="templatemo-edit-btn">Delete</a></td>
                                        </tr>
                                    </c:forEach>   
                                </tbody>

                            </table>   
                        </div>     
                    </div>
                </div>           
            </div>
        </div>
        <footer>
            <div class="footer"> &copy; 2020Copyright:
            </div>
        </footer>
    </body>
</html>