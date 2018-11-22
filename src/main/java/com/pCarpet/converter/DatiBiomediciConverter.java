package com.pCarpet.converter;

import com.pCarpet.dto.DatiBiomediciDTO;
import com.pCarpet.model.DatiBiomedici;


public class DatiBiomediciConverter {

	public static DatiBiomediciDTO convertToDto(DatiBiomedici d) {
		DatiBiomediciDTO datiBiomedici = new DatiBiomediciDTO();
		datiBiomedici.setIdcartella(d.getIdcartella());
		datiBiomedici.setIdpaziente(d.getIdpaziente());
		datiBiomedici.setIdmedico(d.getIdmedico());
		datiBiomedici.setIdsensore(d.getIdsensore());
		datiBiomedici.setRisultato(d.getRisultato());
		datiBiomedici.setData(d.getData());
		return datiBiomedici;
	}	
		public static DatiBiomedici convertToDatiBiomedici(DatiBiomediciDTO d) {
			DatiBiomedici datiBiomedici = new DatiBiomedici();
			datiBiomedici.setIdcartella(d.getIdcartella());
			datiBiomedici.setIdpaziente(d.getIdpaziente());
			datiBiomedici.setIdmedico(d.getIdmedico());
			datiBiomedici.setIdsensore(d.getIdsensore());
			datiBiomedici.setRisultato(d.getRisultato());
			datiBiomedici.setData(d.getData());
			return datiBiomedici;
}
}
