package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MobileCallRecords {
	
	private String timestamp;
	private String receiverMSISDN;
	private Integer receiverTowerId;
	@Id
	private Integer tableId;
	
	@ManyToOne
	@JoinColumn(name="callerMSISDN")
	private PeopleMobile peopleMobile;
	
	@ManyToOne
	@JoinColumn(name="callCellTowerId")
	private CellTower cellTower;
	
	public MobileCallRecords() {
		super();
	}


	public MobileCallRecords(String timestamp,  String receiverMSISDN,
			Integer receiverTowerId, Integer tableId) {
		super();
		this.timestamp = timestamp;
		
		this.receiverMSISDN = receiverMSISDN;
		this.receiverTowerId = receiverTowerId;
		this.tableId = tableId;
	}


	@Override
	public int hashCode() {
		return Objects.hash( receiverMSISDN, receiverTowerId, tableId, timestamp);
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
		return  Objects.equals(receiverMSISDN, other.receiverMSISDN) && receiverTowerId == other.receiverTowerId
				&& tableId == other.tableId && Objects.equals(timestamp, other.timestamp);
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getReceiverMSISDN() {
		return receiverMSISDN;
	}


	public void setReceiverMSISDN(String receiverMSISDN) {
		this.receiverMSISDN = receiverMSISDN;
	}


	public Integer getReceiverTowerId() {
		return receiverTowerId;
	}


	public void setReceiverTowerId(Integer receiverTowerId) {
		this.receiverTowerId = receiverTowerId;
	}


	public Integer getTableId() {
		return tableId;
	}


	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}


	public PeopleMobile getPeopleMobile() {
		return peopleMobile;
	}


	public void setPeopleMobile(PeopleMobile peopleMobile) {
		this.peopleMobile = peopleMobile;
	}


	public CellTower getCellTower() {
		return cellTower;
	}


	public void setCellTower(CellTower cellTower) {
		this.cellTower = cellTower;
	}


	@Override
	public String toString() {
		return "MobileCallRecords [timestamp=" + timestamp + ", receiverMSISDN=" + receiverMSISDN + ", receiverTowerId=" + receiverTowerId
				+ ", tableId=" + tableId + "]";
	}
	
	
	
	
}
