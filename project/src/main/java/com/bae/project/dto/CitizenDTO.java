package com.bae.project.dto;

public class CitizenDTO {

	private int citizenID;
	private String forenames;
	private String surname;
	private String homeAddress;
	private String dateOfBirth;
	private String placeOfBirth;
	private String sex;
	
	private PassportDTO passport;
	private PeopleBusinessAddressDTO businessAddress;
	private PeopleBankAccountDTO bankAccount;
	private PeopleMobileDTO mobile;
	private VehicleRegistrationDTO vehicle;
	
	public CitizenDTO() {
	}

	public CitizenDTO(int citizenID, String forenames, String surname, String homeAddress, String dateOfBirth,
			String placeOfBirth, String sex, PassportDTO passport, PeopleBusinessAddressDTO businessAddress,
			PeopleBankAccountDTO bankAccount, PeopleMobileDTO mobile, VehicleRegistrationDTO vehicle) {
		super();
		this.citizenID = citizenID;
		this.forenames = forenames;
		this.surname = surname;
		this.homeAddress = homeAddress;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.sex = sex;
		this.passport = passport;
		this.businessAddress = businessAddress;
		this.bankAccount = bankAccount;
		this.mobile = mobile;
		this.vehicle = vehicle;
	}


	public int getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(int citizenID) {
		this.citizenID = citizenID;
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

	public PassportDTO getPassport() {
		return passport;
	}

	public void setPassport(PassportDTO passport) {
		this.passport = passport;
	}

	public PeopleBusinessAddressDTO getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(PeopleBusinessAddressDTO businessAddress) {
		this.businessAddress = businessAddress;
	}

	public PeopleBankAccountDTO getBankAccount() {
		return bankAccount;
	}
	
	public void setBankAccount(PeopleBankAccountDTO bankAccount) {
		this.bankAccount = bankAccount;
	}

	public PeopleMobileDTO getMobile() {
		return mobile;
	}

	public void setMobile(PeopleMobileDTO mobile) {
		this.mobile = mobile;
	}

	public VehicleRegistrationDTO getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleRegistrationDTO vehicle) {
		this.vehicle = vehicle;
	}
	
}
