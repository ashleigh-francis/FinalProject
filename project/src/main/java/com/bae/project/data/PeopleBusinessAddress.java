package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PeopleBusinessAddress {
	

	private String homeAddress;
	private String dateOfBirth;
	@Id
	private String businessName;
	private String businessAddress;
	private int tableId;
	
	private String personName;
	
	public PeopleBusinessAddress() {
		super();
	}





	public PeopleBusinessAddress(String homeAddress, String dateOfBirth, String businessName, String businessAddress,
			int tableId, String personName) {
		super();
		this.homeAddress = homeAddress;
		this.dateOfBirth = dateOfBirth;
		this.businessName = businessName;
		this.businessAddress = businessAddress;
		this.tableId = tableId;
		this.personName = personName;
	}





	@Override
	public int hashCode() {
		return Objects.hash(businessAddress, businessName, dateOfBirth, homeAddress, personName, tableId);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeopleBusinessAddress other = (PeopleBusinessAddress) obj;
		return Objects.equals(businessAddress, other.businessAddress)
				&& Objects.equals(businessName, other.businessName) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(homeAddress, other.homeAddress) && Objects.equals(personName, other.personName)
				&& tableId == other.tableId;
	}





	public String getHomeAddress() {
		return homeAddress;
	}


	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getBusinessName() {
		return businessName;
	}


	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}


	public String getBusinessAddress() {
		return businessAddress;
	}


	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}



	public int getTableId() {
		return tableId;
	}


	public void setTableId(int tableId) {
		this.tableId = tableId;
	}





	@Override
	public String toString() {
		return "PeopleBusinessAddress [homeAddress=" + homeAddress + ", dateOfBirth=" + dateOfBirth + ", businessName="
				+ businessName + ", businessAddress=" + businessAddress + ", tableId=" + tableId + ", personName="
				+ personName + "]";
	}

	
}
