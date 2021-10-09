package com.CryptoBank.transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Timestamp;



public class TransDAOimpl implements TransDAO {

	 int prevbal =0; 
	 static Connection con;
	 static PreparedStatement ps;
	 
	 public boolean previousbal(String user, String amt)
	 {

		 boolean status = false;
		 int previ = Integer.parseInt(amt);
		 String sql7 = "select * from trans  where uname =? order by transID desc limit 1;";
	     try {
				con = ConnectionTransDao.getCon();
				ps = con.prepareStatement(sql7);
				ps.setString(1, user);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					 String balance1 = rs.getString("balance");
					 prevbal = Integer.parseInt(balance1);
					 if(prevbal <previ)
					 {
						 return status;
					 }
					 else
					 {
						 status = true;
					 }
				}
	          con.close();
	 }
	     
	     catch(Exception e)
			{
				System.out.println(e);
			}
	     
	     return status;
	     
	 }
     
	@Override
	public boolean insertWithdrawal(WithdrawUser wu) {
	     boolean status = false;
	     
	     String sql3 = "INSERT into trans " +
	     " (uname,pass,sendAC,reciAC,withdrawl) VALUES " + 
	     " (?,?,?,?,?)";
	     
	     
	     try {
				con = ConnectionTransDao.getCon();
				ps = con.prepareStatement(sql3);
				ps.setString(1, wu.getUname());
				ps.setString(2, wu.getPassword());
				ps.setString(3, wu.getOld());
				ps.setString(4, wu.getNewc());
				ps.setString(5, wu.getAmt());
				
				ps.executeUpdate();
				con.close();
				status = true;
				
	     }
	     
	     catch(Exception e)
			{
				System.out.println(e);
			}
           return status;
		}
	
	 public void update()
	 {
		 int put = 0;
		 int id = 0;
		 String sql4 = "select * from trans  order by transID desc limit 1;";
		 String sql5 = "update trans set balance=? where transID =?"; 
		 try{
			 con = ConnectionTransDao.getCon();
			 ps = con.prepareStatement(sql4);
			 
			 ResultSet rs = ps.executeQuery();
			 
			 while(rs.next()) {
				 int ID = rs.getInt("transID");
				 String withdrawl = rs.getString("withdrawl");
	         
			
				
				 int wtd = Integer.parseInt(withdrawl);
				 
				 prevbal = prevbal - wtd;
				 put = prevbal;	
				 id = ID;
				 }
			String bal1 = String.valueOf(put);
			String id1 = String.valueOf(id);
			 ps = con.prepareStatement(sql5);
			 ps.setString(1,bal1);
			 ps.setString(2, id1);
			 ps.executeUpdate();
			 con.close();
			 }
		 catch(Exception e)
			{
				System.out.println(e);
			}		
	 }


	
}
