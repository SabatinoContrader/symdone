package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.SensoriConverter;
import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.dao.SensoriDAO;
import com.pCarpet.dto.SensoriDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Sensori;
import com.pCarpet.model.Sintomo;


@Service
public class SensoriService {
	private SensoriDAO sensoriDAO;
	
	
	@Autowired 
	public SensoriService(SensoriDAO sensoriDAO) {
		this.sensoriDAO=sensoriDAO;
				
	}
	
	public List<SensoriDTO> getAll(){
		List<Sensori> listaSensori = (List<Sensori>) sensoriDAO.findAll();
		List<SensoriDTO> listaSensori1= new ArrayList<>();
		listaSensori.forEach(i->listaSensori1.add(SensoriConverter.convertToDto(i)));
		return listaSensori1;
	}
	public SensoriDTO insertSensori(SensoriDTO sensoriDTO) {
		 Sensori sensori = SensoriConverter.convertToSensori(sensoriDTO);
		 this.sensoriDAO.save(sensori);
		 return SensoriConverter.convertToDto(sensoriDAO.save(sensori));
	}
	
	public SensoriDTO updateSensori(SensoriDTO sensoriDTO) {
		Sensori sensori = SensoriConverter.convertToSensori(sensoriDTO);
		sensoriDAO.save(sensori);
		return SensoriConverter.convertToDto(sensoriDAO.save(sensori));
	}
	
	public SensoriDTO getIdsensore (long idsensore) {
        Sensori s = (Sensori)this.sensoriDAO.findById(idsensore).get(); // procedura automatica di spring col DAO
        return SensoriConverter.convertToDto(s);
    }
	
	public void deleteSensori(long idsensore) {
    	Sensori sensori = sensoriDAO.findById(idsensore).get();
    	this.sensoriDAO.delete(sensori);
       }
	
	public SensoriDTO findById(long idsensore) {
		return SensoriConverter.convertToDto(sensoriDAO.findById(idsensore).get());
	}

	
}
