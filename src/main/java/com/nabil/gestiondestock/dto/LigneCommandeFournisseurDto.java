package com.nabil.gestiondestock.dto;

import java.math.BigDecimal;

import com.nabil.gestiondestock.models.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LigneCommandeFournisseurDto {


	private Long id ;
	
	private ArticleDto article ;
	
	
	
	private CommandeFournisseurDto commandefournisseur ;
	
	
	private BigDecimal quantite ;
	
	
	private BigDecimal prixUnitaire ;
	
	
	
	public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur lf) {
		if(lf==null ) {
			return null ;
		}
			
	    return LigneCommandeFournisseurDto.builder()
	    		.id(lf.getId())
	    		.prixUnitaire(lf.getPrixUnitaire())
	    		.quantite(lf.getQuantite())
	    		.article(ArticleDto.fromEntity(lf.getArticle()))
	    		.commandefournisseur(CommandeFournisseurDto.fromEntity(lf.getCommandefournisseur()))
	    		 .build();
	    
		}
	
     public  static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto lcfd) {
    	 if(lcfd == null )
    		 return null ;
    	 
    	 
    	 LigneCommandeFournisseur lcf = new LigneCommandeFournisseur();
    	 lcf.setId(lcfd.getId());
    	 lcf.setPrixUnitaire(lcfd.getPrixUnitaire());
    	 lcf.setQuantite(lcfd.getQuantite());
    	 lcf.setArticle(ArticleDto.toEntity(lcfd.getArticle()));
    	 lcf.setCommandefournisseur(CommandeFournisseurDto.toEntity(lcfd.getCommandefournisseur()));
    	 
    	 return lcf  ; 
    	 }
     
}
