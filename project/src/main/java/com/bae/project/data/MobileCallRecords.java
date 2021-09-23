package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobileCallRecords {
	
	private String timestamp;
	private String callerMSISDN;
	private String callCellTowerId;
	private String receiverMSISDN;
	private int receiverTowerId;
	@Id
	private int tableId;
	
	
	public MobileCallRecords() {
		super();
	}


	public MobileCallRecords(String timestamp, String callerMSISDN, String callCellTowerId, String receiverMSISDN,
			int receiverTowerId, int tableId) {
		super();
		this.timestamp = timestamp;
		this.callerMSISDN = callerMSISDN;
		this.callCellTowerId = callCellTowerId;
		this.receiverMSISDN = receiverMSISDN;
		this.receiverTowerId = receiverTowerId;
		this.tableId = tableId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(callCellTowerId, callerMSISDN, receiverMSISDN, receiverTowerId, tableId, timestamp);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobileCallRecords other = (MobileCallRecords) obj;
		return Objects.equals(callCellTowerId, other.callCellTowerId)
				&& Objects.equals(callerMSISDN, other.callerMSISDN)
				&& Objects.equals(receiverMSISDN, other.receiverMSISDN) && receiverTowerId == other.receiverTowerId
				&& tableId == other.tableId && Objects.equals(timestamp, other.timestamp);
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public String getCallerMSISDN() {
		return callerMSISDN;
	}


	public void setCallerMSISDN(String callerMSISDN) {
		this.callerMSISDN = callerMSISDN;
	}


	public String getCallCellTowerId() {
		return callCellTowerId;
	}


	public void setCallCellTowerId(String callCellTowerId) {
		this.callCellTowerId = callCellTowerId;
	}


	public String getReceiverMSISDN() {
		return receiverMSISDN;
	}


	public void setReceiverMSISDN(String receiverMSISDN) {
		this.receiverMSISDN = receiverMSISDN;
	}


	public int getReceiverTowerId() {
		return receiverTowerId;
	}


	public void setReceiverTowerId(int receiverTowerId) {
		this.receiverTowerId = receiverTowerId;
	}


	public int getTableId() {
		return tableId;
	}


	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	
	
	
	
}
