<%-- 
    Document   : register-student
    Created on : Mar 2, 2020, 9:22:43 AM
    Author     : SANG
--%>

<%@page import="model.MajorDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Major"%>
<%@page import="common.DateHelper"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <%
        if (request.getParameter("LIST_MAJOR") == null) {
                request.setAttribute("LIST_MAJOR", new MajorDAO().getAll());
            }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body
        <div class="container" style="margin-top: 10px;">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                    <h2>Register</h2>
                    <form action="StudentServlet">
                        <c:if test="${ACTION == null}">
                            <c:set var="ACTION" value="SaveOrUpdate"/>
                        </c:if>
                        
                        <input type="hidden" class="form-control" name="action" value="${ACTION}" >
                        <div class="form-group">
                            <label>Id</label>
                            <input type="text" class="form-control" name="id" value="${STUDENT.id}" ${STUDENT != null ? "readonly":""} placeholder="Enter Id">
                        </div>
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" class="form-control" name="name" value="${STUDENT.name}" placeholder="Enter Name">
                        </div>

                        <div class="form-group">
                            <label>Birthday</label>
                            <input type="date" class="form-control" name="birthday" value="${STUDENT.birthday}" style="padding: 0px 12px" placeholder="Enter Birthday">
                        </div>
                        
                        <div class="form-group">
                            <label>Choose Major</label>
                            <select name="major" class="form-control">
                                <c:forEach var="u" items="${LIST_MAJOR}">
                                    <option value="${u.id}">${u.name}</option>
                                </c:forEach>
                                
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="StudentServlet?action=List" class="btn btn-primary">Display Users</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

