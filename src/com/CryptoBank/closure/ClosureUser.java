package com.CryptoBank.closure;

class ClosureUser {
	private String uname;
	private String password;
	private String old;
	public ClosureUser()
	{
		
	}
	public ClosureUser(String uname, String password, String old) {


		this.uname = uname;
		this.password = password;
		this.old = old;
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
}
