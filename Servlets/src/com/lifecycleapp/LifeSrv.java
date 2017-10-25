package com.lifecycleapp;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeSrv implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {// initialization
		System.out.println("Iam in init method");
		System.out.println("one-->" + config.getServletName());// used to get
																// servlet name
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)// business
																// logic
			throws ServletException, IOException {
		System.out.println("Iam in service method");

	}

	@Override
	public void destroy() {// terminating server
		System.out.println("Iam in destroy method");

	}

	@Override
	public ServletConfig getServletConfig() {// to find to find param init param
												// name,param values

		return null;
	}

	@Override
	public String getServletInfo() {// to find author or version of servlet

		return "servlet Version 3.x";
	}
}
