package com.nabil.gestiondestock.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.nabil.gestiondestock.models.Category;

import lombok.Builder;
import lombok.Data;






@Data
@Builder
public class CategoryDto {
	
	private Long id ;
	
	private String code ;
	
	
	private String designation ;
	

	private List<ArticleDto> articles ;
	
	
	// fait une mapping de Category -> CategoryDto
	
	public  static CategoryDto fromEntity(Category category) {
		if(category==null) {
			return null ;
		}
		
		return CategoryDto.builder()
				.id(category.getId())
				.code(category.getCode())
				.designation(category.getDesignation())
				.articles(
						        category.getArticles() !=null ?
								category.getArticles().stream()
	 							.map(ArticleDto :: fromEntity)
	 							.collect(Collectors.toList()) : null
						
						)
				.build();
		// build ==> creer un objet de type CategoryDto
        
	}
	
	// mapping de categoryDto --> category
	
	public static Category toEntity(CategoryDto categoryDto) {
		if(categoryDto == null)
		{
			return null ;
		}
		
		Category category = new Category();
		category.setId(categoryDto.getId());
		category.setCode(categoryDto.getCode());
		category.setDesignation(categoryDto.getDesignation());
		
		return category ;
	}
	

}
