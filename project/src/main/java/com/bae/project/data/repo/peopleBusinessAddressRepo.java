package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.Citizen;
import com.bae.project.data.PeopleBusinessAddress;

public interface peopleBusinessAddressRepo extends JpaRepository<PeopleBusinessAddress, Integer>{

	List<PeopleBusinessAddress> findByPersonNameIgnoreCase(String name);
}
