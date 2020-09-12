<%-- 
    Document   : layout_main
    Created on : Mar 10, 2020, 8:23:04 AM
    Author     : SANG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.DepartDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Online Shopping Mall</title>

        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <script src="js/bootstrap.min.js"></script>

        <!-- Poly -->
        <link href="css/poly.css" rel="stylesheet" />
    </head>
    <body>
        <div class="container">
            <%
                if (request.getParameter("LIST_DEPART") == null) {
                    request.setAttribute("LIST_DEPART", new DepartDAO().getAll());
                }
            %>
            <jsp:include page="layout/head.jsp"></jsp:include>
            <jsp:include page="layout/menu.jsp"></jsp:include>
                <div class="poly-sheet row">
                <jsp:include page="layout/register-staff.jsp"></jsp:include>
                    <article class="col-sm-9">
                    <c:if test="${MESSAGE != null}">
                        <div class="alert alert-success">
                        <strong>${MESSAGE}</strong>
                      </div>
                    </c:if>
                        <jsp:include page="${CONTENT}"></jsp:include>
                    </article>
                <jsp:include page="layout/aside.jsp"></jsp:include>

                </div>
            <jsp:include page="layout/footer.jsp"></jsp:include>

        </div>
    </body>
</html>
