package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class VehicleRegistration {

	
	private Integer registrationID;
	private String registrationDate;
	@Id
	private String vehicleRegistrationNo;
	private String make;
	private String model;
	private String colour;
	private String forenames;
	private String surname;
	private String address;
	private String dateOfBirth;
	private String driverLicenceID;
	
//	@ManyToOne
//	@JoinColumn(name="forenames")
//	private Citizen citizen;
	@OneToMany(mappedBy ="vehicleRegistration")
	private List<VehicleObservations> vehicleObservations;
	
	public VehicleRegistration() {
		super();
	}
	
	public VehicleRegistration(Integer registrationID, String registrationDate, String vehicleRegistrationNo, String make,
			String model, String colour, String forenames, String surname, String address, String dateOfBirth,
			String driverLicenceID) {
		super();
		this.registrationID = registrationID;
		this.registrationDate = registrationDate;
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.forenames = forenames;
		this.surname = surname;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.driverLicenceID = driverLicenceID;
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, colour, dateOfBirth, driverLicenceID, forenames, make, model, registrationDate,
				registrationID, surname, vehicleRegistrationNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleRegistration other = (VehicleRegistration) obj;
		return Objects.equals(address, other.address) && Objects.equals(colour, other.colour)
				&& Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(driverLicenceID, other.driverLicenceID) && Objects.equals(forenames, other.forenames)
				&& Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& Objects.equals(registrationDate, other.registrationDate) && registrationID == other.registrationID
				&& Objects.equals(surname, other.surname)
				&& Objects.equals(vehicleRegistrationNo, other.vehicleRegistrationNo);
	}

	public Integer getRegistrationID() {
		return registrationID;
	}
	
	public void setRegistrationID(Integer registrationID) {
		this.registrationID = registrationID;
	}
	
	public String getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public String getVehicleRegistrationNo() {
		return vehicleRegistrationNo;
	}
	
	public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
		this.vehicleRegistrationNo = vehicleRegistrationNo;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getDriverLicenceID() {
		return driverLicenceID;
	}
	
	public void setDriverLicenceID(String driverLicenceID) {
		this.driverLicenceID = driverLicenceID;
	}
	
	
	public List<VehicleObservations> getVehicleObservations() {
		return vehicleObservations;
	}
	
	public void setVehicleObservations(List<VehicleObservations> vehicleObservations) {
		this.vehicleObservations = vehicleObservations;
	}
	

	public String getForenames() {
		return forenames;
	}

	public void setForenames(String forenames) {
		this.forenames = forenames;
	}

	@Override
	public String toString() {
		return "VehicleRegistration [registrationID=" + registrationID + ", registrationDate=" + registrationDate
				+ ", vehicleRegistrationNo=" + vehicleRegistrationNo + ", make=" + make + ", model=" + model
				+ ", colour=" + colour + ", forenames=" + forenames + ", surname=" + surname + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + ", driverLicenceID=" + driverLicenceID + "]";
	}
	
	
}
