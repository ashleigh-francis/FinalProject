package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.PeopleBankAccount;
import com.bae.project.dto.FinancialRecordsDTO;


public interface BankAccountRepo extends JpaRepository<PeopleBankAccount, Integer> {

}