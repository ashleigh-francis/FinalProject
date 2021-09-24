package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bae.project.data.Citizen;
import com.bae.project.dto.CitizenDTO;
import com.bae.project.dto.CitizenInfoDTO;
import com.bae.project.dto.FinancialRecordsDTO;
import com.bae.project.dto.MobileRecordsDTO;
import com.bae.project.dto.VehicleInfoDTO;

public interface CitizenRepo extends JpaRepository<Citizen, Integer>{

	List<CitizenInfoDTO> findByCitizenNameIgnoreCase(String name);
	List<FinancialRecordsDTO> findByFinancialNameIgnoreCase(String name);
	List<VehicleInfoDTO> findByVehicalNameIgnoreCase(String name);
	List<MobileRecordsDTO> findByMobileNameIgnoreCase(String name);
}
