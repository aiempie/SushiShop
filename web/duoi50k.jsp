<%-- 
    Document   : duoi50k
    Created on : 23 Jun, 2021, 4:09:37 PM
    Author     : khanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Vietnamese Cuisine</title>
        <link href="css/styleindex.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/font-awesome.css" rel="stylesheet">
        <script src="js/mycode.js"></script>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="logo.jsp"></jsp:include>
        <jsp:include page="thanhcongcu.jsp"></jsp:include>
            <div class="row">
                <div class="col-sm-3">
                    <div class="card bg-light mb-3">
                        <div class="list-group-item active bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>
                        <ul class="list-group category_block">
                        <c:forEach items="${listCate}" var="ca">
                            <li class="list-group-item text-white ${tag == ca.idLoaiHang ? "active":""}"><a href="category?cateid=${ca.idLoaiHang}" style="color: black">${ca.tenLoaiHang}</a></li>
                            </c:forEach>

                    </ul>
                </div>
            </div>

            <div class="col-sm-9">
                <h4 style="color: greenyellow">${mess}</h4>
                <div class="row">
                    <c:forEach items="${listSP}" var="sp">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card h-100">
                                    <a href="detail?idsp=${sp.idSp}"><img class="card-img-top" src="image/${sp.image}.jpg" alt=""></a>
                                    <div class="card-body">
                                        <p class="card-title">
                                            <a href="detail?idsp=${sp.idSp}" style="color: wheat">${sp.tenSp}</a>
                                        </p>
                                        <h6>${sp.dongia}  VND</h6>
                                        <!--                  <p class="card-text"></p>   -->
                                    </div>
                                    <div class="card-footer">
                                        <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                                    </div>
                                    <a class="btn btn-primary"style="background: #ee4d2d" href="addToCart?idsp=${sp.idSp}">Add To Cart</a>
                                </div>
                            </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
