package com.struts1.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts1.actionForm.LoginForm;

public class LoginAction extends Action {
	
	
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
	
private static final String LOGIN_QUERY = "select * from struts1 where user_name=? and password=?";
	
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
	

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {

		String forward = null;
		
		LoginForm loginForm = (LoginForm) form;
		String strUserName = loginForm.getUserName();
		String strPassword = loginForm.getPassword();


		String strErrMsg = null;
		HttpSession session = request.getSession();

		session.setAttribute("psss", strPassword);
		boolean isValidLogon = false;
		   try {
		     isValidLogon = authenticateLogin(strUserName, strPassword);
		     if(isValidLogon) {
		        session.setAttribute("userName", strUserName);
		     } else {
		        strErrMsg = "User name or Password is invalid. Please try again.";
		     }
		   } catch(Exception e) {
		     strErrMsg = "Unable to validate user / password in database";
		   }
		 
		   if(isValidLogon) {
			   forward = "gotoHome";
			   return mapping.findForward(forward);

		   } else {
			   forward = "gotoError";
		     session.setAttribute("errorMsg", strErrMsg);
		     return mapping.findForward(forward);

		   }

	}
	
	
}
