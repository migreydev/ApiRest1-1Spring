package com.vedruna.football.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.football.persistance.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}