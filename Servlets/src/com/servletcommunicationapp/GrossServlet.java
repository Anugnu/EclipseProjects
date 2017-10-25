package com.servletcommunicationapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GrossServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		float basic = Float.parseFloat(req.getParameter("basic"));
		float gross = basic+(basic*0.8f);
		req.setAttribute("gr", gross);
		
		RequestDispatcher rd = req.getRequestDispatcher("/net");
		rd.forward(req, res);
		
	}
}
