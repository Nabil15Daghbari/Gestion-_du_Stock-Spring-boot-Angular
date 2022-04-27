package com.nabil.gestiondestock.dto;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import com.nabil.gestiondestock.models.Utilisateur;
import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class UtilisateurDto {

	
	private Long id ;

	private String nom ;
	
	
	private String prenom ;
	
	
	private String email ;
	
	
	private Instant dateDeNaissance ;
	
	
    private	String motDePasse ;
    
    
    private AddresseDto adresse ;
    
	
    private String photo ;
	
    
    private EntrepriseDto entreprise ;
    
     private List<RolesDto> roles;

     
     public static UtilisateurDto fromEntity(Utilisateur u) {
 		if(u == null) {
 			return null ;
 		}
 		
 		return UtilisateurDto.builder()
 				.id(u.getId())
 				.nom(u.getNom())
 				.prenom(u.getPrenom())
 				.photo(u.getPhoto())
 				.email(u.getEmail())
 				.dateDeNaissance(u.getDateDeNaissance())
 				.motDePasse(u.getMotDePasse())
 				.adresse(AddresseDto.fromEntity(u.getAdresse()))
 				.entreprise(EntrepriseDto.fromEntity(u.getEntreprise()))
 				.roles(
 						u.getRoles() !=null ?
 							u.getRoles().stream()
 							.map(RolesDto :: fromEntity)
 							.collect(Collectors.toList()) : null
 						)
 				
 				.build();
 		
       }
 	
 	
 	public static Utilisateur toEntity(UtilisateurDto ud ) {
 		if(ud == null) {
 			return null ;
 		}
 		
 		Utilisateur u  =new Utilisateur();
 		u.setId(ud.getId());
 		u.setNom(ud.getNom());
 		u.setPrenom(ud.getPrenom());
 		u.setPhoto(ud.getPhoto());
 		u.setEmail(ud.getEmail());
 		u.setDateDeNaissance(ud.getDateDeNaissance());
 		u.setMotDePasse(ud.getMotDePasse());
 		u.setAdresse(AddresseDto.toEntity(ud.getAdresse()));
 		
 		
 		
 		return u ;
 	}
}
