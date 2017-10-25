package com.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterStudent extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("student registration in get method called");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		System.out.println("student registration in post method called");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String zip = request.getParameter("zip");
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");// (1)load the driver

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");

			String sql = "insert into pioneer_student values(?,?,?,?,?)";
			statement = connection.prepareStatement(sql);// (3)create statement

			statement.setInt(1, Integer.parseInt(id));
			statement.setString(2, name);
			statement.setString(3, address);
			statement.setString(4, zip);
			statement.setString(5, password);
			statement.executeUpdate();// (4)execute query
			// for insert,update,delete

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
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("Student registered successfully");
		out.println("</html>");
	}
}
