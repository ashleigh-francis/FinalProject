package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bankcard {

	@Id
	private int bankcardId;
	private long cardNumber;
	private String sortCode;
	private int bankAccountId;
	private int accountNumber;
	private String bank;
	
	
	public Bankcard(int bankcardId, long cardNumber, String sortCode, int bankAccountId, int accountNumber,
			String bank) {
		super();
		this.bankcardId = bankcardId;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.bank = bank;
	}
	
	public Bankcard() {
		super();
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
		Bankcard other = (Bankcard) obj;
		return accountNumber == other.accountNumber && Objects.equals(bank, other.bank)
				&& bankAccountId == other.bankAccountId && bankcardId == other.bankcardId
				&& cardNumber == other.cardNumber && Objects.equals(sortCode, other.sortCode);
	}
	
}
