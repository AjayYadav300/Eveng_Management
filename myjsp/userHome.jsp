<%-- 
    Document   : userHome
    Created on : 28 Oct, 2023, 7:17:38 PM
    Author     : arpit
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
        <h1>User Home</h1>
        <c:if test="${not empty userobj}">
            <h1>Name:${userobj.name}</h1>
            <h1>Email:${userobj.email}</h1>
        </c:if>
            <a href="book.jsp">click</a>
    </body>
</html>
