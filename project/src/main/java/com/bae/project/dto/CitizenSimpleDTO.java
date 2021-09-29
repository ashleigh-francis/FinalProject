package com.bae.project.dto;

import java.util.Objects;

public class CitizenSimpleDTO {
	
	private String forenames;
	private String surname;
	private String dateOfBirth;
	
	
	public CitizenSimpleDTO() {
		super();
	}

	public CitizenSimpleDTO(String forenames, String surname, String dateOfBirth) {
		super();
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
	}

	public String getForenames() {
		return forenames;
	}

	public void setForenames(String forenames) {
		this.forenames = forenames;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
