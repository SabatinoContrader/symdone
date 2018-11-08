package com.pCarpet.dto;

public class SintomoDTO {

	private int idsintomo;
	private String nomeSintomo;
	
	
	public SintomoDTO() 
	{		
	}


	public SintomoDTO(int idsintomo, String nomeSintomo) {
		super();
		this.idsintomo = idsintomo;
		this.nomeSintomo = nomeSintomo;
	}


	public int getIdsintomo() {
		return idsintomo;
	}


	public void setIdsintomo(int idsintomo) {
		this.idsintomo = idsintomo;
	}


	public String getNomeSintomo() {
		return nomeSintomo;
	}


	public void setNomeSintomo(String nomeSintomo) {
		this.nomeSintomo = nomeSintomo;
	}

}
