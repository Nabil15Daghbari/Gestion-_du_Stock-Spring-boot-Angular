package com.nabil.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.nabil.gestiondestock.dto.CommandeClientDto;

public class CommandeClientValidator {
	
	
	public List<String> commandeClientValidator(CommandeClientDto v) {
		
		List<String> errors = new ArrayList<>();
		
		if(v == null) {
			errors.add("Veuillez renseigner le code du commande client");
			errors.add("Veuillez renseigner la date du Commande client");
			
			return errors ;
			
			
		}
		
		if(!StringUtils.hasLength(v.getCode())) {
			
			errors.add("Veuillez renseigner le code du commande client");
			
		}
		
		if(v.getDateCommande() == null) {
			
			errors.add("Veuillez renseigner la date du Commande client");
		}
		
		
		return errors ;
	}

}
