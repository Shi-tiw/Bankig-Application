package com.CryptoBank.transactions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deposit")
public class Deposit extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Deposit() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DepositDAOimpl ddi = new DepositDAOimpl();
		   String uname1 = request.getParameter("uname");
	       String password = request.getParameter("password");
	       String old = request.getParameter("old");
	       String newc = request.getParameter("newc");
	       String amt = request.getParameter("amt");
	       String submitType = request.getParameter("submit");
	       
	       WithdrawUser wu = new WithdrawUser(uname1,password,old,newc,amt);
	       if(submitType.equals("Deposit"))
	       {   
	    	   
	    	   wu.setUname(uname1);
	    	   wu.setPassword(password);
	    	   wu.setOld(old);
	    	   wu.setNewc(newc);
	    	   wu.setAmt(amt);
	    	
	    	   try {
	    		   
	    	   if(ddi.previousbal(uname1))
	    	   {
	    		   if(ddi.insertdeposit(wu))
	    		   {
	    		   ddi.update();
	    		 request.setAttribute("successmessage",wu.getAmt()+ "Deposit is Successful");
	   			request.getRequestDispatcher("amountsuccess.jsp").forward(request, response);	
	    	   }
	    	   else {
	    		request.setAttribute("message", "Wrong Credentials");
	   			request.getRequestDispatcher("deposit.jsp").forward(request, response);
	    	   }
	       }
	    	   else
	    	   {
	    		   request.setAttribute("message", "Error");
	      			request.getRequestDispatcher("deposit.jsp").forward(request, response); 
	    	   }
	    	   }
	    	   
	       catch(Exception e){
	           e.printStackTrace();
	       }
		}
	       else
	       {
	    	   request.setAttribute("message", "Wrong Operation");
	  			request.getRequestDispatcher("deposit.jsp").forward(request, response);
	       }
	       
	       
	       
		}

	}
