package com.bae.project.dto;

public class EposTransactionsDTO {

	private String timestamp;
	private int eposId;
	private long bankCardNumber;
	private int payeeAccount;
	private float amount;
	private int tableId;
	
	private EposDTO epos;	
	
	public EposTransactionsDTO() {
	}

	public EposTransactionsDTO(String timestamp, int eposId, long bankCardNumber, int payeeAccount, float amount,
			int tableId, EposDTO epos) {
		super();
		this.timestamp = timestamp;
		this.eposId = eposId;
		this.bankCardNumber = bankCardNumber;
		this.payeeAccount = payeeAccount;
		this.amount = amount;
		this.tableId = tableId;
		this.epos = epos;
	}

	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public int getEposId() {
		return eposId;
	}


	public void setEposId(int eposId) {
		this.eposId = eposId;
	}


	public long getBankCardNumber() {
		return bankCardNumber;
	}


	public void setBankCardNumber(long bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}


	public int getPayeeAccount() {
		return payeeAccount;
	}


	public void setPayeeAccount(int payeeAccount) {
		this.payeeAccount = payeeAccount;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public int getTableId() {
		return tableId;
	}


	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public EposDTO getEpos() {
		return epos;
	}

	public void setEpos(EposDTO epos) {
		this.epos = epos;
	}
	
}
