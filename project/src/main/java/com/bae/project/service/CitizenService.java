package com.bae.project.service;

import java.util.List;

import com.bae.project.dto.CitizenInfoDTO;
import com.bae.project.dto.FinancialRecordsDTO;
import com.bae.project.dto.MobileRecordsDTO;
import com.bae.project.dto.VehicleInfoDTO;

public interface CitizenService {

	public List<CitizenInfoDTO> getCitizenInfo(String name);
	public List<VehicleInfoDTO> getVehicleInfo(String name);
	public List<MobileRecordsDTO> getMobileRecords(String name);
	public List<FinancialRecordsDTO> getFinancialRecords(String name);
	
}
