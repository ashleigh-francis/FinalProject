package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AnprCamera {
	
	@Id
	private int anprId;
	private String streetName;
	private double latitude;
	private double longitude;
	
	@OneToMany
	private List<VehicleObservations> vehicleObvs;
	
	public AnprCamera() {
		super();
	}

	public AnprCamera(int anprId, String streetName, double latitude, double longitude) {
		super();
		this.anprId = anprId;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anprId, latitude, longitude, streetName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnprCamera other = (AnprCamera) obj;
		return anprId == other.anprId && Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(streetName, other.streetName);
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

	public List<VehicleObservations> getVehicleObvs() {
		return vehicleObvs;
	}

	public void setVehicleObvs(List<VehicleObservations> vehicleObvs) {
		this.vehicleObvs = vehicleObvs;
	}

	@Override
	public String toString() {
		return "AnprCamera [anprId=" + anprId + ", streetName=" + streetName + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
	}

}
