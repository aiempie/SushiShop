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

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <jsp:include page="logo.jsp"></jsp:include>
    <jsp:include page="thanhcongcu.jsp"></jsp:include>
    <c:if test="${sessionScope.acc == null}">
        <h2><a href="login.jsp">Please Login to Show Cart </a></h2>
    </c:if>
    <c:if test="${sessionScope.acc != null}">
        <c:if test="${mess!=null}">
            <h2 style="color: greenyellow">${mess}</h2>
            <a href="menu" class="btn btn-warning"><i class="fa fa-angle-left"></i> Tiếp tục mua hàng</a><p></p>

        </c:if>
        <c:if test="${mess==null}">
            <table id="cart" class="table table-condensed"> 
                  <thead> 
                       <tr> 
                            <th style="width:45%">Tên sản phẩm</th> 
                            <th style="width:10%">Giá</th> 
                            <th style="width:8%">Số lượng</th> 
                            <th style="width:22%" class="text-center">Thành tiền</th> 
                            <th style="width:15%"> </th> 
                           </tr> 
                      </thead> 
                  <tbody>
                    <c:forEach items="${listCart}" var="ls">
                    <form action="upToCart">
                        <tr> 
                               <td data-th="Product"> 
                                    <div class="row"> 
                                         <div class="col-sm-2 hidden-xs"><img src="image/${ls.image}.jpg" alt="Sản phẩm 1" class="img-responsive" width="100">
                                             </div> 
                                         <div class="col-sm-10"> 
                                              <h4 class="nomargin">${ls.tenSp}</h4>  
                                        <input name="idsp" value="${ls.idSP}" type="hidden">
                                             </div> 
                                        </div> 
                                   </td> 
                               <td data-th="Price">${ls.dongia} đ</td> 
                               <td data-th="Quantity"><input name="soluong" class="form-control text-center" value="${ls.soluong}" type="number">
                                   </td> 
                               <td data-th="Subtotal" class="text-center">${ls.thanhtien} đ</td> 
                               <td class="actions" data-th="">
                                <button class="btn btn-info btn-sm" >Update</button>
                                    <a href="delToCart?idsp=${ls.idSP}" class="btn btn-danger btn-sm">Delete</a>
                                   </td> 
                        </tr>
                    </form>
                </c:forEach>
                  
                  </tbody>
            <tfoot> 
                   <tr> 
                        <td><a href="menu" class="btn btn-warning"><i class="fa fa-angle-left"></i> Tiếp tục mua hàng</a>
                            </td> 
                        <td colspan="2" class="hidden-xs"> </td> 
                        <td class="hidden-xs text-center"><strong>Tổng tiền: ${sum} đ</strong>
                            </td> 
                        <td><a href="pay" class="btn btn-success btn-block">Thanh toán <i class="fa fa-angle-right"></i></a>
                            </td> 
                       </tr> 
                  </tfoot> 
             </table>
        </c:if>
    </c:if>

<jsp:include page="footer.jsp"></jsp:include>

</body>

</html>
