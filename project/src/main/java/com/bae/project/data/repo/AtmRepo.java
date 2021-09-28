package com.bae.project.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.AtmPoint;
import com.bae.project.data.AtmTransaction;

public interface AtmRepo extends JpaRepository<AtmPoint, Integer> {

}
