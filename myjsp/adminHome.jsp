<%-- 
    Document   : adminHome
    Created on : 28 Oct, 2023, 7:18:22 PM
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
    <style>
        .group{
            border:1px solid black;
            margin: 5px;
            width: 100px;
            text-align: center;
            float: left;
            /*text-decoration: none;*/
            color: white;
            background-color: black;
        }
        a{
            text-decoration: none;
            color: white;
        }
    </style>
    <body>
        <h1>Admin Home</h1>
         <c:if test="${not empty userobj}">
            <h1>Name:${userobj.name}</h1>
            <h1>Email:${userobj.email}</h1>
        </c:if>
            <div class="group"> <h3><a href="userDetail.jsp">User List</a></h3><br/></div>
           <div class="group"> <h3><a href="bookHis.jsp">Booking History</a></h3><br/></div>
           <div class="group"> <h3><a href="addEvent.jsp">Add Event</a></h3><br/></div>
           <div class="group"> <h3><a href="eventList.jsp">Event List</a></h3><br/></div>
           <div class="group"> <h3><a href="venue.jsp">Vanue</a></h3><br/></div>
            
    </body>
</html>
