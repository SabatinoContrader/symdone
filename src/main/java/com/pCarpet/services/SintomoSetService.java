package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.controller.SintomoSetController;
import com.pCarpet.converter.SintomoSetConverter;
import com.pCarpet.dao.SintomoSetDAO;
import com.pCarpet.dto.SintomoSetDTO;
import com.pCarpet.model.SintomoSet;

@Service
public class SintomoSetService {
	private SintomoSetDAO sintomosetDAO;
	
	@Autowired
	public SintomoSetService(SintomoSetDAO sintomosetDAO) {
		this.sintomosetDAO = sintomosetDAO;
	}
    public void insertSintomoSet(SintomoSetDTO sintomoset) {
		SintomoSet sintomoSet = SintomoSetConverter.convertToSintomoSet(sintomoset);
		sintomosetDAO.save(sintomoSet);
    	
	    }
    
}
  