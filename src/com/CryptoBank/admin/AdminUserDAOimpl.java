package com.CryptoBank.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AdminUserDAOimpl implements AdminUserDAO {

	static Connection con;
	static PreparedStatement ps;
	  
	@Override
	public AdminUser getAdmin(String username, String pass) {
		
		AdminUser au = new AdminUser();
		String sql1 = "SELECT * FROM admin_login where username = ? and password1 = ?;";
     try {
		   con = ConnectionDao.getCon();
		   ps = con.prepareStatement(sql1);
		   ps.setString(1, username );
		   ps.setString(2, pass);
		   
		   ResultSet rs = ps.executeQuery();
		   
		   while(rs.next())
		   {
			   au.setUname(rs.getString(1));
			   au.setPassword(rs.getString(2));

			   
		   }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return au;
	}

}
