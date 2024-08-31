<%-- 
    Document   : venue
    Created on : 17 Nov, 2023, 1:29:41 PM
    Author     : arpit
--%>

<%@page import="java.util.List"%>
<%@page import="classes.EventDtls"%>
<%@page import="DAO.EventDAOImpl"%>
<%@page import="Databases.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style>
            #hello{
               width: 100%;
            height: 100vh;
            display: flex;
            justify-content: center; 
            align-items: center;
            }
             body {                   
            background-repeat: no-repeat;
            background-size: 100%;
            font-family: Arial, sans-serif;
         
            margin: 0;
            padding: 0;
            overflow: hidden;
            
            z-index: -1;
            }        
        header {
            position:sticky;
            background-color: black;
            color: #fff;
            padding: 20px;
        }      
        .fixed-button {
            position: absolute;
            right: 0;
            top: 50%; /* Adjust the top value as needed to center vertically */
            transform: translateY(-50%); /* Center vertically */
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;    
        }       
        a {
  color: #eee;
  outline: 0;
  text-decoration: none;
}
ul {
list-style-type: none;
margin: 0;
padding: 0;
}
li 
{
display: inline;
}
a 
{
color: white;
text-decoration: none;
padding: 10px 10px;
}
a:hover {

transition: all 0.2s ease;
color: rgb(240, 240, 69);
}

#navbutton {   
background-color: #007bff; 
color: #fff;
padding: 10px 20px; 
border: none;
border-radius: 5px;
cursor: pointer;
font-size: 14px;
border-radius: 5px;

}
#navbutton:hover {
background-color: #0056b3;
transition: all 0.2s ease;
}
nav:hover{
transition: all 0.2s ease;
}
        </style>
    </head>
    <body>
        <header>
    <nav>
        <ul>
            <li  style="font-size: 25px;">EVENT MANAGEMENT SYSTEM</li>
            <li  style="position: absolute; left: 30%; font-size: 20px;"><a href="userDetail.jsp">User List</a></li>
            <li  style="position: absolute; left: 37%; font-size: 20px;"><a href="bookHis.jsp">Booking History</a></li>
            <li  style="position: absolute; left: 48%; font-size: 20px;"><a href="addEvent.jsp">Add Event</a></li>
            <li  style="position: absolute; left: 56%; font-size: 20px;"><a href="eventList.jsp">Event List</a></li>
            <li  style="position: absolute; left: 63%; font-size: 20px;"><a href="venue.jsp">Venue</a></li>
            <li  style="position: absolute; right: 2%; top: 25%;"><button id="navbutton"><a href="index.html">Log out</a></button></li>
        </ul>
    </nav>   
</header> 
        
        <div id="hello">
        
        <form action="/mydemo/VenueServlet" method="post">
            <h2>VANUE</h2>
        <c:if test="${not empty succMsg}">
        <p>${succMsg}</p>
        
        <c:remove var="succMsg" scope="session" />
    </c:if> 
        <c:if test="${not empty failedMsg}">
        <p>${failedMsg}</p>
        <c:remove var="failedMsg" scope="session" />
    </c:if>
        <label for="select">Event type</label>
        <br>
        <select name="eventtype" id="select" required="">
         <%
                    EventDAOImpl dao=new EventDAOImpl(DBConnect.getConn());
                    List<EventDtls>list=dao.getAllEvents();
                    for(EventDtls e:list)
                    {%>
                     <option value="<%=e.getEventName()%>"><%=e.getEventName()%></option>
                    <%}
        %>
         </select>
         <br>
         <label for="capacity">Capacity</label>
         <br>
         <input type="text" name="capacity" id="capacity" placeholder="Enter here" required="">
          <br>
         <label for="cost">Cost</label>
         <br>
         <input type="text" name="cost" id="cost" placeholder="Enter here" required="">
          <br>
         <label for="location">Location</label>
         <br>
         <input type="text" name="location" id="location" placeholder="Enter here" required="">
          <br>
         <label for="contact">Contact</label>
         <br>
         <input type="text" name="contact" id="contact" placeholder="Enter here" required="">
         <br>
         <label for="date">Date</label>
         <br>
         <input type="date" name="date" id="date" placeholder="Enter here" required="">
         <br>
         <input type="submit" value="submit">
        </form>
        </div>
    </body>
</html>
