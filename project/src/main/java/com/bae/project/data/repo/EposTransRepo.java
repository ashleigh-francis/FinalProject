package com.bae.project.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.EposTransactions;
import com.bae.project.data.PeopleBankAccount;

public interface EposTransRepo extends JpaRepository<EposTransactions, Integer> {


}
