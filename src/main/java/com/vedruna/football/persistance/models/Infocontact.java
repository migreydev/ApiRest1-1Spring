package com.vedruna.football.persistance.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="infocontacto")
public class Infocontact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idinfocontacto")
	private int idinfocontacto;
	
	@Column(name="direccion")
	private String direction;
	
	@Column(name="telefono")
	private int numberPhone;
	
	


}
