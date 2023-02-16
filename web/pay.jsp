<%-- 
    Document   : pay.jsp
    Created on : 17 Jun, 2021, 11:00:31 PM
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
        <link href="css/stylecontact.css" rel="stylesheet">
        <link href="css/font-awesome.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="logo.jsp"></jsp:include>
        <jsp:include page="thanhcongcu.jsp"></jsp:include>
            <div class="row">
                <div class="col-sm-7">
                    <div style="text-align:left;">
                        <h3 style="color: #ff6666">Thanh Toán: </h3>
                        <table style="color: #33ffcc">
                            <tr> 
                                    <th style="width:55%">Tên sản phẩm</th> 
                                    <th style="width:15%">Đơn Giá</th> 
                                    <th style="width:10%">Số lượng</th> 
                                    <th style="width:20%" class="text-center">Thành tiền</th> 
                                   </tr> 
                            <c:forEach items="${listCart}" var="sp">
                            <tr>
                                <td>${sp.tenSp}</td>
                                <td>${sp.dongia} đ</td>
                                <td class="text-center">${sp.soluong} </td>
                                <td class="text-center">${sp.thanhtien} đ</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
            <div class="col-sm-4">
                <form action="paying" id="form1">
                    <input type="text" id="fid" name="Username" value="${cus.username}" class="hidden" ><br>
                    <input type="text" id="fname" name="tenKhach" value="${cus.tenKhach}"placeholder="Tên Khách Hàng"><br>
                    <input type="text" id="femail" name="sdt" value="${cus.sdt}" placeholder="SĐT Nhận"><br>
                    <input type="text" id="fdiachi" name="diachi" value="${cus.diachi}" placeholder="Địa Chỉ"><br>
                    <input type="text" id="fcontent" name="ghichu" placeholder="Ghi Chú"><br>
                    <h4 style="color: #ff6666" text-align: right><strong>TỔNG TIỀN:  ${sum} VNĐ</strong></h4>
                    <input type="submit" value="Xác Nhận Đặt Hàng">
                </form>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
