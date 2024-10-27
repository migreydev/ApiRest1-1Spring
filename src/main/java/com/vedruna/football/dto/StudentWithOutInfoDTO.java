package com.vedruna.football.dto;

import com.vedruna.football.persistance.models.Student;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class StudentWithOutInfoDTO {

	private int idalumno;
	private String name;
	private String surname;
	
	public StudentWithOutInfoDTO(Student student) {
		this.idalumno = student.getIdalumno();
		this.name=student.getName();
		this.surname= student.getSurname();
	}
}
