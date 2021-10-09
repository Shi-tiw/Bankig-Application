package com.CryptoBank.addressChange;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/addressChange")
public class AddressChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AddressChange() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AddressChangeDAOimpl acdl = new AddressChangeDAOimpl();
	       
	       String user = request.getParameter("uname");
	       String pass = request.getParameter("password");
	       String adr = request.getParameter("addressn");
	       String cit = request.getParameter("cityn");
	       String stn = request.getParameter("staten");
	       String pin = request.getParameter("pincode");
	       String submitType = request.getParameter("submit");
	       
	       AddressChangeUser aku = new AddressChangeUser(user,pass,adr,cit,stn,pin);
	      try {
	       if(submitType.equals("Change Address"))
	       { 
	    	   acdl.changeAddress(aku, user);
	    	   request.setAttribute("message","Address is Changed");
	   		   request.getRequestDispatcher("amountsuccess.jsp").forward(request, response);	
	    	   }
	    	   else {
	    		request.setAttribute("message", "Wrong Credentials");
	   			request.getRequestDispatcher("logout.jsp").forward(request, response);
	    	   }
	       }
	      catch(Exception e){
	           e.printStackTrace();
	       }
	
	       }
		}

