package com.pCarpet.model;

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
@Table(name="sensori")
@NoArgsConstructor
@AllArgsConstructor
public class Sensori {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	@NonNull
	private long idsensore;
	
	@Column 
	private String tipoSensore;
	
	@Column 
	private String specificheSensore;
	
	
	
	
	

}
