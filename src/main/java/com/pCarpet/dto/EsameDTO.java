package com.pCarpet.dto;

public class EsameDTO {

	private long idesame;
	private String esame;
	private String descrizione;
	
	public EsameDTO() {
		
	}
	
	public EsameDTO(long idesame, String esame, String descrizione) {
		super();
		this.idesame = idesame;
		this.esame = esame;
		this.descrizione = descrizione;
	}

	public long getIdesame() {
		return idesame;
	}

	public void setIdesame(long idesame) {
		this.idesame = idesame;
	}

	public String getEsame() {
		return esame;
	}

	public void setEsame(String esame) {
		this.esame = esame;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}
