<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
 <div align="center">
  <h1>Login Successful !!!!</h1>
  <h1>${message} !!!! Welcome Admin</h1>
  <table>
  <tr><td>
   <form action="adminlogout">
    <input type="submit" name="out" value="Log out" />
    </form></table>
 </div>
</body>
</html>