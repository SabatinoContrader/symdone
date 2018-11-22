package com.pCarpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
	
	public User() {
		
	}
	

    public User(long idutente, String username) {
        this();
		this.iduser=idutente;
        this.username=username;
    }
	
	public User(long idutente, String username, String password, int idRuolo, String ruolo, String name, String surname, String phone, String email) {
		this();
		this.iduser=idutente;
		this.username=username;
		this.password=password;
		this.idRuolo=idRuolo;
		this.ruolo=ruolo;
		this.name=name;
		this.surname=surname;
	}
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iduser;
	
	@Column
	@NotNull
    private String username;
	
	@Column
	@NotNull
    private String password;
	
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuolo;
	
	@Column
	@NotNull
    private String ruolo;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
}

