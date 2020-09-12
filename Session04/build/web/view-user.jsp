<%-- 
    Document   : view
    Created on : Feb 17, 2020, 8:32:36 AM
    Author     : SANG
--%>

<%@page import="model.User1DAO"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page import="model.UserDAO"%>
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
        <%
            User1DAO dao = new User1DAO();
            List<User> ls = dao.getAll();
        %>
        <div class="container">
            <h2>List Users 4</h2>
            <a href="UserServlet?action=AddOrEdit" class="btn btn-primary">Add Users</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>UserName</th>
                        <th>Password</th>
                        <th>FullName</th>
                        <th>Age</th>
                        <th>Birthday</th>
                        <th>Gender</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (int i = 0; i < ls.size(); i++) { 
                        User u = ls.get(i);
                        //in thong tin ra
                    %>
                           
                    <tr>
                        <td><%=u.getUsername() %></td>
                        <td><%=u.getPassword() %></td>
                        <td><%=u.getFullname() %></td>
                        <td><%=u.getAge() %></td>
                        <td><%=u.getBirthday() %></td>
                        <td><%=u.isGender() %></td>
                        <td><a class="btn btn-primary btn-sm" href="UserServlet?action=AddOrEdit&username=<%=u.getUsername() %>">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="UserServlet?action=Delete&username=<%=u.getUsername() %>">Del</a></td>
                    </tr>

                    <%} %>
                    
                </tbody>
            </table>
        </div>
    </body>
</html>


