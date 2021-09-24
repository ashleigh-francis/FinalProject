package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AtmTransaction {
	
		@Column(name = "timestamp")
		private String atmTimestamp;
		private int atmId;
		@Column(name = "bankCardNumber")
		private long atmBankCardNumber;
		private String type;
		@Column(name = "amount")
		private float atmAmount;
		@Id
		private int id;
			
		@ManyToOne
		private BankCard bankcard;
		@ManyToOne
		private AtmPoint atmPoint;
		
		public AtmTransaction() {
			super();
		}

		public AtmTransaction(String atmTimestamp, int atmId, long atmBankCardNumber, String type, float atmAmount,
				int id, BankCard bankcard, AtmPoint atmPoint) {
			super();
			this.atmTimestamp = atmTimestamp;
			this.atmId = atmId;
			this.atmBankCardNumber = atmBankCardNumber;
			this.type = type;
			this.atmAmount = atmAmount;
			this.id = id;
		}

		public String getAtmTimestamp() {
			return atmTimestamp;
		}

		public void setAtmTimestamp(String atmTimestamp) {
			this.atmTimestamp = atmTimestamp;
		}

		public int getAtmId() {
			return atmId;
		}

		public void setAtmId(int atmId) {
			this.atmId = atmId;
		}

		public long getAtmBankCardNumber() {
			return atmBankCardNumber;
		}

		public void setAtmBankCardNumber(long atmBankCardNumber) {
			this.atmBankCardNumber = atmBankCardNumber;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public float getAtmAmount() {
			return atmAmount;
		}

		public void setAtmAmount(float atmAmount) {
			this.atmAmount = atmAmount;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public BankCard getBankcard() {
			return bankcard;
		}

		public void setBankcard(BankCard bankcard) {
			this.bankcard = bankcard;
		}

		public AtmPoint getAtmPoint() {
			return atmPoint;
		}

		public void setAtmPoint(AtmPoint atmPoint) {
			this.atmPoint = atmPoint;
		}

		@Override
		public int hashCode() {
			return Objects.hash(atmAmount, atmBankCardNumber, atmId, atmTimestamp, id, type);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AtmTransaction other = (AtmTransaction) obj;
			return Float.floatToIntBits(atmAmount) == Float.floatToIntBits(other.atmAmount)
					&& atmBankCardNumber == other.atmBankCardNumber && atmId == other.atmId
					&& Objects.equals(atmTimestamp, other.atmTimestamp) && id == other.id && Objects.equals(type, other.type);
		}

		@Override
		public String toString() {
			return "AtmTransaction [atmTimestamp=" + atmTimestamp + ", atmId=" + atmId + ", atmBankCardNumber="
					+ atmBankCardNumber + ", type=" + type + ", atmAmount=" + atmAmount + ", id=" + id + "]";
		}

		
	
}
