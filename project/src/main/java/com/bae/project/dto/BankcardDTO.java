package com.bae.project.dto;

public class BankcardDTO {

	private int bankcardId;
	private long cardNumber;
	private String sortCode;
	private int bankAccountId;
	private int accountNumber;
	private String bank;
	
	private EposTransactionsDTO eposTransaction;
	private AtmTransactionDTO atmTransaction;
	
	public BankcardDTO() {
		
	}
	
	public BankcardDTO(int bankcardId, long cardNumber, String sortCode, int bankAccountId, int accountNumber,
			String bank, EposTransactionsDTO eposTransaction, AtmTransactionDTO atmTransaction) {
		super();
		this.bankcardId = bankcardId;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.eposTransaction = eposTransaction;
		this.atmTransaction = atmTransaction;
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

	public EposTransactionsDTO getEposTransaction() {
		return eposTransaction;
	}

	public void setEposTransaction(EposTransactionsDTO eposTransaction) {
		this.eposTransaction = eposTransaction;
	}

	public AtmTransactionDTO getAtmTransaction() {
		return atmTransaction;
	}

	public void setAtmTransaction(AtmTransactionDTO atmTransaction) {
		this.atmTransaction = atmTransaction;
	}
	
}
