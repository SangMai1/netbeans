<%-- 
    Document   : loaisach_view
    Created on : May 3, 2020, 2:38:33 PM
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
		<table class="table table-bordered">
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Action</td>
				</tr>
			</thead>
			<tbody>
                        <c:forEach var="st" items="${LIST_LOAISACH}">
					<tr>
						<td>${st.maLoaiSach}</td>
						<td>${st.tenLoaiSach}</td>
						<td>
							<a href="LoaiSachServlet?action=AddOrEdit&maLoaiSach=${st.maLoaiSach}" class="btn btn-primary">Edit </a>
							<a href="LoaiSachServlet?action=delete&maLoaiSach=${st.maLoaiSach}" class="btn btn-primary">Del</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
