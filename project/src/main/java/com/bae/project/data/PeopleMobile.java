package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PeopleMobile {
	
	@Id
	private String forename;
	private String surname;
	private String dateOfBirth;
	private String address;
	private String town;
	private String postcode;
	private String phoneNumber;
	private String network;
	
	
	public PeopleMobile(String forename, String surname, String dateOfBirth, String address, String town,
			String postcode, String phoneNumber, String network) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.town = town;
		this.postcode = postcode;
		this.phoneNumber = phoneNumber;
		this.network = network;
	}
	
	
	public PeopleMobile() {
		super();
	}


	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
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
	@Override
	public int hashCode() {
		return Objects.hash(address, dateOfBirth, forename, network, phoneNumber, postcode, surname, town);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeopleMobile other = (PeopleMobile) obj;
		return Objects.equals(address, other.address) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(forename, other.forename) && Objects.equals(network, other.network)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(postcode, other.postcode)
				&& Objects.equals(surname, other.surname) && Objects.equals(town, other.town);
	}
	
	

}
