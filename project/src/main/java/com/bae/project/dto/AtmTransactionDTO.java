package com.bae.project.dto;

public class AtmTransactionDTO {
	
	private String timestamp;
	private int atmId;
	private long bankCardNumber;
	private String type;
	private float amount;
	private int id;
	
	private AtmPointDTO atmPoint;
	
	public AtmTransactionDTO() {
	}

	public AtmTransactionDTO(String timestamp, int atmId, long bankCardNumber, String type, float amount, int id,
			AtmPointDTO atmPoint) {
		super();
		this.timestamp = timestamp;
		this.atmId = atmId;
		this.bankCardNumber = bankCardNumber;
		this.type = type;
		this.amount = amount;
		this.id = id;
		this.atmPoint = atmPoint;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getAtmId() {
		return atmId;
	}

	public void setAtmId(int atmId) {
		this.atmId = atmId;
	}

	public long getBankCardNumber() {
		return bankCardNumber;
	}

	public void setBankCardNumber(long bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AtmPointDTO getAtmPoint() {
		return atmPoint;
	}

	public void setAtmPoint(AtmPointDTO atmPoint) {
		this.atmPoint = atmPoint;
	}
	
}
