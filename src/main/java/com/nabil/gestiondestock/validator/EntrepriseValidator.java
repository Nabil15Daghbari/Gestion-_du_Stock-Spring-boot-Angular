package com.nabil.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;
import com.nabil.gestiondestock.dto.EntrepriseDto;

public class EntrepriseValidator {
	
	public static List<String> Validate(EntrepriseDto v){
		
		List<String> errors = new ArrayList<>();
		
		if(v==null) {
			errors.add("Veuillez renseigner le nom d'utilisateur");
			errors.add("Veuillez renseigner le code fiscal d l'entreprise");
			errors.add("Veuillez renseigner le numéro du telephone d l'entreprise");
			errors.add("Veuillez renseigner le site web de l'entreprise ");
			errors.add("Veuillez renseigner l'email  de l'entreprise");
			errors.add("Veuillez renseigner l'adresse de l'entreprise");
	
			return errors ;
		}
		
		
		if(!StringUtils.hasLength(v.getNom())) {
			errors.add("Veuillez renseigner le nom d'utilisateur");
		}
		
		if(!StringUtils.hasLength(v.getCodeFiscal())) {
			errors.add("Veuillez renseigner le code fiscal d l'entreprise");
		}
		
		if(!StringUtils.hasLength(v.getNumTel())) {
			errors.add("Veuillez renseigner le numéro du telephone d l'entreprise");
		}
		
		if(!StringUtils.hasLength(v.getSteWeb())) {
			errors.add("Veuillez renseigner le site web de l'entreprise ");
		}
		
		if(!StringUtils.hasLength(v.getEmail())) {
			errors.add("Veuillez renseigner l'email  de l'entreprise");
		}
		
		
		
		
		if(v.getAdresse() == null) {
			errors.add("Veuillez renseigner l'adresse de l'entreprise");
		}else {
			if(!StringUtils.hasLength(v.getAdresse().getAdresse1())) {
				errors.add("Le champs Adresse 1' est obligatoire");
			}
			if(!StringUtils.hasLength(v.getAdresse().getVille())) {
				errors.add("Le champs 'Ville' est obligatoire");
			}
			if(!StringUtils.hasLength(v.getAdresse().getCodePostale())) {
				errors.add("Le champs 'Code postale' est obligatoire");
			}
			if(!StringUtils.hasLength(v.getAdresse().getPays())) {
				errors.add("Le champs 'Pays' est obligatoire");
			}
		}
		
		
		
		return errors ;
			
		}

}
