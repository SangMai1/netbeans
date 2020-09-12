<%-- 
    Document   : view-student
    Created on : Mar 2, 2020, 8:41:22 AM
    Author     : SANG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
      
        
        <div class="container">
            <h2>List Users 4</h2>
            <a href="StudentServlet?action=AddOrEdit" class="btn btn-primary">Add Student</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Birthday</th>
                        <th>MajorId</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="st" items="${LIST_STUDENT}">
                        <tr>
                            <td>${st.id}</td>
                            <td>${st.name}</td>
                            <td>${st.birthday}</td>
                            <td>${st.major.name}</td>
                        
                        <td><a class="btn btn-primary btn-sm" href="StudentServlet?action=AddOrEdit&id=${st.id}">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="StudentServlet?action=Delete&id=${st.id}">Del</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

