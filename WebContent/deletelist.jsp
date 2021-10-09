<%@page import="java.util.ArrayList"%>
<%@page import="com.CryptoBank.details.AccountString"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
        ArrayList list = (ArrayList)request.getAttribute("list");
          %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Closed Account History</title>
</head>
<body>
<div align="center">
   <h1>Closed Account History</h1>
     <table style="with: 80%">
         <tr bgcolor="00FF7F"> 
         <th><b>S.No</b></th>
          <th><b>Username</b></th>
          <th><b>Account No</b></th>
          <th><b>Date:Time</b></th>
          </tr>
          <% for(int i = 0; i< list.size(); i++){ %>
          <tr>
          <% AccountString ast = (AccountString)list.get(i);%>
    <td>
         <%= ast.getCid() %>
    </td>
    <td>
         <%= ast.getUname() %>
    </td>
    <td>
         <%= ast.getAccount() %>
    </td>
    <td>
         <%= ast.getTme() %>
    </td>
    </tr>
    
    <% } %>
          </table>
          </div>
 
</body>
</html>