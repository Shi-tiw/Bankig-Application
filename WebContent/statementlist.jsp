<%@page import="java.util.ArrayList"%>
<%@page import="com.CryptoBank.statement.ArrayString"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%
        ArrayList list = (ArrayList)request.getAttribute("list");
          %>  
   
<!DOCTYPE html>
<html>
<head>
<title>Statement List</title>
</head>
<body>
<div align="center">
   <h1>Transaction Statement</h1>
     <table style="with: 80%">
         <tr bgcolor="00FF7F"> 
<th><b>Transaction ID</b></th>
          <th><b>Username</b></th>
          <th><b>Sent by A/C No</b></th>
          <th><b>Received by A/C No</b></th>
          <th><b>Deposit</b></th>
          <th><b>Withdrawl</b></th>
          <th><b>Balance</b></th>
          <th><b>Date:Time</b></th>
         </tr>
<% for(int i = 0; i< list.size(); i++){ %>
  <tr>
    <% ArrayString ast = (ArrayString)list.get(i);%>
    <td>
         <%= ast.getTransID() %>
    </td>
    <td>
         <%= ast.getUname() %>
    </td>
    <td>
         <%= ast.getSendAc() %>
    </td>
    <td>
         <%= ast.getReciAc() %>
    </td>
    <td>
         <%= ast.getDeposit() %>
    </td>
    <td>
         <%= ast.getWithdrawl() %>
    </td>
 
    <td>
         <%= ast.getBalance() %>
    </td>
    <td>
         <%= ast.getDtm() %>
    </td>
    
  </tr>
    


<% } %>



</table>
</div>
</body>
</html>