package com.bae.project.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.Epos;
import com.bae.project.data.PeopleBankAccount;

public interface EposRepo extends JpaRepository<Epos, Integer> {
 
}
