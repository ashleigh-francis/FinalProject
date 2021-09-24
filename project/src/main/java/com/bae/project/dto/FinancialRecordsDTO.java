package com.bae.project.dto;

public class FinancialRecordsDTO {

	private int accountNumber;
	private String bank;
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
	private String atmTimestamp;
	private long atmBankCardNumber;
	private String type;
	private float atmAmount;
	private String operator;
	private String atmStreetName;
	private String atmPostcode;
	private double atmLatitude;
	private double atmLongitude;
	
	public FinancialRecordsDTO() {
		super();
	}

	

	public FinancialRecordsDTO(int accountNumber, String bank, long cardNumber, String sortCode, String timestamp,
			long bankCardNumber, int payeeAccount, float amount, String vendor, String streetName, String postcode,
			double latitude, double longitude, String atmTimestamp, long atmBankCardNumber, String type,
			float atmAmount, String operator, String atmStreetName, String atmPostcode, double atmLatitude,
			double atmLongitude) {
		super();
		this.accountNumber = accountNumber;
		this.bank = bank;
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
		this.atmTimestamp = atmTimestamp;
		this.atmBankCardNumber = atmBankCardNumber;
		this.type = type;
		this.atmAmount = atmAmount;
		this.operator = operator;
		this.atmStreetName = atmStreetName;
		this.atmPostcode = atmPostcode;
		this.atmLatitude = atmLatitude;
		this.atmLongitude = atmLongitude;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getAtmStreetName() {
		return atmStreetName;
	}

	public void setAtmStreetName(String atmStreetName) {
		this.atmStreetName = atmStreetName;
	}

	public String getAtmPostcode() {
		return atmPostcode;
	}

	public void setAtmPostcode(String atmPostcode) {
		this.atmPostcode = atmPostcode;
	}

	public double getAtmLatitude() {
		return atmLatitude;
	}

	public void setAtmLatitude(double atmLatitude) {
		this.atmLatitude = atmLatitude;
	}

	public double getAtmLongitude() {
		return atmLongitude;
	}

	public void setAtmLongitude(double atmLongitude) {
		this.atmLongitude = atmLongitude;
	}

	public String getAtmTimestamp() {
		return atmTimestamp;
	}

	public void setAtmTimestamp(String atmTimestamp) {
		this.atmTimestamp = atmTimestamp;
	}

	public long getAtmBankCardNumber() {
		return atmBankCardNumber;
	}

	public void setAtmBankCardNumber(long atmBankCardNumber) {
		this.atmBankCardNumber = atmBankCardNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getAtmAmount() {
		return atmAmount;
	}

	public void setAtmAmount(float atmAmount) {
		this.atmAmount = atmAmount;
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
