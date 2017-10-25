package com.struts2;

public class LoginAction {

	private String name;
	
	private String password;
	
	public String execute(){
		
		String forward = null;
		if( getName().equals("test") && getPassword().equals("testing")){
			forward="success";
		}else{
			forward="failure";
		}
		return forward;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
