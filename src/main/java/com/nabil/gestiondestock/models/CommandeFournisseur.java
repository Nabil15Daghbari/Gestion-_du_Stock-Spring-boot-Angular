package com.nabil.gestiondestock.models;


import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="commandefournisseur")
public class CommandeFournisseur  extends AbstractEntity{

	@Column(name="code")
	private String code  ;
	
	@Column(name="dateCommande")
     private Instant dateCommande ;
	
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur ;
	
    @OneToMany(mappedBy = "commandefournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
	
    
    @Column(name="idEntreprise")
	private Integer idEntreprise ;
	
}
