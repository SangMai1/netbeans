<%-- 
    Document   : loaisach2
    Created on : May 3, 2020, 2:37:26 PM
    Author     : SANG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                    <h2>Loai Sach</h2>
                    <form action="LoaiSachServlet">
                        <c:if test="${ACTION == null}">
                            <c:set var="ACTION" value="SaveOrUpdate"/>
                        </c:if>
                        <input type="hidden" class="form-control" name="action" value="${ACTION}" >
                        <div class="form-group">
                            <label>Ma Loai Sach</label>
                            <input type="text" class="form-control" name="MaLoaiSach" value="${LOAISACH.maLoaiSach}" placeholder="Enter Ma Loai Sach">
                        </div>
                        <div class="form-group">
                            <label>Ten Loai Sach</label>
                            <input type="text" class="form-control" name="TenLoaiSach" value="${LOAISACH.tenLoaiSach}" placeholder="Enter Ten Loai Sach">
                        </div>

                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="" class="btn btn-primary">Display Loai Sach</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
