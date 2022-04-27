package com.nabil.gestiondestock.dto;

import java.math.BigDecimal;

import com.nabil.gestiondestock.models.LigneCommandeClient;

import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class LigneCommandeClientDto {

	private Long id ;
	
	private ArticleDto article ;
	
	
	private CommandeClientDto commandeClient ;

	private BigDecimal quantite ;
	

	private BigDecimal prixUnitaire ;
	
	
	
	public static LigneCommandeClientDto fromEntity(LigneCommandeClient lc) {
		if(lc==null ) {
			return null ;
		}
			
	    return LigneCommandeClientDto.builder()
	    		.id(lc.getId())
	    		.quantite(lc.getQuantite())
	    		.prixUnitaire(lc.getPrixUnitaire())
	    		.article(ArticleDto.fromEntity(lc.getArticle()))
	    		.commandeClient(CommandeClientDto.fromEntity(lc.getCommandeClient()))
	    		.build();
	    
		}
	
     public  static  LigneCommandeClient toEntity(LigneCommandeClientDto lcd) {
    	 if(lcd == null )
    		 return null ;
    	 
    	 
    	 LigneCommandeClient lc = new LigneCommandeClient();
    	 lc.setId(lcd.getId());
    	 lc.setPrixUnitaire(lcd.getPrixUnitaire());
    	 lc.setQuantite(lcd.getQuantite());
    	 lc.setArticle(ArticleDto.toEntity(lcd.getArticle()));
    	 lc.setCommandeClient(CommandeClientDto.toEntity(lcd.getCommandeClient()));
    	 
    	 return lc  ; 
    	 }
     
	
	

}
