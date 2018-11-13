package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.EsameConverter;
import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.dao.EsameDAO;
import com.pCarpet.dto.EsameDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Esame;
import com.pCarpet.model.Sintomo;


@Service
public class EsameService {

	private EsameDAO esameDAO;
	
	@Autowired
	public EsameService(EsameDAO esameDAO) {
		this.esameDAO = esameDAO;
	}
	
	public List<EsameDTO> getAll(){
		//List<Esame> listaEsami = (List<Esame>)esameDAO.findAll();
		List<Esame> listaEsami = (List<Esame>)esameDAO.findAll();
		List<EsameDTO> EsamiPerPatologie= new ArrayList<>();
		listaEsami.forEach(i->EsamiPerPatologie.add(EsameConverter.convertToDto(i)));
		return EsamiPerPatologie;
	}
	
	public void insertEsame(EsameDTO esame) {
		System.out.println(esame.getIdesame() + esame.getEsame() + esame.getDescrizione());
		esameDAO.save(EsameConverter.convertToEsame(esame));
	}
	
	public void deleteEsame(Long idesame) {
		Esame e = esameDAO.findById(idesame).get();
		esameDAO.delete(e);
	}
	
	public void updateEsame(EsameDTO esameDTO) {
		esameDAO.save(EsameConverter.convertToEsame(esameDTO));
	}	
	
	public EsameDTO getIdesame (long idesame) {
        Esame e = (Esame)this.esameDAO.findById(idesame).get(); // procedura automatica di spring col DAO
        return EsameConverter.convertToDto(e);
    }
}
