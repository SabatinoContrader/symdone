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
					
				case "indietroMedico":
					return "homeMedico";
					
				case "update":
					return "homeAdmin";	//cambiare
					
				case "delete":
					return "homeAdmin";  //cambiare
			}
		}
		return "homeMedico";
	}
	
	
	@RequestMapping(value = "/showMedico", method = RequestMethod.POST)
	public String HomeMedicoPost (HttpServletRequest request, Model model) {
		List<MedicoDTO> listaMedico = medicoService.getAll();
		model.addAttribute("listaMedico", listaMedico);
		
		String scelta=request.getParameter("scelta");
		
	
		if(scelta != null) {
			switch(scelta) {
				case "insert":
					String nome=request.getParameter("nome");
					String cognome=request.getParameter("cognome");					
					String specializzazione=request.getParameter("specializzazione");
					String indirizzo=request.getParameter("indirizzo");
					String mail=request.getParameter("mail");
					MedicoDTO m=new MedicoDTO(0,nome,cognome,specializzazione,indirizzo, mail);
					
					medicoService.insertMed(m);
					listaMedico = medicoService.getAll();
					model.addAttribute("medico", listaMedico);
					return "medicoView";
					
				case "update":
					long idm=Integer.parseInt(request.getParameter("id"));
					String usernamem=request.getParameter("username");
					String passwordm=request.getParameter("password");
					String ruolom=request.getParameter("ruolo");
					UserDTO um=new UserDTO(idm,usernamem,passwordm,0,ruolom);
					
					userService.insertUser(um);
					users = userService.getAllUsers();
					model.addAttribute("users", users);
					return "managementUser";
			}
		}
	
		return "managementUser";
	}
	
}
