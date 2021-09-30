package com.bae.project.dto;

public class AtmDTO {

	private String atmTimestamp;
	private long atmBankCardNumber;
	private String type;
	private float atmAmount;
	private String operator;
	private String atmStreetName;
	private String atmPostcode;
	private double atmLatitude;
	private double atmLongitude;
	
	public AtmDTO() {
	
	}

	public AtmDTO(String atmTimestamp, long atmBankCardNumber, String type, float atmAmount, String operator,
			String atmStreetName, String atmPostcode, double atmLatitude, double atmLongitude) {
		super();
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
	
	
}
