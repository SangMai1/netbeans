<%-- 
    Document   : add-student
    Created on : Jan 8, 2020, 9:01:55 AM
    Author     : SANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h2>ADD STUDENT</h2>
            <form action="AddStudentServlet">
              <div class="form-group">
                <label for="email">ID:</label>
                <input type="text" class="form-control" id="email" placeholder="Enter ID" name="id">
              </div>
              <div class="form-group">
                <label for="email">NAME:</label>
                <input type="text" class="form-control" id="email" placeholder="Enter NAME" name="name">
              </div>
              <div class="form-group">
                <label for="email">PHONE:</label>
                <input type="text" class="form-control" id="email" placeholder="Enter PHONE" name="phone">
              </div>
              <div class="form-group">
                <label for="email">EMAIL:</label>
                <input type="text" class="form-control" id="email" placeholder="Enter EMAIL" name="email">
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
            </form>
          </div>

    </body>
</html>
