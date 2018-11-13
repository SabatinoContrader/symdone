package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.ErbaConverter;
import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.dao.ErbaDAO;
import com.pCarpet.dto.ErbaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Erba;
import com.pCarpet.model.Sintomo;

@Service
public class ErbaService {
	
	private ErbaDAO erbaDAO;
	
	@Autowired
	public ErbaService(ErbaDAO erbaDAO) {
		this.erbaDAO = erbaDAO;
	}
	
	public List<ErbaDTO> getAll(){
		List<Erba> listaErba = (List<Erba>) erbaDAO.findAll();
		List<ErbaDTO> erbePerPatologie= new ArrayList<>();
		listaErba.forEach(i->erbePerPatologie.add(ErbaConverter.convertToDto(i)));
		return erbePerPatologie;
		
		}
	
	public void insertErba(ErbaDTO erba) {
		erbaDAO.save(ErbaConverter.convertToErba(erba));

	}
	
	
	public void deleteErba (Long iderba) {
		Erba e = erbaDAO.findById(iderba).get();
		erbaDAO.delete(e);
	}
	
	public void updateErba(ErbaDTO erbaDTO) {
		this.erbaDAO.save(ErbaConverter.convertToErba(erbaDTO));
	}
	
	public ErbaDTO getErbaID (long id) {
        Erba erba = (Erba)this.erbaDAO.findById(id).get(); // procedura automatica di spring col DAO
        return ErbaConverter.convertToDto(erba);
    }
	
	
	
}