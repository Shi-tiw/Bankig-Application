package com.CryptoBank.transactions;

public class WithdrawUser {
	
	private String uname;
	private String password;
	private String old;
	private String newc;
	private String amt;
	
	public WithdrawUser()
	{
		
	}
	
	public WithdrawUser(String uname, String password, String old, String newc, String amt) {
		
		this.uname = uname;
		this.password = password;
		this.old = old;
		this.newc = newc;
		this.amt = amt;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOld() {
		return old;
	}
	public void setOld(String old) {
		this.old = old;
	}
	public String getNewc() {
		return newc;
	}
	public void setNewc(String newc) {
		this.newc = newc;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
}
