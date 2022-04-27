 package com.nabil.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.nabil.gestiondestock.dto.ArticleDto;

public class ArticleValidator {
	
	
	public static List<String> validate(ArticleDto articleDto){
		
		List<String> errors = new ArrayList<>();
		
		if(articleDto ==null) {
			errors.add("Veuillez renseigner le code d'article");
			errors.add("Veuillez renseigner la designation de l'article");
			errors.add("Veuillez renseigner le prix unitaire HT  d'article");
			errors.add("Veuillez renseigner le taux TVA  de l'article");
			errors.add("Veuillez renseigner le prix unitaire TTC de  l'article");
			errors.add("Veuillez selectionner une categorie");
			return errors ;
		}
		
		
		
		
		
		if(!StringUtils.hasLength(articleDto.getCodeArticle())) {
			errors.add("Veuillez renseigner le code d'article");
			
		}
		if(!StringUtils.hasLength(articleDto.getDesignation())) {
			errors.add("Veuillez renseigner la designation de l'article");
			
		}
		if(articleDto.getPrixUnitaireHt()==null) {
			errors.add("Veuillez renseigner le prix unitaire HT  d'article");
			
		}
		if(articleDto.getTauxTva()==null) {
			errors.add("Veuillez renseigner le taux TVA  de l'article");
			
		}
		if(articleDto.getPrixUnitaireTtc()==null) {
			errors.add("Veuillez renseigner le prix unitaire TTC de  l'article");
			
		}
		if(articleDto.getCodeArticle()==null) {
			errors.add("Veuillez selectionner une categorie");
			
		}
		
		
		
		
		return errors ;
		
	}
 
}
