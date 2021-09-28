package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.VehicleObservations;
import com.bae.project.data.VehicleRegistration;
import com.bae.project.dto.VehicleInfoDTO;

public interface VehicleObservationRepo extends JpaRepository<VehicleObservations, Integer> {

	}
