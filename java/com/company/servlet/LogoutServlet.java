package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.company.dao.UserDaoImpl;
import com.company.dao.UserDao;
/**
 * Servlet implementation class LoginServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static UserDao userDao=new UserDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try(PrintWriter out=response.getWriter())
		{
		  String username = request.getParameter("username");
	      String password = request.getParameter("password");
	       
	      if(username != null && password !=null)
	      {
	    	  if (username.equals("Deepanjali") && password.equals("1234"))
			{
				response.sendRedirect("welcome.jsp");
			}
	    	 else
	    		{
	    		System.out.println ("Invalid user or password");
	    		}
	      }
	      else
	      {
	    	  System.out.println("Empty username or password");
	      }  	  
	}
}*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession currentSession =request.getSession(false);
		
		if(currentSession != null)
		{
			currentSession.invalidate();
		}
		
		// Redirect to the Home page
		response.sendRedirect("index.html");
}
}
