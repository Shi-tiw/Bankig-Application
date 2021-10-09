package com.CryptoBank.accountRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOimpl implements UserDAO {

	  static Connection con;
	  static PreparedStatement ps;
      

	  
	@Override
	public int insertUser(User u) {

		int status = 0;
		String sql = "INSERT INTO user" +
				"  (uname,password1,email,FirstName,LastName,gender,dob,address,city,state,pincode,phoneNo) VALUES " + 
			    " (?,?,?,?,?,?,?,?,?,?,?,?);"; 
		String sql3 = "INSERT INTO trans(uname,pass) VALUES " + " (?,?);";
		
		try {
			con = ConnectioDao.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPassword());
		    ps.setString(3, u.getEmail());
			ps.setString(4, u.getFirstName());
			ps.setString(5, u.getLastName());
			ps.setString(6, u.getGender());
			ps.setString(7, u.getDob());
			ps.setString(8, u.getAddress());
			ps.setString(9, u.getCity());
			ps.setString(10,u.getState());
			ps.setString(11, u.getPincode());
			ps.setString(12, u.getPhoneNo());
			
			status = ps.executeUpdate();
			ps = con.prepareStatement(sql3);
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPassword());
			status = ps.executeUpdate();
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return status ;
	}

	@Override
	public User getUser(String username, String password) {
  
		User u = new User();
		String sql1 = "SELECT * FROM user where uname=? and password1 =?";
     try {
		   con = ConnectioDao.getCon();
		   ps = con.prepareStatement(sql1);
		   ps.setString(1, username );
		   ps.setString(2, password);
		   
		   ResultSet rs = ps.executeQuery();
		   
		   while(rs.next())
		   {
			   u.setUname(rs.getString(1));
			   u.setPassword(rs.getString(2));
			   u.setEmail(rs.getString(3));
			   u.setFirstName(rs.getString(4));
			   u.setLastName(rs.getString(5));
			   u.setGender(rs.getString(6));
			   u.setDob(rs.getString(7));
			   u.setAddress(rs.getString(8));
			   u.setCity(rs.getString(9));
			   u.setState(rs.getString(10));
			   u.setPincode(rs.getString(11));
			   u.setPhoneNo(rs.getString(12));
			   
		   }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return u;
	}
	
	
}
