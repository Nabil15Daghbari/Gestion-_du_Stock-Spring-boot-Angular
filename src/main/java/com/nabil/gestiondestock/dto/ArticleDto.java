package com.nabil.gestiondestock.dto;

import java.math.BigDecimal;


import com.nabil.gestiondestock.models.Article;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {

	private Long id ;
	
	private String codeArticle ;
	
	
	private String designation ;
	
	
	private BigDecimal prixUnitaireHt ;
	
	
	private BigDecimal tauxTva ;
	
	
	private BigDecimal prixUnitaireTtc ;
	
	
	private String photo ;
	
	private CategoryDto category ;
	
	
	// on besoins ces method aprés pour la persistence et   recupérer les donner
	
	// mapping Article --> ArticleDto
	public static ArticleDto fromEntity(Article article )
	{
		if(article == null) {
			return null ;
		}
		
		return ArticleDto.builder()
				.id(article.getId())
				.codeArticle(article.getCodeArticle())
				.designation(article.getDesignation())
				.prixUnitaireHt(article.getPrixUnitaireHt())
				.tauxTva(article.getTauxTva())
				.prixUnitaireTtc(article.getPrixUnitaireTtc())
				.photo(article.getPhoto())
				.category(CategoryDto.fromEntity(article.getCategory()))
				.build();
	}
	
	// mapping articelDto --> article
	
	public static Article toEntity(ArticleDto articleDto) {
		if(articleDto == null) {
			return null ;
		}
		
		Article article =new Article();
		article.setId(articleDto.getId());
		article.setCodeArticle(articleDto.getCodeArticle());
		article.setDesignation(articleDto.getDesignation());
		article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
		article.setTauxTva(articleDto.getTauxTva());
		article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
		article.setPhoto(articleDto.getPhoto());
		article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));
		
		return article ;
		
		
		
	}
}
