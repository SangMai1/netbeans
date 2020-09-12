<%-- 
    Document   : Bai2
    Created on : Feb 24, 2020, 8:50:42 AM
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
        <c:set var="number1" value="9" scope="page"/>
        <c:set var="number2" value="8" scope="page"/>
        <c:if test="${number1 > number2}">
            <c:out value="number1 > number2"/>
        </c:if>
    </body>
</html>
