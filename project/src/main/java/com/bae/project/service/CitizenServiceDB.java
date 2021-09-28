package com.bae.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort.Direction;
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
import com.bae.project.data.repo.AnprCameraRepo;
import com.bae.project.data.repo.AtmRepo;
import com.bae.project.data.repo.AtmTransRepo;
import com.bae.project.data.repo.CitizenRepo;
import com.bae.project.data.repo.EposRepo;
import com.bae.project.data.repo.EposTransRepo;
import com.bae.project.data.repo.BankAccountRepo;
import com.bae.project.data.repo.BankCardRepo;
import com.bae.project.data.repo.CallRecordsRepo;
import com.bae.project.data.repo.CellTowerRepo;
import com.bae.project.data.repo.MobileRepo;
import com.bae.project.data.repo.PassportRepo;
import com.bae.project.data.repo.VehicleObservationRepo;
import com.bae.project.data.repo.VehicleRepo;
import com.bae.project.data.repo.peopleBusinessAddressRepo;
import com.bae.project.dto.CitizenInfoDTO;
import com.bae.project.dto.FinancialRecordsDTO;
import com.bae.project.dto.MobileRecordsDTO;
import com.bae.project.dto.VehicleInfoDTO;
import org.springframework.data.domain.Sort;



@Service
@Primary
public class CitizenServiceDB implements CitizenService{
	
	private CitizenRepo repo;
	private VehicleRepo repoV;
	private peopleBusinessAddressRepo repoP;
	private PassportRepo repoPa;
	private VehicleObservationRepo repoO;
	private AnprCameraRepo repoA;
	private BankAccountRepo repoBA;
	private BankCardRepo repoBC;
	private EposTransRepo repoET;
	private EposRepo repoE;
	private AtmTransRepo repoAT;
	private AtmRepo repoAP;
	private MobileRepo repoM;
	private CallRecordsRepo repoCR;
	private CellTowerRepo repoCT;

	
	
