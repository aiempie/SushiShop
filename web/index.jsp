<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Vietnamese Cuisine</title>
        <link href="css/styleindex.css" rel="stylesheet">
        <script src="js/mycode.js"></script>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>

    <jsp:include page="logo.jsp"></jsp:include>
    <jsp:include page="thanhcongcu.jsp"></jsp:include>
    <c:if test="${sessionScope.acc.getIsAdmin()==1}">
        <h2> <a style="color: #fff200">Hello ${khach}</a></h2>
        <a style="color:greenyellow ">Login by Admin Account</a>
    </c:if>
    <c:if test="${sessionScope.acc.getIsAdmin()==0}">
        <h2> <a style="color: #fff200">Hello ${khach}</a></h2>
        <a style="color: greenyellow">Login by User Account</a>
    </c:if>


    <jsp:include page="slider.jsp"></jsp:include>
        <!-- N?i dung chi ti?t-->
        <div class="row monan">
            <div class="col-md-6">
                <h2 style="color: orange"> Món Ăn Mua Nhiều Nhất</h2>
            <c:forEach items="${nhieu}" var="ca">
                <a href="detail?idsp=${ca.idSp}"><img src="image/${ca.image}.jpg" class="img-responsive" /></a>
                <h4 style="color: wheat"> ${ca.tenSp} </h4>
            </c:forEach>

        </div>
        <!--Món ?n th? hai-->
        <div class="col-md-6">
            <h2 style="color: greenyellow   "> Món Ăn Được Yêu Thích Nhất</h2>
            <c:forEach items="${yeu}" var="y">
                <a href="detail?idsp=${y.idSp}"><img src="image/${y.image}.jpg" class="img-responsive" /></a>
                <h4 style="color: whitesmoke"> ${y.tenSp} </h4>
            </c:forEach>
        </div>
    </div>


    <!--n?i dung footer-->
    <jsp:include page="footer.jsp"></jsp:include>


</body>

</html>