package com.pCarpet.dto;

public class KitDTO {
	private long idkit;
	private String tipoKit;
	private String descrizioneKit;
	private String software;
	
	public KitDTO() 
	{		
	}


	public KitDTO(long idkit, String tipoKit, String descrizioneKit, String software) {
		
		this.idkit = idkit;
		this.tipoKit = tipoKit;
		this.descrizioneKit = descrizioneKit;
		this.software = software;
		
	}


	public long getIdkit() {
		return idkit;
	}


	public void setIdkit(long idkit) {
		this.idkit = idkit;
	}


	public String getTipoKit() {
		return tipoKit;
	}


	public void setTipoKit(String tipoKit) {
		this.tipoKit = tipoKit;
	}


	public String getDescrizioneKit() {
		return descrizioneKit;
	}


	public void setDescrizioneKit(String descrizioneKit) {
		this.descrizioneKit = descrizioneKit;
	}


	public String getSoftware() {
		return software;
	}


	public void setSoftware(String software) {
		this.software = software;
	}
}
