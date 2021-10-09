package com.CryptoBank.details;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteDetails")
public class DeleteDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DeleteDetails() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeleteDetailsDAOimpl ddod = new DeleteDetailsDAOimpl();
		String submitType = request.getParameter("submit");
		
		if(submitType.equals("Proceed"))
		{
			ArrayList<AccountString> as = ddod.printdetails();
			request.setAttribute("list", as);
			request.getRequestDispatcher("deletelist.jsp").forward(request, response);
		}	
	}

}
