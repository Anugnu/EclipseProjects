package com.welcomeapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeSrv extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<body bgcolor='blue'>");
		pw.println("<marquee><h1>Welcome to servlet technology</h1></marquee>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
		
	}

}
