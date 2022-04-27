package com.nabil.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;
import com.nabil.gestiondestock.dto.LigneCommandeClientDto;



public class LigneCommandeClientValidator {
	
public List<String> Validator(LigneCommandeClientDto v) {
		
		List<String> errors = new ArrayList<>();
		
		if(v == null) {
			errors.add("Veuillez renseigner le prix unitaire d'article");
			errors.add("Veuillez renseigner quantitie ");
			
			return errors ;
			
			
		}
		
		if(v.getPrixUnitaire()==null) {
			
			errors.add("Veuillez renseigner le prix unitaire d'article");
			
		}
		
		if(v.getQuantite() == null) {
			
			errors.add("Veuillez renseigner quantitie ");
		}
		
		
		return errors ;
	}


}
