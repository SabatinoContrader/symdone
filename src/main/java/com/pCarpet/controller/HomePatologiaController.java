package com.pCarpet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.PatologiaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.services.PatologiaService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
@Controller
@RequestMapping("/HomePatologia")
public class HomePatologiaController {
	
	private PatologiaService patologiaService;
	@Autowired
	public HomePatologiaController(PatologiaService patologiaService) {
		this.patologiaService = patologiaService;
	}
	
	@RequestMapping(value = "/ShowPatologia", method = RequestMethod.GET)
	public String HomePatologia(HttpServletRequest request, Model model) {
		List<PatologiaDTO> listaPatologia = patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia);
		return "patologiaView";
	}
	
	@RequestMapping(value = "/InsertForm", method = RequestMethod.GET)
	public String InsertForm(HttpServletRequest request) {
		return "patologiaInsert";
	}
	@RequestMapping(value = "/InsertPatologia", method = RequestMethod.POST)
	public String InsertPatologia(HttpServletRequest request, Model model) {
		PatologiaDTO patologiaDTO = new PatologiaDTO();
		patologiaDTO.setPatologia(request.getParameter("patologia"));
		patologiaDTO.setDescrizione(request.getParameter("descrizione"));
		patologiaService.insertPatologia(patologiaDTO);
		List<PatologiaDTO> listaPatologia = patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia);
		return "patologiaView";
	}
	@RequestMapping(value="/DeleteForm", method=RequestMethod.GET)
	public String DeleteForm(HttpServletRequest request, Model model) {
		List<PatologiaDTO> listaPatologia = patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia);
		return "patologiaDelete";
	} 
	@RequestMapping(value="/DeletePatologia", method=RequestMethod.POST)
	public String DeletePatologia(HttpServletRequest request, Model model) {
		long idpatologia = Long.parseLong(request.getParameter("idpatologia"));
		patologiaService.deletePatologia(idpatologia);
		List<PatologiaDTO> listaPatologia = patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia);
		return "patologiaView";		
	} 
	@RequestMapping(value="/UpdateForm", method= RequestMethod.GET)
	public String UpdateForm(HttpServletRequest request, Model model) {
		List<PatologiaDTO> listaPatologia = patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia);
		return "patologiaUpdate";		
	}
	@RequestMapping(value="/UpdatePatologia", method= RequestMethod.POST)
	public String UpdatePatologia(HttpServletRequest request,Model model) {
		long idpatologia=Long.parseLong(request.getParameter("idpatologia").toString());
		model.addAttribute("idpatologia", idpatologia);
		PatologiaDTO patologiaDTO = new PatologiaDTO();
		patologiaDTO.setIdpatologia(Long.parseLong(request.getParameter("idpatologia").toString()));
		patologiaDTO.setPatologia(request.getParameter("patologia"));
		patologiaDTO.setDescrizione(request.getParameter("descrizione"));
		patologiaService.updatePatologia(patologiaDTO);
		List<PatologiaDTO> listaPatologia = patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia);
		return "patologiaView";
				
	}



}