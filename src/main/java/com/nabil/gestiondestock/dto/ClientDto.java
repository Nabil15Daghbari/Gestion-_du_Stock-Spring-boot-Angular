package com.nabil.gestiondestock.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.nabil.gestiondestock.models.Client;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ClientDto {
	
	private Long id ;
	
	private String nom ;
	
	
	private String prenom ;
	

	private AddresseDto adresse ;
	
	private String  photo ;
	
	
	private String email ;
	
	
	private String numTel ;
	
	
	private List<CommandeClientDto> commandeClients ;
	
	
	public static ClientDto fromEntity(Client c) {
		if(c == null) {
			return null ;
		}
		
		return ClientDto.builder()
				.id(c.getId())
				.nom(c.getNom())
				.prenom(c.getPrenom())
				.photo(c.getPhoto())
				.email(c.getEmail())
				.numTel(c.getNumTel())
				.adresse(AddresseDto.fromEntity(c.getAdresse()))
				.commandeClients(
						c.getCommandeClients() !=null ?
	 							c.getCommandeClients().stream()
	 							.map(CommandeClientDto :: fromEntity)
	 							.collect(Collectors.toList()) : null
						
						
						)
				.build();
		
      }
	
	
	public static Client toEntity(ClientDto cl ) {
		if(cl == null) {
			return null ;
		}
		
		Client c  =new Client();
		c.setId(cl.getId());
		c.setNom(cl.getNom());
		c.setPrenom(cl.getPrenom());
		c.setPhoto(cl.getPhoto());
		c.setEmail(cl.getEmail());
		c.setNumTel(cl.getNumTel());
		c.setAdresse(AddresseDto.toEntity(cl.getAdresse()));
		
		return c ;
	}
	
}
