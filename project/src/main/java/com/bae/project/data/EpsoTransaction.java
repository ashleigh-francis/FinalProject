package com.bae.project.data;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EpsoTransaction {
	
	@Id
	private String timestamp;
	private int eposId;
	private long bankCardNumber;
	private int payeeAccount;
	private float amount;
	private int tableId;
	
	
	public EpsoTransaction(String timestamp, int eposId, long bankCardNumber, int payeeAccount, float amount,
			int tableId) {
		super();
		this.timestamp = timestamp;
		this.eposId = eposId;
		this.bankCardNumber = bankCardNumber;
		this.payeeAccount = payeeAccount;
		this.amount = amount;
		this.tableId = tableId;
	}
	
	public EpsoTransaction() {
		super();
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
	@Override
	public int hashCode() {
		return Objects.hash(amount, bankCardNumber, eposId, payeeAccount, tableId, timestamp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EpsoTransaction other = (EpsoTransaction) obj;
		return Float.floatToIntBits(amount) == Float.floatToIntBits(other.amount)
				&& bankCardNumber == other.bankCardNumber && eposId == other.eposId
				&& payeeAccount == other.payeeAccount && tableId == other.tableId
				&& Objects.equals(timestamp, other.timestamp);
	}
	
	
}
