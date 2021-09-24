package com.bae.project.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.bae.project.service.CitizenService;

@RestController
@CrossOrigin
public class CitizenController {

	private CitizenService service;
	
	public CitizenController(CitizenService service) {
		super();
		this.service = service;
	}
	
	
}
