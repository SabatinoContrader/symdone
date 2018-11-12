package com.pCarpet.converter;

import com.pCarpet.dto.PatologiaDTO;
import com.pCarpet.model.Patologia;

public class PatologiaConverter {

	public static PatologiaDTO convertToDto(Patologia p) {
		PatologiaDTO patologia = new PatologiaDTO();
		patologia.setIdpatologia(p.getIdpatologia());
		patologia.setPatologia(p.getPatologia());
		patologia.setDescrizione(p.getDescrizione());
		return patologia;
	}	
		public static Patologia convertToPatologia(PatologiaDTO p) {
			Patologia patologia = new Patologia();
			patologia.setIdpatologia(p.getIdpatologia());
			patologia.setPatologia(p.getPatologia());
			patologia.setDescrizione(p.getDescrizione());
			return patologia;
}
}