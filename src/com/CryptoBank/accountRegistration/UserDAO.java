package com.CryptoBank.accountRegistration;

public interface UserDAO {
	
	public int insertUser(User u);
	public User getUser(String username, String pass);

}
