package com.bae.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
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
import com.bae.project.data.PeopleBankAccount;
import com.bae.project.data.PeopleMobile;
import com.bae.project.data.Users;
import com.bae.project.data.VehicleObservations;
import com.bae.project.data.VehicleRegistration;
import com.bae.project.data.repo.BankAccountRepo;
import com.bae.project.data.repo.CitizenRepo;
import com.bae.project.data.repo.MobileRepo;
import com.bae.project.data.repo.UsersRepo;
import com.bae.project.data.repo.VehicleRepo;
import com.bae.project.dto.CitizenInfoDTO;
import com.bae.project.dto.FinancialRecordsDTO;
import com.bae.project.dto.MobileRecordsDTO;
import com.bae.project.dto.TransactionType;
import com.bae.project.dto.UsersDTO;
import com.bae.project.dto.VehicleInfoDTO;

@Service
@Primary
public class CitizenServiceDB implements CitizenService {

	private CitizenRepo repo;
	private VehicleRepo repoV;
	private BankAccountRepo repoBA;
	private MobileRepo repoM;
	private UsersRepo repoU;

	public CitizenServiceDB(CitizenRepo repo, VehicleRepo repoV, BankAccountRepo repoBA, MobileRepo repoM) {
		super();
		this.repo = repo;
		this.repoV = repoV;
		this.repoBA = repoBA;
		this.repoM = repoM;
	}

	public CitizenInfoDTO mapToDTO(Citizen Citizen
//			PeopleBusinessAddress Business, Passport Passport
	) {

		CitizenInfoDTO dtoC = new CitizenInfoDTO();
		dtoC.setForenames(Citizen.getForenames());
		dtoC.setSurname(Citizen.getSurname());
		dtoC.setHomeAddress(Citizen.getHomeAddress());
		dtoC.setPlaceOfBirth(Citizen.getPlaceOfBirth());
		dtoC.setDateOfBirth(Citizen.getDateOfBirth());
		dtoC.setSex(Citizen.getSex());
//		if (Business != null) {
//		dtoC.setBusinessName(Business.getBusinessName());
//		dtoC.setBusinessAddress(Business.getBusinessAddress());
//		}
//		if (Passport != null) {
//		dtoC.setPassportNumber(Passport.getPassportNumber());
//		dtoC.setNationality(Passport.getNationality());
//		dtoC.setIssuingCountry(Passport.getIssuingCountry());
//		dtoC.setDateOfIssue(Passport.getDateOfIssue());
//		dtoC.setDateOfExpiry(Passport.getDateOfExpiry());
//		}
		return dtoC;
	}

	private FinancialRecordsDTO mapToDTO(PeopleBankAccount account, BankCard card, AtmTransaction transaction) {
		FinancialRecordsDTO dto = new FinancialRecordsDTO();
		dto.setTransactionType(TransactionType.ATM);

		dto.setAccountNumber(account.getAccountNumber());
		dto.setBank(account.getBank());

		dto.setCardNumber(card.getCardNumber());
		dto.setSortCode(card.getSortCode());

		AtmPoint atm = transaction.getAtmPoint();
		dto.setTimestamp(transaction.getAtmTimestamp());
		dto.setAmount(transaction.getAtmAmount());
		dto.setType(transaction.getType());
		dto.setOperator(atm.getOperator());
		dto.setStreetName(atm.getAtmStreetName());
		dto.setPostcode(atm.getAtmPostcode());
		dto.setLatitude(atm.getAtmLatitude());
		dto.setLongitude(atm.getAtmLongitude());

		return dto;
	}

	private FinancialRecordsDTO mapToDTO(PeopleBankAccount account, BankCard card, EposTransactions transaction) {
		FinancialRecordsDTO dto = new FinancialRecordsDTO();
		dto.setTransactionType(TransactionType.EPOS);

		dto.setAccountNumber(account.getAccountNumber());
		dto.setBank(account.getBank());
		dto.setCardNumber(card.getCardNumber());
		dto.setSortCode(card.getSortCode());
		dto.setTimestamp(transaction.getTimestamp());
		dto.setAmount(transaction.getAmount());

		Epos epos = transaction.getEpos();
		dto.setStreetName(epos.getStreetName());
		dto.setPostcode(epos.getPostcode());
		dto.setLatitude(epos.getLatitude());
		dto.setLongitude(epos.getLongitude());

		dto.setPayeeAccount(transaction.getPayeeAccount());
		dto.setVendor(epos.getVendor());

		return dto;
	}

	public List<FinancialRecordsDTO> mapToDTO(PeopleBankAccount account) {
		List<FinancialRecordsDTO> financialDTOs = new ArrayList<>();

		for (BankCard card : account.getBankcards()) {

			for (AtmTransaction transaction : card.getAtmTrans()) {
				financialDTOs.add(this.mapToDTO(account, card, transaction));
			}

			for (EposTransactions transaction : card.getEposTrans()) {
				financialDTOs.add(this.mapToDTO(account, card, transaction));
			}
		}

		return financialDTOs;
	}

