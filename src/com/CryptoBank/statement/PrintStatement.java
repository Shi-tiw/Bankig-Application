package com.CryptoBank.statement;

import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.ArrayList;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/printStatement")
public class PrintStatement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PrintStatement() {
  
    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StatsDAOimpl sd = new StatsDAOimpl();
		String user = request.getParameter("uname");
		String submitType = request.getParameter("submit");
		
		
		
		if(submitType.equals("Print"))
		{
			ArrayList<ArrayString> as = sd.print(user);	
			request.setAttribute("list", as);
			request.getRequestDispatcher("statementlist.jsp").forward(request, response);
		}
		
		 else
	       {
	    	   request.setAttribute("message", "Invalid User");
	  			request.getRequestDispatcher("printstatement.jsp").forward(request, response);
	       }
		
		
	}
	
	

}
