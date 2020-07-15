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
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> 
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <header>
           
            <nav>
                <ul>
                    <li><a href="IndexADM.jsp">Home</a></li>
                    <li><a href="AddProduct.jsp">Add Product</a></li>
                    <li><a href="#">Settings</a></li>
                    <li><a href="#">Pages</a></li>
                </ul>
            </nav>
        </header>
        
         <h1>
                Welcome admin
            </h1>
            <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="ds"/>

            <sql:query var="result" dataSource="${ds }">

            select * from product


            </sql:query>

        <div class="signup-header">
            <h2>Edit Product</h2>
        </div>
      
        <form method="post" action="AdminController">

            <input type="hidden" name="page" value="edit_product">

            <input type="hidden" name="id" value="<c:out value="${p.getpId()}"></c:out>">

            <div class="signup-group">
                <label>Name</label>
                <input type="text" name="name" value="<c:out value="${p.getName }"></c:out>" required>
            </div>
            <div class="signup-group">
                <label>Price</label>
                <input type="text" name="price" value="<c:out value="${p.getpPrice() }"></c:out>" required>
            </div>
             <div class="signup-group">
                <label>Type</label>
                <input type="text" name="type" value="<c:out value="${p.getpType() }"></c:out>" required>
            </div>
            <div class="signup-group">
                <label>Code Produce</label>
                <input type="text" name="codeproduce" value="<c:out value="${p.getCodeProduce() }"></c:out>" required>
            </div>
            <div class="signup-group">
                <label>Description</label>
                <input type="text" name="description" value="<c:out value="${p.getDescription() }"></c:out>" required>
            </div>
            
            <div class="signup-group">
                <label>Image</label>
                <img style="height: 160px;width: 160px;" src="<c:out value="${p.getpLImage() }"></c:out>">
            </div>
            <div class="signup-group">
                <label>Price Sale</label>
                <input type="text" name="sale" value="<c:out value="${p.getPpriceSale() }"></c:out>" required>
            </div>
   
            <div class="signup-group">
                <input type="submit" value="Process">	 
            </div>
        </form>

        <footer>
            <div class="footer"> &copy; 2020 Copyright:
               
            </div>
        </footer>
    </body>
</html>
