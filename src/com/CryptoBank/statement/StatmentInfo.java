package com.CryptoBank.statement;

import java.sql.Timestamp;

public class StatmentInfo {
	
	int transID;
	String uname;
	String sendAc;
	String reciAc;
	String deposit;
	String withdrawl;
	String balance;
	Timestamp dtm;
	
	
	public StatmentInfo(int transID, String uname, String sendAc, String reciAc, String deposit, String withdrawl,
			String balance, Timestamp dtm) {
	
		this.transID = transID;
		this.uname = uname;
		this.sendAc = sendAc;
		this.reciAc = reciAc;
		this.deposit = deposit;
		this.withdrawl = withdrawl;
		this.balance = balance;
		this.dtm = dtm;
	}
	public int getTransID() {
		return transID;
	}
	public void setTransID(int transID) {
		this.transID = transID;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSendAc() {
		return sendAc;
	}
	public void setSendAc(String sendAc) {
		this.sendAc = sendAc;
	}
	public String getReciAc() {
		return reciAc;
	}
	public void setReciAc(String reciAc) {
		this.reciAc = reciAc;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(String withdrawl) {
		this.withdrawl = withdrawl;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public Timestamp getDtm() {
		return dtm;
	}
	public void setDtm(Timestamp dtm) {
		this.dtm = dtm;
	} 
	
	
	
	

}
