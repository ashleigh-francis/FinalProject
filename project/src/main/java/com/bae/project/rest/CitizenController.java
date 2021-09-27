package com.bae.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.project.dto.CitizenInfoDTO;
import com.bae.project.dto.FinancialRecordsDTO;
import com.bae.project.dto.MobileRecordsDTO;
import com.bae.project.dto.VehicleInfoDTO;
import com.bae.project.service.CitizenService;

@RestController
public class CitizenController {

	
	private CitizenService service;
	
	public CitizenController(CitizenService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getCitizenInfo/{name}")
	public List<CitizenInfoDTO> getCitizenInfo(@PathVariable String name) {
		return this.service.getCitizenInfo(name);
		
	}
	@GetMapping("/getVehicleInfo/{name}")
	public List<VehicleInfoDTO> getVehicleInfo(@PathVariable String name) {
		return this.service.getVehicleInfo(name);
		
	}
	@GetMapping("/getMobileRecords/{name}")
	public List<MobileRecordsDTO> getMobileRecords(@PathVariable String name) {
		return this.service.getMobileRecords(name);
		
	}
	@GetMapping("/getFinancialRecords/{name}")
	public List<FinancialRecordsDTO> getFinancialRecords(@PathVariable String name) {
		return this.service.getFinancialRecords(name);
		
	}
}
