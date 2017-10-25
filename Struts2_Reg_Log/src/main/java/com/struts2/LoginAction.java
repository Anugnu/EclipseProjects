package com.struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginAction {
	
	private String userName;
	
	private String password;
	


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
	
	private Connection getConnection() throws Exception {
		   Connection conn = null;
		   try {
		     Class.forName("com.mysql.jdbc.Driver");
		     conn = DriverManager.getConnection("jdbc:mysql://localhost/bethi", "root", "rootoor");
		   } catch (SQLException e) {
		      System.out.println("SQLException: Unable to open connection to db: "+e.getMessage());
		      throw e;
		   } catch(Exception e) {
		      System.out.println("Exception: Unable to open connection to db: "+e.getMessage());
		      throw e;
		   }
		   return conn;
		}
	
private static final String LOGIN_QUERY = "select * from struts2 where user_name=? and password=?";
	
	private boolean authenticateLogin(String strUserName, String strPassword) throws Exception {
		   boolean isValid = false;
		   Connection conn = null;
		   try {
		     conn = getConnection();
		     PreparedStatement prepStmt = conn.prepareStatement(LOGIN_QUERY);
		     prepStmt.setString(1, strUserName);
		     prepStmt.setString(2, strPassword);
		     ResultSet rs = prepStmt.executeQuery();
		     if(rs.next()) {
		       System.out.println("User login is valid in DB");
		       isValid = true; 
		     }
		  } catch(Exception e) {
		    System.out.println("validateLogon: Error while validating password: "+e.getMessage());
		    throw e;
		  } finally {
		     conn.close();
		  }
		  return isValid;
		}
	
	public String execute() {
		String forward = null;
		String strErrMsg = null;
//		HttpSession session = request.getSession();

//		session.setAttribute("psss", strPassword);
		boolean isValidLogon = false;
		   try {
		     isValidLogon = authenticateLogin(getUserName(),getPassword());
		     if(isValidLogon) {
//		        session.setAttribute("userName", strUserName);
		     } else {
		        strErrMsg = "User name or Password is invalid. Please try again.";
		     }
		   } catch(Exception e) {
		     strErrMsg = "Unable to validate user / password in database";
		   }
		 
		   if(isValidLogon) {
			   forward = "user";
			   return forward;

		   } else {
			   forward = "wrong";
//		     session.setAttribute("errorMsg", strErrMsg);
		     return forward;

		   }
		
	}

}
