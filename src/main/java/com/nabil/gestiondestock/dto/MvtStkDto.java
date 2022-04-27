package com.nabil.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.nabil.gestiondestock.models.MvtStk;
import com.nabil.gestiondestock.models.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStkDto {

	
	
	private Long id ;
	
	private Instant dateMvt ;
	
	
	private BigDecimal quantitie ;
	
	
	private TypeMvtStk typeMvt ;

	
	private ArticleDto article ;
	
	public static MvtStkDto fromEntity(MvtStk mv) {
		if(mv == null ) {
			return null ;
				
		}
		
		return MvtStkDto.builder()
				.id(mv.getId())
				.dateMvt(mv.getDateMvt())
				.quantitie(mv.getQuantitie())
				.typeMvt(mv.getTypeMvt())
				.article(ArticleDto.fromEntity(mv.getArticle()))
				.build();
		
		
	}
	
	
	public static MvtStk toEntity(MvtStkDto mvd) {
		if(mvd == null) {
			return null ;
		}
		
		MvtStk mv = new MvtStk();
		mv.setId(mvd.getId());
		mv.setDateMvt(mvd.getDateMvt());
		mv.setQuantitie(mvd.getQuantitie());
		mv.setTypeMvt(mvd.getTypeMvt());
		mv.setArticle(ArticleDto.toEntity(mvd.getArticle()));
	
		
		return mv ;
	}
}
