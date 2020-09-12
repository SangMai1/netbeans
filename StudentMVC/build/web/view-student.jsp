<%-- 
    Document   : views-tudent
    Created on : Jan 8, 2020, 9:19:41 AM
    Author     : SANG
--%>

<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Student st = (Student) request.getAttribute("STUDENT");
 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Danh Sach Sinh Vien</h1>
        <p>ID: <%=st.getId() %></p>
        <p>Name: <%=st.getName() %>
        <p>Phone: <%=st.getPhone() %></p>
        <p>Email: <%=st.getEmail() %></p>
    </body>
</html>
