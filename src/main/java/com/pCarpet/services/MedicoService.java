package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.MedicoConverter;
import com.pCarpet.converter.PatologiaConverter;
import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.converter.UserConverter;
import com.pCarpet.dao.MedicoDAO;
import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.dto.PatologiaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.model.Medico;
import com.pCarpet.model.Patologia;
import com.pCarpet.model.Sintomo;
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
	
	public MedicoDTO getMedicoID (long id) {
        Medico m = (Medico)this.medicoDAO.findById(id).get(); // procedura automatica di spring col DAO
        return MedicoConverter.convertToDto(m);
    }
	
	public void updateMedico(MedicoDTO medico) {
		medicoDAO.save(MedicoConverter.convertToMedico(medico));
	}
	
	public void deleteMedico(long id) {
    	 Medico medico = medicoDAO.findById(id).get();
    	 this.medicoDAO.delete(medico);	
    }
	
	public List<MedicoDTO> getListaResultMedici(long idsintomo) {
		List<Medico> listaMedici = (List<Medico>) this.medicoDAO.findAllListMedico(idsintomo);
		List<MedicoDTO> SintomoPerMedicoSet= new ArrayList<>();
		listaMedici.forEach(i->SintomoPerMedicoSet.add(MedicoConverter.convertToDto(i)));
		return SintomoPerMedicoSet;
	}
	
	public List<MedicoDTO> getListaResultMediciDue(long idsintomoUno, long idsintomoDue) {
		List<Medico> listaMedici = (List<Medico>) this.medicoDAO.findAllListMedicoTwoParameter(idsintomoUno,idsintomoDue);
		List<MedicoDTO> SintomoPerMedicoSet= new ArrayList<>();
		listaMedici.forEach(i->SintomoPerMedicoSet.add(MedicoConverter.convertToDto(i)));
		return SintomoPerMedicoSet;
	}
	
}
