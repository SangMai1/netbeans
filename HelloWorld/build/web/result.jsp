<%-- 
    Document   : result
    Created on : Jan 8, 2020, 8:27:30 AM
    Author     : SANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String rs = (String) request.getAttribute("RESULT");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ket qua <%=rs%></h1>
        <hr/>
    </body>
</html>
