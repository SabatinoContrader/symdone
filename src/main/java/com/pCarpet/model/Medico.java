package com.pCarpet.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medico {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idmedico;
	
	@Column
	@NonNull
	private String nome;
	
	@Column
	@NonNull
	private String cognome;
	
	@Column
	@NonNull
	private String specializzazione;
	
	@Column
	@NonNull
	private String indirizzo;
	
	@Column
	@NonNull
	private String mail;
}
