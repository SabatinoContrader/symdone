package com.pCarpet.converter;

import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Sintomo;

public class SintomoConverter {
	
	public static SintomoDTO convertToDto(Sintomo i) {
		SintomoDTO sintomoDTO= new SintomoDTO();
		sintomoDTO.setIdsintomo(i.getIdsintomo());
		sintomoDTO.setNomeSintomo(i.getSintomo());
		return sintomoDTO;		
		}

	public static Sintomo convertToSintomo(SintomoDTO i) {
		Sintomo sintomo = new Sintomo();
		sintomo.setIdsintomo(i.getIdsintomo());
		sintomo.setSintomo(i.getNomeSintomo());
		return sintomo;
	  	}
}
