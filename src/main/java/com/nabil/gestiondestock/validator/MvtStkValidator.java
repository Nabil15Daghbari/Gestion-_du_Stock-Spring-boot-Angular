package com.nabil.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;


import com.nabil.gestiondestock.dto.MvtStkDto;

public class MvtStkValidator {
	
public List<String> Validator(MvtStkDto v) {
		
		List<String> errors = new ArrayList<>();
		
		if(v == null) {
			errors.add("Veuillez renseigner la date du mouvement");
			errors.add("Veuillez renseigner quantitie ");
			errors.add("Veuillez renseigner le type de mouvement ");
			
			return errors ;
			
			
		}
		
		if(v.getDateMvt()==null) {
			
			errors.add("Veuillez renseigner la date du mouvement");
			
		}
		
		if(v.getQuantitie() == null) {
			
			errors.add("Veuillez renseigner quantitie ");
		}
		
		if(v.getTypeMvt() == null) {
				
				errors.add("Veuillez renseigner le type de mouvement ");
			}
		
		
		return errors ;
	}

}
