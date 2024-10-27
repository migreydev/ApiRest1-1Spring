package com.vedruna.football.services;

import java.util.List;

import com.vedruna.football.dto.StudentDTO;
import com.vedruna.football.dto.StudentWithOutInfo;

public interface StudentServiceI {
	
	List<StudentWithOutInfo> getAllStudents();
	StudentWithOutInfo getStudentByName(String name);
	void addStudent(StudentDTO student);


}
