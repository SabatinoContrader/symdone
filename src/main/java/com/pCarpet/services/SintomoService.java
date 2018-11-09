package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.dao.SintomoDAO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Sintomo;

@Service
public class SintomoService {
	
	private SintomoDAO sintomoDAO;
	
	@Autowired
	public SintomoService(SintomoDAO sintomoDAO) {
		this.sintomoDAO = sintomoDAO;
	}
	
	public List<SintomoDTO> getAll(){
		List<Sintomo> listaSintomi = (List<Sintomo>) sintomoDAO.findAll();
		List<SintomoDTO> SintomoPerSintomoSet= new ArrayList<>();
		listaSintomi.forEach(i->SintomoPerSintomoSet.add(SintomoConverter.convertToDto(i)));
		return SintomoPerSintomoSet;

	}
}
