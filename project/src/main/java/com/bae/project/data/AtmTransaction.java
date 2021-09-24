package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AtmTransaction {
	
		private String timestamp;
		private int atmId;
		private long bankCardNumber;
		private String type;
		private float amount;
		@Id
		private int id;
		
		@ManyToOne
		private BankCard bankcard;
		@ManyToOne
		private AtmPoint atmPoint;
		
		public AtmTransaction() {
			super();
		}


		public AtmTransaction(String timestamp, int atmId, long bankCardNumber, String type, float amount, int id) {
			super();
			this.timestamp = timestamp;
			this.atmId = atmId;
			this.bankCardNumber = bankCardNumber;
			this.type = type;
			this.amount = amount;
			this.id = id;
		}


		@Override
		public int hashCode() {
			return Objects.hash(amount, atmId, bankCardNumber, id, timestamp, type);
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
			return Float.floatToIntBits(amount) == Float.floatToIntBits(other.amount) && atmId == other.atmId
					&& bankCardNumber == other.bankCardNumber && id == other.id
					&& Objects.equals(timestamp, other.timestamp) && Objects.equals(type, other.type);
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
		public String toString() {
			return "AtmTransaction [timestamp=" + timestamp + ", atmId=" + atmId + ", bankCardNumber=" + bankCardNumber
					+ ", type=" + type + ", amount=" + amount + ", id=" + id + "]";
		}
		
}
