<%-- 
    Document   : book
    Created on : 17 Nov, 2023, 8:31:50 PM
    Author     : arpit
--%>

<%@page import="classes.VanueDtls"%>
<%@page import="java.util.List"%>
<%@page import="DAO.VanueDAOImpl"%>
<%@page import="Databases.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             table,tr,td,th{
            border: 1px solid black;
            border-collapse: collapse;
        }
        /*@import url('https://fonts.googleapis.com/css?family=Montserrat|Open+Sans|Roboto');*/
*{
 margin:0;
 padding: 0;
 outline: 0;
}
.filter{
 position: absolute;
 left: 0;
 top: 0;
 bottom: 0;
 right: 0;
/* z-index: 1;*/
/* background: rgb(233,76,161);*/
 background: white;
/*background: -moz-linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);
background: -webkit-linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);
background: linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);
filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#e94ca1",endColorstr="#c74ae9",GradientType=1);
opacity: .7;*/
}
table{
 position: absolute;
 z-index: 2;
 left: 50%;
 top: 50%;
 transform: translate(-50%,-50%);
 width: 60%; 
 border-collapse: collapse;
 border-spacing: 0;
 box-shadow: 0 2px 15px rgba(64,64,64,.7);
 border-radius: 12px 12px 0 0;
 overflow: hidden;

}
td , th{
 padding: 15px 20px;
 text-align: center;
 

}
th{
/* background-color: #ba68c8;*/
 background-color: black;
 color: #fafafa;
 font-family: 'Open Sans',Sans-serif;
 font-weight: 200;
 text-transform: uppercase;

}
tr{
 width: 100%;
 background-color: #fafafa;
 font-family: 'Montserrat', sans-serif;
}
tr:nth-child(even){
 background-color: #eeeeee;
}
h2{
    color: red;
    margin-top:  10px;
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
        
<!--        <c:if test="${not empty userobj}">
            <h1>Name:${userobj.name}</h1>
            <h1>Email:${userobj.email}</h1>
        </c:if>-->
    <center><h1>Booking</h1></center>
        <table>
            <thead>
                <tr>
                    <th>Event type.</th>
                    <th>Capacity</th>
                    <th>Cost</th>
                    <th>Location</th>
                    <th>Contact</th>
                    <th>Date</th>
                </tr>
            </thead>
            <tbody>
                <%
                    VanueDAOImpl dao=new VanueDAOImpl(DBConnect.getConn());
                    List<VanueDtls>list=dao.getAllVanue();
                    for(VanueDtls e:list)
                    {%>
                     <tr>
                         <td><%=e.geteType()%></td>
                         <td><%=e.getCapacity()%></td>
                         <td><%=e.getCost()%></td>
                         <td><%=e.getLocation() %></td>
                         <td><%=e.getContact() %></td>
                         <td><%=e.getDate() %></td>
<!--                         <td><a href="payment.jsp?id=">Edit</a><a href="#">Delete</a></td>-->
                         <td><a href="payment.jsp">Book&Pay</a>
                        
                    </tr>
                    <%}
                %>
               
            </tbody>
        </table>
    </body>
</html>
