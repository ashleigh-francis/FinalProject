package com.bae.project.dto;

public class PeopleMobileDTO {

	private int id;
	private String forename;
	private String surname;
	private String dateOfBirth;
	private String address;
	private String town;
	private String postcode;
	private String phoneNumber;
	private String network;
	
	private MobileCallRecordsDTO callRecords;
	

	public PeopleMobileDTO() {
	}

	public PeopleMobileDTO(int id, String forename, String surname, String dateOfBirth, String address, String town,
			String postcode, String phoneNumber, String network, MobileCallRecordsDTO callRecords) {
		super();
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.town = town;
		this.postcode = postcode;
		this.phoneNumber = phoneNumber;
		this.network = network;
		this.callRecords = callRecords;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getForename() {
		return forename;
	}


	public void setForename(String forename) {
		this.forename = forename;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}


	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getNetwork() {
		return network;
	}


	public void setNetwork(String network) {
		this.network = network;
	}

	public MobileCallRecordsDTO getCallRecords() {
		return callRecords;
	}

	public void setCallRecords(MobileCallRecordsDTO callRecords) {
		this.callRecords = callRecords;
	}
	
}
