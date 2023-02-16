<%-- 
    Document   : chitietdh
    Created on : 21 Jun, 2021, 4:03:25 PM
    Author     : khanh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>List Order</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <link href="css/stylecontact.css" rel="stylesheet">
        <link href="css/font-awesome.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head> 
    <jsp:include page="logo.jsp"></jsp:include>
        <body>
            <div class="container">
                <div class="table-wrapper">
                <jsp:include page="headadmin.jsp"></jsp:include>
                    <div class="col-sm-2"><a href="listorder" class="btn btn-success btn-block" >Quay lại</a></div><br><br>
                    <table class="table table-striped table-hover">
                        <h3 style="color: red">Hoá đơn chi tiết của: ${cus.tenKhach} </h3>
                    <thead>
                        <tr>
                            <th style="width:10%">ID</th>
                            <th style="width:50%">Tên Sản Phẩm</th>
                            <th style="width:15%">Đơn Giá</th>
                            <th style="width:10%">Số lượng</th>
                            <th style="width:15%">Thành tiền</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listCt}" var="ct">
                            <tr>
                                <td>${ct.idSP}</td>
                                <td>${ct.tenSp}</td>
                                <td>${ct.dongia}</td>
                                <td>${ct.soluong}</td>
                                <td>${ct.thanhtien}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <h4 style="color: #0099cc" class="text-right">TỔNG TIỀN:  ${sum} VNĐ</h4>
                <form action="active?id=${dh.idDonHang}" id="form1"  >
                    <input type="text" id="fid" name="id" value="${id}" class="hidden" ><br>
                    <label>Tên Khách Hàng: </label>
                    <input style="color: black" type="text" value="${cus.tenKhach}"placeholder="Tên Khách Hàng">
                    <label>SĐT Nhận: </label>
                    <input style="color: black" type="text" value="${cus.sdt}" placeholder="SĐT Nhận"><br>
                    <label>Địa Chỉ: </label>
                    <input style="color: black"  type="text" value="${cus.diachi}" placeholder="Địa Chỉ"><br>
                    <c:if test="${dh.trangThai==1}"><input type="submit" value="Đã chuẩn bị xong!"></c:if>
                    <c:if test="${dh.trangThai==2}"><input type="submit" value="Đã Nhận!"></c:if>
                </form>
            </div>
        </div>
    </body>
</html>
