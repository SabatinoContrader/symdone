package com.pCarpet.dto;

public class SintomoSetDTO {
	
	private long idsintomoset;
	private int idprimosintomo;
	private int idsecondosintomo;
	private int idterzosintomo;
	//private Object doctor;
	
	public SintomoSetDTO() {
		
	}
	
	public SintomoSetDTO(long idsintomoset, int idprimosintomo, int idsecondosintomo, int idterzosintomo) {
		this.idsintomoset= idsintomoset;
		this.idprimosintomo= idprimosintomo;
		this.idsecondosintomo= idsecondosintomo;
		this.idterzosintomo= idterzosintomo;
		
	}
	
	public long getIdsintomoset() {
		 return idsintomoset;	
	}
	
	public int getIdprimosintomo() {
		return idprimosintomo;
	}
	
	public int getIdsecondosintomo() {
		return idsecondosintomo;
	}
	
	public int getIdterzosintomo() {
		return idterzosintomo;
	}
	public void setIdsintomoset(long idsintomoset) {
		this.idsintomoset= idsintomoset;
		}
	public void setIdprimosintomo(int idprimosintomo) {
		this.idprimosintomo= idprimosintomo;
		}
	public void setIdsecondosintomo(int idsecondosintomo) {
		this.idsecondosintomo= idsecondosintomo;
		}
	public void setIdterzosintomo(int idterzosintomo) {
		this.idterzosintomo= idterzosintomo;
		}
   
	
	
	/*public void setDoctor(UserDTO covertToDTO, String doctor) {
		this.doctor = doctor;
		
	}*/
	
	}
