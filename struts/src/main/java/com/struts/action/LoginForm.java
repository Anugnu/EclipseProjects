package com.struts.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){

		String username = getUsername();
		String password = getPassword();
		ActionErrors errors = new ActionErrors();
		
		if(username.equals("")){
			errors.add("empty",new ActionMessage("error.username"));
			
		}
		if(password.equals("")){
			errors.add("empty",new ActionMessage("error.password"));
			
		}
		return errors;
		
	}
}

