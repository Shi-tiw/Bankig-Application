package com.CryptoBank.closure;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/closure")
public class Closure extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Closure() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   ClosureDAOimpl cac = new ClosureDAOimpl();
		   String user = request.getParameter("uname");
	       String passw = request.getParameter("password");
	       String olde = request.getParameter("old");
	       String submitType = request.getParameter("submit");
	       
	       ClosureUser cu = new ClosureUser(user,passw,olde);
	       if(submitType.equals("Delete"))
	       { try {
	    	    if(cac.insertClosure(cu))
	    	    {
	    	    if(cac.closeAcHistory(user, olde))
	    	    {request.setAttribute("message","Closure is Successful");
	   			request.getRequestDispatcher("loginsuccess.jsp").forward(request, response);
	    	    }
	    	    else
	    	    {
	    	    	request.setAttribute("message","Error");
		   			request.getRequestDispatcher("acclosure.jsp").forward(request, response);
	    	    }
	       }
	    	    else
	    	    {
	    	    	request.setAttribute("message","Closure Not Successful");
		   			request.getRequestDispatcher("accclosure.jsp").forward(request, response);
	    	    }
	       }
	       catch(Exception e){
	           e.printStackTrace();
	       }
	       }
	       
	       else
	       {
	    	   request.setAttribute("message", "Invalid Details or");
	  		   request.getRequestDispatcher("acclosure.jsp").forward(request, response);   
	       }

}
}
