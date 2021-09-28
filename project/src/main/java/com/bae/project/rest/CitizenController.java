package com.bae.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.project.data.AnprCamera;
import com.bae.project.data.AtmPoint;
import com.bae.project.data.AtmTransaction;
import com.bae.project.data.BankCard;
import com.bae.project.data.CellTower;
import com.bae.project.data.Citizen;
import com.bae.project.data.Epos;
import com.bae.project.data.EposTransactions;
import com.bae.project.data.MobileCallRecords;
import com.bae.project.data.PeopleBankAccount;
import com.bae.project.data.PeopleMobile;
import com.bae.project.data.VehicleObservations;
import com.bae.project.data.VehicleRegistration;
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
	
	@GetMapping("/getCitizenInfo")
	public List<CitizenInfoDTO> getCitizenInfo(@RequestBody Citizen citizen) {
		return this.service.getCitizenInfo(citizen);
		
	}
	
//	@GetMapping("/getAll/{field}/{direction}")
//	public ResponseEntity<List<CitizenInfoDTO>> sortAndFilterDucks(@PathVariable String field, @PathVariable Direction direction, @RequestBody Citizen citizen) {
//		return ResponseEntity.ok(this.service.sortAndFilterCitizen(direction, field, citizen));
//	}
	@GetMapping("/getVehicleInfo")
	public List<VehicleInfoDTO> getVehicleInfo(@RequestBody VehicleRegistration vehicleRegistration, VehicleObservations vehicleObservations, AnprCamera anprCamera) {
		return this.service.getVehicleInfo(vehicleRegistration, vehicleObservations, anprCamera);
		
	}
	@GetMapping("/getMobileRecords")
	public List<MobileRecordsDTO> getMobileRecords(@RequestBody PeopleMobile peopleMobile, MobileCallRecords mobileCallRecords,
			CellTower cellTower) {
		return this.service.getMobileRecords( peopleMobile, mobileCallRecords,
				 cellTower);
		
	}
	@GetMapping("/getFinancialRecords")
	public List<FinancialRecordsDTO> getFinancialRecords(@RequestBody PeopleBankAccount peopleBankAccount, BankCard bankCard,
			EposTransactions eposTransactions, Epos epos, AtmTransaction atmTransaction, AtmPoint atmPoint) {
		return this.service.getFinancialRecords( peopleBankAccount, bankCard,
				 eposTransactions,  epos, atmTransaction, atmPoint);
		
	}
}
