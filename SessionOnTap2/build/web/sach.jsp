<%-- 
    Document   : sach
    Created on : May 5, 2020, 9:38:36 PM
    Author     : SANG
--%>

<%@page import="daos.LoaiSachDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" style="margin-top: 10px;">
             <%
        if (request.getParameter("LIST_LOAISACH") == null) {
                request.setAttribute("LIST_LOAISACH", new LoaiSachDAO().getAll());
            }
    %>
		<div class="col-sm-12">
			<h2>Register</h2>
			<form action="SachServlet">
                            <c:if test="${ACTION == null}">
                                <c:set var="ACTION" value="SaveOrUpdate"/>
                            </c:if>
                            <input type="hidden" class="form-control" name="action" value="${ACTION}" >
				<div class="form-group">
					<label>Ma sach</label> <input type="text" class="form-control"
						name="maSach" value="${SACH.maSach}" placeholder="Enter id">
				</div>
				<div class="form-group">
					<label>Ten sach</label> <input type="text" class="form-control"
						name="tenSach" value="${SACH.tenSach}" placeholder="Enter Name">
				</div>
				<div class="form-group">
					<label>Ngay nhap</label> <input type="date" class="form-control"
						name="ngayNhap" value="${SACH.ngayNhap}"
						placeholder="Enter ngay nhap">
				</div>
				<div class="form-group">
					<label>Gia tien</label> <input type="text" class="form-control"
						name="giaTien" value="${SACH.giaTien}"
						placeholder="Enter gia tien">
				</div>
				<div class="form-group">
                                    <label>So luong</label> <input type="numbers" class="form-control"
						name="soLuong" value="${SACH.soLuong}"
						placeholder="Enter so luong">
				</div>
				<div class="form-group">
					<label>Loại sách</label> <select class="form-control"
						name="loaiSach" value="${SACH.loaiSach}">
						<c:forEach var="u" items="${LIST_LOAISACH}">
							<option value="${u.maLoaiSach}">${u.tenLoaiSach}</option>
						</c:forEach>

					</select>

				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
				<a href="SachServlet?action=List" class="btn btn-primary">List</a>
			</form>



		</div>
	</div>
</body>
</html>