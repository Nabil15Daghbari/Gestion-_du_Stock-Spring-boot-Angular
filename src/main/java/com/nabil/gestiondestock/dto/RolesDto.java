package com.nabil.gestiondestock.dto;


import com.nabil.gestiondestock.models.Roles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

	private Long id ;
	
	
	private String roleName;
	
	
	private UtilisateurDto utilisateur ;
	
	
	public static RolesDto fromEntity(Roles r) {
		if(r == null ) {
			return null ;
				
		}
		
		return RolesDto.builder()
				.id(r.getId())
				.roleName(r.getRoleName())
				.utilisateur(UtilisateurDto.fromEntity(r.getUtilisateur()))
				.build();
		
		
	}
	
	
	public static Roles toEntity(RolesDto rd) {
		if(rd == null) {
			return null ;
		}
		
		Roles r = new Roles();
		r.setId(rd.getId());
		r.setRoleName(rd.getRoleName());
		r.setUtilisateur(UtilisateurDto.toEntity(rd.getUtilisateur()));
		
	
		
		return r ;
	}
}
