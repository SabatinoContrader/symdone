package com.pCarpet.dto;

public class PatologiaDTO {
	private long idpatologia;
	private String patologia;
	private String descrizione;
	
	public PatologiaDTO() {

}
public PatologiaDTO(long idpatologia,String patologia,String descrizione) {
	this.idpatologia = idpatologia;
	this.patologia = patologia;
	this.descrizione = descrizione;
}
public long getIdpatologia() {
	return idpatologia;
}

public String getPatologia() {
	return patologia;
}

public String getDescrizione() {
	return descrizione;
}

public void setIdpatologia(long idpatologia) {
	this.idpatologia= idpatologia;
}

public void setPatologia(String patologia) {
	this.patologia= patologia;
}

public void setDescrizione(String descrizione) {
	this.descrizione= descrizione;

	
}
}