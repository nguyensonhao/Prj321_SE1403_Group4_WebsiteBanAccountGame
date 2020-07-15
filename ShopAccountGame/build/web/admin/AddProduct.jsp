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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> 
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <header>
            <h1>
                Welcome admin
            </h1>
            <nav>
                <ul>
                    <li><a href="IndexADM.jsp">Home</a></li>
                    <li><a href="AddProduct.jsp">Add Product</a></li>
                    <li><a href="#">Settings</a></li>
                    <li><a href="#">Pages</a></li>
                </ul>
            </nav>
        </header>

        <div class="signup-header">
            <h2>Add Product</h2>
        </div>

        <form method="post" action="AdminProduce">

            <input type="hidden" name="page" value="add_product">

            <div class="signup-group">
                <label>Name</label>
                <input type="text" name="name" placeholder="product name goes here"  required>
            </div>
            <div class="signup-group">
                <label>Price</label>
                <input type="text" name="price" placeholder="product price" required>
            </div>
            <div class="signup-group">
                <label>Type</label>
                <input type="text" name="type" placeholder="product Type" required>
            </div>

            <div class="signup-group">
                <label>Description</label>
                <input type="text" name="description" placeholder="product Description" required>
            </div>
            <div class="signup-group">
                <label>Code Produce</label>
                <input type="text" name="codeproduce" placeholder="product Code Produce" required>
            </div>
            <div class="signup-group">
                <label for="fileupload"> Select an image to upload</label>
                <input type="file" name="image" required><br>
            </div>
             <div class="signup-group">
                <label>Price Sale</label>
                <input type="text" name="Sale" placeholder="product price Sale" required>
            </div>
            <div class="signup-group">
                <input type="submit" value="Process">	 
            </div>
        </form>

        <footer style="position: absolute;left: 0;bottom: 0;width: 100%;">
            <div class="footer"> &copy; 2020 Copyright:
            </div>
        </footer>
    </body>
</html>