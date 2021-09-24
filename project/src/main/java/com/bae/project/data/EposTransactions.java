package com.bae.project.data;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EposTransactions {
	
	@Id
	private int tableId;
	private String timestamp;
	private int eposId;
	private long bankCardNumber;
	private int payeeAccount;
	private float amount;
	
	@ManyToOne
	private BankCard bankcard;
	@ManyToOne
	private Epos epos;
	
	public EposTransactions(String timestamp, int eposId, long bankCardNumber, int payeeAccount, float amount,
			int tableId) {
		super();
		this.timestamp = timestamp;
		this.eposId = eposId;
		this.bankCardNumber = bankCardNumber;
		this.payeeAccount = payeeAccount;
		this.amount = amount;
		this.tableId = tableId;
	}
	
	public EposTransactions() {
		super();
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
		EposTransactions other = (EposTransactions) obj;
		return Float.floatToIntBits(amount) == Float.floatToIntBits(other.amount)
				&& bankCardNumber == other.bankCardNumber && eposId == other.eposId
				&& payeeAccount == other.payeeAccount && tableId == other.tableId
				&& Objects.equals(timestamp, other.timestamp);
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

	public BankCard getBankcard() {
		return bankcard;
	}

	public void setBankcard(BankCard bankcard) {
		this.bankcard = bankcard;
	}

	public Epos getEpos() {
		return epos;
	}

	public void setEpos(Epos epos) {
		this.epos = epos;
	}

	@Override
	public String toString() {
		return "EposTransactions [tableId=" + tableId + ", timestamp=" + timestamp + ", eposId=" + eposId
				+ ", bankCardNumber=" + bankCardNumber + ", payeeAccount=" + payeeAccount + ", amount=" + amount + "]";
	}
	
}
