package com.bae.project.data;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Citizen {
	
	
	private Long citizenID;
	@Id
	private String forenames;
	private String surname;
	private String homeAddress;
	private String dateOfBirth;
	private String placeOfBirth;
	private String sex;
	

//	@OneToMany(mappedBy ="citizen")
//	private List<PeopleBankAccount> bankAccounts;
//	@OneToMany(mappedBy ="citizen")
//	private List<PeopleMobile> peopleMobiles;
//	@OneToMany(mappedBy ="citizen")
//	private List<VehicleRegistration> vehicleRegistrations;

	
	public Citizen() {
		super();
	}
	
	public Citizen(Long citizenID, String forenames, String surname, String homeAddress, String dateOfBirth,
			String placeOfBirth, String sex) {
		super();
		this.citizenID = citizenID;
		this.forenames = forenames;
		this.surname = surname;
		this.homeAddress = homeAddress;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.sex = sex;
	}

	@Override
	public int hashCode() {
		return Objects.hash(citizenID, dateOfBirth, forenames, homeAddress, placeOfBirth, sex, surname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citizen other = (Citizen) obj;
		return citizenID == other.citizenID && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(forenames, other.forenames) && Objects.equals(homeAddress, other.homeAddress)
				&& Objects.equals(placeOfBirth, other.placeOfBirth) && Objects.equals(sex, other.sex)
				&& Objects.equals(surname, other.surname);
	}
	public Long getCitizenID() {
		return citizenID;
	}
	public void setCitizenID(Long citizenID) {
		this.citizenID = citizenID;
	}
	public String getForenames() {
		return forenames;
	}
	public void setForenames(String forenames) {
		this.forenames = forenames;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "Citizen [citizenID=" + citizenID + ", forenames=" + forenames + ", surname=" + surname
				+ ", homeAddress=" + homeAddress + ", dateOfBirth=" + dateOfBirth + ", placeOfBirth=" + placeOfBirth
				+ ", sex=" + sex + "]";
	}

}
