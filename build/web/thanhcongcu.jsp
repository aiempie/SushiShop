<%-- 
    Document   : sst3
    Created on : 5 Jun, 2021, 7:28:08 PM
    Author     : khanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--N?i dung Menu-->
<nav class="navbar navbar-inverse bg-primary" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

                <li><a href="index"> <span class="glyphicon glyphicon-home"></span> HOME </a> </li>
                <li><a href="menu">Menu</a></li>
                <li><a href="forum">Forum </a></li>
                <li> <a href="contact.jsp">Contact</a> </li>
                <li><a href="about.jsp">About me </a></li>
                    <c:if test="${sessionScope.acc != null}">
                    <li><a href="showcart"> Cart </a></li>
                    <li><a style="color: #fff200">Hello ${sessionScope.acc.username}</a></li>
                        <c:if test="${sessionScope.acc.getIsAdmin()!=0}">
                        <li><a href="listController"><span class="glyphicon glyphicon-cog"></span>  Manage Product</a></li>
                        </c:if>
                    <li><a href="logout">Logout</a></li>
                    </c:if>
                    <c:if test="${sessionScope.acc == null}">
                    <li><a href="login.jsp">Login / Sign Up</a></li>
                    </c:if>
                 <li><a href="qanda">Q&A </a></li>
            </ul>


            <form action="search" method="post" class="navbar-form navbar-right">
                <div class="form-group">
                    <input value="${txtS}" name="txt" type="text" class="form-control" placeholder="search">
                </div>
                <button type="submit" class="btn btn-default">Search</button>
            </form>

        </div>

    </div>

</nav>