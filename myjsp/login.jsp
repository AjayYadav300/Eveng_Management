<%-- 
    Document   : login
    Created on : 28 Oct, 2023, 7:19:23 PM
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
                header {
            position:sticky;
           
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
  .grid {
    margin-left: auto;
    margin-right: auto;
    max-width: 320px;
    max-width: 20rem;
    width: 90%;
  }
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
 a {
    color: #eee;
    outline: 0;
    text-decoration: none;
  } 
  a:focus,
  a:hover {
    text-decoration: underline;
  }
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
  .login input[type='text']:hover {
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
            <li  style="position: absolute; right: 1%; top: 25%;"><button id="navbutton"><a href="login.jsp">Login</a></button></li>
            <li  style="position: absolute; right: 8%; top: 25%;"><button id="navbutton"><a href="register.jsp">Sign Up</a></button></li>
        </ul>
    </nav>   
</header> 
        <br><br><br><br><br><br><br><br><br>
<center><h2 style="color: white;">Login Form</h2></center>
        <c:if test="${not empty failedMsg}">
            <h5>${failedMsg}</h5>
            <c:remove var="faileMsg" scope="session"/>
        </c:if>
            <form action="/mydemo/LoginServlet" method="post" class="form login">
        <div class="form__field">
        <label for="login__username"><svg class="icon"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#user"></use></svg><span class="hidden">Username</span></label>
        <input id="login_username" type="text" name="femail" class="form_input" placeholder="Username" required>
      </div>

      <div class="form__field">
        <label for="login__password"><svg class="icon"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#lock"></use></svg><span class="hidden">Password</span></label>
        <input id="login_password" type="password" name="pass" class="form_input" placeholder="Password" required>
      </div>

      <div class="form__field">
        <input type="submit" value="Sign In">
      </div>

    </form>

    <p class="text--center">Not a member? <a href="register.jsp">Sign up now</a> <svg class="icon"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="assets/images/icons.svg#arrow-right"></use></svg></p>

  </div>

  <svg xmlns="http://www.w3.org/2000/svg" class="icons"><symbol id="arrow-right" viewBox="0 0 1792 1792"><path d="M1600 960q0 54-37 91l-651 651q-39 37-91 37-51 0-90-37l-75-75q-38-38-38-91t38-91l293-293H245q-52 0-84.5-37.5T128 1024V896q0-53 32.5-90.5T245 768h704L656 474q-38-36-38-90t38-90l75-75q38-38 90-38 53 0 91 38l651 651q37 35 37 90z"/></symbol><symbol id="lock" viewBox="0 0 1792 1792"><path d="M640 768h512V576q0-106-75-181t-181-75-181 75-75 181v192zm832 96v576q0 40-28 68t-68 28H416q-40 0-68-28t-28-68V864q0-40 28-68t68-28h32V576q0-184 132-316t316-132 316 132 132 316v192h32q40 0 68 28t28 68z"/></symbol><symbol id="user" viewBox="0 0 1792 1792"><path d="M1600 1405q0 120-73 189.5t-194 69.5H459q-121 0-194-69.5T192 1405q0-53 3.5-103.5t14-109T236 1084t43-97.5 62-81 85.5-53.5T538 832q9 0 42 21.5t74.5 48 108 48T896 971t133.5-21.5 108-48 74.5-48 42-21.5q61 0 111.5 20t85.5 53.5 62 81 43 97.5 26.5 108.5 14 109 3.5 103.5zm-320-893q0 159-112.5 271.5T896 896 624.5 783.5 512 512t112.5-271.5T896 128t271.5 112.5T1280 512z"/></symbol></svg>


        </form>
    </body>
</html>
