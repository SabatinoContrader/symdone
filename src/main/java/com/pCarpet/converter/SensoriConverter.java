package com.pCarpet.converter;

import com.pCarpet.dto.SensoriDTO;
import com.pCarpet.model.Sensori;

public class SensoriConverter {
	public static SensoriDTO convertToDto(Sensori s) {
		SensoriDTO sensoriDTO= new SensoriDTO();
		sensoriDTO.setIdsensore(s.getIdsensore());
		sensoriDTO.setTipoSensore(s.getTipoSensore());
		sensoriDTO.setSpecificheSensore(s.getSpecificheSensore());
		
		return sensoriDTO;
		
		
	}
public static Sensori convertToSensori(SensoriDTO s) {
	Sensori sensori = new Sensori();
	sensori.setIdsensore(s.getIdsensore());
	sensori.setTipoSensore(s.getTipoSensore());
	sensori.setSpecificheSensore(s.getSpecificheSensore());
	
	return sensori;
}

}
