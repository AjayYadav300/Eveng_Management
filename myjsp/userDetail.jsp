<%-- 
    Document   : userDetail
    Created on : 6 Nov, 2023, 11:06:28 PM
    Author     : arpit
--%>

<%@page import="java.util.List"%>
<%@page import="classes.User"%>
<%@page import="Databases.DBConnect"%>
<%@page import="DAO.UserDAOImpl"%>
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
            <li  style="position: absolute; left: 30%; font-size: 20px;"><a href="userDetail.jsp">User List</a></li>
            <li  style="position: absolute; left: 37%; font-size: 20px;"><a href="bookHis.jsp">Booking History</a></li>
            <li  style="position: absolute; left: 48%; font-size: 20px;"><a href="addEvent.jsp">Add Event</a></li>
            <li  style="position: absolute; left: 56%; font-size: 20px;"><a href="eventList.jsp">Event List</a></li>
            <li  style="position: absolute; left: 63%; font-size: 20px;"><a href="venue.jsp">Venue</a></li>
            <li  style="position: absolute; right: 2%; top: 25%;"><button id="navbutton"><a href="index.html">Log out</a></button></li>
        </ul>
    </nav>   
</header> 
        
    <center><h2>UserList</h2></center>
        
<!--        <div class="filter"></div>-->
         <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone NO</th>
            <th>Action</th>
        </tr>
    </thead>
        <%
            UserDAOImpl udo=new UserDAOImpl(DBConnect.getConn());
            List<User>list=udo.getAllUser();
            for(User u:list)
            {%>
                
    <tbody>
        <tr>
            <td><%=u.getId()%></td>
            <td><%=u.getName()%></td>
            <td><%=u.getEmail()%></td>
            <td><%=u.getPhone()%></td>
            <td>Delete</td>
        </tr>
    <br>
    </tbody>          
            <%}
        %>
        </table>
    </body>
</html>
