<%-- 
    Document   : helloname
    Created on : Jan 6, 2020, 9:22:34 AM
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
        <form action="Hellonameservlet" method="get">
            Input Name: <input type="text" name="txtName"/>
            <input type="submit" value="send"/>
        </form>
    </body>
</html>
