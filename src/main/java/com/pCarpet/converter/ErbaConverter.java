package com.pCarpet.converter;

import com.pCarpet.dto.ErbaDTO;
import com.pCarpet.model.Erba;

public class ErbaConverter {
	
	public static ErbaDTO convertToDto(Erba i) {
		ErbaDTO erbaDTO= new ErbaDTO();
		erbaDTO.setIderba(i.getIderba());
		erbaDTO.setErba(i.getErba());
		erbaDTO.setDescrizione(i.getDescrizione());
		return erbaDTO;		
		}

	 public static Erba convertToErba(ErbaDTO i) {
		Erba erba = new Erba();
		erba.setIderba(i.getIderba());
		erba.setErba(i.getErba());
		erba.setDescrizione(i.getDescrizione());
		return erba;
	  	}
	
}