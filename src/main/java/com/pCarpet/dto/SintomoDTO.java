package com.pCarpet.dto;

public class SintomoDTO {

	private long idsintomo;
	private String nomeSintomo;
	
	
	public SintomoDTO() 
	{		
	}


	public SintomoDTO(long idsintomo, String nomeSintomo) {
		super();
		this.idsintomo = idsintomo;
		this.nomeSintomo = nomeSintomo;
	}


	public long getIdsintomo() {
		return idsintomo;
	}


	public void setIdsintomo(long l) {
		this.idsintomo = l;
	}


	public String getNomeSintomo() {
		return nomeSintomo;
	}


	public void setNomeSintomo(String nomeSintomo) {
		this.nomeSintomo = nomeSintomo;
	}

}
