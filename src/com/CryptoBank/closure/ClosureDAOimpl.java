package com.CryptoBank.closure;

import java.sql.Connection;
import java.sql.PreparedStatement;



public class ClosureDAOimpl implements ClosureDAO {

	static Connection con;
	static PreparedStatement ps;
	public boolean closeAcHistory(String user,String ac)
	{
		boolean status = false;
		String sql11 = "INSERT INTO closedaccount(uname,acn) values "+ 
		                " (?,?);";
		try {
			con = ConnectionClosureDao.getCon();
			ps = con.prepareStatement(sql11);
			ps.setString(1, user);
			ps.setString(2, ac);
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
	@Override
	public boolean insertClosure(ClosureUser cu) {
		boolean status = false;
	     String sql7 = "DELETE FROM user WHERE  " +
	     "uname=?"; 
	     try {
				con = ConnectionClosureDao.getCon();
				ps = con.prepareStatement(sql7);
				ps.setString(1, cu.getUname());
	
				
				ps.execute();
				con.close();
				status = true;
	     }
	     
	     catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			return status ;
		}
	
	
	 }


