package com.struts.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts.dao.LoginDAO;

public class LoginAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException {

		LoginForm loginform = (LoginForm) form;
		String username = loginform.getUsername();
		String password = loginform.getPassword();
		String forward = null;

		LoginDAO loginDAO = new LoginDAO();
		boolean isUserValid = loginDAO.checkUserDetailsWithDB(username,
				password);

		/*
		 * if (username.equals("john") && password.equals("test")) {
		 */
		if (isUserValid) {
			forward = "success";
		} else {
			forward = "failure";
		}

		return mapping.findForward(forward);

	}
}
