package com.CryptoBank.accountRegistration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginRegister() {  
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		UserDAO ud = new UserDAOimpl(); 
		String uname1 = request.getParameter("uname");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		User u = ud.getUser(uname1, password);
		
		if(submitType.equals("Login") && u != null && u.getFirstName() != null)
		{
			
			request.setAttribute("message",u.getFirstName());
			request.getRequestDispatcher("loginsuccess.jsp").forward(request, response);	
		}
		
		else if(submitType.equals("Register"))
		{
			u.setUname(uname1);
			u.setPassword(password);
			u.setEmail(request.getParameter("email"));
			u.setFirstName(request.getParameter("FirstName"));
			u.setLastName(request.getParameter("LastName"));
			u.setGender(request.getParameter("gender"));
			u.setDob(request.getParameter("dob"));
			u.setAddress(request.getParameter("address"));
			u.setCity(request.getParameter("city"));
			u.setState(request.getParameter("state"));
			u.setPincode(request.getParameter("pincode"));
			u.setPhoneNo(request.getParameter("phoneNo")); 
			
			ud.insertUser(u);
			request.setAttribute("succesMessage","Account Registered! Please Login to continue.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		else
		{
			request.setAttribute("message","Account Not Registered! Register New Account");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	}

}
