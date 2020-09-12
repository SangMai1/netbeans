<%-- 
    Document   : list-employee
    Created on : Feb 16, 2020, 3:02:24 PM
    Author     : SANG
--%>

<%@page import="java.util.List"%>
<%@page import="model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <%
        List<Employee> arr = (List<Employee>) request.getAttribute("EMPLOYEE");
    %>
    <body>
        <div class="container">
            <h2>Danh sach sinh vien</h2>           
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
                  <%for (Employee ee : arr) { %>
                    <tr>
                      <td><%=ee.getId() %></td>
                      <td><%=ee.getName() %></td>
                      <td><%=ee.isGender() ? "Nam" : "Nữ" %></td>
                      <td>
                          <a href="EmployeeServlet?id=<%=ee.getId() %>&action=edit" class="btn btn-primary">EDIT</a>
                          <a href="EmployeeServlet?id=<%=ee.getId() %>&action=del" class="btn btn-danger">DEL</a>
                      </td>
                    </tr>
                  <%}%>
              </tbody>
            </table>
        </div>
    </body>
</html>
