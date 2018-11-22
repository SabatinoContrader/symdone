package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.pCarpet.dao.MedicoDAO;
import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.services.MedicoService;

@RestController
@CrossOrigin
@RequestMapping("/HomeMedico")
public class HomeMedicoController {
	
	private MedicoService medicoService;

	@Autowired
	public HomeMedicoController (MedicoService medicoService) {
		this.medicoService =  medicoService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/ShowMedico", method = RequestMethod.GET)
	public List<MedicoDTO> HomeMedicoGet () {
		List<MedicoDTO> listaMedico = medicoService.getAll();
		return listaMedico;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public MedicoDTO UpdateForm (String id) {
		
		MedicoDTO m= this.medicoService.getMedicoID(Integer.parseInt(id));
		return m;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/updateMedico", method = RequestMethod.POST)
	public MedicoDTO UpdateMedico (
			@RequestParam (value="idMedico") long id,
			@RequestParam (value="nomeMedico") String nome,
			@RequestParam (value="cognomeMedico") String cognome,
			@RequestParam (value="specializzazioneMedico") String specializzazione,
			@RequestParam (value="indirizzoMedico") String indirizzo,
			@RequestParam (value="mailMedico") String mail) {
		
		MedicoDTO medicoDTO=medicoService.getMedicoID(id);
		medicoDTO.setNome(nome);
		medicoDTO.setCognome(cognome);
		medicoDTO.setSpecializzazione(specializzazione);
		medicoDTO.setIndirizzo(indirizzo);
		medicoDTO.setMail(mail);
		medicoService.updateMedico(medicoDTO);
		return medicoDTO;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/insertMedico", method = RequestMethod.POST)
	public MedicoDTO InsertMedico (
			@RequestParam (value="nomeMedico") String nome,
			@RequestParam (value="cognomeMedico") String cognome,
			@RequestParam (value="specializzazioneMedico") String specializzazione,
			@RequestParam (value="indirizzoMedico") String indirizzo,
			@RequestParam (value="mailMedico") String mail) {	
		
		MedicoDTO medicoDTO= new MedicoDTO();
		medicoDTO.setNome(nome);
		medicoDTO.setCognome(cognome);
		medicoDTO.setSpecializzazione(specializzazione);
		medicoDTO.setIndirizzo(indirizzo);
		medicoDTO.setMail(mail);
		//MedicoDTO m=new MedicoDTO(0,nome,cognome,specializzazione,indirizzo, mail);
		medicoService.insertMed(medicoDTO);
		
		//List<MedicoDTO> listaMedico2 = medicoService.getAll();
		
		//model.addAttribute("listaMedico", listaMedico2);
		return medicoDTO;
		}
	
	
	
	@RequestMapping(value = "/deleteMedico", method = RequestMethod.GET)
	public boolean DeleteMedico (String id) {
		
		//List<MedicoDTO> listaMedico4 = medicoService.getAll();
		//model.addAttribute("listaMedico", listaMedico4);
		medicoService.deleteMedico(Long.parseLong(id));
		//listaMedico4= medicoService.getAll();
		//model.addAttribute("listaMedico", listaMedico4);
		return true;
	}
}	
