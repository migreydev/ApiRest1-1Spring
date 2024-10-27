package com.vedruna.football.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.football.dto.StudentDTO;
import com.vedruna.football.dto.StudentWithOutInfoDTO;
import com.vedruna.football.services.StudentServiceImpI;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	StudentServiceImpI studentService;
	
	@GetMapping()
	public List<StudentWithOutInfoDTO> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{name}")
	public StudentWithOutInfoDTO getStudentByName(@PathVariable String name) {
		return studentService.getStudentByName(name);
		
	}
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody StudentDTO student) {
		studentService.addStudent(student);
	}
	
	

}
