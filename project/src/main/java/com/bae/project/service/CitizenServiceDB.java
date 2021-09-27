package com.bae.project.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.bae.project.data.AnprCamera;
import com.bae.project.data.AtmPoint;
import com.bae.project.data.AtmTransaction;
import com.bae.project.data.BankCard;
import com.bae.project.data.CellTower;
import com.bae.project.data.Citizen;
import com.bae.project.data.Epos;
import com.bae.project.data.EposTransactions;
import com.bae.project.data.MobileCallRecords;
import com.bae.project.data.Passport;
import com.bae.project.data.PeopleBankAccount;
import com.bae.project.data.PeopleBusinessAddress;
import com.bae.project.data.PeopleMobile;
import com.bae.project.data.VehicleObservations;
import com.bae.project.data.VehicleRegistration;
import com.bae.project.data.repo.CitizenRepo;
import com.bae.project.data.repo.FinancialRepo;
import com.bae.project.data.repo.MobileRepo;
import com.bae.project.data.repo.VehicleRepo;
import com.bae.project.dto.CitizenInfoDTO;
import com.bae.project.dto.FinancialRecordsDTO;
import com.bae.project.dto.MobileRecordsDTO;
import com.bae.project.dto.VehicleInfoDTO;

@Service
@Primary
public class CitizenServiceDB implements CitizenService{
	
	private CitizenRepo repo;
	private VehicleRepo repoV;
	private FinancialRepo repoF;
	private MobileRepo repoM;
	

	public CitizenServiceDB(CitizenRepo repo, VehicleRepo repoV, FinancialRepo repoF, MobileRepo repoM) {
		super();
		this.repo = repo;
		this.repoV = repoV;
		this.repoF = repoF;
		this.repoM = repoM;
	}

	public CitizenInfoDTO mapToDTO(Citizen Citizen, PeopleBusinessAddress Business, Passport Passport) {
		
		CitizenInfoDTO dtoC = new CitizenInfoDTO();
		dtoC.setForenames(Citizen.getForenames());
		dtoC.setSurname(Citizen.getSurname());
		dtoC.setHomeAddress(Citizen.getHomeAddress());
		dtoC.setPlaceOfBirth(Citizen.getPlaceOfBirth());
		dtoC.setSex(Citizen.getSex());
		dtoC.setBusinessName(Business.getBusinessName());
		dtoC.setBusinessAddress(Business.getBusinessAddress());
		dtoC.setPassportNumber(Passport.getPassportNumber());
		dtoC.setNationality(Passport.getNationality());
		dtoC.setIsssuingCountry(Passport.getIsssuingCountry());
		dtoC.setDateOfIssue(Passport.getDateOfIssue());
		dtoC.setDateOfExpiry(Passport.getDateOfExpiry());
		return dtoC;
	}
	
	public FinancialRecordsDTO mapToDTO(PeopleBankAccount Bank, BankCard Bankcard,
			EposTransactions EposTrans, Epos Epos, AtmTransaction AtmTrans,
			AtmPoint Atm) {
		FinancialRecordsDTO dtoF = new FinancialRecordsDTO();
		dtoF.setAccountNumber(Bank.getAccountNumber());
		dtoF.setBank(Bank.getBank());
		dtoF.setBankCardNumber(Bankcard.getCardNumber());
		dtoF.setSortCode(Bankcard.getSortCode());
		dtoF.setTimestamp(EposTrans.getTimestamp());
		dtoF.setBankCardNumber(EposTrans.getBankCardNumber());
		dtoF.setPayeeAccount(EposTrans.getPayeeAccount());
		dtoF.setAmount(EposTrans.getAmount());
		dtoF.setVendor(Epos.getVendor());
		dtoF.setStreetName(Epos.getStreetName());
		dtoF.setPostcode(Epos.getPostcode());
		dtoF.setLatitude(Epos.getLatitude());
		dtoF.setLongitude(Epos.getLongitude());
		dtoF.setAtmTimestamp(AtmTrans.getAtmTimestamp());
		dtoF.setAtmBankCardNumber(AtmTrans.getAtmBankCardNumber());
		dtoF.setType(AtmTrans.getType());
		dtoF.setAtmAmount(AtmTrans.getAtmAmount());
		dtoF.setOperator(Atm.getOperator());
		dtoF.setAtmStreetName(Atm.getAtmStreetName());
		dtoF.setAtmPostcode(Atm.getAtmPostcode());
		dtoF.setAtmLatitude(Atm.getAtmLatitude());
		dtoF.setAtmLongitude(Atm.getAtmLongitude());
		
		return dtoF;
	}
	
	public VehicleInfoDTO mapToDTO(VehicleRegistration VehicleReg, 
			VehicleObservations VehicleObvs, AnprCamera Anpr) {
		VehicleInfoDTO dtoV = new VehicleInfoDTO();
		dtoV.setDriverLicenceID(VehicleReg.getDriverLicenceID());
		dtoV.setVehicleRegistrationNo(VehicleReg.getVehicleRegistrationNo());
		dtoV.setMake(VehicleReg.getMake());
		dtoV.setModel(VehicleReg.getModel());
		dtoV.setColour(VehicleReg.getColour());
		dtoV.setAnprPointId(VehicleObvs.getAnprPointId());
		dtoV.setTimestamp(VehicleObvs.getTimestamp());
		dtoV.setStreetName(Anpr.getStreetName());
		dtoV.setLatitude(Anpr.getLatitude());
		dtoV.setLongitude(Anpr.getLongitude());
		
		return dtoV;
	}
	
	public MobileRecordsDTO mapToDTO(PeopleMobile PeopleMobile, 
			MobileCallRecords MobileCall, CellTower CellTower) {
		MobileRecordsDTO dtoM = new MobileRecordsDTO();
		dtoM.setPhoneNumber(PeopleMobile.getPhoneNumber());
		dtoM.setNetwork(PeopleMobile.getNetwork());
		dtoM.setTimestamp(MobileCall.getTimestamp());
		dtoM.setCallerMSISDN(MobileCall.getCallerMSISDN());
		dtoM.setReceiverMSISDN(MobileCall.getReceiverMSISDN());
		dtoM.setLatitude(CellTower.getLatitude());
		dtoM.setLongitude(CellTower.getLongitude());
		
		return dtoM;
	}
	
	
	@Override
	public List<CitizenInfoDTO> getCitizenInfo(String name) {
		
		return this.repo.findByForenamesIgnoreCase(name);
	}

	@Override
	public List<VehicleInfoDTO> getVehicleInfo(String name) {
		// TODO Auto-generated method stub
		return this.repoV.findByForenamesIgnoreCase(name);
	}

	@Override
	public List<MobileRecordsDTO> getMobileRecords(String name) {
		// TODO Auto-generated method stub
		return this.repoM.findByForenameIgnoreCase(name);
	}

	@Override
	public List<FinancialRecordsDTO> getFinancialRecords(String name) {
		// TODO Auto-generated method stub
		return this.repoF.findByForenamesIgnoreCase(name);
	}

}
