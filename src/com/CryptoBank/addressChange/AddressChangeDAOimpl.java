package com.CryptoBank.addressChange;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddressChangeDAOimpl implements AddressChangeDAO {

	static Connection con;
	static PreparedStatement ps;
	
	@Override
	public boolean changeAddress(AddressChangeUser au,String user) {
		 
		boolean status = false;
		String sql8 = "update user set address = ?, city = ?, state=?, pincode=? where uname=?";
		try {
			  con = ConnectionAddrDao.getCon();
			  ps = con.prepareStatement(sql8);
			  ps.setString(1, au.getAddress());
			  ps.setString(2, au.getCity());
			  ps.setString(3, au.getState());
			  ps.setString(4, au.getPincode());
			  ps.setString(5, user);
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

}
