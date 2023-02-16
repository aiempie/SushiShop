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
                <h3 style="color: red">${bang}</h3>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th style="width:5%">ID Contact</th>
                                <th style="width:10%">Username</th>
                                <th style="width:20%">Name</th>
                                <th style="width:25%">Email</th>
                                <th style="width:30%">Report</th>
                                <th style="width:10%">TrangThai</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${listCt}" var="ct">
                            <tr>
                                <td>${ct.idContact}</td>
                                <td>${ct.username}</td>
                                <td>${ct.name}</td>
                                <td>${ct.email}</td>
                                <td>${ct.request}</td>
                                <td>
                                <c:if test="${ct.trangThai==false}">Chưa đọc</c:if>
                                <c:if test="${ct.trangThai==true}">Đã đọc</c:if>
                                </td>
                                <td>
                                    <a href="activeCon?id=${ct.idContact}" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Đã đọc">subdirectory_arrow_right</i></a>
                                </td>
                            </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
