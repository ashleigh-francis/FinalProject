package com.bae.project.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.BankCard;
import com.bae.project.data.PeopleBankAccount;

public interface BankCardRepo extends JpaRepository<BankCard, Integer> {
 

}
