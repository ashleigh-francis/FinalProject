package com.bae.project.dto;

public class MobileRecordsDTO {
	
	private String phoneNumber;
	private String network;
	
	private String timestamp;
	private String receiverMSISDN;
	
	private Double latitude;
	private Double longitude;
	
	
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



	public String getReceiverMSISDN() {
		return receiverMSISDN;
	}


	public void setReceiverMSISDN(String receiverMSISDN) {
		this.receiverMSISDN = receiverMSISDN;
	}


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	

}
