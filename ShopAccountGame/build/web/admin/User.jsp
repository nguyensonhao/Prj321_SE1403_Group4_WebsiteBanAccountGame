<%-- 
    Document   : User
    Created on : Jul 16, 2020, 5:59:26 PM
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
        <title>Manage Users</title>
        <meta name="description" content="">
        <meta name="author" content="templatemo">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/templatemo-style.css" rel="stylesheet">
    </head>
    <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="conn"/>
    <sql:update var="delete" dataSource="${conn}" sql="DELETE FROM `user`WHERE uId='${param.id}'"/>
    <sql:query var="result" dataSource="${conn }">
        select * from user ORDER BY uId ASC
    </sql:query>
    <body>  
        <!-- Left column -->
        <div class="templatemo-flex-row">
            <div class="templatemo-sidebar">
                <header class="templatemo-site-header">
                    <div class="square"></div>
                    <h1>Visual Admin</h1>
                </header>
                <div class="profile-photo-container">
                    <img src="images/profile-photo.jpg" alt="Profile Photo" class="img-responsive">  
                    <div class="profile-photo-overlay"></div>
                </div>      
                <div class="mobile-menu-icon">
                    <i class="fa fa-bars"></i>
                </div>
                <nav class="templatemo-left-nav">          
                    <li><a href="IndexADM.jsp"><i class="fa fa-home fa-fw"></i>Home</a></li>
                        <li><a href="AddProduct.jsp"><i class="fa fa-database fa-fw"></i>Add Product</a></li>
                        <li><a href="User.jsp" class="active"><i class="fa fa-users fa-fw"></i>Manage Users</a></li>
                        <li><a href="#">Settings</a></li>
                        <li><a href="#">Pages</a></li>
                        <li><a href="login.html"><i class="fa fa-eject fa-fw"></i>Sign Out</a></li>
                </nav>
            </div>
            <!-- Main content --> 
            <div class="templatemo-content col-1 light-gray-bg">
                <div class="templatemo-top-nav-container">
                    <div class="row">
                        <nav class="templatemo-top-nav col-lg-12 col-md-12">
                            <ul class="text-uppercase">
                               <li><a href="IndexADM.jsp" >Admin panel</a></li>
                                <li><a href="ManageUsers.jsp"class="active">Overview</a></li>
                                <li><a href="/ADMController?page=logout">Sign in form</a></li>
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
                                        <td>BirthDay</td>
                                        <td>Age</td>
                                        <td>Phone Number</td>
                                        <td>Email</td>
                                        <td>Address</td>
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
                                            <td ><a href="/ADMController?page=edit&id=${row.uId}"class="templatemo-edit-btn">Edit</a> <hr>
                                            <a href="?id=${row.uId}" class="templatemo-edit-btn">Delete</a></td>
                                        </tr>
                                    </c:forEach>   
                                </tbody>
                            </table>    
                        </div>                          
                    </div>          
                    <div class="templatemo-flex-row flex-content-row">                                       
                    </div> <!-- Second row ends -->                    
                    <footer class="text-right">
                        <p>Copyright &copy; 2084 Company Name 
                            | Designed by <a href="http://www.templatemo.com" target="_parent">templatemo</a></p>
                    </footer>         
                </div>
            </div>
        </div>

        <!-- JS -->
        <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>      <!-- jQuery -->
        <script type="text/javascript" src="js/templatemo-script.js"></script>      <!-- Templatemo Script -->

    </body>
</html>
