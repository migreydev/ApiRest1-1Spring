package com.vedruna.football.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.dto.StudentDTO;
import com.vedruna.football.dto.StudentWithOutInfo;
import com.vedruna.football.persistance.models.Infocontact;
import com.vedruna.football.persistance.models.Student;
import com.vedruna.football.persistance.repository.InfocontactRepository;
import com.vedruna.football.persistance.repository.StudentRepository;

@Service
public class StudentServiceImpI implements StudentServiceI{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	InfocontactRepository infocontactRepository;

	@Override
	public List<StudentWithOutInfo> getAllStudents() {
		
		List<Student> students = studentRepository.findAll();
		List<StudentWithOutInfo> studentsDTO = new ArrayList<>();
		
		for(Student newStudent : students) {
			StudentWithOutInfo studentDTO = new StudentWithOutInfo();
			 
		     studentDTO.setIdalumno(newStudent.getIdalumno());
		     studentDTO.setName(newStudent.getName());
		     studentDTO.setSurname(newStudent.getSurname());
		     
		     
			studentsDTO.add(studentDTO);
		}
		
		return studentsDTO;
	}

	@Override
	public void addStudent(StudentDTO student) {
		Student newStudent = new Student();
		
		newStudent.setIdalumno(student.getIdalumno());
		newStudent.setName(student.getName());
		newStudent.setSurname(student.getSurname());
		
		studentRepository.save(newStudent);
	
		Infocontact newInfocontact = new Infocontact();
		
		newInfocontact.setIdinfocontacto(student.getInfocontact().getIdinfocontacto());
		newInfocontact.setDirection(student.getInfocontact().getDirection());
        newInfocontact.setNumberPhone(student.getInfocontact().getNumberPhone());
        newInfocontact.setStudent(newStudent);
        
        newStudent.setInfocontact(newInfocontact);
        infocontactRepository.save(newInfocontact);    
        	
	}

	@Override
	public StudentWithOutInfo getStudentByName(String name) {
		StudentWithOutInfo student = new StudentWithOutInfo(studentRepository.findByName(name));
		
		return student;
	}

}
