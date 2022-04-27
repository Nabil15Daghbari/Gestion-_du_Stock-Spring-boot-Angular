package com.nabil.gestiondestock.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.nabil.gestiondestock.models.Entreprise;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class EntrepriseDto {

	
	private Long id ;
	
	private String nom ; 
	
	
	private String description ;
	
	
	private AddresseDto adresse ;
	
	
	private String codeFiscal;
	
	private String photo ;
	

	private String email ;
	

	private String numTel ;
	
	
	private String steWeb;
	
	
    private List<UtilisateurDto> utilisateurs;
    
    
    
    public static EntrepriseDto fromEntity(Entreprise ent) {
    	if(ent==null)
    		return null ;
    	
    	return EntrepriseDto.builder()
    			.id(ent.getId())
    			.nom(ent.getNom())
    			.description(ent.getDescription())
    			.codeFiscal(ent.getCodeFiscal())
    			.photo(ent.getPhoto())
    			.email(ent.getEmail())
    			.numTel(ent.getNumTel())
    			.steWeb(ent.getSteWeb())
    			.adresse(AddresseDto.fromEntity(ent.getAdresse()))
    			.utilisateurs(
    					ent.getUtilisateurs() !=null ?
    							ent.getUtilisateurs().stream()
 	 							.map(UtilisateurDto :: fromEntity)
 	 							.collect(Collectors.toList()) : null
 	 						)
 	 				
    			.build();
    	
    }
    
    public static Entreprise toEntity(EntrepriseDto entd) {
    	if(entd== null)
    		return null ;
    	
    	Entreprise ent = new  Entreprise() ;
    	ent.setId(entd.getId());
    	ent.setNom(entd.getNom());
    	ent.setDescription(entd.getDescription());
    	ent.setCodeFiscal(entd.getCodeFiscal());
    	ent.setPhoto(entd.getPhoto());
    	ent.setEmail(entd.getEmail());
    	ent.setNom(entd.getNumTel());
    	ent.setSteWeb(entd.getSteWeb());
    	ent.setAdresse(AddresseDto.toEntity(entd.getAdresse()));
    	
    	return ent ;
    	
    }
    
}
