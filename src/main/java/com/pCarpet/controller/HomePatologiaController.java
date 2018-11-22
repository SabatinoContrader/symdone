package com.pCarpet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pCarpet.dto.PatologiaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.services.PatologiaService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin
@RequestMapping("/HomePatologia")
public class HomePatologiaController {
	
	private PatologiaService patologiaService;
	
	@Autowired
	public HomePatologiaController(PatologiaService patologiaService) {
		this.patologiaService = patologiaService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/ShowPatologia", method = RequestMethod.GET)
	public List<PatologiaDTO> getAll(){
		List<PatologiaDTO> patologia = patologiaService.getAll();
		return patologia;
	}
	
	
	@RequestMapping(value = "/InsertPatologia", method = RequestMethod.POST)
	@CrossOrigin
	public PatologiaDTO newPatologia(
			@RequestParam(value="patologia") String patologia,
			@RequestParam(value="descrizione") String descrizione) {
		PatologiaDTO patologiaDTO = new PatologiaDTO();
		patologiaDTO.setPatologia(patologia);
		patologiaDTO.setDescrizione(descrizione);
		patologiaDTO = patologiaService.insertPatologia(patologiaDTO);
		return patologiaDTO;
	}
		 List<PatologiaDTO> getAll2(){
		List<PatologiaDTO> patologia = patologiaService.getAll();
		return patologia;
	}
		 @CrossOrigin
			@RequestMapping(value="/delete", method = RequestMethod.GET)
			public boolean delete(@RequestParam(value="idpatologia") long idpatologia) {
				patologiaService.deletePatologia(idpatologia);
				return true;
				
			}
		 
		 @CrossOrigin
			@RequestMapping(value="/update", method = RequestMethod.POST)
		 public PatologiaDTO updatePatologia(
				 @RequestParam(value= "idpatologia") long idpatologia,
				 	@RequestParam(value= "patologia") String patologia,
				 	@RequestParam(value= "descrizione") String descrizione) {
			 PatologiaDTO patologiaDTO = patologiaService.findById(idpatologia);
			 patologiaDTO.setPatologia(patologia);
			 patologiaDTO.setDescrizione(descrizione);
			 patologiaService.updatePatologia(patologiaDTO);
			return patologiaDTO;
		 }
	/*@RequestMapping(value = "/operationForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		
		List<PatologiaDTO> listaPatologia = this.patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia);
	    String scelta= request.getParameter("scelta");
	    
	    if (scelta.equals("update")) {
	    	PatologiaDTO p = this.patologiaService.getIdpatologia(Long.parseLong(request.getParameter("idpatologia")));			
			model.addAttribute("patologia", p);
		    return "patologiaUpdate";
		}
	    else if(scelta.equals("delete")) {
            patologiaService.deletePatologia(Long.parseLong((request.getParameter("idpatologia"))));			
            listaPatologia = patologiaService.getAll();
			model.addAttribute("listaPatologia", listaPatologia);
			return "patologiaView";
	    }
	    
	    return "";
	
	}
	
	@RequestMapping(value = "/operationForm", method = RequestMethod.POST)
	public String patologiaControlPost(HttpServletRequest request, Model model ) {
		
		List<PatologiaDTO> listaPatologia = patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia);	
		String scelta=request.getParameter("scelta");
	
		
			switch(scelta) {
				
			case "update":
				long idpatologia=Long.parseLong(request.getParameter("idpatologia"));
				String patologia= request.getParameter("patologia");
				String descrizione= request.getParameter("descrizione");
				PatologiaDTO patologiaDTO = new PatologiaDTO(idpatologia,patologia,descrizione);
				patologiaService.insertPatologia(patologiaDTO);
				List<PatologiaDTO> listaPatologia1 = patologiaService.getAll();
				model.addAttribute("listaPatologia", listaPatologia1);
				return "patologiaView";
			}
		
	
		return "patologiaView";
	}
	*/
	
	@RequestMapping(value = "/returnHomePatologia", method = RequestMethod.GET)
	public String returnControl(HttpServletRequest request) {
		return "homePatologia";
	}
	
	@RequestMapping(value = "/returnHomeDoctor", method = RequestMethod.GET)
	public String returnTwoControl(HttpServletRequest request) {
		return "homeDoctor";
	}


}