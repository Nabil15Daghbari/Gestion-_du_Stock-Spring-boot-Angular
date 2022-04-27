package com.nabil.gestiondestock.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.nabil.gestiondestock.models.Fournisseur;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class FournisseurDto {

	private Long id ;
	
	private String nom ;
	
	
	private String prenom ;
	
	
	private AddresseDto adresse ;
	
	
	private String  photo ;
	
	
	private String email ;
	
	
	private String numTel ;
	
	
	private List<CommandeFournisseurDto> commandeFournisseur ;
	
	
	
	public static FournisseurDto fromEntity(Fournisseur f) {
		if(f == null) {
			return null ;
		}
		
		return FournisseurDto.builder()
				.id(f.getId())
				.nom(f.getNom())
				.prenom(f.getPrenom())
				.photo(f.getPhoto())
				.email(f.getEmail())
				.numTel(f.getNumTel())
				.adresse(AddresseDto.fromEntity(f.getAdresse()) )
				.commandeFournisseur(
						f.getCommandeFournisseur() !=null ?
	 							f.getCommandeFournisseur().stream()
	 							.map(CommandeFournisseurDto :: fromEntity)
	 							.collect(Collectors.toList()) : null
						
						)
				.build();
		
      }
	
	
	public static Fournisseur toEntity(FournisseurDto fd ) {
		if(fd == null) {
			return null ;
		}
		
		Fournisseur f  =new Fournisseur();
		f.setId(fd.getId());
		f.setNom(fd.getNom());
		f.setPrenom(fd.getPrenom());
		f.setPhoto(fd.getPhoto());
		f.setEmail(fd.getEmail());
		f.setNumTel(fd.getNumTel());
		f.setAdresse(AddresseDto.toEntity(fd.getAdresse()));
		
		return f ;
	}
}
