<%-- 
    Document   : cart2
    Created on : Jul 21, 2020, 8:35:18 AM
    Author     : Hao Nguyen 
--%>

<%@page import="Model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Bill"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 class="text-center">Giỏ Hàng</h2>
        <div class="container"> 
            <table id="cart" class="table table-hover table-condensed"> 
                <thead> 
                    <tr> 
                        <th style="width:50%">Tên sản phẩm</th> 
                        <th style="width:10%">Giá</th> 
                        <th style="width:8%">Số lượng</th> 
                        <th style="width:22%" class="text-center">Thành tiền</th> 
                        <th style="width:10%"> </th> 
                    </tr> 
                </thead> 
                
                <tbody>

                   <sql:setDataSource var="conn" driver = "com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost/shopacc"
                           user="root" password="" scope="page"/>
                   <sql:update var="delete" dataSource="${conn}" sql="DELETE FROM `bill` WHERE bId='${param.bId}'"/> 
                   <sql:query var="result" dataSource="${conn}">
                         SELECT * FROM `bill`
                    </sql:query>
                     
                     <c:forEach items="${result.rows}" var="row">
                    <tr> 
                        <td data-th="Product"> 
                            <div class="row"> 
                                <div class="col-sm-2 hidden-xs"><img src="${row.pImage}" alt="" class="img-responsive" width="100">
                                </div> 
                                <div class="col-sm-10"> 
                                    <h4 class="nomargin"> ${row.pName}</h4> 
                                    <p> </p> 
                                </div> 
                            </div> 
                        </td> 
                        <td data-th="Price">${row.pPrice}</td> 
                        <td data-th="Quantity">${row.bQuantity}
                        </td> 
                        <td data-th="Subtotal" class="text-center">${row.bQuantity * row.pPrice}</td> 
                        <td  > 
                            <button  onclick="window.location.href='cart.jsp?bId=${row.bId}'"><i class="far fa-times-circle"></i>                                     
                                   </button>    
                                   <!--<button onclick="window.location.href='cart.jsp?bId=${row.bId}'">Delete</button>-->
                        </td> 
                    </tr>
                    <c:set var="total" value="${total + row.pPrice}"></c:set>
                      </c:forEach>
                </tbody>
                <tfoot> 
                    <tr> 
                        
                        <td><a href="index.jsp" class="btn btn-warning"><i class="fa fa-angle-left"></i> Tiếp tục mua hàng</a>
                        </td> 
                        <td colspan="2" class="hidden-xs"> </td> 
                        <td class="hidden-xs text-center"><strong>Tổng tiền <c:out value="${total}"/></strong>
                        </td> 
                        <td><a href="" class="btn btn-success btn-block">Thanh toán <i class="fa fa-angle-right"></i></a>
                        </td> 
                    </tr> 
                </tfoot> 
               
            </table>
        </div>
    </body>
   
    <style type="text/css">.table&amp;amp;gt;tbody&amp;amp;gt;tr&amp;amp;gt;td, .table&amp;amp;gt;tfoot&amp;amp;gt;tr&amp;amp;gt;td {  
            vertical-align: middle;
        }

        @media screen and (max-width: 600px) { 
            table#cart tbody td .form-control { 
                width:20%; 
                display: inline !important;
            } 

            .actions .btn { 
                width:36%; 
                margin:1.5em 0;
            } 

            .actions .btn-info { 
                float:left;
            } 

            .actions .btn-danger { 
                float:right;
            } 

            table#cart thead {
                display: none;
            } 

            table#cart tbody td {
                display: block;
                padding: .6rem;
                min-width:320px;
            } 

            table#cart tbody tr td:first-child {
                background: #333;
                color: #fff;
            } 

            table#cart tbody td:before { 
                content: attr(data-th);
                font-weight: bold; 
                display: inline-block;
                width: 8rem;
            } 

            table#cart tfoot td {
                display:block;
            } 
            table#cart tfoot td .btn {
                display:block;
            }
        }</style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"><script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="js/jquery-1.11.1.min.js"></script>
</html>
