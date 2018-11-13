package com.pCarpet.dto;

public class MedicoDTO {

	private int idmedico;
	private String nome;
	private String cognome;
	private String specializzazione;
	private String indirizzo;
	private String mail;
	
	public MedicoDTO() 
	{		
	}


	public MedicoDTO(int idMed, String nome, String cognome, String specializzazione, String indirizzo, String mail) {
		super();
		this.idmedico = idMed;
		this.nome = nome;
		this.cognome = cognome;
		this.specializzazione = specializzazione;
		this.indirizzo = indirizzo;
		this.mail = mail;
	}


	public int getIdMed() {
		return idmedico;
	}

	public void setIdMed(int idMed) {
		this.idmedico = idMed;
	}

	public String getNomeMed() {
		return nome;
	}

	public void setNomeMed(String nome) {
		this.nome = nome;
	}
	
	public String getCognomeMed() {
		return cognome;
	}

	public void setCognomeMed(String cognome) {
		this.cognome = cognome;
	}
	
	public String getSpecMed() {
		return specializzazione;
	}

	public void setSpecMed(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	
	public String getIndMed() {
		return indirizzo;
	}

	public void setIndMed(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public String getMailMed() {
		return mail;
	}

	public void setMailMed(String mail) {
		this.mail = mail;
	}


}
