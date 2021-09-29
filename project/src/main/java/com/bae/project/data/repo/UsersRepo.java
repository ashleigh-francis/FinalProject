package com.bae.project.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.project.data.Users;

public interface UsersRepo extends JpaRepository<Users, Integer> {
	
	List<Users> findByUserNameIgnoreCase(String name);
	
}
