package com.bae.project.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.AnprCamera;
import com.bae.project.data.VehicleObservations;

public interface AnprCameraRepo extends JpaRepository<AnprCamera, Integer>  {

}
