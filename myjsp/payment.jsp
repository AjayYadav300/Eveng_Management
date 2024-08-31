<%-- 
    Document   : payment
    Created on : 17 Nov, 2023, 9:12:00 PM
    Author     : arpit
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <li  style="position: absolute; left: 30%; font-size: 20px;"><a href="book.jsp">Book</a></li>
            <li  style="position: absolute; left: 37%; font-size: 20px;"><a href="bookHis1.jsp">Booking History</a></li>
            <li  style="position: absolute; left: 48%; font-size: 20px;"><a href="#">Contact</a></li>
            <!--<li  style="position: absolute; left: 56%; font-size: 20px;"><a href="eventList.jsp">Event List</a></li>-->
            <!--<li  style="position: absolute; left: 63%; font-size: 20px;"><a href="venue.jsp">Venue</a></li>-->
            <li  style="position: absolute; right: 2%; top: 25%;"><button id="navbutton"><a href="index.html">Log out</a></button></li>
        </ul>
    </nav>   
</header> 
        <div id="hello">
        <form action="/mydemo/booking" method="post">
            <h2>Payment Details</h2>
         <c:if test="${not empty succMsg}">
        <p>${succMsg}</p>
        
        <c:remove var="succMsg" scope="session" />
    </c:if> 
        <c:if test="${not empty failedMsg}">
        <p>${failedMsg}</p>
        <c:remove var="failedMsg" scope="session" />
    </c:if>
            <label for="name">Person Name</label>
            <br>
            <input type="text" name="pname" id="name" required>
            <br>
            <label for="pno">Card Number</label>
            <br>
            <input type="text" name="pno" id="pno" required>
            <br>
            <label for="pex">Expiry</label>
            <br>
            <input type="month" name="pex" id="pex" required>
            <label for="pc">CVV/CVC</label>
            <input type="text" name="pc" id="pc" required><br>
            <input type="submit" value="Pay">
        </form>
            </div>
    </body>
</html>
