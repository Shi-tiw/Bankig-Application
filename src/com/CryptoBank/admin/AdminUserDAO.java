package com.CryptoBank.admin;

//import com.CryptoBank.accountRegistration.User;

public interface AdminUserDAO {
	public AdminUser getAdmin(String username, String pass);
}
