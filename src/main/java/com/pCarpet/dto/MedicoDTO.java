package com.pCarpet.dto;

public class MedicoDTO {

	private long idmedico;
	private String nome;
	private String cognome;
	private String specializzazione;
	private String indirizzo;
	private String mail;
	
	public MedicoDTO() 
	{		
	}


	public MedicoDTO(long idmedico, String nome, String cognome, String specializzazione, String indirizzo, String mail) {
		super();
		this.idmedico = idmedico;
		this.nome = nome;
		this.cognome = cognome;
		this.specializzazione = specializzazione;
		this.indirizzo = indirizzo;
		this.mail = mail;
	}


	public long getIdmedico() {
		return idmedico;
	}

	public void setIdmedico(long idmedico) {
		this.idmedico = idmedico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


}
