<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <div align="center">
  <h1>Login into Account</h1>
  <form action="loginRegister" method="post">
   <table style="with: 100%">
   <tr>
   <td><h3>${message}</h3>
   <h3>${succesMessage}</h3>
   </td>
   
   <td></td>
   </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" name="uname" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
  
   <tr><td><input type="submit" name="submit" value="Login"></td>
   <td><a href= "userregister.jsp" >Register for New Account </a>
   </td></tr> 
    </table>
  </form>
 </div>
</body>
</html>