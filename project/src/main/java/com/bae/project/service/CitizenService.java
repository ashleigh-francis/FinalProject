package com.bae.project.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

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

public interface CitizenService {

	public List<CitizenInfoDTO> getCitizenInfo(Citizen citizen);

//	public List<VehicleInfoDTO> getVehicleInfo(VehicleRegistration VehicleRegistration);
//	public List<MobileRecordsDTO> getMobileRecords(String name);



	List<VehicleInfoDTO> getVehicleInfo(VehicleRegistration vehicleRegistration,
			VehicleObservations vehicleObservations, AnprCamera anprCamera);

	List<FinancialRecordsDTO> getFinancialRecords(PeopleBankAccount peopleBankAccount, BankCard bankCard,
			EposTransactions eposTransactions, Epos epos, AtmTransaction atmTransaction, AtmPoint atmPoint);

	List<MobileRecordsDTO> getMobileRecords(PeopleMobile peopleMobile, MobileCallRecords mobileCallRecords,
			CellTower cellTower);
	
}
