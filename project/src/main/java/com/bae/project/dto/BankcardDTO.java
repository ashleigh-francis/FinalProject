package com.bae.project.dto;

public class BankcardDTO {

	private int bankcardId;
	private long cardNumber;
	private String sortCode;
	private int bankAccountId;
	private int accountNumber;
	private String bank;
	
	public BankcardDTO() {
		
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
	
	
}
