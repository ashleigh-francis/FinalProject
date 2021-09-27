package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.PeopleBankAccount;
import com.bae.project.dto.FinancialRecordsDTO;


public interface FinancialRepo extends JpaRepository<PeopleBankAccount, Integer> {

	List<FinancialRecordsDTO> findByForenamesIgnoreCase(String name);
}