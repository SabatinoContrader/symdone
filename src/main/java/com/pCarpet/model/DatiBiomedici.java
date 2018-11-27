package com.pCarpet.model;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="datiBiomedici")
@NoArgsConstructor
@AllArgsConstructor

public class DatiBiomedici {
	
		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long idcartella;
		
		@Column (unique=true)
		@NonNull
		private long idpaziente;
		
		@Column
		@NonNull
		private long idmedico;
		
		@Column
		@NonNull
		private long idsensore;
		
		@Column
		private String risultato; 
		
		@Column
		private Date data;

	

	}


