<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User Registration</title>
</head>
<body>
 <div align="center">
  <h1>New Account Register Form</h1>
   <form action="loginRegister" method ="post">
   <table style="with: 80%">
   <tr>
     <td>User Name</td>
     <td><input type="text" name="uname" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="email" name="email" /></td>
    </tr>
    <tr>
     <td>First Name</td>
     <td><input type="text" name="FirstName" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="LastName" /></td>
    </tr>
    <tr>
     <td>Gender</td>
     <td><input type="text" name="gender" /></td>
    </tr>
    <tr>
    <tr>
     <td>Date of Birth</td>
     <td><input type="text" name="dob" /></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="address" /></td>
    </tr>
    <tr>
     <td>City</td>
     <td><input type="text" name="city" /></td>
    </tr>
    <tr>
    <tr>
     <td>State</td>
     <td><input type="text" name="state" /></td>
    </tr>
    <tr>
   <tr>
     <td>Pincode</td>
     <td><input type="text" name="pincode" /></td>
    </tr>
    <tr>
     <td>Phone No</td>
     <td><input type="text" name="phoneNo" /></td>
    </tr>
   </table>
   <input type="submit" name ="submit" value="Register" />
  </form>
 </div>
</body>
</html>