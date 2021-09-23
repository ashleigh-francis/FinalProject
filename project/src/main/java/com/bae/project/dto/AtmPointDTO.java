package com.bae.project.dto;

public class AtmPointDTO {
	
	private int atmId;
	private String operator;
	private String streetName;
	private String postcode;
	private double latitude;
	private double longitude;
	
	
	public AtmPointDTO() {
	}


	public int getAtmId() {
		return atmId;
	}


	public void setAtmId(int atmId) {
		this.atmId = atmId;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
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
