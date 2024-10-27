package com.vedruna.football.services;

import java.util.List;

import com.vedruna.football.dto.StudentDTO;
import com.vedruna.football.dto.StudentWithOutInfoDTO;
import com.vedruna.football.persistance.models.Student;

public interface StudentServiceI {
	
	List<StudentWithOutInfoDTO> getAllStudents();
	StudentWithOutInfoDTO getStudentByName(String name);
	void addStudent(StudentDTO student);
	void deleteStudent(Student student);
	Student getNameStudent(String name);


}
