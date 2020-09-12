<%-- 
    Document   : sach_view
    Created on : May 5, 2020, 9:46:38 PM
    Author     : SANG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
	<div class="container">
		<h2>List Loai sach</h2>
		<form action="SachServlet?action=search">
				<div class="form-group">
					<input class="form-control" name="ten">
				</div>
				<button type="submit">Search</button>
				</form>
		<table class="table table-bordered">
			<thead>
				<tr>
					<td>Ma sach</td>
					<td>Ten sach</td>
					<td>Ngay nhap</td>
					<td>Gia tien</td>
					<td>So luong</td>
					<td>Loai sach</td>
					<td>Action</td>
				</tr>
			</thead>
			<tbody>
                        <c:forEach var="st" items="${LIST_SACH}">
					<tr>
						<td>${st.maSach}</td>
						<td>${st.tenSach}</td>
						<td>${st.ngayNhap}</td>
						<td>${st.giaTien}</td>
						<td>${st.soLuong}</td>
						<td>${st.loaiSach.tenLoaiSach}</td>
						<td>
							<a href="SachServlet?action=AddOrEdit&maSach=${st.maSach}" class="btn btn-primary">Edit </a>
							<a href="SachServlet?action=delete&maSach=${st.maSach}" class="btn btn-primary">Del</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