	public CitizenServiceDB(CitizenRepo repo, VehicleRepo repoV, peopleBusinessAddressRepo repoP, PassportRepo repoPa,
			VehicleObservationRepo repoO, AnprCameraRepo repoA, BankAccountRepo repoBA, BankCardRepo repoBC,
			EposTransRepo repoET, EposRepo repoE, AtmTransRepo repoAT, AtmRepo repoAP, MobileRepo repoM,
			CallRecordsRepo repoCR, CellTowerRepo repoCT) {
		super();
		this.repo = repo;
		this.repoV = repoV;
		this.repoP = repoP;
		this.repoPa = repoPa;
		this.repoO = repoO;
		this.repoA = repoA;
		this.repoBA = repoBA;
		this.repoBC = repoBC;
		this.repoET = repoET;
		this.repoE = repoE;
		this.repoAT = repoAT;
		this.repoAP = repoAP;
		this.repoM = repoM;
		this.repoCR = repoCR;
		this.repoCT = repoCT;
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
	
	public FinancialRecordsDTO mapToDTO(PeopleBankAccount Bank, BankCard Bankcard,
			EposTransactions EposTrans, Epos Epos, AtmTransaction AtmTrans,
			AtmPoint Atm) {
		FinancialRecordsDTO dtoF = new FinancialRecordsDTO();
		dtoF.setAccountNumber(Bank.getAccountNumber());
		dtoF.setBank(Bank.getBank());
		dtoF.setCardNumber(Bankcard.getCardNumber());
		dtoF.setSortCode(Bankcard.getSortCode());
		dtoF.setTimestamp(EposTrans.getTimestamp());
		dtoF.setPayeeAccount(EposTrans.getPayeeAccount());
		dtoF.setAmount(EposTrans.getAmount());
		dtoF.setVendor(Epos.getVendor());
		dtoF.setStreetName(Epos.getStreetName());
		dtoF.setPostcode(Epos.getPostcode());
		dtoF.setLatitude(Epos.getLatitude());
		dtoF.setLongitude(Epos.getLongitude());
		dtoF.setAtmTimestamp(AtmTrans.getAtmTimestamp());
		dtoF.setType(AtmTrans.getType());
		dtoF.setAtmAmount(AtmTrans.getAtmAmount());
		dtoF.setOperator(Atm.getOperator());
		dtoF.setAtmStreetName(Atm.getAtmStreetName());
		dtoF.setAtmPostcode(Atm.getAtmPostcode());
		dtoF.setAtmLatitude(Atm.getAtmLatitude());
		dtoF.setAtmLongitude(Atm.getAtmLongitude());
		
		return dtoF;
	}
	
	public VehicleInfoDTO mapToDTO(VehicleRegistration VehicleReg
			, 
			VehicleObservations VehicleObvs
			, AnprCamera Anpr
			)
			{
		VehicleInfoDTO dtoV = new VehicleInfoDTO();
		dtoV.setDriverLicenceID(VehicleReg.getDriverLicenceID());
		dtoV.setVehicleRegistrationNo(VehicleReg.getVehicleRegistrationNo());
		dtoV.setMake(VehicleReg.getMake());
		dtoV.setModel(VehicleReg.getModel());
		dtoV.setColour(VehicleReg.getColour());
		dtoV.setTimestamp(VehicleObvs.getTimestamp());
		dtoV.setAnprPointId(Anpr.getAnprId());
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
		dtoM.setReceiverMSISDN(MobileCall.getReceiverMSISDN());
		dtoM.setLatitude(CellTower.getLatitude());
		dtoM.setLongitude(CellTower.getLongitude());
		
		return dtoM;
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
		for (int i =0;i<citizens.size();i++) {
			citizenDTO.add(this.mapToDTO(citizens.get(i)
					
//					, businessAddress.get(i), passport.get(i)
					));
		}
		
		return citizenDTO;
		
	}


	@Override
	public List<VehicleInfoDTO> getVehicleInfo(VehicleRegistration vehicleRegistration
			, VehicleObservations vehicleObservations
			, AnprCamera anprCamera
			) {
		List<VehicleInfoDTO> vehicleDTO = new ArrayList<>();
		List<VehicleRegistration> vehicles = this.repoV.findAll(Example.of(vehicleRegistration));
		List<VehicleObservations> observations = this.repoO.findAll(Example.of(vehicleObservations));
		List<AnprCamera> cameras = this.repoA.findAll(Example.of(anprCamera));
		for (int i =0;i<vehicles.size();i++) {
			vehicleDTO.add(this.mapToDTO(vehicles.get(i),observations.get(i),cameras.get(i)
					));
		}
		
		return vehicleDTO;
	}

	@Override
	public List<MobileRecordsDTO> getMobileRecords(PeopleMobile peopleMobile
			,MobileCallRecords mobileCallRecords, CellTower cellTower
			) {
		List<MobileRecordsDTO> mobileDTO = new ArrayList<>();
		List<PeopleMobile> mobiles = this.repoM.findAll(Example.of(peopleMobile));
		List<MobileCallRecords> records = this.repoCR.findAll(Example.of(mobileCallRecords));
		List<CellTower> towers = this.repoCT.findAll(Example.of(cellTower));
		for (int i =0;i<mobiles.size();i++) {
			for (int k =0;k<records.size();k++) {
			mobileDTO.add(this.mapToDTO(mobiles.get(i),records.get(k),towers.get(i)
					));
			}
		}
		
		return mobileDTO;
	}
	@Override
	public List<FinancialRecordsDTO> getFinancialRecords(PeopleBankAccount peopleBankAccount, 
			BankCard bankCard, EposTransactions eposTransactions, Epos epos, AtmTransaction atmTransaction,
			AtmPoint atmPoint
			) {
		List<FinancialRecordsDTO> financialDTO = new ArrayList<>();
		List<PeopleBankAccount> accounts = this.repoBA.findAll(Example.of(peopleBankAccount));
		List<BankCard> cards = this.repoBC.findAll(Example.of(bankCard));
		List<EposTransactions> eposTrans = this.repoET.findAll(Example.of(eposTransactions));
		List<Epos> eposList = this.repoE.findAll(Example.of(epos));
		
		
		List<AtmTransaction> atmTrans = this.repoAT.findAll(Example.of(atmTransaction));
		List<AtmPoint> atms = this.repoAP.findAll(Example.of(atmPoint));
		for (int i =0;i<accounts.size();i++) {
			financialDTO.add(this.mapToDTO(accounts.get(i),cards.get(i),eposTrans.get(i),eposList.get(i),atmTrans.get(i),atms.get(i)));
				
		}
		
		return financialDTO;

	}

}
