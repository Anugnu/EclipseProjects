package com.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	/*
	 * this is a method get connection to the database
	 */
	public Connection getConnection() throws SQLException,
			ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "root");
		return connection;
	}

	/*
	 * this method checks the details entered by user with the database details
	 * and returns if the user matches or not
	 */
	public boolean checkUserDetailsWithDB(String username, String password)
			throws ClassNotFoundException, SQLException {

		boolean isUserValid = false;

		Connection connection = getConnection();
		String sql = "select name, password from pioneer_student where name = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, username);
		ResultSet resultSet = statement.executeQuery();
		String usernamefromDB = null;
		String passwordfromDB = null;

		while (resultSet.next()) {
			usernamefromDB = resultSet.getString(1);
			passwordfromDB = resultSet.getString(2);
		}

		if (username.equals(usernamefromDB)
				&& (password.equals(passwordfromDB))) {
			isUserValid = true;
		}
		return isUserValid;
	}
}
