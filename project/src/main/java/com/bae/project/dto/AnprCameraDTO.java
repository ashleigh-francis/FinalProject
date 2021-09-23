package com.bae.project.dto;

public class AnprCameraDTO {
	
	private int anprId;
	private String streetName;
	private double latitude;
	private double longitude;
	
	public AnprCameraDTO() {
		super();
	}

	public int getAnprId() {
		return anprId;
	}

	public void setAnprId(int anprId) {
		this.anprId = anprId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
