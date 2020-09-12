<%-- 
    Document   : list-student
    Created on : Jan 8, 2020, 9:43:39 AM
    Author     : SANG
--%>

<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<Student> ls = (List<Student>) request.getAttribute("LIST_STUDENT");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h2>Danh Sach Sinh Vien</h2>

            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>PHONE</th>
                        <th>EMAIL</th>
                        <th>ACTION</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Student st : ls) { %>
                    <tr>
                        <td><%= st.getId() %></td>
                        <td><%= st.getName() %></td>
                        <td><%= st.getPhone() %></td>
                        <td><%= st.getEmail() %></td>
                        <td><a href="#" class="btn btn-primary">EDIT</a> <a href="#" class="btn btn-danger">DEL</a></td>
                    </tr>   
                    <%} %>
                    
                </tbody>
            </table>
        </div>
    </body>
</html>
