package com.bae.project.dto;

public class VehicleObservationDTO {
	
	private int anprPointId;
	private String timestamp;
	private String vehicleRegistrationNumber;
	
	private AnprCameraDTO anprCamera;
	
	
	public VehicleObservationDTO() {
	}

	public VehicleObservationDTO(int anprPointId, String timestamp, String vehicleRegistrationNumber,
			AnprCameraDTO anprCamera) {
		super();
		this.anprPointId = anprPointId;
		this.timestamp = timestamp;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.anprCamera = anprCamera;
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

	public AnprCameraDTO getAnprCamera() {
		return anprCamera;
	}

	public void setAnprCamera(AnprCameraDTO anprCamera) {
		this.anprCamera = anprCamera;
	}
	
	

}
