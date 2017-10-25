package com.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Counter")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int hit;

	public void init() {
		hit = 0;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		hit++;
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Counter: "+hit);
		out.println("</body>");
		out.println("</html>");
	}
}
