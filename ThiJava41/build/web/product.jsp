<%-- 
    Document   : product
    Created on : May 6, 2020, 8:52:15 AM
    Author     : SANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body
        <div class="container" style="margin-top: 10px;">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                    <h2>San Pham</h2>
                    <form action="ProductServlet">
                        <c:if test="${ACTION == null}">
                            <c:set var="ACTION" value="SaveOrUpdate"/>
                        </c:if>
                        <input type="hidden" class="form-control" name="action" value="${ACTION}" >
                        <div class="form-group">
                            <label>Ma SP</label>
                            <input type="text" class="form-control" name="maSp" value="${PRODUCT.maSp}" placeholder="Enter Ma SP">
                        </div>
                        <div class="form-group">
                            <label>Ten SP</label>
                            <input type="text" class="form-control" name="tenSp" value="${PRODUCT.tenSp}" placeholder="Enter Ten SP">
                        </div>
                        <div class="form-group">
                            <label>Ngay nhap</label>
                            <input type="date" class="form-control" name="ngayNhap" value="${PRODUCT.ngayNhap}" placeholder="Enter ngay nhap">
                        </div>
                        
                        <div class="form-group">
                            <label>So Luong</label>
                            <input type="number" class="form-control" name="soLuong" value="${PRODUCT.soLuong}" placeholder="Enter So Luong">
                        </div>
                        <div class="form-group">
                            <label>Gia Tien</label>
                            <input type="number" class="form-control" name="giaTien" value="${PRODUCT.giaTien}" placeholder="Enter Gia Tien">
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="ProductServlet?action=List" class="btn btn-primary">Display product</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
