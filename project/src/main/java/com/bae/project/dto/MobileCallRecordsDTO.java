package com.bae.project.dto;

public class MobileCallRecordsDTO {
	
	private String timestamp;
	private String callerMSISDN;
	private String callCellTowerId;
	private String receiverMSISDN;
	private int receiverTowerId;
	private int tableId;
	
	
	public MobileCallRecordsDTO() {
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
