package com.CryptoBank.closure;

public class TransferUser {
		private String uname;
		private String password;
		private String old;
		public TransferUser() {
			
		}
		public TransferUser(String uname, String password, String old) {
			super();
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
