<%-- 
    Document   : list-employee
    Created on : Jan 15, 2020, 9:08:27 AM
    Author     : SANG
--%>

<%@page import="model.EmpoyeeDAO"%>
<%@page import="model.Employee"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <%

        List<Employee> arr = (List<Employee>) request.getAttribute("EMPLOYEES");
    %>
    <body>
        <div class="container">
            <h2>Danh Sach Sinh Vien</h2>

            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>GENDER</th>
                        <th>ACTION</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Employee ee : arr) { %>
                    <tr>
                        <td><%=ee.getId() %></td>
                        <td><%=ee.getName()%></td>
                        <td><%=ee.isGender() ? "Nam" : "Nữ" %></td>
                        <td><a href="EmployeeServlet?id=<%=ee.getId() %>&action=edit" class="btn btn-primary">EDIT</a> 
                            <a href="EmployeeServlet?id=<%=ee.getId() %>&action=del" class="btn btn-danger">DEL</a></td>
                    </tr>   
                    <%}%>


                </tbody>
            </table>
        </div>
    </body>
</html>
