<%-- 
    Document   : view-staffs-user
    Created on : Mar 4, 2020, 9:50:49 AM
    Author     : SANG
--%>

<%@page import="model.StaffsDAO"%>
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
    <body>
       <%
           request.setAttribute("STAFFS", new StaffsDAO().getAll());
       %>
        <div class="container">
            <h2>List Users 4</h2>
            <a href="StaServlet" class="btn btn-primary">Add Users</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Birthday</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Name</th>
                        <th>Notes</th>
                        <th>Phone</th>
                        <th>Photo</th>
                        <th>Salary</th>
                        <th>Depart_id</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>      
                    <c:forEach var="st" items="${LIST_STAFFS}">
                        <tr>
                            <td>${st.id}</td>
                            <td>${st.birthday}</td>
                            <td>${st.email}</td>
                            <td>${st.gender}</td>
                            <td>${st.name}</td>
                            <td>${st.notes}</td>
                            <td>${st.phone}</td>
                            <td>${st.photo}</td>
                            <td>${st.salary}</td>
                            <td>${st.depart_id.id}</td>
                            <td><a class="btn btn-primary btn-sm" href="StaServlet?action=AddOrEdit&id=${st.id}">Edit</a> |
                                <a class="btn btn-danger btn-sm" href="StaServlet?action=Delete&id=${st.id}">Del</a></td>
                        </tr>
                        
                    </c:forEach> 
                </tbody>
            </table>
        </div>

    </body>
</html>
