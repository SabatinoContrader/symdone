package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Patologia;
import com.pCarpet.model.Sintomo;
import com.pCarpet.services.SintomoService;

@Controller
@RequestMapping("/HomeSearchSintomo")
public class HomeRicercaController {
	
	private SintomoService sintomoService;
	private List<SintomoDTO> searchListSintomi;
	private List<Patologia> listaDisease;
	//private List<Medico> listaMedici;

	@Autowired
	public HomeRicercaController (SintomoService sintomoService) {
		this.sintomoService =  sintomoService;
	}
	
	@RequestMapping(value = "/operationSearchForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		
		List<SintomoDTO> listaSintomo2 = this.sintomoService.getAll();
		model.addAttribute("listaSintomo", listaSintomo2);
	    String scelta= request.getParameter("scelta");
	    
	    switch(scelta) {
		
		case "updateView":
			listaSintomo2 = sintomoService.getAll();
			model.addAttribute("listaSintomo", listaSintomo2);
			return "ricercaPatologie";
			
		case "searchPatologia":
			long idsintomo = Integer.parseInt(request.getParameter("idRicerca"));
			System.out.println("ID: " + idsintomo );
			searchListSintomi = sintomoService.getListaPatologia(idsintomo);
			model.addAttribute("listaSintomo", searchListSintomi);
			//request.setAttribute("conta", count);
			return "ricercaPatologie";
			
		case "result":
			long idresultSintomo = Integer.parseInt(request.getParameter("idRicerca"));
			//listaDisease = sintomoService.getListDisease(idresultSintomo);
			//request.setAttribute("listaDisease", listaDisease);
			//listaMedici = medicoService.getListMedici(id1);
			//request.setAttribute("allDoctor", listaMedici);
			return "";
		}
	    
	    
	    
	    return "";
	
	}
}
