package com.CryptoBank.statement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionStatDao implements Provider {
	static Connection con = null;
	static String dbDriver = "com.mysql.cj.jdbc.Driver";
	public static Connection getCon()
	{
		try {
			Class.forName(dbDriver);
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
	}

}
