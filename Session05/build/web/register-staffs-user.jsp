<%-- 
    Document   : register-staffs-user
    Created on : Mar 4, 2020, 10:09:22 AM
    Author     : SANG
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="model.DepartDAO"%>
<%@page import="model.Depart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <%
        if (request.getParameter("LIST_DEPART") == null) {
                request.setAttribute("LIST_DEPART", new DepartDAO().getAll());
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
                    <form action="StaffServlet?action=${ACTION}"  method="post" enctype="multipart/form-data">
                        
                        <div class="form-group">
                            <label>Id</label>
                            <input type="text" class="form-control" name="id" value="${STAFFS.id}" placeholder="Enter Id">
                        </div>
                        
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" class="form-control" name="name" value="${STAFFS.name}" placeholder="Enter Name">
                        </div>
                        
                        <div class="form-group">
                            <label>Birthday</label>
                            <input type="date" class="form-control" name="birthday" value="<fmt:formatDate value="${STAFFS.birthday}" pattern="dd-MM-yyyy"></fmt:formatDate>" style="padding: 0px 12px" placeholder="Enter Birthday">
                        </div>
                        
                        <div class="form-group">
                            <label>Email</label>
                            <input type="text" class="form-control" name="email" value="${STAFFS.email}" placeholder="Enter Email">
                        </div>
                        
                        <div class="form-group">
                            <label>Gender</label>
                            <div class="radio"><!--value = 1 => Nam| 0 =>Nu -->
                                <label class="checkbox-inline"><input type="radio" name="gender"  value="1" <c:if test="${STAFFS.gender}">checked</c:if> >Male</label>
                                <label class="checkbox-inline"><input type="radio" name="gender"  value="0" <c:if test="${not STAFFS.gender}">checked</c:if> >Female</label>

                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label>Notes</label>
                            <textarea class="form-control" name="notes" rows="4" cols="300" value="${STAFFS.notes}"></textarea>
                        </div>
                        
                        <div class="form-group">
                            <label>Phone</label>
                            <input type="text" class="form-control" name="phone" value="${STAFFS.phone}" placeholder="Enter Phone">
                        </div>
                        
                        <div class="form-group">
                            <label>Photo</label><br>
                            <c:if test="${STAFFS.photo != null}">
                                <img src="uploads/${STAFFS.photo}" width="80" height="70"/>
               
                            </c:if>
                                <input type="file" class="form-control" name="photo" placeholder="Enter Photo">
                        </div>
                        
                        <div class="form-group">
                            <label>Salary</label>
                            <input type="number" class="form-control" name="salary" value="${STAFFS.salary}" placeholder="Enter Salary">
                        </div>
                        
                        <div class="form-group">
                            <label>Choose Depart_id</label>
                            <select name="depart_id" class="form-control">
                                <c:forEach var="u" items="${LIST_DEPART}">
                                    <option value="${u.id}">${u.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="StaffServlet?action=List" class="btn btn-primary">Display Users</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
