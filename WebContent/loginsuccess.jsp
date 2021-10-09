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
  <h1>Functionalities</h1>
  <h1>${message} !!!! Welcome</h1>
  <table>
   <tr>
   <td><a href= "addresschange.jsp" >Click here to Change Address </a>
   </td>
   </tr>
   <tr><td>
   <form action="logout">
    <input type="submit" name="out" value="Log out" />
    </form>
   </table>
 </div>
</body>
</html>