package com.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")//class extends HttpServlet
public class FirstServlet extends HttpServlet {//using annotations
	private static final long serialVersionUID = 1L;

	public void init() {//(1)initializing only once
		System.out.println("Iam in Init method");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Iam in DoGet method");
	
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello this is my first servlet");
		out.println("</body>");
		out.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}//(2)business logic
	
	public void destroy(){//(3)when servlet terminated,only once when server stopped
		System.out.println("Iam in Destroy method");
	}

}
