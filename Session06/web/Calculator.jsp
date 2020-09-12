<%-- 
    Document   : Calculator
    Created on : Feb 24, 2020, 8:23:04 AM
    Author     : SANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form>
            <input type="text" placeholder="number 1" name="txtNumber1" value="${param.txtNumber1}"><br>
            <input type="text" placeholder="number 2" name="txtNumber2" value="${param.txtNumber2}"><br>
            <input type="submit">
            <p>Tong : ${param.txtNumber1 + param.txtNumber2}</p>
        </form>
    </body>
</html>
