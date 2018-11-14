package com.pCarpet.converter;

import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.model.Medico;

public class MedicoConverter {
	
	public static MedicoDTO convertToDto(Medico i) {
		MedicoDTO medicoDTO= new MedicoDTO();
		medicoDTO.setIdmedico(i.getIdmedico());
		medicoDTO.setNome(i.getNome());
		medicoDTO.setCognome(i.getCognome());
		medicoDTO.setSpecializzazione(i.getSpecializzazione());
		medicoDTO.setIndirizzo(i.getIndirizzo());
		medicoDTO.setMail(i.getMail());
		return medicoDTO;		
		}

	public static Medico convertToMedico(MedicoDTO i) {
		Medico medico = new Medico();
		medico.setIdmedico(i.getIdmedico());
		medico.setNome(i.getNome());
		medico.setCognome(i.getCognome());
		medico.setSpecializzazione(i.getSpecializzazione());
		medico.setIndirizzo(i.getIndirizzo());
		medico.setMail(i.getMail());
		return medico;
	  	}
}
