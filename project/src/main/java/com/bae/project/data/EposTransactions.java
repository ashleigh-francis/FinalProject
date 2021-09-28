package com.bae.project.data;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EposTransactions {
	
	@Id
	private Integer tableId;
	private String timestamp;
	private Long payeeAccount;
	private Float amount;
	
	@ManyToOne
	@JoinColumn(name="bankCardNumber")
	private BankCard bankcard;
	
	@ManyToOne
	@JoinColumn(name = "eposId")
	private Epos epos;
	
	public EposTransactions(String timestamp, Long payeeAccount, Float amount,
			Integer tableId) {
		super();
		this.timestamp = timestamp;

		this.payeeAccount = payeeAccount;
		this.amount = amount;
		this.tableId = tableId;
	}
	
	public EposTransactions() {
		super();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(amount,  payeeAccount, tableId, timestamp);
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
				&& payeeAccount == other.payeeAccount && tableId == other.tableId
				&& Objects.equals(timestamp, other.timestamp);
	}

	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public Long getPayeeAccount() {
		return payeeAccount;
	}
	public void setPayeeAccount(Long payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Integer getTableId() {
		return tableId;
	}
	public void setTableId(Integer tableId) {
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
		return "EposTransactions [tableId=" + tableId + ", timestamp=" + timestamp +", payeeAccount=" + payeeAccount + ", amount=" + amount + "]";
	}
	
}
