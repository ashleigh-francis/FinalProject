package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VehicleObservations {

	@Id
	
	private String timestamp;

	
	@ManyToOne
	@JoinColumn(name="vehicleRegistrationNumber")
	private VehicleRegistration vehicleRegistration;
	@ManyToOne
	@JoinColumn(name = "ANPRPointId")
	private AnprCamera anprCamera;
	
	public VehicleObservations() {
		super();
	}

	public VehicleObservations( String timestamp) {
		super();
		
		this.timestamp = timestamp;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash( timestamp);
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
		return Objects.equals(timestamp, other.timestamp);
				
	}

	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	

	public VehicleRegistration getVehicleRegistration() {
		return vehicleRegistration;
	}

	public void setVehicleRegistration(VehicleRegistration vehicleRegistration) {
		this.vehicleRegistration = vehicleRegistration;
	}

	public AnprCamera getAnprCamera() {
		return anprCamera;
	}

	public void setAnprCamera(AnprCamera anprCamera) {
		this.anprCamera = anprCamera;
	}

	@Override
	public String toString() {
		return "VehicleObservations [ timestamp=" + timestamp
				 + "]";
	}
	
	
}
