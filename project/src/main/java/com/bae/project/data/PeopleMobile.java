package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PeopleMobile {
	
	
	private Integer id;
	private String forenames;
	private String surname;
	private String dateOfBirth;
	private String address;
	private String town;
	private String postcode;
	@Id
	private String phoneNumber;
	private String network;
	
//	@ManyToOne
//	@JoinColumn(name="forenames")
//	private Citizen citizen;
	@OneToMany(mappedBy="peopleMobile")
	private List<MobileCallRecords> mobileCallRecords;
	
	public PeopleMobile() {
		super();
	}



	public PeopleMobile(Integer id, String forenames, String surname, String dateOfBirth, String address, String town,
			String postcode, String phoneNumber, String network) {
		super();
		this.id = id;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.town = town;
		this.postcode = postcode;
		this.phoneNumber = phoneNumber;
		this.network = network;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, dateOfBirth, forenames, id, network, phoneNumber, postcode, surname, town);
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
				&& Objects.equals(forenames, other.forenames) && Objects.equals(id, other.id)
				&& Objects.equals(network, other.network) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(postcode, other.postcode) && Objects.equals(surname, other.surname)
				&& Objects.equals(town, other.town);
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public List<MobileCallRecords> getMobileCallRecords() {
		return mobileCallRecords;
	}


	public void setMobileCallRecords(List<MobileCallRecords> mobileCallRecords) {
		this.mobileCallRecords = mobileCallRecords;
	}

	public String getForenames() {
		return forenames;
	}


	public void setForenames(String forenames) {
		this.forenames = forenames;
	}



	@Override
	public String toString() {
		return "PeopleMobile [id=" + id + ", forenames=" + forenames + ", surname=" + surname + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ", town=" + town + ", postcode=" + postcode + ", phoneNumber="
				+ phoneNumber + ", network=" + network + "]";
	}

	
}
