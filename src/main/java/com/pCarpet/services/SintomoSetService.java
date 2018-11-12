package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.controller.HomeSintomoSetController;
import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.converter.SintomoSetConverter;
import com.pCarpet.dao.SintomoSetDAO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.dto.SintomoSetDTO;
import com.pCarpet.model.Sintomo;
import com.pCarpet.model.SintomoSet;

@Service
public class SintomoSetService {
	private SintomoSetDAO sintomosetDAO;
	
	@Autowired
	public SintomoSetService(SintomoSetDAO sintomosetDAO) {
		this.sintomosetDAO = sintomosetDAO;
	}  
	public List<SintomoSetDTO> getAll(){
		List<SintomoSet> listaSintomoSet = (List<SintomoSet>) sintomosetDAO.findAll();
		List<SintomoSetDTO> listaSintomoSet1= new ArrayList<>();
		listaSintomoSet.forEach(i->listaSintomoSet1.add(SintomoSetConverter.convertToDTO(i)));
		return listaSintomoSet1;
	}
	 public void insertSintomoSet(SintomoSetDTO sintomoset) {
		SintomoSet sintomoSet = SintomoSetConverter.convertToSintomoSet(sintomoset);
		sintomosetDAO.save(sintomoSet);
    	
	    }
	 public void updateSintomoSet(Long idsintomoset) {
		 SintomoSet l = sintomosetDAO.findById(idsintomoset).get();
		 sintomosetDAO.save(l);
	 }
	 public void sintomosetUpdate(SintomoSetDTO sintomoset) {
		 sintomosetDAO.save(SintomoSetConverter.convertToSintomoSet(sintomoset));
	 }
     public void deleteSintomoSet(Long idsintomoset) {
    	 SintomoSet l = sintomosetDAO.findById(idsintomoset).get();
    	 sintomosetDAO.delete(l);
     }
     public SintomoSetDTO searchSintomoSet(long idsintomoset) {
    	 return SintomoSetConverter.convertToDTO(sintomosetDAO.findById(idsintomoset).get());
     }
     
}
  