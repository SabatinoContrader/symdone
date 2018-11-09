package com.pCarpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
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
@Table(name="sintomoset") 
@NoArgsConstructor
@AllArgsConstructor


public class SintomoSet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long idsintomoset;
	
	@Column
	@NotNull
	private int idprimosintomo;
	
	@Column
	@NotNull
	private int idsecondosintomo;
	
	@Column
	@NotNull
	private int idterzosintomo;
	
	@ManyToOne
	@JoinColumn (name = "doctor")
    private User doctor; 
}
