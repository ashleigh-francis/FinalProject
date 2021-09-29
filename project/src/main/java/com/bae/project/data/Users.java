package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Users {
	
	private Integer Id;
	private String User;
	private String Passwrd;
	
	
	public Users() {
		super();
	}

	public Users(Integer id, String user, String passwrd) {
		super();
		Id = id;
		User = user;
		Passwrd = passwrd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, Passwrd, User);
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
		return Objects.equals(Id, other.Id) && Objects.equals(Passwrd, other.Passwrd)
				&& Objects.equals(User, other.User);
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	@Override
	public String toString() {
		return "Users [Id=" + Id + ", User=" + User + ", Passwrd=" + Passwrd + "]";
	}

}
