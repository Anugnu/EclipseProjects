package com.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCookieServlet")
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cookie cookies[] = request.getCookies();
		String name = null;
		String value = null;
		String password = null;
		
		for (int i = 0; i < cookies.length; i++) {
			name = cookies[i].getName();

			if(name.equals("username")){
				value = cookies[i].getValue();
			}
			if(name.equals("password")){
				password = cookies[i].getValue();
			}
		}

		PrintWriter out = response.getWriter();
		out.println("Username from cookie : " +value);
		out.println("Username from password : " +password);
		out.close();
	}

}
