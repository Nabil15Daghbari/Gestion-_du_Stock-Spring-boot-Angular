package com.nabil.gestiondestock.dto;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.nabil.gestiondestock.models.CommandeClient;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CommandeClientDto {

	private Long id ;
	
	
	private String code ;
	
	
	private Instant dateCommande ;
	

	private ClientDto client ; 

	private List<LigneCommandeClientDto> ligneCommandeClients;
	
	
	public static CommandeClientDto fromEntity(CommandeClient cc) {
		if(cc==null) {
			return null ;
		}
		
		return CommandeClientDto.builder()
				.id(cc.getId())
				.code(cc.getCode())
				.dateCommande(cc.getDateCommande())
				.client(ClientDto.fromEntity(cc.getClient()))
				.ligneCommandeClients(
						        cc.getLigneCommandeClients() !=null ?
								cc.getLigneCommandeClients().stream()
	 							.map(LigneCommandeClientDto :: fromEntity)
	 							.collect(Collectors.toList()) : null
						
						)
				
				.build();
						
	  }
	
	public static CommandeClient toEntity(CommandeClientDto ccd) {
		if(ccd == null)
			return null ;
		
		CommandeClient cc = new CommandeClient();
		cc.setId(ccd.getId());
		cc.setCode(ccd.getCode());
		cc.setDateCommande(ccd.getDateCommande());
		cc.setClient(ClientDto.toEntity(ccd.getClient()));
		
		return cc ;
		
	}
	
	
	
}
