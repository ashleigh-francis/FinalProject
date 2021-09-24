package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passport {
	
	@Id
	private int passportNumber;
	private String surname;
	private String givenName;
	private String nationality;
	private String dob;
	private String sex;
	private String placeOfBirth;
	private String isssuingCountry;
	private String dateOfIssue;
	private String dateOfExpiry;
	
	@ManyToOne
	private Citizen citizen;
	
	public Passport() {
		super();
	}

	public Passport(int passportNumber, String surname, String givenName, String nationality, String dob, String sex,
			String placeOfBirth, String isssuingCountry, String dateOfIssue, String dateOfExpiry) {
		super();
		this.passportNumber = passportNumber;
		this.surname = surname;
		this.givenName = givenName;
		this.nationality = nationality;
		this.dob = dob;
		this.sex = sex;
		this.placeOfBirth = placeOfBirth;
		this.isssuingCountry = isssuingCountry;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfExpiry, dateOfIssue, dob, givenName, isssuingCountry, nationality, passportNumber,
				placeOfBirth, sex, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passport other = (Passport) obj;
		return Objects.equals(dateOfExpiry, other.dateOfExpiry) && Objects.equals(dateOfIssue, other.dateOfIssue)
				&& Objects.equals(dob, other.dob) && Objects.equals(givenName, other.givenName)
				&& Objects.equals(isssuingCountry, other.isssuingCountry)
				&& Objects.equals(nationality, other.nationality) && passportNumber == other.passportNumber
				&& Objects.equals(placeOfBirth, other.placeOfBirth) && Objects.equals(sex, other.sex)
				&& Objects.equals(surname, other.surname);
	}

	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getIsssuingCountry() {
		return isssuingCountry;
	}

	public void setIsssuingCountry(String isssuingCountry) {
		this.isssuingCountry = isssuingCountry;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", surname=" + surname + ", givenName=" + givenName
				+ ", nationality=" + nationality + ", dob=" + dob + ", sex=" + sex + ", placeOfBirth=" + placeOfBirth
				+ ", isssuingCountry=" + isssuingCountry + ", dateOfIssue=" + dateOfIssue + ", dateOfExpiry="
				+ dateOfExpiry + "]";
	}

}
