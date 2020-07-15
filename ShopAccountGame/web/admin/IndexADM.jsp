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
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> 
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <form action="Admin" method="post">
        <header>
            <h1>
                Welcome admin
            </h1>
            
            <nav>
                <ul>
                    <li><a href="admin?page=index">Home</a></li>
                    <li><a href="/admin?page=addproduct">Add Product</a></li>
                    <li><a href="#">Settings</a></li>
                    <li><a href="#">Pages</a></li>
                </ul>
            </nav>
        </header>

        <sql:setDataSource user="root" password="" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/shopacc" var="ds"/>

        <sql:query var="result" dataSource="${ds }">

            select * from product


        </sql:query>



        <div class="container">
            <h2>Products List:</h2>
            <table>
                <tr>
                    <th>Item id</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Type</th>
                    <th>Description</th>
                    <th>Code Produce</th>
                    <th>Image</th>
                    <th>Price Sale</th>
                    <th>Option</th>
                </tr>
            </table>

            <c:forEach items="${result.rows }" var="row">
                <table style="table-layout: fixed;width: 100%;">

                    <tr>
                        <td style="width: 50px;"><c:out value="${row.pId }"></c:out></td>
                        <td style="width: 100px;"><c:out value="${row.pName }"></c:out></td>
                        <td style="width: 100px;"><c:out value="${row.pPrice }"></c:out></td>
                        <td style="width: 100px;"><c:out value="${row.pType }"/></td>
                        <td style="width: 100px;"><c:out value="${row.pDescription}"/></td>
                        <td style="width: 100px;"><c:out value="${row.codeProduce}"/></td>
                        <td style="width: 100px;"><img src="${row.pImage}" height="100" width="150" ></td>
                        <td style="width: 100px;"><c:out value="${row.PpriceSale}"/></td>

                        <td style="width: 100px;"><a href="/admin/EditProduct.jsp?page=edit&id=${row.pId}" style="color: #6bb1f8;">edit</a> ||
                            <a href="<%= request.getContextPath()%>/admin?page=delete&id=${row.pId}" style="color:#6bb1f8;">delete</a></td>
                    </tr>
                </table>
            </c:forEach>
        </div>
        <footer>
            <div class="footer"> &copy; 2020Copyright:

            </div>
        </footer>
            </form>
    </body>
</html>