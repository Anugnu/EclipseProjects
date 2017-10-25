package com.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		
		Cookie cookie = new Cookie("password",username);
		cookie.setMaxAge(10);
		response.addCookie(cookie);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<form action='GetCookieServlet'>");
		out.println("<input type='submit' value= 'Get Cookie'>");
		out.println("</form>");
		out.println("</html>");
	}

}
