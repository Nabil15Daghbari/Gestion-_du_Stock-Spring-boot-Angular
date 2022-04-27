package com.nabil.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.nabil.gestiondestock.models.Fournisseur;

public class FournisseurValidator {
	
public static List<String> validate(Fournisseur Dto) {
		
		List<String> errors = new ArrayList<>();
		
		if(Dto ==null) {
			errors.add("Veuillez renseigner le nom du fournisseur");
			errors.add("Veuillez renseigner le prenom du fournisseur");
			errors.add("Veuillez renseigner le numéro de telephone du fournisseur");
			errors.add("Veuillez renseigner l'email du fournisseur");
			return errors ;
		}
		
		if(!StringUtils.hasLength(Dto.getNom())) {
			errors.add("Veuillez renseigner le nom du fournisseur");
		}
		
		if(!StringUtils.hasLength(Dto.getPrenom())) {
			errors.add("Veuillez renseigner le prenom du fournisseur");
		}
		
		if(!StringUtils.hasLength(Dto.getNumTel())) {
			errors.add("Veuillez renseigner le numéro de telephone du fournisseur");
		}
		
		if(!StringUtils.hasLength(Dto.getEmail())) {
			errors.add("Veuillez renseigner l'email du fournisseur");
		}
		
		
		
		
		return errors ;
		
	}


}
