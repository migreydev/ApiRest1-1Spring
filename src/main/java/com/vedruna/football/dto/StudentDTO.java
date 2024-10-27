package com.vedruna.football.dto;


import com.vedruna.football.persistance.models.Student;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class StudentDTO {
	
	private int idalumno;
	private String name;
	private String surname;
	private InfocontactDTO infocontact;
	
	public StudentDTO(Student student) {
		this.idalumno = student.getIdalumno();
		this.name = student.getName();
		this.surname = student.getSurname();
		this.infocontact = new InfocontactDTO(student.getInfocontact());
	}

	

}
