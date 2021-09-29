package com.bae.project.dto;

public class UsersDTO {
	
	private String User;
	private String Passwrd;
	
	public UsersDTO() {
		super();
	}

	public UsersDTO(String user, String passwrd) {
		super();
		User = user;
		Passwrd = passwrd;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getPasswrd() {
		return Passwrd;
	}

	public void setPasswrd(String passwrd) {
		Passwrd = passwrd;
	}

}
