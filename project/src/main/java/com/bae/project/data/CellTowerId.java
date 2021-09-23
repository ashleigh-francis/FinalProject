package com.bae.project.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CellTowerId {
	
	private int cellTowerId;
	private String operator;
	private int type;
	private double latitude;
	private double longitude;
	@Id
	private int tableId;
	
	
	public CellTowerId() {
		super();
	}


	public CellTowerId(int cellTowerId, String operator, int type, double latitude, double longitude, int tableId) {
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
		CellTowerId other = (CellTowerId) obj;
		return cellTowerId == other.cellTowerId
				&& Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(operator, other.operator) && tableId == other.tableId && type == other.type;
	}


	public int getCellTowerId() {
		return cellTowerId;
	}


	public void setCellTowerId(int cellTowerId) {
		this.cellTowerId = cellTowerId;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public int getTableId() {
		return tableId;
	}


	public void setTableId(int tableId) {
		this.tableId = tableId;
	}


	
}
