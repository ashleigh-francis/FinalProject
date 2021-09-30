package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AtmTransaction {
	
		@Column(name = "timestamp")
		private String atmTimestamp;
		private String type;
		@Column(name = "amount")
		private Float atmAmount;
		@Id
		private Integer id;
			
		@ManyToOne
		@JoinColumn(name="bankCardNumber")
		private BankCard bankcard;
		
		@ManyToOne
		@JoinColumn(name="atmId")
		private AtmPoint atmPoint;
		
		public AtmTransaction() {
			super();
		}

		

		public AtmTransaction(String atmTimestamp, String type, Float atmAmount, Integer id) {
			super();
			this.atmTimestamp = atmTimestamp;
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


		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Float getAtmAmount() {
			return atmAmount;
		}

		public void setAtmAmount(Float atmAmount) {
			this.atmAmount = atmAmount;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
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
			return Objects.hash(atmAmount, atmTimestamp, id, type);
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
			
					&& Objects.equals(atmTimestamp, other.atmTimestamp) && id == other.id && Objects.equals(type, other.type);
		}

		@Override
		public String toString() {
			return "AtmTransaction [atmTimestamp=" + atmTimestamp +  ", type=" + type + ", atmAmount=" + atmAmount + ", id=" + id + "]";
		}

		
	
}
