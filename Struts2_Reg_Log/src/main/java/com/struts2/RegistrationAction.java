package com.struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationAction {
	
	private String firstName;
	
	private String lastName;
	
	private String userName;
	
	private String password;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

	
	public String executereg() {
	
	
	String forward = null;
	Connection conn = null;
	PreparedStatement prepStmt = null;
	   

		   
	try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bethi", "root", "rootoor");
			
			String saveStudent = "insert into struts2 values(?,?,?,?)";
			prepStmt = conn.prepareStatement(saveStudent);
			
			prepStmt.setString(1, getFirstName());
			prepStmt.setString(2, getLastName());
			prepStmt.setString(3, getUserName());
			prepStmt.setString(4, getPassword());
			
			prepStmt.executeUpdate();
			
//			HttpSession session = request.getSession();
//			session.setAttribute("firstName", registrationForm.getFirstName());
//			session.setAttribute("lastName", registrationForm.getLastName());
			
			forward = "success";
			return forward;
			
		} catch (Exception e) {
			forward = "wrong";
			return forward;
//			e.printStackTrace();

	 	} finally {
		   
			try {
				prepStmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		   
	 	}
	}
}
