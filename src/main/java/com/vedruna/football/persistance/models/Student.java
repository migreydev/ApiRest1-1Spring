package com.vedruna.football.persistance.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="alumnos")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idalumno")
	private int idalumno;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="apellidos")
	private String surname;
	
	@OneToOne(mappedBy = "student")
    private Infocontact infocontact;

}
