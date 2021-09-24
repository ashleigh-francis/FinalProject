package com.bae.project.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.bae.project.data.AtmPoint;
import com.bae.project.data.AtmTransaction;
import com.bae.project.data.BankCard;
import com.bae.project.data.Citizen;
import com.bae.project.data.Epos;
import com.bae.project.data.EposTransactions;
import com.bae.project.data.Passport;
import com.bae.project.data.PeopleBankAccount;
import com.bae.project.data.PeopleBusinessAddress;
import com.bae.project.data.repo.CitizenRepo;
import com.bae.project.dto.CitizenInfoDTO;
import com.bae.project.dto.FinancialRecordsDTO;
import com.bae.project.dto.MobileRecordsDTO;
import com.bae.project.dto.VehicleInfoDTO;

@Service
@Primary
public class CitizenServiceDB implements CitizenService{
	
	private CitizenRepo repo;
	
	public CitizenServiceDB(CitizenRepo repo) {
		super();
		this.repo=repo;
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
		dtoF.setForenames(Bank.getForenames());
		dtoF.setSurname(Bank.getSurname());
		dtoF.setDateOfBirth(Bank.getDateOfBirth());
		dtoF.setHomeAddress(Bank.getHomeAddress());
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
		
		
		return dtoF;
	}
	
	
	@Override
	public List<CitizenInfoDTO> getCitizenInfo(String name) {
		
		return this.repo.findByCitizenNameIgnoreCase(name);
	}

	@Override
	public List<VehicleInfoDTO> getVehicleInfo(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MobileRecordsDTO> getMobileRecords(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FinancialRecordsDTO> getFinancialRecords(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
