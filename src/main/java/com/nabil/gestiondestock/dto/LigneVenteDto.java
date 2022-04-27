package com.nabil.gestiondestock.dto;

import java.math.BigDecimal;

import com.nabil.gestiondestock.models.LigneVente;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class LigneVenteDto {

	private Long id ;
	
	private VentesDto vente ;
	
	
	private BigDecimal quantite ;
	
	
	private BigDecimal prixUnitaire ;
	
	
	public static LigneVenteDto fromEntity(LigneVente lv) {
		if(lv==null) {
			return null;

		}
					
		return 	LigneVenteDto.builder()
				.id(lv.getId())
				.quantite(lv.getQuantite())
				.prixUnitaire(lv.getPrixUnitaire())
				.vente(VentesDto.fromEntity(lv.getVente()))
				.build();
		
	}
	
	public static LigneVente toEntity(LigneVenteDto lvd) {
		if(lvd==null) {
			return null;

		           }
	 				
		LigneVente lv =new LigneVente();
		lv.setId(lvd.getId());
		lv.setQuantite(lvd.getQuantite());
		lv.setPrixUnitaire(lvd.getPrixUnitaire());
		lv.setVente(VentesDto.toEntity(lvd.getVente()));
		
		
		return lv ;
		
		
		
		
	}
}
