package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AtmPoint {

	@Id
	private int atmId;
	private String operator;
	private String streetName;
	private String postcode;
	private double latitude;
	private double longitude;
	
	@OneToMany
	private List<AtmTransaction> atmTrans;
	
	public AtmPoint(int atmId, String operator, String streetName, String postcode, double latitude, double longitude) {
		super();
		this.atmId = atmId;
		this.operator = operator;
		this.streetName = streetName;
		this.postcode = postcode;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public AtmPoint() {
		super();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(atmId, latitude, longitude, operator, postcode, streetName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtmPoint other = (AtmPoint) obj;
		return atmId == other.atmId && Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(operator, other.operator) && Objects.equals(postcode, other.postcode)
				&& Objects.equals(streetName, other.streetName);
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

	public List<AtmTransaction> getAtmTrans() {
		return atmTrans;
	}

	public void setAtmTrans(List<AtmTransaction> atmTrans) {
		this.atmTrans = atmTrans;
	}

	@Override
	public String toString() {
		return "AtmPoint [atmId=" + atmId + ", operator=" + operator + ", streetName=" + streetName + ", postcode="
				+ postcode + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
}
