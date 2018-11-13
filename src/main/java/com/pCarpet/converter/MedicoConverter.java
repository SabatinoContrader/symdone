package com.pCarpet.converter;

import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.model.Medico;

public class MedicoConverter {
	
	public static MedicoDTO convertToDto(Medico i) {
		MedicoDTO medicoDTO= new MedicoDTO();
		medicoDTO.setIdMed(i.getIdmedico());
		medicoDTO.setNomeMed(i.getNome());
		medicoDTO.setCognomeMed(i.getCognome());
		medicoDTO.setSpecMed(i.getSpecializzazione());
		medicoDTO.setIndMed(i.getIndirizzo());
		medicoDTO.setMailMed(i.getMail());
		return medicoDTO;		
		}

	public static Medico convertToMedico(MedicoDTO i) {
		Medico medico = new Medico();
		medico.setIdmedico(i.getIdMed());
		medico.setNome(i.getNomeMed());
		medico.setCognome(i.getCognomeMed());
		medico.setSpecializzazione(i.getSpecMed());
		medico.setIndirizzo(i.getIndMed());
		medico.setMail(i.getMailMed());
		return medico;
	  	}
}
