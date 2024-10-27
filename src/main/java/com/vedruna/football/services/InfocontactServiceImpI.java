package com.vedruna.football.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.InfocontactDTO;
import com.vedruna.football.persistance.models.Student;
import com.vedruna.football.persistance.repository.InfocontactRepository;
import com.vedruna.football.persistance.repository.StudentRepository;

@Service
public class InfocontactServiceImpI implements InfocontactServiceI{
	
	@Autowired
	InfocontactRepository infocontactRepository;
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public InfocontactDTO getInfocontactOfStudent(int id) {
		
		Student student = studentRepository.findByidalumno(id);
		
		InfocontactDTO infoContact = new InfocontactDTO(student.getInfocontact());
		
		return infoContact;
	}
	
	

}
