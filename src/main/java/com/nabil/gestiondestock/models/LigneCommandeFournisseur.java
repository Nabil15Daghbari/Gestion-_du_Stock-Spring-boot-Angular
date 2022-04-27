package com.nabil.gestiondestock.models;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {

	
	
	
	
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article ;
	
	
	@ManyToOne
	@JoinColumn(name="idcommandefournisseur")
	private CommandeFournisseur commandefournisseur ;
	
	@Column(name="quantitie")
	private BigDecimal quantite ;
	
	@Column(name="prixunitaire")
	private BigDecimal prixUnitaire ;

	
	
	
	
}
	
	