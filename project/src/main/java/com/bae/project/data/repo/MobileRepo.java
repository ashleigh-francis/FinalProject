package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bae.project.data.PeopleMobile;
import com.bae.project.dto.MobileRecordsDTO;

public interface MobileRepo extends JpaRepository<PeopleMobile, Integer> {


}
