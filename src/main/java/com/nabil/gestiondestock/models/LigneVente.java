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

@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="lignevente")
public class LigneVente extends AbstractEntity {

	
	@ManyToOne
	@JoinColumn(name="idvente")
	private Ventes vente ;
	
	@Column(name="quantitie")
	private BigDecimal quantite ;
	
	@Column(name="prixunitaire")
	private BigDecimal prixUnitaire ;
	
	@Column(name="idEntreprise")
	private Integer idEntreprise ;
	
	
	
	public LigneVente() {
		
	}
}
