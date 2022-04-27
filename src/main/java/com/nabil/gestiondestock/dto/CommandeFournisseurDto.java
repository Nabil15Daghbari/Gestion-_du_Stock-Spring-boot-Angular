package com.nabil.gestiondestock.dto;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.nabil.gestiondestock.models.CommandeFournisseur;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CommandeFournisseurDto {
	private Long id ;

	private String code  ;
	
	
     private Instant dateCommande ;
   
	private FournisseurDto fournisseur ;
     
	private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
	
	
	public static CommandeFournisseurDto fromEntity(CommandeFournisseur cf ) {
	    if(cf==null)
	    	return null ;
	    
	    return CommandeFournisseurDto.builder()
	    		.id(cf.getId())
	    		.code(cf.getCode())
	    		.dateCommande(cf.getDateCommande())
	    		.fournisseur(FournisseurDto.fromEntity(cf.getFournisseur()))
	    		.ligneCommandeFournisseurs(
	    				
	    				cf.getLigneCommandeFournisseurs() !=null ?
	    						cf.getLigneCommandeFournisseurs().stream()
	 							.map(LigneCommandeFournisseurDto :: fromEntity)
	 							.collect(Collectors.toList()) : null
	    				
	    				)
	    		
	    		.build();
		
	}
	
	
	public static CommandeFournisseur toEntity(CommandeFournisseurDto cfd) {
		if(cfd==null)
			return null ;
		
		CommandeFournisseur cf = new CommandeFournisseur() ;
		cf.setId(cfd.getId());
		cf.setCode(cfd.getCode());
		cf.setDateCommande(cfd.getDateCommande());
		cf.setFournisseur(FournisseurDto.toEntity(cfd.getFournisseur()));
		
		return cf ;
	}
	
	
}
