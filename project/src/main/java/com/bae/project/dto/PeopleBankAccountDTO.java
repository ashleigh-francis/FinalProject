package com.bae.project.dto;

public class PeopleBankAccountDTO {
	
	private int bankAccountId;
	private int accountNumber;
	private String bank;
	private String forenames;
	private String surname;
	private String dateOfBirth;
	private String homeAddress;
	
	private BankcardDTO bankcard;	
	
	public PeopleBankAccountDTO() {
	}

	public PeopleBankAccountDTO(int bankAccountId, int accountNumber, String bank, String forenames, String surname,
			String dateOfBirth, String homeAddress, BankcardDTO bankcard) {
		super();
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
		this.bankcard = bankcard;
	}

	public int getBankAccountId() {
		return bankAccountId;
	}


	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
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


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public BankcardDTO getBankcard() {
		return bankcard;
	}

	public void setBankcard(BankcardDTO bankcard) {
		this.bankcard = bankcard;
	}

}
