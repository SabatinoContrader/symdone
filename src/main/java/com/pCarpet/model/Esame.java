package com.pCarpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Esame {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idesame;
	
	@Column
	@NonNull
	private String esame;
	
	@Column
	private String descrizione;
}
