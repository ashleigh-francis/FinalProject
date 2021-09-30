package com.bae.project.dto;

public class CellTowerDTO {

	private int cellTowerId;
	private String operator;
	private int type;
	private double latitude;
	private double longitude;
	private int tableId;
	
	public CellTowerDTO() {
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
