<%-- 
    Document   : listOrder
    Created on : 20 Jun, 2021, 3:21:39 PM
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
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head> 
    <jsp:include page="logo.jsp"></jsp:include>
        <body>
            <div class="container">
                <div class="table-wrapper">
                <jsp:include page="headadmin.jsp"></jsp:include>
                <table class="table table-striped table-hover">
                    <h3 style="color: red">${bang}</h3>
                    <thead>
                        <tr>
                            <th style="width:10%">ID</th>
                            <th style="width:20%">Người đặt</th>
                            <th style="width:20%">Trạng thái</th>
                            <th style="width:40%">Ghi chú </th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listOd}" var="od">
                            <tr>
                                <td>${od.idDonHang}</td>
                                <td>${od.username}</td>
                                <td>
                                    <c:if test="${od.trangThai==1}">Chờ xác nhận từ Shop</c:if>
                                    <c:if test="${od.trangThai==2}">Shop đã nhận</c:if>
                                    </td>
                                    <td>${od.ghiChu}</td>
                                <td>
                                    <a href="loadOrder?id=${od.idDonHang}&us=${od.username}" data-toggle="modal"><i class="material-icons" data-toggle="modal" title="Xem chi tiết">subject</i></a>
                                    <c:if test="${od.trangThai==1}">
                                        <a href="active?id=${od.idDonHang}" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Nhận đơn">store</i></a>
                                    </c:if>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
