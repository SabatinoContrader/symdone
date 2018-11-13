package com.pCarpet.services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.AssetConverter;
import com.pCarpet.converter.BadgeReaderConverter;
import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.dao.SintomoDAO;
import com.pCarpet.dto.AssetDTO;
import com.pCarpet.dto.BadgeReaderDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Asset;
import com.pCarpet.model.BadgeReader;
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
	
	public void insertSintomo(SintomoDTO sintomo) {
		 this.sintomoDAO.save(SintomoConverter.convertToSintomo(sintomo));
	}
	
	public void updateSintomo(SintomoDTO sintomo) {
		sintomoDAO.save(SintomoConverter.convertToSintomo(sintomo));
	}
	
	public SintomoDTO getSintomoID (long id) {
        Sintomo s = (Sintomo)this.sintomoDAO.findById(id).get(); // procedura automatica di spring col DAO
        return SintomoConverter.convertToDto(s);
    }
	
	public void deleteSintomo(long id) {
    	Sintomo sintomo = sintomoDAO.findById(id).get();
    	 this.sintomoDAO.delete(sintomo);
    }
	
	public List<SintomoDTO> getListaPatologia(long id) {
		System.out.println("IDReturn: " + id);
		List<Sintomo> listaSintomo = (List<Sintomo>) this.sintomoDAO.findAllListSintomo(id);
		List<SintomoDTO> SintomoPerSintomoSet= new ArrayList<>();
		listaSintomo.forEach(i->SintomoPerSintomoSet.add(SintomoConverter.convertToDto(i)));
		return SintomoPerSintomoSet;
	}
}
