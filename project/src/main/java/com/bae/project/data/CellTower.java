package com.bae.project.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CellTower {
	
	@Id
	private Integer cellTowerId;
	private String operator;
	private String type;
	private Double latitude;
	private Double longitude;
	private Integer tableId;
	
	@OneToMany(mappedBy ="cellTower")
	private List<MobileCallRecords> mobileCallRecords;
	
	public CellTower() {
		super();
	}

	public CellTower(Integer cellTowerId, String operator, String type, Double latitude, Double longitude,
			Integer tableId) {
		super();
		this.cellTowerId = cellTowerId;
		this.operator = operator;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
		this.tableId = tableId;
	}



	@Override
	public int hashCode() {
		return Objects.hash(cellTowerId, latitude, longitude, operator, tableId, type);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellTower other = (CellTower) obj;
		return cellTowerId == other.cellTowerId
				&& Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(operator, other.operator) && tableId == other.tableId && type == other.type;
	}


	public Integer getCellTowerId() {
		return cellTowerId;
	}


	public void setCellTowerId(Integer cellTowerId) {
		this.cellTowerId = cellTowerId;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}


	public Integer getTableId() {
		return tableId;
	}


	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}


	public List<MobileCallRecords> getMobileCallRecords() {
		return mobileCallRecords;
	}


	public void setMobileCallRecords(List<MobileCallRecords> mobileCallRecords) {
		this.mobileCallRecords = mobileCallRecords;
	}


	@Override
	public String toString() {
		return "CellTower [cellTowerId=" + cellTowerId + ", operator=" + operator + ", type=" + type + ", latitude="
				+ latitude + ", longitude=" + longitude + ", tableId=" + tableId + "]";
	}


	
}
