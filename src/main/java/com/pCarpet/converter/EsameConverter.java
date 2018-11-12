package com.pCarpet.converter;

import com.pCarpet.dto.EsameDTO;
import com.pCarpet.model.Esame;


public class EsameConverter {
	
	public static EsameDTO convertToDto(Esame i) {
		EsameDTO esameDTO= new EsameDTO();
		esameDTO.setIdesame(i.getIdesame());
		esameDTO.setEsame(i.getEsame());
		esameDTO.setDescrizione(i.getDescrizione());
		return esameDTO;		
		}
	public static Esame convertToEsame(EsameDTO i) {
		Esame esame = new Esame();
		esame.setIdesame(i.getIdesame());
		esame.setEsame(i.getEsame());
		esame.setDescrizione(i.getDescrizione());
		return esame;
		}
}
