package com.bae.project.dto;

public class FinancialRecordsDTO {

	private int accountNumber;
	private String bank;
	private String forenames;
	private String surname;
	private String dateOfBirth;
	private String homeAddress;
	private long cardNumber;
	private String sortCode;
	private String timestamp;
	private long bankCardNumber;
	private int payeeAccount;
	private float amount;
	private String vendor;
	private String streetName;
	private String postcode;
	private double latitude;
	private double longitude;
	
	
	
	public FinancialRecordsDTO() {
		super();
	}


	public FinancialRecordsDTO(int accountNumber, String bank, String forenames, String surname, String dateOfBirth,
			String homeAddress, long cardNumber, String sortCode, String timestamp, long bankCardNumber,
			int payeeAccount, float amount, String vendor, String streetName, String postcode, double latitude,
			double longitude) {
		super();
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.timestamp = timestamp;
		this.bankCardNumber = bankCardNumber;
		this.payeeAccount = payeeAccount;
		this.amount = amount;
		this.vendor = vendor;
		this.streetName = streetName;
		this.postcode = postcode;
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
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


	public String getHomeAddress() {
		return homeAddress;
	}


	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}


	public long getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}


	public String getSortCode() {
		return sortCode;
	}


	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public long getBankCardNumber() {
		return bankCardNumber;
	}


	public void setBankCardNumber(long bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}


	public int getPayeeAccount() {
		return payeeAccount;
	}


	public void setPayeeAccount(int payeeAccount) {
		this.payeeAccount = payeeAccount;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	
}
