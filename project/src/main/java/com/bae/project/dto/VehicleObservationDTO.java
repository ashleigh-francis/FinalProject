package com.bae.project.dto;

public class VehicleObservationDTO {
	
	private int anprPointId;
	private String timestamp;
	private String vehicleRegistrationNumber;
	
	
	public VehicleObservationDTO() {
	}


	public int getAnprPointId() {
		return anprPointId;
	}


	public void setAnprPointId(int anprPointId) {
		this.anprPointId = anprPointId;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}


	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}
	
	

}
