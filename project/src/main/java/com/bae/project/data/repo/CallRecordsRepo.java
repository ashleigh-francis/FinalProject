package com.bae.project.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.MobileCallRecords;
import com.bae.project.data.PeopleMobile;

public interface CallRecordsRepo extends JpaRepository<MobileCallRecords, Integer> {

}
