<%-- 
    Document   : product_view
    Created on : May 6, 2020, 8:52:28 AM
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
		<h2>List Product</h2>
                <a href="ProductServlet?action=AddOrEdit" class="btn btn-primary">Add</a>
		<table class="table table-bordered">
			<thead>
				<tr>
					<td>MaSP</td>
					<td>TenSP</td>
                                        <td>Ngay Nhap</td>
                                        <td>So Luong</td>
                                        <td>Gia Tien</td>
                                        <td>Thanh Tien</td>
					<td>Action</td>
				</tr>
			</thead>
			<tbody>
                        <c:forEach var="st" items="${LIST_PRODUCT}">
					<tr>
						<td>${st.maSp}</td>
						<td>${st.tenSp}</td>
                                                <td>${st.ngayNhap}</td>
                                                <td>${st.soLuong}</td>
                                                <td>${st.giaTien}</td>
                                                <td>${st.soLuong * st.giaTien}</td>
						<td>
							<a href="ProductServlet?action=AddOrEdit&maSp=${st.maSp}" class="btn btn-primary">Edit </a>
							<a href="ProductServlet?action=delete&maSp=${st.maSp}" class="btn btn-primary">Del</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
