package com.pCarpet.dto;

import java.sql.Blob;
import java.sql.Date;

public class DatiBiomediciDTO {
	private long idcartella;
	private long idpaziente;
	private long idmedico;
	private long idsensore;
	private String risultato;
	private Date data;
	
	public DatiBiomediciDTO() {
}
	
	public DatiBiomediciDTO(long idcartella,long idpaziente, long idmedico, long idsensore,String risultato, Date data) {
		this.idcartella = idcartella;
		this.idpaziente= idpaziente;
		this.idmedico= idmedico;
		this.idsensore = idsensore;
		this.risultato = risultato;
		this.data=data;
	}

	public long getIdcartella() {
		return idcartella;
	}

	public void setIdcartella(long idcartella) {
		this.idcartella = idcartella;
	}

	public long getIdpaziente() {
		return idpaziente;
	}

	public void setIdpaziente(long idpaziente) {
		this.idpaziente = idpaziente;
	}

	public long getIdmedico() {
		return idmedico;
	}

	public void setIdmedico(long idmedico) {
		this.idmedico = idmedico;
	}

	public long getIdsensore() {
		return idsensore;
	}

	public void setIdsensore(long idsensore) {
		this.idsensore = idsensore;
	}

	public String getRisultato() {
		return risultato;
	}

	public void setRisultato(String risultato) {
		this.risultato = risultato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
		