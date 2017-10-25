package com.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RefreshServlet")
public class RefreshServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    		response.setIntHeader("Refresh",5);
    		response.setContentType("text/html");
    		
    		long time = System.currentTimeMillis();
    		PrintWriter out = response.getWriter();
    		out.println("<html>");
    		out.println("Current time is : " +time);
    		out.println("</html>");
	}

}
