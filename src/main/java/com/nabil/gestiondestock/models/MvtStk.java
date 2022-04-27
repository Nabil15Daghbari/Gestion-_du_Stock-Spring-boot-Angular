package com.nabil.gestiondestock.models;

import java.math.BigDecimal;
import java.time.Instant;


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
@Table(name="mvtstock")
public class MvtStk  extends AbstractEntity{

	@Column(name="datemvt")
	private Instant dateMvt ;
	
	@Column(name="quantitie")
	private BigDecimal quantitie ;
	
	@Column(name="typemvt")
	private TypeMvtStk typeMvt ;

	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article ;
}
