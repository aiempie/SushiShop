<%-- 
    Document   : contact
    Created on : 10 Jun, 2021, 2:28:01 AM
    Author     : khanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Contact</title>
        <link href="css/styleindex.css" rel="stylesheet">
        <link href="css/stylecontact.css" rel="stylesheet">
        <link href="css/font-awesome.css" rel="stylesheet">
        <script src="js/mycode.js"></script>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="logo.jsp"></jsp:include>
        <jsp:include page="thanhcongcu.jsp"></jsp:include>
            <div class="form">
            <c:if test="${sessionScope.acc == null}">
                <a style="color: orange" href="login.jsp">Please Login or Sign Up to Contact</a>
                </c:if>
            <c:if test="${sessionScope.acc != null}">
                <p style="color: red"> ${mess}</p>
            <form action="contact" id="form1">
                <input type="text" id="fid" name="cid" value="${sessionScope.acc.username}" readonly="" ><br>
                <input type="text" id="fname" name="cname" placeholder="Họ tên"><br>
                <input type="text" id="femail" name="cemail" placeholder="E-Mail"><br>
                <input type="text" id="fcontent" name="content" placeholder="Nội dung yêu cầu"><br>
                <input type="submit" value="Gửi yêu cầu">
            </form>
            </c:if>
            <p><strong>Địa chỉ: Đại học FPT Đà Nẵng</strong></p>
            <p>SĐT Tư vấn: 0776962393</p>
            <p>Liên hệ: lienhe@sushishop.com</p>
            <p>Thời gian xử lý yêu cầu<strong> theo giờ hành chính</strong> mỗi ngày</p>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
