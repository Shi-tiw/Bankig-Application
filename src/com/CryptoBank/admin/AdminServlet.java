package com.CryptoBank.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin_login")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AdminServlet() {  
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminUserDAO au = new AdminUserDAOimpl();
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		
		AdminUser a = au.getAdmin(uname, password);
		
		if(submitType.equals("Login") && a != null )
		{
			request.setAttribute("message",a.getUname());
			request.getRequestDispatcher("adminsuccess.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("message","Invalid Admin Credentials! Try Again");
			request.getRequestDispatcher("adminlogin.jsp").forward(request, response);
		}
		
		

	}

}
