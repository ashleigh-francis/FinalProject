package com.bae.project.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class VehicleRegistration {

	@Id
	private int registrationID;
	private String registrationDate;
	private String vehicleRegistrationNo;
	private String make;
	private String model;
	private String colour;
	private String forenames;
	private String surname;
	private String address;
	private String dateOfBirth;
	private String driverLicenceID;
	
	@ManyToOne
	private Citizen citizen;
	@OneToMany
	private List<VehicleObservations> vehicleObvs;
	
	public VehicleRegistration() {
		super();
	}
	
	public VehicleRegistration(String driverLicenceID, String forenames, String address, String make, String surname,
			String vehicleRegistrationNo, String colour, String dateOfBirth, String model, String registrationDate,
			int registrationID) {
		super();
		this.driverLicenceID = driverLicenceID;
		this.forenames = forenames;
		this.address = address;
		this.make = make;
		this.surname = surname;
		this.vehicleRegistrationNo = vehicleRegistrationNo;
		this.colour = colour;
		this.dateOfBirth = dateOfBirth;
		this.model = model;
		this.registrationDate = registrationDate;
		this.registrationID = registrationID;
	}
		

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((driverLicenceID == null) ? 0 : driverLicenceID.hashCode());
		result = prime * result + ((forenames == null) ? 0 : forenames.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		result = prime * result + registrationID;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((vehicleRegistrationNo == null) ? 0 : vehicleRegistrationNo.hashCode());
		return result;
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (driverLicenceID == null) {
			if (other.driverLicenceID != null)
				return false;
		} else if (!driverLicenceID.equals(other.driverLicenceID))
			return false;
		if (forenames == null) {
			if (other.forenames != null)
				return false;
		} else if (!forenames.equals(other.forenames))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (registrationDate == null) {
			if (other.registrationDate != null)
				return false;
		} else if (!registrationDate.equals(other.registrationDate))
			return false;
		if (registrationID != other.registrationID)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (vehicleRegistrationNo == null) {
			if (other.vehicleRegistrationNo != null)
				return false;
		} else if (!vehicleRegistrationNo.equals(other.vehicleRegistrationNo))
			return false;
		return true;
	}
	
	public int getRegistrationID() {
		return registrationID;
	}
	
	public void setRegistrationID(int registrationID) {
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
	
	public Citizen getCitizen() {
		return citizen;
	}
	
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	
	public List<VehicleObservations> getVehicleObvs() {
		return vehicleObvs;
	}
	
	public void setVehicleObvs(List<VehicleObservations> vehicleObvs) {
		this.vehicleObvs = vehicleObvs;
	}
	
	@Override
	public String toString() {
		return "VehicleRegistration [registrationID=" + registrationID + ", registrationDate=" + registrationDate
				+ ", vehicleRegistrationNo=" + vehicleRegistrationNo + ", make=" + make + ", model=" + model
				+ ", colour=" + colour + ", forenames=" + forenames + ", surname=" + surname + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + ", driverLicenceID=" + driverLicenceID + "]";
	}
	
}
