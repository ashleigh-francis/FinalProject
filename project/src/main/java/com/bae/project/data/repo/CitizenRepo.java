package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bae.project.data.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer>{

	List<Citizen> findByNameIgnoreCase(String name);
}
