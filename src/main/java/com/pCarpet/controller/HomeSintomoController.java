package com.pCarpet.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pCarpet.dao.SintomoDAO;

import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Sintomo;
import com.pCarpet.services.SintomoService;


@RestController
@CrossOrigin
@RequestMapping("/HomeSintomo")
public class HomeSintomoController {
	
	private SintomoService sintomoService;


	@Autowired
	public HomeSintomoController (SintomoService sintomoService) {
		this.sintomoService =  sintomoService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/ShowSintomo", method = RequestMethod.GET)
	public List<SintomoDTO> getAll(){
		List<SintomoDTO> sintomo = sintomoService.getAll();
		return sintomo;
	}
	
	/*@RequestMapping(value = "/insertForm", method = RequestMethod.GET)
	public String insertForm(HttpServletRequest request, Model model) {
		return "insertSintomo";
	}*/
	
	@RequestMapping(value = "/insertSintomo", method = RequestMethod.POST)
	@CrossOrigin
	public  SintomoDTO  newSintomo(
		@RequestParam(value="nomeSintomo") String nomeSintomo) {
		
		SintomoDTO sintomoDTO = new SintomoDTO();
		sintomoDTO.setNomeSintomo(nomeSintomo);
		sintomoService.insertSintomo(sintomoDTO);
		return sintomoDTO;
	}
		 List<SintomoDTO> getAll1(){
		List<SintomoDTO> sintomo = sintomoService.getAll();
		return sintomo;
}
		 @CrossOrigin
			@RequestMapping(value="/delete", method = RequestMethod.GET)
			public boolean delete(@RequestParam(value="id") long id) {
				sintomoService.deleteSintomo(id);
				return true;
				
		 }
				
		 @CrossOrigin
		 @RequestMapping (value ="/update", method= RequestMethod.POST)
		 public SintomoDTO updateSintomo (
				 @RequestParam(value = "id") long id,
				 @RequestParam(value="nomeSintomo") String nomeSintomo) {
			 SintomoDTO sintomoDTO = sintomoService.findById(id);
			 sintomoDTO.setNomeSintomo(nomeSintomo);
			 sintomoService.update(sintomoDTO);
			return sintomoDTO ; 
		 }
		 
		 
		 
		 /*@RequestMapping(value = "/operationForm", method = RequestMethod.GET)
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
	}*/
	
	
	@RequestMapping(value = "/returnHomeSintomo", method = RequestMethod.GET)
	public String returnControl(HttpServletRequest request) {
		return "homeSintomo";
	}
	
	@RequestMapping(value = "/returnHomeDoctor", method = RequestMethod.GET)
	public String returnTwoControl(HttpServletRequest request) {
		return "homeDoctor";
	}
}
