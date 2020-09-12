<%-- 
    Document   : view-parts-user
    Created on : Feb 21, 2020, 8:20:25 AM
    Author     : SANG
--%>

<%@page import="java.util.List"%>
<%@page import="model.DepartDAO"%>
<%@page import="model.Depart"%>
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
            DepartDAO dao = new DepartDAO();
            List<Depart> ls = dao.getAll();
        %>
        <div class="container">
            <h2>List Users 4</h2>
            <a href="DepartServlet?action=AddOrEdit" class="btn btn-primary">Add Users</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>      
                    <%
                        for (int i = 0; i < ls.size(); i++) {
                                Depart d = ls.get(i);
                           
                    %>
                    <tr>
                        <td><%=d.getId() %></td>
                        <td><%=d.getName() %></td>
                        <td><a class="btn btn-primary btn-sm" href="DepartServlet?action=AddOrEdit&id=<%=d.getId() %>">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="DepartServlet?action=Delete&id=<%=d.getId() %>">Del</a></td>
                    </tr>

                    <%}%>
                    
                </tbody>
            </table>
        </div>

    </body>
</html>
