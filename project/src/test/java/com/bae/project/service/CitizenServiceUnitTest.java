package com.bae.project.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Example;
import org.springframework.test.context.ActiveProfiles;

import com.bae.project.data.Citizen;
import com.bae.project.data.repo.BankAccountRepo;
import com.bae.project.data.repo.CitizenRepo;
import com.bae.project.data.repo.MobileRepo;
import com.bae.project.data.repo.UsersRepo;
import com.bae.project.data.repo.VehicleRepo;
import com.bae.project.dto.CitizenInfoDTO;

@SpringBootTest
@ActiveProfiles("test")
public class CitizenServiceUnitTest {
	
	@Autowired
	private CitizenServiceDB service;
	
	@MockBean
	private CitizenRepo repo;
	private VehicleRepo repoV;
	private BankAccountRepo repoBA;
	private MobileRepo repoM;
	private UsersRepo repoU;
	
	@Test
	void testGetCitizenInfo() {
		long citizenID = 1234564917;
		List<Citizen> testList = new ArrayList<>();
		Citizen testCitizen = new Citizen(citizenID, "Sam", "Thornton", "Home", "17/07/1983", "Salisbury", "Male");

		testList.add(testCitizen);
		
		String search = "Sam";
		
		Mockito.when(this.repo.findByForenamesIgnoreCase(search)).thenReturn(testList);
		
		assertThat(this.service.getCitizenInfo(testCitizen)).isEqualTo(testList);
		
		Mockito.verify(this.repo, Mockito.times(1)).findAll();
		
		
	}
	
	@Test
	void testGetVehicleInfo() {
		
	}

}
