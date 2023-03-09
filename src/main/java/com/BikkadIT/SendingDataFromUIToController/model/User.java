package com.BikkadIT.SendingDataFromUIToController.model;

public class User {
	
	private String fname;
	
	private String lname;
	
	private String email;
	
	private String uname;
	
	private String passwaord;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswaord() {
		return passwaord;
	}

	public void setPasswaord(String passwaord) {
		this.passwaord = passwaord;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", uname=" + uname + ", passwaord="
				+ passwaord + "]";
	}
	
	

}
