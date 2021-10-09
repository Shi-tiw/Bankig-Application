package com.CryptoBank.details;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

public class DeleteDetailsDAOimpl implements DeleteDetailsDAO {
	static Connection con;
	static PreparedStatement ps;

	@Override
	public ArrayList<AccountString> printdetails() {
		
		ArrayList<AccountString> acd = new ArrayList<>();
		String sql14 = "SELECT * FROM closedaccount";
		try {
			con = ConnectiondeldetailsDao.getCon();
			ps = con.prepareStatement(sql14);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("countid");
				String usern = rs.getString("uname");
				String acno = rs.getString("acn");
				Timestamp tt = rs.getTimestamp("dtm");
				
				String tdm = tt.toString();
				String sid = String.valueOf(id);
				AccountString ab = new AccountString(sid,usern,acno,tdm);
				acd.add(ab);
			}
		}catch(Exception ex){
            ex.printStackTrace();;
        }
		return acd;
	}

}
