<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw Money</title>
</head>
<div align="center">
  <h1>Withdrawal Form</h1>

  <h3>Enter Details to proceed to Withdrawal</h3>
   <form action="printStatement" method ="post">
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
</table>
      <input type="submit" name ="submit" value="Print" />
</form>
</div>
</body>
</html>
