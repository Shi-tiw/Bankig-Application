package com.CryptoBank.addressChange;

public class AddressChangeUser {
	private String uname;
	private String password;
	private String address;
	private String city;
	private String state;
	private String pincode;
	public AddressChangeUser(String uname, String password, String address, String city, String state, String pincode) {
		super();
		this.uname = uname;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	

}
