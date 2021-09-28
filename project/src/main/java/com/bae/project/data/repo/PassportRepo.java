package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.Passport;
import com.bae.project.data.PeopleBusinessAddress;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

	List<Passport> findByGivenNameIgnoreCase(String name);
}
