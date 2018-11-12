package com.pCarpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="patologia")
@NoArgsConstructor
@AllArgsConstructor

public class Patologia {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idpatologia;
	
	@Column
	@NonNull
	private String patologia;
	
	@Column
	@NonNull
	private String descrizione; 

}

