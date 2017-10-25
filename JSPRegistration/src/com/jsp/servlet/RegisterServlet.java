package com.jsp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");

		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");// (1)load the driver

			connection = DriverManager.getConnection(// (2)get database
														// connection
					"jdbc:mysql://localhost:3306/test", "root", "root");

			String sql = "insert into vinay values(?,?,?,?,?)";
			statement = connection.prepareStatement(sql);// (3)create statement
			
			statement.setInt(1, Integer.parseInt(id));
			statement.setString(2, name);
			statement.setString(3, city);
			statement.setString(4, zip);
			statement.setString(5, password);
			statement.executeUpdate();// (4)execute query
			//for insert,update,delete
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (statement != null) {// (5)close connection
					connection.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		response.sendRedirect("success.jsp");
	
		
	}

}
