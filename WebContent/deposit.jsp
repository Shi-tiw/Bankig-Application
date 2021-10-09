<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit Money</title>
</head>
<div align="center">
  <h1>Deposit Form</h1>

  <h3>Enter Details to proceed to Deposit</h3>
   <form action="deposit" method ="post">
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
     <td>Your Account Number</td>
     <td><input type="text" name="old" /></td>
    </tr>
    <tr>
     <td>Deposit Money To Account</td>
     <td><input type="text" name="newc" /></td>
    </tr>
    <tr>
     <td>Deposit Amount</td>
     <td><input type="text" name="amt" /></td>
    </tr>
    <tr>
</table>
      <input type="submit" name ="submit" value="Deposit" />
</form>
</div>
</body>
</html>
