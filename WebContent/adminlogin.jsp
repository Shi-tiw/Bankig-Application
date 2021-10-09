<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
 <div align="center">
  <h1>Admin Login</h1>
  <form action="admin_login" method="post">
   <table style="with: 100%">
   <tr>
   <td><h3>${message}</h3>
   </td> 
   <td></td>
   </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>

   </table>
   <input type="submit" name ="submit" value="Login" />
  </form>
 </div>
</body>
</html>