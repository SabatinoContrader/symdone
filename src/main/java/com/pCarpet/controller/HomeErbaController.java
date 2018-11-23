package com.pCarpet.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pCarpet.dao.ErbaDAO;
import com.pCarpet.dto.ErbaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Erba;
import com.pCarpet.model.Sintomo;
import com.pCarpet.services.ErbaService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin
@RequestMapping("/HomeErbaC")
public class HomeErbaController {

	private ErbaService erbaService;
	private ErbaDAO erbaDAO;
	

	@Autowired
	public HomeErbaController(ErbaService erbaService) {
		this.erbaService = erbaService;
	}
	@CrossOrigin
	@RequestMapping(value = "/ShowErba", method = RequestMethod.GET)
	public List<ErbaDTO> findAll(){
								  
		
		List<ErbaDTO> listaErba = this.erbaService.getAll();
		
		return listaErba;

	}
	/*@CrossOrigin
	@RequestMapping(value = "/insertForm", method = RequestMethod.GET)
	public String insertForm(HttpServletRequest request) {
		return "insertErba";
	}*/
	@CrossOrigin
	@RequestMapping(value = "/insertErba", method = RequestMethod.POST)
	public ErbaDTO insertErba(@RequestParam(value="descrizione")String descrizione,
								 @RequestParam(value="erba")String erba) {
		System.out.println("DESCRIZIONE:"+descrizione);
		System.out.println("ERBA:"+erba);
		ErbaDTO erbaDTO = new ErbaDTO();
		erbaDTO.setErba(erba);
		erbaDTO.setDescrizione(descrizione);
		erbaService.insertErba(erbaDTO);
		//List<ErbaDTO> listaErba = erbaService.getAll();
		
		return erbaDTO;
	}
	
	@CrossOrigin
	@RequestMapping(value="/updateErba", method= RequestMethod.POST)
	public ErbaDTO updateErba (
			
			@RequestParam(value="iderba") long iderba,
			@RequestParam(value="erba", required=false) String erba,
			@RequestParam(value="descrizione", required=false)String descrizione) {


	ErbaDTO erbaDTO = erbaService.getErbaID(iderba);
	if (erba != null) {
		erbaDTO.setErba(erba);
		}
		if (descrizione != null) {
		erbaDTO.setDescrizione(descrizione);
		}
	
	erbaService.updateErba(erbaDTO);
	return erbaDTO;
	}
	
	
	@CrossOrigin
	@RequestMapping(value="/deleteErba", method = RequestMethod.POST)
	public void delete(@RequestParam(value="iderba") long iderba) {
					erbaService.deleteErba(iderba);
			
	}
	
	
}