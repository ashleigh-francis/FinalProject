package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BankCard {

	
	private Integer bankcardId;
	@Id
	private Long cardNumber;
	private String sortCode;
	private Integer bankAccountId;
	private String bank;
	
	@ManyToOne
	@JoinColumn(name="accountNumber")
	private PeopleBankAccount peopleBankAccount;
	
	@OneToMany(mappedBy = "bankcard")
	private List<EposTransactions> eposTrans;
	
	@OneToMany(mappedBy = "bankcard")
	private List<AtmTransaction> AtmTrans;
	

	public BankCard(Integer bankcardId, Long cardNumber, String sortCode, Integer bankAccountId, String bank) {
		super();
		this.bankcardId = bankcardId;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.bankAccountId = bankAccountId;
		this.bank = bank;
	}

	public BankCard() {
		super();
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(bank, bankAccountId, bankcardId, cardNumber, sortCode);
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
		return Objects.equals(bank, other.bank) && Objects.equals(bankAccountId, other.bankAccountId)
				&& Objects.equals(bankcardId, other.bankcardId) && Objects.equals(cardNumber, other.cardNumber)
				&& Objects.equals(sortCode, other.sortCode);
	}

	public Integer getBankcardId() {
		return bankcardId;
	}
	public void setBankcardId(Integer bankcardId) {
		this.bankcardId = bankcardId;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getSortCode() {
		return sortCode;
	}
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}

	public PeopleBankAccount getBankAccount() {
		return peopleBankAccount;
	}

	public void setBankAccount(PeopleBankAccount bankAccount) {
		this.peopleBankAccount = bankAccount;
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


	public Integer getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(Integer bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	@Override
	public String toString() {
		return "BankCard [bankcardId=" + bankcardId + ", cardNumber=" + cardNumber + ", sortCode=" + sortCode
				+ ", bankAccountId=" + bankAccountId + ", bank=" + bank + "]";
	}
	
	
	
}
