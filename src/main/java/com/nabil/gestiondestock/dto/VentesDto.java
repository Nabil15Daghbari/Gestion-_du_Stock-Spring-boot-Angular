
package com.nabil.gestiondestock.dto;

import java.time.Instant;

import com.nabil.gestiondestock.models.Ventes;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class VentesDto {
	
	private Long id ;

	private String code ;
	
	
	private Instant dateVente ;
	
    private String commentaire ; 

    
    public static  VentesDto fromEntity(Ventes v ) {
    	if(v==null) {
    		return null ;
    	}
    	
    	return VentesDto.builder()
    			.id(v.getId())
    			.code(v.getCode())
    			.dateVente(v.getDateVente())
    			.commentaire(v.getCommentaire())
    			.build();
    		
    }
    
    public static Ventes toEntity(VentesDto vd) {
    	if(vd==null) {
    		return null ;
    	}
    	
    	Ventes v = new Ventes();
    	v.setId(vd.getId());
    	v.setCode(vd.getCode());
    	v.setDateVente(vd.getDateVente());
    	v.setCommentaire(vd.getCommentaire());
    	return v ;
    	
    	
    }
}
