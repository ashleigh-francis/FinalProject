package com.bae.project.dto;

public class EposTransactionsDTO {

	private String timestamp;
	private int eposId;
	private long bankCardNumber;
	private int payeeAccount;
	private float amount;
	private int tableId;
	
	
	public EposTransactionsDTO() {
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
	
	
	
	
}
