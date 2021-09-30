package com.bae.project.dto;

public class VehicleRegistrationDTO {
	
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
	
	private VehicleObservationDTO vehicleObvs;
	
	public VehicleRegistrationDTO() {
	}
	
	public VehicleRegistrationDTO(int registrationID, String registrationDate, String vehicleRegistrationNo,
			String make, String model, String colour, String forenames, String surname, String address,
			String dateOfBirth, String driverLicenceID, VehicleObservationDTO vehicleObvs) {
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
		this.vehicleObvs = vehicleObvs;
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

	public VehicleObservationDTO getVehicleObvs() {
		return vehicleObvs;
	}

	public void setVehicleObvs(VehicleObservationDTO vehicleObvs) {
		this.vehicleObvs = vehicleObvs;
	}
	
	

}
