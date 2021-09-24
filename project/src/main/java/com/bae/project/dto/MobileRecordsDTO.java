package com.bae.project.dto;

public class MobileRecordsDTO {
	
	private String phoneNumber;
	private String network;
	
	private String timestamp;
	private String callerMSISDN;
	private String receiverMSISDN;
	
	private double latitude;
	private double longitude;
	
	
	public MobileRecordsDTO() {
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


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public String getCallerMSISDN() {
		return callerMSISDN;
	}


	public void setCallerMSISDN(String callerMSISDN) {
		this.callerMSISDN = callerMSISDN;
	}


	public String getReceiverMSISDN() {
		return receiverMSISDN;
	}


	public void setReceiverMSISDN(String receiverMSISDN) {
		this.receiverMSISDN = receiverMSISDN;
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
