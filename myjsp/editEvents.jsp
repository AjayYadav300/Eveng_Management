<%-- 
    Document   : editBooks
    Created on : 16 Nov, 2023, 9:08:46 AM
    Author     : arpit
--%>

<%@page import="classes.EventDtls"%>
<%@page import="DAO.EventDAOImpl"%>
<%@page import="Databases.DBConnect"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>EDIT EVENTS</h2>
       
            
            <%
                int id=Integer.parseInt(request.getParameter("id"));
                EventDAOImpl dao=new EventDAOImpl(DBConnect.getConn());
                EventDtls e=dao.getEventById(id);
                %>
        <form action="/mydemo/EditEventServlet" method="post" enctype="multipart/form-data">
            <input type="hidden" name="id" value="<%= e.getEventId()%>">    
        <label for="ename">Event Name</label>
        <br>
        <input type="text" name="ename" id="ename" value="<%=e.getEventName()%>" required>
        <br>
        <label for="edes">Description</label>
        <br>
        <input type="text" name="edes" id="edes" value="<%=e.getEventDiscription()%>" required>
        <br>
        <label for="eimg" >Upload Photo</label>
        <br>
        <input type="file" name="eimg" value="<%=e.getPhotoName()%>" id="eimg">
        <br><br>
        <input type="submit" value="Update">
        </form>
    </body>
</html>

