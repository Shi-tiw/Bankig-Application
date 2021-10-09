package com.CryptoBank.transactions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/transfer")
public class MoneyTransfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MoneyTransfer() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TransDAOimpl td = new TransDAOimpl();
	       String uname1 = request.getParameter("uname");
	       String password = request.getParameter("password");
	       String old = request.getParameter("old");
	       String newc = request.getParameter("newc");
	       String amt = request.getParameter("amt");
	       String submitType = request.getParameter("submit");
	       
	       WithdrawUser wu = new WithdrawUser(uname1,password,old,newc,amt);
	       if(submitType.equals("Transfer"))
	       {   
	    	   
	    	   wu.setUname(uname1);
	    	   wu.setPassword(password);
	    	   wu.setOld(old);
	    	   wu.setNewc(newc);
	    	   wu.setAmt(amt);
	    	
	    	   try {
	    	   
	    		   if(td.previousbal(uname1, amt))
	    	   {
	    			   if(td.insertWithdrawal(wu))
	    			   {
	    		   td.update();
	    		 request.setAttribute("successmessage",wu.getAmt()+ "MoneyTransfer is Successful");
	   			request.getRequestDispatcher("logout.jsp").forward(request, response);	
	    			   }
	    			   else {
	    		    		request.setAttribute("message", "Wrong Credentials");
	    		   			request.getRequestDispatcher("actransfer.jsp").forward(request, response);
	    		    	   }
	    	   }
	    	   else {
	    		request.setAttribute("message", "Amount Exceeding your Balance");
	   			request.getRequestDispatcher("actransfer.jsp").forward(request, response);
	    	   }
	       }
	       catch(Exception e){
	           e.printStackTrace();
	       }
		}
	       else
	       {
	    	   request.setAttribute("message", "Wrong Operation");
	  			request.getRequestDispatcher("actransfer.jsp").forward(request, response);
	       }
	       
	       
	       
		}

	

	}

