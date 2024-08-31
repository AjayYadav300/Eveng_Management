<%-- 
    Document   : register
    Created on : 23 Oct, 2023, 6:13:32 PM
    Author     : arpit
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
         <style>
  header {
    position:sticky;
    background-color: black;
    color: #fff;
    padding: 20px;
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
 /* config.css */

/* helpers/align.css */



.grid {
  margin-left: auto;
  margin-right: auto;
  max-width: 320px;
  max-width: 20rem;
  width: 90%;
}

/* helpers/hidden.css */

.hidden {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

/* helpers/icon.css */

.icons {
  display: none;
}

.icon {
  display: inline-block;
  fill: #606468;
  font-size: 16px;
  font-size: 1rem;
  height: 1em;
  vertical-align: middle;
  width: 1em;
}

/* layout/base.css */

* {
  -webkit-box-sizing: inherit;
          box-sizing: inherit;
}

html {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  font-size: 100%;
  height: 100%;
}

body {
  background-color: #2c3338;
  color: #606468;
  font-family: 'Open Sans', sans-serif;
  font-size: 14px;
  font-size: 0.875rem;
  font-weight: 400;
  height: 100%;
  line-height: 1.5;
  margin: 0;
  min-height: 100vh;
}

/* modules/anchor.css */

a {
  color: #eee;
  outline: 0;
  text-decoration: none;
}

a:focus,
a:hover {
  text-decoration: underline;
}

/* modules/form.css */

input {
  background-image: none;
  border: 0;
  color: inherit;
  font: inherit;
  margin: 0;
  outline: 0;
  padding: 0;
  -webkit-transition: background-color 0.3s;
  transition: background-color 0.3s;
}

input[type='submit'] {
  cursor: pointer;
}

.form {
  margin: -14px;
  margin: -0.875rem;
}

.form input[type='password'],
.form input[type='text'],
.form input[type='submit'] {
  width: 100%;
}

.form__field {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin: 14px;
  margin: 0.875rem;
}

.form__input {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}

/* modules/login.css */

.login {
  color: #eee;
}

.login label,
.login input[type='text'],
.login input[type='password'],
.login input[type='submit'] {
  border-radius: 0.25rem;
  padding: 16px;
  padding: 1rem;
}

.login label {
  background-color: #363b41;
  border-bottom-right-radius: 0;
  border-top-right-radius: 0;
  padding-left: 20px;
  padding-left: 1.25rem;
  padding-right: 20px;
  padding-right: 1.25rem;
}

.login input[type='password'],
.login input[type='text'] {
  background-color: white;
  border-bottom-left-radius: 0;
  border-top-left-radius: 0;
}

.login input[type='password']:focus,
.login input[type='password']:hover,
.login input[type='text']:focus,
.login input[type='text']:hover
.login input[type='number']:focus,
.login input[type='number']:hover {
  background-color: #434a52;
}

.login input[type='submit'] {
  background-color: #ea4c88;
  color: #eee;
  font-weight: 700;
  text-transform: uppercase;
}

.login input[type='submit']:focus,
.login input[type='submit']:hover {
  background-color: #d44179;
}

/* modules/text.css */

p {
  margin-bottom: 24px;
  margin-bottom: 1.5rem;
  margin-top: 24px;
  margin-top: 1.5rem;
}

.text--center {
  text-align: center;
}
#arp{
  margin-left: 20px;
  margin-top: 0;
}
#tc{
  margin-top: 20px;
}
</style>
    </head>
    <body>
        <header>
    <nav>
        <ul>
            <li  style="font-size: 25px;">EVENT MANAGEMENT SYSTEM</li>
            <li  style="position: absolute; left: 40%; font-size: 20px;"><a href="ok.html">Home</a></li>
            <li  style="position: absolute; left: 45%; font-size: 20px;"><a href="#">About</a></li>
            <li  style="position: absolute; left: 50%; font-size: 20px;"><a href="#">Services</a></li>
            <li  style="position: absolute; left: 56%; font-size: 20px;"><a href="#">Contact</a></li>
            <li  style="position: absolute; right: 1%; top: 25%;"><button id="navbutton"><a href="login.html">Login</a></button></li>
            <li  style="position: absolute; right: 8%; top: 25%;"><button id="navbutton"><a href="signup.html">Sign Up</a></button></li>
        </ul>
    </nav>   
</header> 
<br><br>
<center><h2 style="color: white; margin-bottom: 20px;">SignUp Form</h2></center>
    <c:if test="${not empty succMsg}">
        <p>${succMsg}</p>
        
        <c:remove var="succMsg" scope="session" />
    </c:if> 
        <c:if test="${not empty failedMsg}">
        <p>${failedMsg}</p>
        <c:remove var="failedMsg" scope="session" />
    </c:if>
        <body class="align">

  <div class="grid">

    <form action="/mydemo/RegisterServlet" method="POST" class="form login">


        <div class="form__field">
            <input id="login_name" type="text" name="fname" class="form_input" placeholder="Name" required>
          </div> 
  

      <div class="form__field">
        <input id="login_username" type="text" name="email" class="form_input" placeholder="Email" required>
      </div>

      <div class="form__field">
        <input id="login_password" type="password" name="password" class="form_input" placeholder="Password" required>
      </div>

      <div class="form__field">
        <input id="login_mob" type="text" name="phone" class="form_input" placeholder="Mob. no." required>
      </div>

      <div class="form__field">
        <input id="login_add" type="text" name="address" class="form_input" placeholder="Address" required>
      </div>
      <div class="form_field">
        <input type="checkbox" name="check" id="tc"><br>
       
      </div>
      <label for="tc" id="arp">I agree of statement in Term of service</label><br>

      <div class="form__field">
        <input type="submit" value="Sign Up">
      </div>

    </form>

    <p class="text--center">Already a member? <a href="login.jsp">Login Now</a> 

  </div>
    </body>
</html>
