package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Epos {
	
	private int id;
	private String vendor;
	private String streetName;
	private String postcode;
	private double latitude;
	private double longitude;
	@Id
	private int tableId;
	
	
	@OneToMany(mappedBy = "epos")
	private List<EposTransactions> eposTrans;
	
	public Epos() {
		super();
	}


	public Epos(int id, String vendor, String streetName, String postcode, double latitude, double longitude,
			int tableId) {
		super();
		this.id = id;
		this.vendor = vendor;
		this.streetName = streetName;
		this.postcode = postcode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.tableId = tableId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, latitude, longitude, postcode, streetName, tableId, vendor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Epos other = (Epos) obj;
		return id == other.id && Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(postcode, other.postcode) && Objects.equals(streetName, other.streetName)
				&& tableId == other.tableId && Objects.equals(vendor, other.vendor);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
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


	public int getTableId() {
		return tableId;
	}


	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public List<EposTransactions> getEposTrans() {
		return eposTrans;
	}

	public void setEposTrans(List<EposTransactions> eposTrans) {
		this.eposTrans = eposTrans;
	}

	@Override
	public String toString() {
		return "Epos [id=" + id + ", vendor=" + vendor + ", streetName=" + streetName + ", postcode=" + postcode
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", tableId=" + tableId + "]";
	}
	
}
