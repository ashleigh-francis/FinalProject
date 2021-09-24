package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AtmPoint {

	@Id
	private int atmId;
	private String operator;
	@Column(name="streetName")
	private String atmStreetName;
	@Column(name="postcode")
	private String atmPostcode;
	@Column(name="latitude")
	private double atmLatitude;
	@Column(name="longitude")
	private double atmLongitude;
	
	@OneToMany
	private List<AtmTransaction> atmTrans;
	
	public AtmPoint() {
		super();
	}

	public AtmPoint(int atmId, String operator, String atmStreetName, String atmPostcode, double atmLatitude,
			double atmLongitude) {
		super();
		this.atmId = atmId;
		this.operator = operator;
		this.atmStreetName = atmStreetName;
		this.atmPostcode = atmPostcode;
		this.atmLatitude = atmLatitude;
		this.atmLongitude = atmLongitude;
	}

	@Override
	public int hashCode() {
		return Objects.hash(atmId, atmLatitude, atmLongitude, atmPostcode, atmStreetName, operator);
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
		return atmId == other.atmId
				&& Double.doubleToLongBits(atmLatitude) == Double.doubleToLongBits(other.atmLatitude)
				&& Double.doubleToLongBits(atmLongitude) == Double.doubleToLongBits(other.atmLongitude)
				&& Objects.equals(atmPostcode, other.atmPostcode) && Objects.equals(atmStreetName, other.atmStreetName)
				&& Objects.equals(operator, other.operator);
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

	public String getAtmStreetName() {
		return atmStreetName;
	}

	public void setAtmStreetName(String atmStreetName) {
		this.atmStreetName = atmStreetName;
	}

	public String getAtmPostcode() {
		return atmPostcode;
	}

	public void setAtmPostcode(String atmPostcode) {
		this.atmPostcode = atmPostcode;
	}

	public double getAtmLatitude() {
		return atmLatitude;
	}

	public void setAtmLatitude(double atmLatitude) {
		this.atmLatitude = atmLatitude;
	}

	public double getAtmLongitude() {
		return atmLongitude;
	}

	public void setAtmLongitude(double atmLongitude) {
		this.atmLongitude = atmLongitude;
	}

	public List<AtmTransaction> getAtmTrans() {
		return atmTrans;
	}

	public void setAtmTrans(List<AtmTransaction> atmTrans) {
		this.atmTrans = atmTrans;
	}

	@Override
	public String toString() {
		return "AtmPoint [atmId=" + atmId + ", operator=" + operator + ", atmStreetName=" + atmStreetName
				+ ", atmPostcode=" + atmPostcode + ", atmLatitude=" + atmLatitude + ", atmLongitude=" + atmLongitude
				+ "]";
	}
	
}
