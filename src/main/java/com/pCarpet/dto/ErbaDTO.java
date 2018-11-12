package com.pCarpet.dto;

public class ErbaDTO {

	private Long iderba;
	private String erba;
	private String descrizione;
	
	public ErbaDTO() 
	{		
	}


	public ErbaDTO(Long iderba, String erba, String descrizione) {
		this.iderba = iderba;
		this.erba = erba;
		this.descrizione = descrizione;
	}


	public Long getIderba() {
		return iderba;
	}


	public void setIderba(Long iderba) {
		this.iderba = iderba;
	}


	public String getErba() {
		return erba;
	}


	public void setErba(String erba) {
		this.erba = erba;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}




}
