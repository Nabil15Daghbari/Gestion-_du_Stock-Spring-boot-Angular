package com.nabil.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;
import com.nabil.gestiondestock.dto.CommandeFournisseurDto;

public class CommandeFournisseurValitator {
	

		public List<String> commandeFournisseurValidator(CommandeFournisseurDto v) {
			
			List<String> errors = new ArrayList<>();
			
			if(v == null) {
				errors.add("Veuillez renseigner le code du commande fournisseur");
				errors.add("Veuillez renseigner la date du Commande fournisseur");
				
				return errors ;
				
				
			}
			
			if(!StringUtils.hasLength(v.getCode())) {
				
				errors.add("Veuillez renseigner le code du commande fournisseur");
				
			}
			
			if(v.getDateCommande() == null) {
				
				errors.add("Veuillez renseigner la date du Commande fournisseur");
			}
			
			
			return errors ;
		}
}
