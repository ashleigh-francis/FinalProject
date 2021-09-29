package com.bae.project.service;

import java.util.List;

import com.bae.project.data.AnprCamera;
import com.bae.project.data.CellTower;
import com.bae.project.data.Citizen;
import com.bae.project.data.MobileCallRecords;
import com.bae.project.data.PeopleBankAccount;
import com.bae.project.data.PeopleMobile;
import com.bae.project.data.Users;
import com.bae.project.data.VehicleObservations;
import com.bae.project.data.VehicleRegistration;
import com.bae.project.dto.CitizenInfoDTO;
import com.bae.project.dto.FinancialRecordsDTO;
import com.bae.project.dto.MobileRecordsDTO;
import com.bae.project.dto.UsersDTO;
import com.bae.project.dto.VehicleInfoDTO;

public interface CitizenService {

	public List<CitizenInfoDTO> getCitizenInfo(Citizen citizen);

	List<VehicleInfoDTO> getVehicleInfo(VehicleRegistration vehicleRegistration,
			VehicleObservations vehicleObservations, AnprCamera anprCamera);

	List<FinancialRecordsDTO> getFinancialRecords(PeopleBankAccount account);

	List<MobileRecordsDTO> getMobileRecords(PeopleMobile peopleMobile, MobileCallRecords mobileCallRecords,
			CellTower cellTower);

	public List<UsersDTO> getUsers(Users users);
}
