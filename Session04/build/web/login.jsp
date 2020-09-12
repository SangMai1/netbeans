<%-- 
    Document   : login
    Created on : Feb 19, 2020, 9:36:09 AM
    Author     : SANG
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>JSP Page</title>
    </head>
  
    <body>
        <h2>Login Form</h2>

        <form action="LoginServlet" method="post">
          <div class="imgcontainer">
            <img src="https://www.w3schools.com/bootstrap4/img_avatar3.png" alt="Avatar" class="avatar">
          </div>

          <div class="container">
            <label for="uname"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="uname">

            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw">

            <button type="submit">Login</button>
            
        </form>
    </body>
</html>
