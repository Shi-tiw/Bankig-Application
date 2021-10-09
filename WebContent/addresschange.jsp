<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Change</title>
</head>
<div align="center">
  <h1>Address Change Form</h1>
  <h3>Enter Details to proceed to Change address </h3>
   <form action="addressChange" method ="post">
   <table style="with: 80%">
   <tr><td>
   <h3>${message}</h3>
   <h3>${successmessage}</h3>
   </td>
   <td></td>
   </tr>
   <tr>
     <td>User Name</td>
     <td><input type="text" name="uname" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
    <tr>
     <td>New Address</td>
     <td><input type="text" name="addressn" /></td>
    </tr>
    <tr>
     <td>New City</td>
     <td><input type="text" name="cityn" /></td>
    </tr>
    <tr>
     <td>New State</td>
     <td><input type="text" name="staten" /></td>
    </tr>
    <tr>
     <td>New Pincode</td>
     <td><input type="text" name="pincode" /></td>
    </tr>
    
</table>
      <input type="submit" name ="submit" value="Change Address" />
</form>
</div>
</body>
</html>
