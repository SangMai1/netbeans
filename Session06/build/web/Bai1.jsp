<%-- 
    Document   : Bai1
    Created on : Feb 24, 2020, 8:39:14 AM
    Author     : SANG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="number" value="9"/>
        <c:out value="${number}"/>
        <c:remove var="number"/>
        sau remove: <c:out value="${number}"/>
        <c:out value="xin chao thay"/>
    </body>
</html>
