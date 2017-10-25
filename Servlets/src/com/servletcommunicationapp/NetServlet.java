package com.servletcommunicationapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NetServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		float gross = (Float)req.getAttribute("gr");
		float net = gross +(gross *0.8f);
		
		pw.println("<h1>Net Salary " +net + "</h1>");
		pw.close();
	}
}
