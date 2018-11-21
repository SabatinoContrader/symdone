package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pCarpet.dto.EsameDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.services.EsameService;

@RestController
@CrossOrigin
@RequestMapping("/HomeEsame")
public class HomeEsameController {
	
	private EsameService esameService;
	
	@Autowired
	public HomeEsameController (EsameService esameService) {
		this.esameService =  esameService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/ShowEsame", method = RequestMethod.GET)
	//public String HomeEsame(HttpServletRequest request, Model model) {
	public List<EsameDTO> getAll(){	
	List<EsameDTO> listaEsame = esameService.getAll();
		return listaEsame;
	}
	
	
	
	@CrossOrigin
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public EsameDTO insertEsame(
			@RequestParam(value="esame") String esame,
			@RequestParam(value="descrizione") String descrizione) {
		
		System.out.println(esame+" "+descrizione);
		EsameDTO esameDTO = new EsameDTO();
		esameDTO.setEsame(esame);
		esameDTO.setDescrizione(descrizione);
		esameService.insertEsame(esameDTO);
		return esameDTO;
				
	} 
	
	
	@CrossOrigin
	@RequestMapping(value="/deleteEsame", method=RequestMethod.GET)
	public void delete(@RequestParam(value="idesame") long idesame) {
		esameService.getIdesame(idesame);
		esameService.deleteEsame(idesame);
		
	}
	
	@CrossOrigin
	@RequestMapping(value="/updateEsame", method= RequestMethod.POST)
	public EsameDTO updateEsame(
			@RequestParam(value="idesame") long idesame,
			@RequestParam(value="esame", required=false)String esame,
			@RequestParam(value="descrizione", required=false)String descrizione) {
		EsameDTO edto = esameService.getIdesame(idesame);
		
		if(esame != null) {
		edto.setEsame(esame);	
		}

		if(descrizione != null) {
		edto.setDescrizione(descrizione);
		}
		
		esameService.updateEsame(edto);
		return edto;
	}
	

}
