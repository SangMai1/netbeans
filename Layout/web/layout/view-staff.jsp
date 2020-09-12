<%-- 
    Document   : view-staff.jsp
    Created on : Mar 10, 2020, 11:37:43 PM
    Author     : SANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<h2>List Users 4</h2>
<a href="StaffServlet" class="btn btn-primary">Add Users</a>
<table class="table table-bordered">
    <thead>
        <tr>
            <th>Id</th>
            <th>Birthday</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Name</th>
            <th>Notes</th>
            <th>Phone</th>
            <th>Photo</th>
            <th>Salary</th>
            <th>Depart_id</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>      
    <c:forEach var="st" items="${LIST_STAFFS}">
        <tr>
            <td>${st.id}</td>
            <td>${st.birthday}</td>
            <td>${st.email}</td>
            <td>${st.gender}</td>
            <td>${st.name}</td>
            <td>${st.notes}</td>
            <td>${st.phone}</td>
            <td>${st.photo}</td>
            <td>${st.salary}</td>
            <td>${st.depart_id.id}</td>
            <td><a class="btn btn-primary btn-sm" href="StaffServlet?action=AddOrEdit&id=${st.id}">Edit</a> |
                <a class="btn btn-danger btn-sm" href="StaffServlet?action=Delete&id=${st.id}">Del</a></td>
        </tr>

    </c:forEach> 
</tbody>
</table>