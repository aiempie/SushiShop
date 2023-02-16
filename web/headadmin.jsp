<%-- 
    Document   : headadmin
    Created on : 20 Jun, 2021, 3:10:52 PM
    Author     : khanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<div class="table-title">
    <div class="row">
        <div class="col-sm-3">
            <h2>Manage Setting </h2>
            <h4 style="color: #fff200">Hello ${sessionScope.acc.username}</h4>
            <h4 style="color: red">${mess}</h4>
        </div>
        <div class="col-sm-9">
            <a href="index"class="btn btn-success" >  <i class="material-icons">home</i> <span>HOME</span></a>
            <a href="listcontact"class="btn btn-success" ><i class="material-icons">ring_volume</i> <span>Yêu cầu Khách Hàng</span></a>
            <div class="dropdown btn btn-success">
                <a data-toggle="modal" style="color: white"><i class="material-icons">people</i>Account Setting</a>
                <div class="dropdown-child">
                    <a href="account" >List Account</a>
                    <a href="#addAccountModal"  data-toggle="modal">Add Account</a>
                </div>
            </div>
            <div class="dropdown btn btn-success">
                <a class=" " data-toggle="modal" style="color: white"><i class="material-icons">collections</i>Product Setting</a>
                <div class="dropdown-child">
                    <a href="listController" >List Product</a>
                    <a href="#addEmployeeModal"  data-toggle="modal">Add Product</a>
                </div>
            </div>
            <div class="dropdown btn btn-success">
                <a class=" " data-toggle="modal" style="color: white"><i class="material-icons">collections</i>Order Setting</a>
                <div class="dropdown-child">
                    <a href="listorder" >List Order</a>
                    <a href="listsold" >List Sold</a>
                </div>
            </div>
            
        </div>
    </div>
</div>
