<%-- 
    Document   : detail
    Created on : 5 Jun, 2021, 6:22:09 PM
    Author     : khanh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
        <style>
            div.stars {
                width: 270px;
                display: inline-block;
            }
            input.star { display: none; }

            label.star {
                float: right;
                padding: 10px;
                font-size: 36px;
                color: #444;
                transition: all .2s;
            }
            input.star:checked ~ label.star:before {
                content: '\f005';
                color: #FD4;
                transition: all .25s;
            }
            input.star-5:checked ~ label.star:before {
                color: #FE7;
                text-shadow: 0 0 20px #952;
            }
            input.star-1:checked ~ label.star:before { color: #F62; } 
            label.star:hover { transform: rotate(-15deg) scale(1.3); }
            label.star:before {
                content: '\f006';
                font-family: FontAwesome;
            }

        </style>
    </head>

    <jsp:include page="logo.jsp"></jsp:include>
        <body>
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

            <div class="col-sm-8">
                <h4 style="color: greenyellow">${mess}</h4>
                <div class="containerz">
                    <div>
                        <aside class="col-sm-7">
                            <article class="gallery-wrap"> 
                                <div>
                                    <img src="image/${sp.image}.jpg">
                                </div> <!-- slider-product.// -->
                            </article> <!-- gallery-wrap .end// -->
                        </aside>
                        <aside class="col-sm-5">
                            <article class="card-body p-5">
                                <h3 class="title mb-3">${sp.tenSp}</h3>

                                <p class="price-detail-wrap"> 
                                    <span class="price h3 text-warning"> 
                                        <span class="currency">Giá: </span><span class="num">${sp.dongia}  VND</span>
                                    </span> 
                                </p> 
                                <hr>
                                <a href="buyNow?idsp=${sp.idSp}" class="btn btn-lg btn-primary text-uppercase"> Buy now </a>
                                <a href="addToCart?idsp=${sp.idSp}" class="btn btn-lg btn-success text-uppercase">Add to cart </a>
                                <hr>
                                <div class="stars">
                                    <c:if test="${ss!=null}">
                                        <h4>Số sao hiện có: ${ss}</h4>
                                    </c:if>
                                    <form action="rate"  method="POST" >
                                        <input name="idsp" value="${sp.idSp}" type="hidden">
                                        <input class="star star-5" id="star-5" type="radio" name="star" value="5"/>
                                        <label class="star star-5" for="star-5"></label>
                                        <input class="star star-4" id="star-4" type="radio" name="star" value="4"/>
                                        <label class="star star-4" for="star-4"></label>
                                        <input class="star star-3" id="star-3" type="radio" name="star" value="3"/>
                                        <label class="star star-3" for="star-3"></label>
                                        <input class="star star-2" id="star-2" type="radio" name="star" value="2"/>
                                        <label class="star star-2" for="star-2"></label>
                                        <input class="star star-1" id="star-1" type="radio" name="star" value="1"/>
                                        <label class="star star-1" for="star-1"></label>
                                        <p><textarea name="comment" style="color: black"></textarea></p>
                                        <input type="submit" value="Confirm" style="color: black"/>
                                    </form>
                                </div>
                                <hr>
                                <div style="text-align:left;">
                                    <h3 style="color: #ff6666">Bình luận từ khách hàng: </h3>
                                    <c:forEach items="${listCmt}" var="cmt">
                                        <li style="color: #ccff33">${cmt} </li>
                                        </c:forEach>
                                </div>
                            </article> <!-- card-body.// -->
                        </aside> <!-- col.// -->
                    </div>
                </div>
            </div>

        </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

