package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.dto.PatologiaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Medico;
import com.pCarpet.model.Patologia;
import com.pCarpet.model.Sintomo;
import com.pCarpet.services.MedicoService;
import com.pCarpet.services.PatologiaService;
import com.pCarpet.services.SintomoService;

@Controller
@RequestMapping("/HomeSearchSintomo")
public class HomeRicercaController {
	
	private SintomoService sintomoService;
	private PatologiaService patologiaService;
	private MedicoService medicoService;
	private List<SintomoDTO> searchListSintomi;
	private List<PatologiaDTO> listaPatologia;
	private List<MedicoDTO> listaMedici;
	private int count=0;
	private long idsintomo = 0;

	@Autowired
	public HomeRicercaController (SintomoService sintomoService, PatologiaService patologiaService, MedicoService medicoService) {
		this.sintomoService =  sintomoService;
		this.patologiaService =  patologiaService;
		this.medicoService = medicoService;
	}
	
	@RequestMapping(value = "/operationSearchForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		
		List<SintomoDTO> listaSintomo2 = this.sintomoService.getAll();
		model.addAttribute("listaSintomo", listaSintomo2);
	    String scelta= request.getParameter("scelta");
	    System.out.println("SCELTA: " + scelta);
	    
	    switch(scelta) {
		
		case "updateView":
			listaSintomo2 = sintomoService.getAll();
			model.addAttribute("listaSintomo", listaSintomo2);
			return "ricercaPatologie";
			
		case "searchPatologia":
			count += 1;
			idsintomo = Integer.parseInt(request.getParameter("idRicerca"));
			System.out.println("IDSP: " + idsintomo);
			searchListSintomi = sintomoService.getListaPatologia(idsintomo);
			model.addAttribute("listaSintomo", searchListSintomi);
			return "ricercaPatologie";
			
		case "result":
			if(count == 1) {
				listaPatologia = patologiaService.getListaResultPatologia(idsintomo);
				model.addAttribute("listaPatologia", listaPatologia);
				listaMedici = medicoService.getListaResultMedici(idsintomo);
				model.addAttribute("listaMedici", listaMedici);
				count = 0;
				idsintomo = 0;
				return "resultSearch";
			}
			else if(count == 2) {
				
				count = 0;
			}
			return "";
		}
	    
	    
	    
	    return "";
	
	}
}