	@Override
	public List<FinancialRecordsDTO> getFinancialRecords(PeopleBankAccount peopleBankAccount) {
		List<FinancialRecordsDTO> financialDTOs = new ArrayList<>();
		List<PeopleBankAccount> accounts = this.repoBA.findAll(Example.of(peopleBankAccount));

		for (PeopleBankAccount account : accounts) {
			financialDTOs.addAll(this.mapToDTO(account));
		}

		return financialDTOs;

	}

	public VehicleInfoDTO mapToDTO(VehicleRegistration VehicleReg, VehicleObservations VehicleObvs
//			,AnprCamera Anpr
			) {
		VehicleInfoDTO dtoV = new VehicleInfoDTO();
		dtoV.setDriverLicenceID(VehicleReg.getDriverLicenceID());
		dtoV.setVehicleRegistrationNo(VehicleReg.getVehicleRegistrationNo());
		dtoV.setMake(VehicleReg.getMake());
		dtoV.setModel(VehicleReg.getModel());
		dtoV.setColour(VehicleReg.getColour());
		dtoV.setTimestamp(VehicleObvs.getTimestamp());
		AnprCamera anpr = VehicleObvs.getAnprCamera();
		dtoV.setAnprPointId(anpr.getAnprId());
		dtoV.setStreetName(anpr.getStreetName());
		dtoV.setLatitude(anpr.getLatitude());
		dtoV.setLongitude(anpr.getLongitude());

		return dtoV;
	}

	public MobileRecordsDTO mapToDTO(PeopleMobile PeopleMobile, MobileCallRecords MobileCall
//			,CellTower CellTower
			) {
		MobileRecordsDTO dtoM = new MobileRecordsDTO();
		dtoM.setPhoneNumber(PeopleMobile.getPhoneNumber());
		dtoM.setNetwork(PeopleMobile.getNetwork());
		dtoM.setTimestamp(MobileCall.getTimestamp());
		dtoM.setReceiverMSISDN(MobileCall.getReceiverMSISDN());
		CellTower tower = MobileCall.getCellTower();
		dtoM.setLatitude(tower.getLatitude());
		dtoM.setLongitude(tower.getLongitude());

		return dtoM;
	}
	
	public UsersDTO mapToDTO(Users users) {
		UsersDTO dtoU = new UsersDTO();
		dtoU.setUser(users.getUser());
		dtoU.setPasswrd(users.getPasswrd());
		
		return dtoU;
	}

//	@Override
//	public List<CitizenInfoDTO> sortAndFilterCitizen(Direction direction, String field, Citizen citizen) {
//		return this.repo.findAll(Example.of(citizen), Sort.by(direction, field)).stream().map(this::mapToDTO).collect(Collectors.toList());
//	}

	@Override
	public List<CitizenInfoDTO> getCitizenInfo(Citizen citizen) {
		List<CitizenInfoDTO> citizenDTO = new ArrayList<>();
//		List<PeopleBusinessAddress> businessAddress = this.repoP.findByPersonNameIgnoreCase(name);
		List<Citizen> citizens = this.repo.findAll(Example.of(citizen));
//		List<Passport> passport = this.repoPa.findByGivenNameIgnoreCase(name);
		for (int i = 0; i < citizens.size(); i++) {
			citizenDTO.add(this.mapToDTO(citizens.get(i)

//					, businessAddress.get(i), passport.get(i)
			));
		}

		return citizenDTO;

	}

	@Override
	public List<VehicleInfoDTO> getVehicleInfo(VehicleRegistration vehicleRegistration,
			VehicleObservations vehicleObservations, AnprCamera anprCamera) {
		List<VehicleInfoDTO> vehicleDTO = new ArrayList<>();
		List<VehicleRegistration> vehicles = this.repoV.findAll(Example.of(vehicleRegistration));
		for (VehicleRegistration registration : vehicles) {
			for (VehicleObservations observations : registration.getVehicleObservations()) {
					vehicleDTO.add(this.mapToDTO(registration, observations));
			}
		}


		return vehicleDTO;
	}

	@Override
	public List<MobileRecordsDTO> getMobileRecords(PeopleMobile peopleMobile, MobileCallRecords mobileCallRecords,
			CellTower cellTower) {
		List<MobileRecordsDTO> mobileDTO = new ArrayList<>();
		List<PeopleMobile> mobiles = this.repoM.findAll(Example.of(peopleMobile));
		for (PeopleMobile mobile : mobiles) {
			for (MobileCallRecords records : mobile.getMobileCallRecords()) {
					mobileDTO.add(this.mapToDTO(mobile, records));
			}
		}
		return mobileDTO;
	}
	
	@Override
	public List<UsersDTO> getUsers(Users users) {
		List<UsersDTO> userDTO = new ArrayList<>();
		List<Users> userList = this.repoU.findAll(Example.of(users));
			userDTO.add(this.mapToDTO(users));
		
		return userDTO;
	}

}
