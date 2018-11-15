package com.pCarpet.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.pCarpet.converter.PatologiaConverter;
import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.dao.PatologiaDAO;
import com.pCarpet.dto.PatologiaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Patologia;
import com.pCarpet.model.Sintomo;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatologiaService {
	private PatologiaDAO patologiaDAO;
	
	@Autowired
	public PatologiaService(PatologiaDAO patologiaDAO) {
		this.patologiaDAO=patologiaDAO;
	}
	public List<PatologiaDTO> getAll(){
		List<Patologia> listaPatologia = (List<Patologia>) patologiaDAO.findAll();
		List<PatologiaDTO> PatologiaPerPatologiaSet= new ArrayList<>();
		listaPatologia.forEach(i->PatologiaPerPatologiaSet.add(PatologiaConverter.convertToDto(i)));
		return PatologiaPerPatologiaSet;

	}	
	
    public void insertPatologia(PatologiaDTO patologiaDTO) {
		Patologia patologia = PatologiaConverter.convertToPatologia(patologiaDTO);
		this.patologiaDAO.save(patologia);
    }
		
    public void deletePatologia(Long idpatologia) {
		Patologia p = patologiaDAO.findById(idpatologia).get();
		patologiaDAO.delete(p);
	}	
    
    public void updatePatologia(PatologiaDTO patologiaDTO) {
	    Patologia patologia = PatologiaConverter.convertToPatologia(patologiaDTO);
	    this.patologiaDAO.save(patologia);
    }
    
    public PatologiaDTO getIdpatologia(long idpatologia) {
	    Patologia p=(Patologia)this.patologiaDAO.findById(idpatologia).get();
	    return PatologiaConverter.convertToDto(p);
    }
    
	
	
    public List<PatologiaDTO> getListaResultPatologia(long idpatologia) {
    	System.out.println("IDReturn1: " + idpatologia);
    	List<Patologia> listaPatologia = (List<Patologia>) this.patologiaDAO.findAllListPatologia(idpatologia);
		List<PatologiaDTO> SintomoPerPatologiaSet= new ArrayList<>();
		listaPatologia.forEach(i->SintomoPerPatologiaSet.add(PatologiaConverter.convertToDto(i)));
		return SintomoPerPatologiaSet;
	}
    
    public List<PatologiaDTO> getListaResultPatologiaDue(long idpatologia1, long idpatologia2) {
		List<Patologia> listaPatologia = (List<Patologia>) this.patologiaDAO.findAllListPatologiaTwoParameter(idpatologia1, idpatologia2);
		List<PatologiaDTO> SintomoPerPatologiaSet= new ArrayList<>();
		listaPatologia.forEach(i->SintomoPerPatologiaSet.add(PatologiaConverter.convertToDto(i)));
		return SintomoPerPatologiaSet;
	}
    
    public List<PatologiaDTO> getListaResultPatologiaTre(long idpatologia1, long idpatologia2, long idpatologia3) {
		List<Patologia> listaPatologia = (List<Patologia>) this.patologiaDAO.findAllListPatologiaThreeParameter(idpatologia1, idpatologia2, idpatologia3);
		List<PatologiaDTO> SintomoPerPatologiaSet= new ArrayList<>();
		listaPatologia.forEach(i->SintomoPerPatologiaSet.add(PatologiaConverter.convertToDto(i)));
		return SintomoPerPatologiaSet;
	}
   

}
