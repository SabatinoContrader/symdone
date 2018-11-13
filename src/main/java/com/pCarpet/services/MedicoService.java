package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.MedicoConverter;
import com.pCarpet.converter.UserConverter;
import com.pCarpet.dao.MedicoDAO;
import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.model.Medico;
import com.pCarpet.model.User;

@Service
public class MedicoService {
	
	private MedicoDAO medicoDAO;
	
	@Autowired
	public MedicoService(MedicoDAO medicoDAO) {
		this.medicoDAO = medicoDAO;
	}
	
	public List<MedicoDTO> getAll(){
		List<Medico> listaMedico = (List<Medico>) medicoDAO.findAll();
		List<MedicoDTO> MedicoPerMedicoSet= new ArrayList<>();
		listaMedico.forEach(i->MedicoPerMedicoSet.add(MedicoConverter.convertToDto(i)));
		return MedicoPerMedicoSet;

	}
	
	public boolean insertMed (MedicoDTO medicoDTO) {
	    
    	Medico medico = MedicoConverter.convertToMedico(medicoDTO);
        return this.medicoDAO.save(medico)!=null;
     
    }
}
