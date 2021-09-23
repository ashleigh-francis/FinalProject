package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleObservations {

	@Id
	private int anprPointId;
	private String timestamp;
	private String vehicleRegistrationNumber;
	
	public VehicleObservations() {
		super();
	}

	public VehicleObservations(int anprPointId, String timestamp, String vehicleRegistrationNumber) {
		super();
		this.anprPointId = anprPointId;
		this.timestamp = timestamp;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
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
	@Override
	public int hashCode() {
		return Objects.hash(anprPointId, timestamp, vehicleRegistrationNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleObservations other = (VehicleObservations) obj;
		return anprPointId == other.anprPointId && Objects.equals(timestamp, other.timestamp)
				&& Objects.equals(vehicleRegistrationNumber, other.vehicleRegistrationNumber);
	}
	
	
}
