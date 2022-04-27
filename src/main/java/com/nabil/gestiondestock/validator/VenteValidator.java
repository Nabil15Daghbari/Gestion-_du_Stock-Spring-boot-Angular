package com.nabil.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.nabil.gestiondestock.dto.VentesDto;

public class VenteValidator {

	
public List<String> Validator(VentesDto v) {
		
		List<String> errors = new ArrayList<>();
		
		if(v == null) {
			
			errors.add("Veuillez renseigner le code du vente ");
			errors.add("Veuillez renseigner la date du vente ");
			errors.add("Veuillez renseigner votre commentaire");
			return errors ;
			
			
		}
		
		if(v.getDateVente()==null) {
			
			errors.add("Veuillez renseigner la date du vente ");
			
		}
		
			if(!StringUtils.hasLength(v.getCode())) {
						
						errors.add("Veuillez renseigner le code du vente ");
						
					}
			
			if(!StringUtils.hasLength(v.getCommentaire())) {
				
				errors.add("Veuillez renseigner votre commentaire");
				
			}
		


		
		
		return errors ;
	}

}
