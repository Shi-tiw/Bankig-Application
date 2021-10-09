package com.CryptoBank.statement;
//import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
//import java.util.List;

public class StatsDAOimpl implements StatsDAO {
    
	static Connection con;
	  static PreparedStatement ps;
	  
	@Override
	public ArrayList<ArrayString> print(String username) {
		
		ArrayList<ArrayString> pk = new ArrayList<>();
		String sql6 = "select transID,uname,sendAC,reciAC,deposit,withdrawl,balance,dtm from trans"
				+ " where uname = ?";
		
		
		try {
			con = ConnectionStatDao.getCon();
			ps = con.prepareStatement(sql6);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
			int id = rs.getInt("transID");
			String usern = rs.getString("uname");
			String sAC = rs.getString("sendAC");
			String rAC = rs.getString("reciAC");
			String depo = rs.getString("deposit");
			String with = rs.getString("withdrawl");
			String bal = rs.getString("balance");
			Timestamp tt = rs.getTimestamp("dtm");
			
			String tdm = tt.toString();
			String ssid = String.valueOf(id);
			ArrayString si = new ArrayString(ssid,usern,sAC,rAC,depo,with,bal,tdm);
			
			pk.add(si);
			}			
		}catch(Exception ex){
            ex.printStackTrace();;
        }
		return pk;
		
		
	}
	
}


