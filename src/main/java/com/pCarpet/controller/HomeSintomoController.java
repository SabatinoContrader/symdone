package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dao.SintomoDAO;
import com.pCarpet.dto.AssetDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.services.SintomoService;

@Controller
@RequestMapping("/HomeSintomo")
public class HomeSintomoController {
	
	private SintomoService sintomoService;

	@Autowired
	public HomeSintomoController (SintomoService sintomoService) {
		this.sintomoService =  sintomoService;
	}
	
	@RequestMapping(value = "/ShowSintomo", method = RequestMethod.GET)
	public String HomeSintomo(HttpServletRequest request, Model model) {
		List<SintomoDTO> listaSintomo = sintomoService.getAll();
		model.addAttribute("listaSintomo", listaSintomo);
		return "sintomoView";
	}
	
	@RequestMapping(value = "/insertForm", method = RequestMethod.GET)
	public String insertForm(HttpServletRequest request, Model model) {
		return "insertSintomo";
	}
	
	@RequestMapping(value = "/insertSintomo", method = RequestMethod.GET)
	public String insertSintomo(HttpServletRequest request, Model model) {
		SintomoDTO sintomo = new SintomoDTO();
		sintomo.setNomeSintomo(request.getParameter("nome"));
		sintomoService.insertSintomo(sintomo);
		List<SintomoDTO> listaSintomo2 = sintomoService.getAll();
		model.addAttribute("listaSintomo", listaSintomo2);
		return "sintomoView";
	}
	
	@RequestMapping(value = "/operationForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		
		List<SintomoDTO> listaSintomo3 = this.sintomoService.getAll();
		model.addAttribute("listaSintomo", listaSintomo3);
	    String scelta= request.getParameter("scelta");
	    
	    if (scelta.equals("update")) {
	    	SintomoDTO s = this.sintomoService.getSintomoID(Integer.parseInt(request.getParameter("id")));			
			model.addAttribute("sintomo", s);
		    return "updateSintomo";
		}
	    else if(scelta.equals("delete")) {
            sintomoService.deleteSintomo(Long.parseLong((request.getParameter("id"))));			
            listaSintomo3 = sintomoService.getAll();
			model.addAttribute("listaSintomo", listaSintomo3);
			return "sintomoView";
	    }
	    
	    return "";
	
	}
	
	@RequestMapping(value = "/operationForm", method = RequestMethod.POST)
	public String sintomoControlPost(HttpServletRequest request, Model model ) {
		
		List<SintomoDTO> listaSintomo3 = sintomoService.getAll();
		model.addAttribute("listaSintomo", listaSintomo3);	
		String scelta=request.getParameter("scelta");
	
		
			switch(scelta) {
				
			case "update":
				long idsintomo = Integer.parseInt(request.getParameter("id"));
					String nomeSintomo =request.getParameter("nome");
					SintomoDTO sdto =new SintomoDTO(idsintomo,nomeSintomo);				
					sintomoService.insertSintomo(sdto);
					List<SintomoDTO> listaSintomo4 = sintomoService.getAll();
					model.addAttribute("listaSintomo", listaSintomo4);	
					return "sintomoView";
			}
		
	
		return "sintomoView";
	}
	
	
	@RequestMapping(value = "/returnHomeSintomo", method = RequestMethod.GET)
	public String returnControl(HttpServletRequest request) {
		return "homeSintomo";
	}
	
	@RequestMapping(value = "/returnHomeDoctor", method = RequestMethod.GET)
	public String returnTwoControl(HttpServletRequest request) {
		return "homeDoctor";
	}
}
