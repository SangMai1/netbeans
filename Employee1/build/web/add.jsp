<%-- 
    Document   : add
    Created on : Feb 16, 2020, 2:30:57 PM
    Author     : SANG
--%>

<%@page import="model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String action = request.getParameter("action");
    Employee ee = null;
    if (action == null || action.equals("")) {
            ee = new Employee("", "", true);
            action = "add";
        } else {
            ee = (Employee) request.getAttribute("EMPLOYEE");
            action = (String) request.getAttribute("ACTION");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </head>
    
    <body>
        <div class="container">
            <h2>Them Nhan Vien</h2>
            <form action="EmployeeServlet">
              <div class="form-group">
                <label>ID:</label>
                <input type="text" class="form-control" placeholder="Enter Id" name="id" value="<%=ee.getId() %>">
              </div>
              <div class="form-group">
                <label>Name:</label>
                <input type="text" class="form-control" placeholder="Enter name" name="name" value="<%=ee.getName() %>">
              </div>
              <div class="form-group">
                <label>Gioi Tinh:</label>
                <div class="form-check">
                    <label class="form-check-label">
                        <%
                            String s = "";
                            String b = "";
                            if (action == null || action.equals("")) {
                                    s = "checked";
                                } else {
                                if (ee.isGender()) {
                                        s = "checked";
                                    } else {
                                    b = "checked";
                                }
                            }
                        %>
                        <input type="radio" class="form-check-input" name="gender" <%=s %> value="Nam">Nam
                    </label>
                  </div>
                  <div class="form-check">
                    <label class="form-check-label">
                        <input type="radio" class="form-check-input" name="gender" <%=b %> value="Nữ">Nữ
                    </label>
                  </div>
              </div>
                    <button type="submit" class="btn btn-primary" name="action" value="<%=action %>"><%=action %></button>
            </form>
        </div>
    </body>
</html>
