package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BankCard {

	@Id
	private int bankcardId;
	private long cardNumber;
	private String sortCode;
	private int bankAccountId;
	private int accountNumber;
	private String bank;
	
	@ManyToOne
	private PeopleBankAccount bankAccount;
	
	@OneToMany(mappedBy = "bankcard")
	private List<EposTransactions> eposTrans;
	
	@OneToMany(mappedBy = "bankcard")
	private List<AtmTransaction> AtmTrans;
	
	public BankCard(int bankcardId, long cardNumber, String sortCode, int bankAccountId, int accountNumber,
			String bank) {
		super();
		this.bankcardId = bankcardId;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.bank = bank;
	}
	
	public BankCard() {
		super();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, bank, bankAccountId, bankcardId, cardNumber, sortCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankCard other = (BankCard) obj;
		return accountNumber == other.accountNumber && Objects.equals(bank, other.bank)
				&& bankAccountId == other.bankAccountId && bankcardId == other.bankcardId
				&& cardNumber == other.cardNumber && Objects.equals(sortCode, other.sortCode);
	}

	public int getBankcardId() {
		return bankcardId;
	}
	public void setBankcardId(int bankcardId) {
		this.bankcardId = bankcardId;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getSortCode() {
		return sortCode;
	}
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
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

	public PeopleBankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(PeopleBankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public List<EposTransactions> getEposTrans() {
		return eposTrans;
	}

	public void setEposTrans(List<EposTransactions> eposTrans) {
		this.eposTrans = eposTrans;
	}

	public List<AtmTransaction> getAtmTrans() {
		return AtmTrans;
	}

	public void setAtmTrans(List<AtmTransaction> atmTrans) {
		AtmTrans = atmTrans;
	}

	@Override
	public String toString() {
		return "BankCard [bankcardId=" + bankcardId + ", cardNumber=" + cardNumber + ", sortCode=" + sortCode
				+ ", bankAccountId=" + bankAccountId + ", accountNumber=" + accountNumber + ", bank=" + bank + "]";
	}
	
}
