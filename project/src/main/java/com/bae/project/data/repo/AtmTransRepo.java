package com.bae.project.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.AtmTransaction;
import com.bae.project.data.PeopleBankAccount;

public interface AtmTransRepo extends JpaRepository<AtmTransaction, Integer> {
 

}
