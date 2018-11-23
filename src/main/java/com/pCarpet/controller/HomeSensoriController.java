package com.pCarpet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.pCarpet.dto.SensoriDTO;
import com.pCarpet.services.SensoriService;

@RestController
@CrossOrigin
@RequestMapping("/HomeSensore")

public class HomeSensoriController {
	private SensoriService sensoriService;
	




@Autowired
public HomeSensoriController(SensoriService sensoriService) {
	this.sensoriService = sensoriService;
}

@CrossOrigin
@RequestMapping(value = "/showSensore", method = RequestMethod.GET)
public List<SensoriDTO> findAll(){
	List<SensoriDTO> listaSensori = this.sensoriService.getAll();
	
	return listaSensori;
}

@CrossOrigin
@RequestMapping(value = "/insertSensore", method = RequestMethod.POST)
public SensoriDTO insertSensori(@RequestParam(value="tipoSensore") String tipoSensore,
							 @RequestParam(value="specificheSensore") String specificheSensore) {
																
		SensoriDTO sensoriDTO = new SensoriDTO();
	sensoriDTO.setTipoSensore(tipoSensore);
	sensoriDTO.setSpecificheSensore(specificheSensore);
	sensoriService.insertSensori(sensoriDTO);
	return sensoriDTO;
}
@CrossOrigin
@RequestMapping(value="/updateSensore", method= RequestMethod.POST)
public SensoriDTO updateSensori (
		
		@RequestParam(value="idsensore") long idsensore,
		@RequestParam(value="tipoSensore", required=false) String tipoSensore,
		@RequestParam(value="specificheSensore", required=false) String specificheSensore) {


SensoriDTO sensoriDTO = sensoriService.getIdsensore(idsensore);
if (tipoSensore != null) {
	sensoriDTO.setTipoSensore(tipoSensore);
	}
if (specificheSensore != null) {
	sensoriDTO.setSpecificheSensore(specificheSensore);
	}

	

     	sensoriService.updateSensori(sensoriDTO);
     	return sensoriDTO;
}

@CrossOrigin
@RequestMapping(value="/deleteSensore", method = RequestMethod.POST)
public void deleteSensori(@RequestParam(value="idsensore") long idsensore) {
				sensoriService.deleteSensori(idsensore);
		
}
}