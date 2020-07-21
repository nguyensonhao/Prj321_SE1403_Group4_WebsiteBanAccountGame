<%-- 
    Document   : ManageUsers
    Created on : Jul 20, 2020, 4:30:06 PM
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
                    <h1>User </h1>
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
                        <li><a href="ManageUsers.jsp"class="active"><i class="fa fa-users fa-fw"></i>Manage Users</a></li>
                        <li><a href="#">Settings</a></li>
                        <li><a href="/ADMController?page=home">Pages</a></li>
                        <li><a href="/ADMController?page=logout"><i class="fa fa-eject fa-fw"></i>Sign Out</a></li>
                    </ul>

                    <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="conn"/>
                    <sql:update var="delete" dataSource="${conn}" sql="DELETE FROM `user`WHERE uId='${param.id}'"/>
                    <sql:query var="result" dataSource="${conn }">
                        SELECT * FROM `user` INNER JOIN role ON role.rId = user.rId ORDER BY uId ASC
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
                <div class="templatemo-content-container">
                    <div class="templatemo-content-widget no-padding">
                        <div class="panel panel-default table-responsive">

                            <table class="table table-striped table-bordered templatemo-user-table">
                                <thead>
                                     <tr>
                                        <td>No</td>
                                        <td>Full Name</td>
                                        <td>User Name</td>
                                        <td>PassWord</td>
                                        <td>BirthDay</td>
                                        <td>Age</td>
                                        <td>Phone Number</td>
                                        <td>Email</td>
                                        <td>Address</td>
                                        <td>Role</td>
                                        <td>Option</td>
                                    </tr>
                                </thead>

                                <tbody>
                                     <c:forEach items="${result.rows }" var="row">
                                        <tr>
                                            <td ><c:out value="${row.uId }"></c:out></td>
                                            <td ><c:out value="${row.uFullName }"></c:out></td>
                                            <td ><c:out value="${row.userName }"></c:out></td>
                                            <td ><c:out value="${row.uPassWord }"></c:out></td>
                                            <td ><c:out value="${row.uBirthday}"/></td> 
                                            <td ><c:out value="${row.uAge }"></c:out></td>
                                            <td ><c:out value="${row.uPhone}"/></td>
                                            <td ><c:out value="${row.uEmail}"/></td>
                                            <td ><c:out value="${row.uAddress}"/></td>
                                            <td ><c:out value="${row.NameRole}"/></td>
                                            <td ><a href="/ADMController?page=edit_u&uid=${row.uId}"class="templatemo-edit-btn">Edit</a> <hr>
                                                <a href="?id=${row.uId}" class="templatemo-edit-btn">Delete</a></td>
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
