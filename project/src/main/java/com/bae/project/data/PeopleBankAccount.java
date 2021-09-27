package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PeopleBankAccount {

	@Id
	private int bankAccountId;
	private int accountNumber;
	private String bank;
	private String forenames;
	private String surname;
	private String dateOfBirth;
	private String homeAddress;
	
	@ManyToOne
	private Citizen citizen;
	@OneToMany(mappedBy = "")
	private List<BankCard> bankcards;
	
	public PeopleBankAccount() {
		super();
	}
	
	public PeopleBankAccount(int bankAccountId, int accountNumber, String bank, String forenames, String surname,
			String dateOfBirth, String homeAddress) {
		super();
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, bank, bankAccountId, dateOfBirth, forenames, homeAddress, surname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeopleBankAccount other = (PeopleBankAccount) obj;
		return accountNumber == other.accountNumber && Objects.equals(bank, other.bank)
				&& bankAccountId == other.bankAccountId && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(forenames, other.forenames) && Objects.equals(homeAddress, other.homeAddress)
				&& Objects.equals(surname, other.surname);
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

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public List<BankCard> getBankcards() {
		return bankcards;
	}

	public void setBankcards(List<BankCard> bankcards) {
		this.bankcards = bankcards;
	}

	@Override
	public String toString() {
		return "PeopleBankAccount [bankAccountId=" + bankAccountId + ", accountNumber=" + accountNumber + ", bank="
				+ bank + ", forenames=" + forenames + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth
				+ ", homeAddress=" + homeAddress + "]";
	}
	
}
