package com.vedruna.football.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.football.dto.InfocontactDTO;
import com.vedruna.football.services.InfocontactServiceImpI;

@RestController
@RequestMapping("/api/v1/infocontact")
public class InfocontactController {
	
	@Autowired
	InfocontactServiceImpI infocontactService;
	
	@GetMapping("/{id}")
	public InfocontactDTO getInfocontactOfStudent(@PathVariable int id) {
		
		return infocontactService.getInfocontactOfStudent(id);
	}

}
