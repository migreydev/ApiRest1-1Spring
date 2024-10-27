package com.vedruna.football.dto;

import com.vedruna.football.persistance.models.Infocontact;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class InfocontactDTO {
	
	private int idinfocontacto;
    private String direction;
    private int numberPhone;
    
    public InfocontactDTO(Infocontact infocontact) {
    	this.idinfocontacto = infocontact.getIdinfocontacto();
        this.direction = infocontact.getDirection();
        this.numberPhone = infocontact.getNumberPhone();
    }

}
