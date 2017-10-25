package com.struts1.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts1.actionForm.RegistrationForm;

public class RegistrationAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		
		String forward = null;
		RegistrationForm registrationForm = (RegistrationForm) form;
		

			
		Connection conn = null;
		PreparedStatement prepStmt = null;
	   
		try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost/bethi", "root", "rootoor");
				
				String saveStudent = "insert into struts1 values(?,?,?,?)";
				prepStmt = conn.prepareStatement(saveStudent);
				
				prepStmt.setString(1, registrationForm.getFirstName());
				prepStmt.setString(2, registrationForm.getLastName());
				prepStmt.setString(3, registrationForm.getUserName());
				prepStmt.setString(4, registrationForm.getPassword());
				
				prepStmt.executeUpdate();
				
				HttpSession session = request.getSession();
				session.setAttribute("firstName", registrationForm.getFirstName());
				session.setAttribute("lastName", registrationForm.getLastName());
				
				forward = "gotoHome";
				
			} catch (Exception e) {
				forward = "gotoError";
				e.printStackTrace();
  
		 	} finally {
			   
				try {
					prepStmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			   
		 	}
		   
			return mapping.findForward(forward);

	}

}
