package com.bae.project.dto;

public class UsersDTO {
	
	private String username;
	private String passwrd;
	
	public UsersDTO() {
		super();
	}

	public UsersDTO(String username, String passwrd) {
		super();
		this.username = username;
		this.passwrd = passwrd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswrd() {
		return passwrd;
	}

	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	
}
