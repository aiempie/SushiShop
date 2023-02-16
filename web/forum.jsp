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
        <link href="css/styleforum.css" rel="stylesheet">
        <script src="js/mycode.js"></script>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="logo.jsp"></jsp:include>
        <jsp:include page="thanhcongcu.jsp"></jsp:include>


            <div class="be-comment">
            <c:forEach items="${listF}" var="us">
                <div class="be-img-comment">	
                    <a><img src="images/admin.png" alt="" class="be-ava-comment"> </a>
                </div>
                <div class="be-comment-content">

                    <span class="be-comment-name">
                        <a style="color: wheat">${us.username}</a>
                    </span>
                    <p class="be-comment-text">${us.chat} </p>
                </div>
            </c:forEach>
        </div>

        <form action="comment" class="form-block">
            <c:if test="${sessionScope.acc != null}">
                <div class="row">
                    <div class="col-xs-12">
                        <input  name="Username" value="${sessionScope.acc.username}" type="hidden" class="form-control" required>
                        <div class="form-group">
                            <textarea name="content" class="form-input" required="" placeholder="Your text"></textarea>
                        </div>
                    </div>
                   <input class="btn btn-primary pull-right" type="submit" value="submit" />
                </div>
            </c:if>
            <c:if test="${sessionScope.acc == null}">
                <h4><a href="login.jsp">Please Login to Comment </a></h4>

            </c:if>

        </form>
        <div class="clearfix">
            <div class="hint-text">Showing <b>5</b> out of <b>2</b> entries</div>
            <ul class="pagination">
                <c:forEach begin="1" end="2" var="i">
                    <li class ="page-item active"><a href="forum?index=${i}"class="page-link">${i}</a></li>
                    </c:forEach>
            </ul>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>

</html>
