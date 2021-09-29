package com.bae.project.data;

import java.util.Objects;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Users {
	
	@Id
	private Integer id;
	private String username;
	private String passwrd;
	
	
	public Users() {
		super();
	}


	public Users(Integer id, String username, String passwrd) {
		super();
		this.id = id;
		this.username = username;
		this.passwrd = passwrd;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, passwrd, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(id, other.id) && Objects.equals(passwrd, other.passwrd)
				&& Objects.equals(username, other.username);
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", passwrd=" + passwrd + "]";
	}


}
