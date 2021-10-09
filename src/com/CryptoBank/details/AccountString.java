package com.CryptoBank.details;

public class AccountString {
	String cid;
	String uname;
	String account;
	String tme;
	public AccountString(String cid, String uname, String account, String tme) {
		
		this.cid = cid;
		this.uname = uname;
		this.account = account;
		this.tme = tme;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getTme() {
		return tme;
	}
	public void setTme(String tme) {
		this.tme = tme;
	}
	
	
	
	
	
}
