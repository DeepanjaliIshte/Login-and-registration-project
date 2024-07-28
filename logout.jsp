<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="loginstyle.css">
</head>
<body>
	<%
	
		HttpSession currentSession =request.getSession(false);
		
			if(currentSession != null)
			{
				currentSession.invalidate();
			}
			
			// Redirect to the Home page
			response.sendRedirect("index.html");
			
			// Second type
		/* 
		Reterive the session object
		//HttpSession session1=request.getSession(false);
	
	
	
			if (currentSession != null)
		// check if the session is not null and the username attribute
		if(session1 !=null && session1.getAttribute("username") !=null)
		{
			String username=(String) session1.getAttribute("username");
		}
		else
		{
			// Redirect to the login page if the session is  not valid 
			response.sendRedirect("login.jsp");
		} 
			*/
	%>
</body>
</html>