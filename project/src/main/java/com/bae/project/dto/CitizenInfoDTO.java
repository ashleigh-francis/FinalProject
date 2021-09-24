package com.bae.project.dto;

public class CitizenInfoDTO {

	private String forenames;
	private String surname;
	private String homeAddress;
	private String dateOfBirth;
	private String placeOfBirth;
	private String sex;
	private String businessName;
	private String businessAddress;
	private int passportNumber;
	private String nationality;
	private String isssuingCountry;
	private String dateOfIssue;
	private String dateOfExpiry;
	
	public CitizenInfoDTO() {
		super();
	}

	public CitizenInfoDTO(String forenames, String surname, String homeAddress, String dateOfBirth, String placeOfBirth,
			String sex, String businessName, String businessAddress, int passportNumber, String nationality,
			String isssuingCountry, String dateOfIssue, String dateOfExpiry) {
		super();
		this.forenames = forenames;
		this.surname = surname;
		this.homeAddress = homeAddress;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.sex = sex;
		this.businessName = businessName;
		this.businessAddress = businessAddress;
		this.passportNumber = passportNumber;
		this.nationality = nationality;
		this.isssuingCountry = isssuingCountry;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
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

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
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
	
	
}
