package com.vedruna.football.services;

import java.util.List;

import com.vedruna.football.dto.StudentDTO;
import com.vedruna.football.dto.StudentWithOutInfoDTO;

public interface StudentServiceI {
	
	List<StudentWithOutInfoDTO> getAllStudents();
	StudentWithOutInfoDTO getStudentByName(String name);
	void addStudent(StudentDTO student);


}
