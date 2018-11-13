package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dao.MedicoDAO;
import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.services.MedicoService;

@Controller
@RequestMapping("/HomeMedico")
public class HomeMedicoController {
	
	private MedicoService medicoService;

	@Autowired
	public HomeMedicoController (MedicoService medicoService) {
		this.medicoService =  medicoService;
	}
	
	@RequestMapping(value = "/ShowMedico", method = RequestMethod.GET)
	public String HomeMedicoGet (HttpServletRequest request, Model model) {
		List<MedicoDTO> listaMedico = medicoService.getAll();
		model.addAttribute("listaMedico", listaMedico);
		
		String scelta=request.getParameter("scelta");
		
		if (scelta!=null)
		{
			switch(scelta)
			{
				case "visualizza":
					return "medicoView";
			
				case "inserisci":
					return "insertMedico";
				
				case "indietroMain":
					return "homeAdmin";
					
				case "update":
					return "medicoView";	
					
				case "delete":
					return "medicoView"; 
			}
		}
		return "homeMedico";
	}
	
	@RequestMapping(value = "/indietroMedico", method = RequestMethod.GET)
	public String IndietroMedico (HttpServletRequest request) {
		return "homeMedico";
	}
	
	@RequestMapping(value = "/insertMedico", method = RequestMethod.GET)
	public String InsertMedico (HttpServletRequest request, Model model) {	
		
		//MedicoDTO medico= new MedicoDTO();
		String nome=request.getParameter("nome");
		String cognome=request.getParameter("cognome");					
		String specializzazione=request.getParameter("specializzazione");
		String indirizzo=request.getParameter("indirizzo");
		String mail=request.getParameter("mail");
		MedicoDTO m=new MedicoDTO(0,nome,cognome,specializzazione,indirizzo, mail);
		medicoService.insertMed(m);
		
		List<MedicoDTO> listaMedico2 = medicoService.getAll();
		
		model.addAttribute("listaMedico", listaMedico2);
		return "medicoView";
		}
	
	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public String UpdateForm (HttpServletRequest request, Model model) {
		
		List<MedicoDTO> listaMedico3 = medicoService.getAll();
		model.addAttribute("listaMedico", listaMedico3);
		MedicoDTO m= this.medicoService.getMedicoID(Integer.parseInt(request.getParameter("id")));
		model.addAttribute("medico", m);
		return "updateMedico";
	}
	
	@RequestMapping(value = "/updateMedico", method = RequestMethod.POST)
	public String UpdateMedico (HttpServletRequest request, Model model) {
		
		List<MedicoDTO> listaMedico3 = medicoService.getAll();
		model.addAttribute("listaMedico", listaMedico3);
		long idMed=Long.parseLong(request.getParameter("id"));
		String nome=request.getParameter("nome");
		String cognome=request.getParameter("cognome");					
		String specializzazione=request.getParameter("specializzazione");
		String indirizzo=request.getParameter("indirizzo");
		String mail=request.getParameter("mail");
		
		MedicoDTO m=new MedicoDTO(idMed,nome,cognome,specializzazione,indirizzo, mail);
		medicoService.insertMed(m);
		List<MedicoDTO> listaMedico4 = medicoService.getAll();
		model.addAttribute("listaMedico", listaMedico4);
		return "medicoView";
	}
	
	@RequestMapping(value = "/deleteMedico", method = RequestMethod.GET)
	public String DeleteMedico (HttpServletRequest request, Model model) {
		
		List<MedicoDTO> listaMedico4 = medicoService.getAll();
		model.addAttribute("listaMedico", listaMedico4);
		medicoService.deleteMedico(Long.parseLong(request.getParameter("id")));
		listaMedico4= medicoService.getAll();
		model.addAttribute("listaMedico", listaMedico4);
		return "medicoView";
	}
}	
