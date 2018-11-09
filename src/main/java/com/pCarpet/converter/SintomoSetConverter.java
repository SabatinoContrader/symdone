package com.pCarpet.converter;

import com.pCarpet.dto.SintomoSetDTO;
import com.pCarpet.model.SintomoSet;

public class SintomoSetConverter {
	
	public static SintomoSetDTO convertToDTO(SintomoSet c) {
		SintomoSetDTO sintomosetDTO=new SintomoSetDTO();
		sintomosetDTO.setIdsintomoset(c.getIdsintomoset());
		sintomosetDTO.setIdprimosintomo(c.getIdprimosintomo());
		sintomosetDTO.setIdsecondosintomo(c.getIdsecondosintomo());
		sintomosetDTO.setIdterzosintomo(c.getIdterzosintomo());
		return sintomosetDTO;
   }
	public static SintomoSet convertToSintomoSet(SintomoSetDTO c) {
		SintomoSet sintomoset=new SintomoSet();
		sintomoset.setIdsintomoset(c.getIdsintomoset());
		sintomoset.setIdprimosintomo(c.getIdprimosintomo());
		sintomoset.setIdsecondosintomo(c.getIdsecondosintomo());
		sintomoset.setIdterzosintomo(c.getIdterzosintomo());
		return sintomoset; 
	}
}
