<%-- 
    Document   : register-staff
    Created on : Mar 10, 2020, 11:37:30 PM
    Author     : SANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<h2>Register</h2>
<form action="StaServlet">
    <c:if test="${ACTION == null}">
        <c:set var="ACTION" value="SaveOrUpdate"/>
    </c:if>
    <input type="hidden" class="form-control" name="action" value="${ACTION}" >
    <div class="form-group">
        <label>Id</label>
        <input type="text" class="form-control" name="id" value="<c:if test="${STAFFS != null}">${STAFFS.id}</c:if>" placeholder="Enter Id">
    </div>

    <div class="form-group">
        <label>Name</label>
        <input type="text" class="form-control" name="name" value="<c:if test="${STAFFS != null}">${STAFFS.name}</c:if>" placeholder="Enter Name">
    </div>

    <div class="form-group">
        <label>Birthday</label>
        <input type="date" class="form-control" name="birthday" value="$<c:if test="${STAFFS != null}">${STAFFS.birthday}</c:if>" style="padding: 0px 12px" placeholder="Enter Birthday">
    </div>

    <div class="form-group">
        <label>Email</label>
        <input type="text" class="form-control" name="email" value="<c:if test="${STAFFS != null}">${STAFFS.email}</c:if>" placeholder="Enter Email">
    </div>

    <div class="form-group">
        <label>Gender</label>
        <div class="radio"><!--value = 1 => Nam| 0 =>Nu -->
            <label class="checkbox-inline"><input type="radio" name="gender"  value="1" checked>Male</label>
            <br>
            <label class="checkbox-inline"><input type="radio" name="gender"  value="0"  <c:if test="${STAFFS != null}">${STAFFS.gender == true ? "" : "checked"}</c:if>>Female</label>

        </div>
    </div>

    <div class="form-group">
        <label>Notes</label>
        <textarea class="form-control" name="notes" rows="4" cols="300" value="<c:if test="${STAFFS != null}">${STAFFS.note}</c:if>"></textarea>
    </div>

    <div class="form-group">
        <label>Phone</label>
        <input type="text" class="form-control" name="phone" value="<c:if test="${STAFFS != null}">${STAFFS.phone}</c:if>" placeholder="Enter Phone">
    </div>

    <div class="form-group">
        <label>Photo</label><br>
        <img alt="image" src="uploads/<c:if test="${STAFFS != null}">${STAFFS.photo}</c:if>" id="image-staff" height="150px">
        <input type="file" accept="image/*" class="form-control" name="photo" value="<c:if test="${STAFFS != null}">${STAFFS.photo}</c:if>" placeholder="Enter Photo" onchange="loadFile(event)">
    </div>

    <div class="form-group">
        <label>Salary</label>
        <input type="text" class="form-control" name="salary" value="<c:if test="${STAFFS != null}">${STAFFS.salary}</c:if>" placeholder="Enter Salary">
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
    <a href="StaServlet?action=List" class="btn btn-primary">Display Users</a>
</form>
<!--    <script>
    var loadFile = function(event) {
        var reader = new FileReader();
        reader.onload = function(){
            var output = document.getElementById('image-staff');
            output.src = reader.result;
        };
        console.log(event.target.files[0]);
        reader.readAsDataURL(event.target.files[0]);
    };
    </script>-->
