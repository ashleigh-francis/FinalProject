package com.bae.project.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.CellTower;
import com.bae.project.data.PeopleMobile;

public interface CellTowerRepo extends JpaRepository<CellTower, Integer> {

}
