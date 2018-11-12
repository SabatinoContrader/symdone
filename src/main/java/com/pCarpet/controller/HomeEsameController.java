package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.EsameDTO;
import com.pCarpet.services.EsameService;

@Controller
@RequestMapping("/HomeEsame")
public class HomeEsameController {
	
	private EsameService esameService;
	
	@Autowired
	public HomeEsameController (EsameService esameService) {
		this.esameService =  esameService;
	}
	
	@RequestMapping(value = "/ShowEsame", method = RequestMethod.GET)
	public String HomeEsame(HttpServletRequest request, Model model) {
		List<EsameDTO> listaEsame = esameService.getAll();
		model.addAttribute("listaEsame", listaEsame);
		return "esameView";
	}
	
	@RequestMapping(value="/insertForm", method=RequestMethod.GET)
	public String insertForm(HttpServletRequest request) {
		return "insertEsame";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(HttpServletRequest request, Model model) {
		EsameDTO esameDTO = new EsameDTO();
		esameDTO.setEsame(request.getParameter("esame"));
		esameDTO.setDescrizione(request.getParameter("descrizione"));
		esameService.insertEsame(esameDTO);
		
		List<EsameDTO> listaEsame = esameService.getAll();
		model.addAttribute("listaEsame", listaEsame);
		return "esameView";
	} 
	
	@RequestMapping(value="/deleteForm", method=RequestMethod.GET)
	public String deleteForm(HttpServletRequest request, Model model) {
		List<EsameDTO> listaEsame = esameService.getAll();
		model.addAttribute("listaEsame", listaEsame);
		return "deleteEsame";
	}
	
	@RequestMapping(value="/deleteEsame", method=RequestMethod.POST)
		public String deleteEsame(HttpServletRequest request, Model model) {
		Long idesame = Long.parseLong(request.getParameter("idesame"));
		esameService.deleteEsame(idesame);
		return "esameView";
	} 
	
	@RequestMapping(value="/updateForm", method=RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		List<EsameDTO> listaEsame = esameService.getAll();
		model.addAttribute("listaEsame", listaEsame);
		return "updateEsame";
	}
	
	@RequestMapping(value="/updateEsame", method=RequestMethod.POST)
		public String updateEsame(HttpServletRequest request, Model model) {
		Long idesame = Long.parseLong(request.getParameter("idesame").toString());
		model.addAttribute("idesame", idesame);
		EsameDTO esameDTO = new EsameDTO();
		esameDTO.setIdesame(Long.parseLong(request.getParameter("idesame").toString()));
		esameDTO.setEsame(request.getParameter("esame"));
		esameDTO.setDescrizione(request.getParameter("descrizione"));
		esameService.updateEsame(esameDTO);
		return "esameView";
	} 
	
}
