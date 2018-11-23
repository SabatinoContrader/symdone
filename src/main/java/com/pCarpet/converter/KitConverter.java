package com.pCarpet.converter;

import com.pCarpet.dto.KitDTO;
import com.pCarpet.model.Kit;

public class KitConverter {
	public static KitDTO convertToDto(Kit i) {
		KitDTO kitDTO= new KitDTO();
		kitDTO.setIdkit(i.getIdkit());
		kitDTO.setTipoKit(i.getTipoKit());
		kitDTO.setDescrizioneKit(i.getDescrizioneKit());
		kitDTO.setSoftware(i.getSoftware());
		return kitDTO;		
		}

	public static Kit convertToKit(KitDTO i) {
		Kit kit = new Kit();
		kit.setIdkit(i.getIdkit());
		kit.setTipoKit(i.getTipoKit());
		kit.setDescrizioneKit(i.getDescrizioneKit());
		kit.setSoftware(i.getSoftware());
		return kit;
	  	}
}
