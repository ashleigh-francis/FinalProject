package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AnprCamera {
	
	@Id
	private Integer anprId;
	private String streetName;
	private Double latitude;
	private Double longitude;
	private Integer tableId;
	
	@OneToMany(mappedBy = "anprCamera")
	private List<VehicleObservations> vehicleObvs;
	
	public AnprCamera() {
		super();
	}

	public AnprCamera(Integer anprId, String streetName, Double latitude, Double longitude,Integer tableId) {
		super();
		this.anprId = anprId;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.tableId = tableId;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(anprId, latitude, longitude, streetName, tableId, vehicleObvs);
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
				&& Objects.equals(streetName, other.streetName) && tableId == other.tableId
				&& Objects.equals(vehicleObvs, other.vehicleObvs);
	}

	public Integer getAnprId() {
		return anprId;
	}

	public void setAnprId(Integer anprId) {
		this.anprId = anprId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public List<VehicleObservations> getVehicleObvs() {
		return vehicleObvs;
	}

	public void setVehicleObvs(List<VehicleObservations> vehicleObvs) {
		this.vehicleObvs = vehicleObvs;
	}

	public Integer getTableId() {
		return tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	@Override
	public String toString() {
		return "AnprCamera [anprId=" + anprId + ", streetName=" + streetName + ", latitude=" + latitude + ", longitude="
				+ longitude + ", tableId=" + tableId + "]";
	}

	
}
