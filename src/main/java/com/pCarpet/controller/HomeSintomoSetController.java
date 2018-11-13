package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.dto.SintomoSetDTO;
import com.pCarpet.model.SintomoSet;
import com.pCarpet.services.SintomoSetService;

@Controller
@RequestMapping("/HomeSintomoSet")
public class HomeSintomoSetController {
	
	private SintomoSetService sintomosetService;
	@Autowired
	public HomeSintomoSetController(SintomoSetService sintomosetService) {
		this.sintomosetService = sintomosetService;
	}
	@RequestMapping(value= "/ShowSintomoSet", method = RequestMethod.GET)
	public String HomeSintomoSet(HttpServletRequest request, Model model) {
		List<SintomoSetDTO> listaSintomoSet = sintomosetService.getAll();
		model.addAttribute("listaSintomoSet", listaSintomoSet);
		return "sintomosetView";
	}
	@RequestMapping(value="/InsertForm", method=RequestMethod.GET)
	public String InsertForm(HttpServletRequest request) {
		return "sintomosetInsert";
	}
	@RequestMapping(value = "/insertSintomoSet", method = RequestMethod.POST)
	public String insertSintomoSet(HttpServletRequest request, Model model) {
		SintomoSetDTO sintomosetDTO = new SintomoSetDTO();
    	sintomosetDTO.setIdprimosintomo(Integer.parseInt(request.getParameter("idprimosintomo")));
		sintomosetDTO.setIdsecondosintomo(Integer.parseInt(request.getParameter("idsecondosintomo")));
		sintomosetDTO.setIdterzosintomo(Integer.parseInt(request.getParameter("idterzosintomo")));
		sintomosetService.insertSintomoSet(sintomosetDTO);
		List<SintomoSetDTO> listaSintomoSet = sintomosetService.getAll();
		model.addAttribute("listaSintomoSet", listaSintomoSet);
		return "sintomosetView";
	}
	/*@RequestMapping(value="/UpdateForm", method=RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		List<SintomoSetDTO> listaSintomoSet = sintomosetService.getAll();
		model.addAttribute("listaSinomoSet", listaSintomoSet);
		return "sintomosetUpdate";
	}
	@RequestMapping(value="/updateSintomoSet", method=RequestMethod.POST)
	public String updateSintomoSet(HttpServletRequest request, Model model) {
		long idsintomoset = Long.parseLong(request.getParameter("idsintomoset").toString());
	    List<SintomoSetDTO> listaSintomoSet = sintomosetService.getAll();
		model.addAttribute("listaSintomoSet", listaSintomoSet);
		model.addAttribute("idsintomoset", idsintomoset);
		return "updateSintomoSet";
	}
	@RequestMapping(value="/sintomosetUpdate", method=RequestMethod.POST)
	public String sintomosetUpdate(HttpServletRequest request, Model model) {
		long idsintomoset=Long.parseLong(request.getParameter("idsintomoset").toString());
		SintomoSetDTO sintomoset= sintomosetService.searchSintomoSet(idsintomoset);
		if (sintomoset == null) {
			sintomoset= new SintomoSetDTO();
			sintomoset.setIdsintomoset(idsintomoset);
		}
		
		if (request.getParameter("idprimosintomo").toString()!= "") {
			int idprimosintomo=Integer.parseInt(request.getParameter("idprimosintomo").toString());
			sintomoset.setIdprimosintomo(idprimosintomo);
		}
		
		if (request.getParameter("idsecondosintomo").toString()!= "") {
			int idsecondosintomo=Integer.parseInt(request.getParameter("idsecondosintomo").toString());
		sintomoset.setIdsecondosintomo(idsecondosintomo);
		}
		
		if (request.getParameter("idterzosintomo").toString()!= "") {
			int idterzosintomo=Integer.parseInt(request.getParameter("idterzosintomo").toString());
		sintomoset.setIdterzosintomo(idterzosintomo);
		}
		sintomosetService.sintomosetUpdate(sintomoset);
		List<SintomoSetDTO> listaSintomoSet = sintomosetService.getAll();
		model.addAttribute("listaSintomoSet", listaSintomoSet);
		return "sintomosetView";
	}
	@RequestMapping(value="/DeleteForm", method=RequestMethod.GET)
	public String deleteForm(HttpServletRequest request, Model model) {
		List<SintomoSetDTO> listaSintomoSet = sintomosetService.getAll();
		model.addAttribute("listaSinomoSet", listaSintomoSet);
		return "sintomosetDelete";
	}
	@RequestMapping(value="/deleteSintomoSet", method=RequestMethod.POST)
	public String deleteSintomoSet(HttpServletRequest request, Model model) {
		long idsintomoset = Long.parseLong(request.getParameter("idsintomoset"));
		long l=idsintomoset;
		sintomosetService.deleteSintomoSet(l);
		List<SintomoSetDTO> listaSintomoSet = sintomosetService.getAll();
		model.addAttribute("listaSintomoSet", listaSintomoSet);
        return "sintomosetView"; 
		}
	@RequestMapping(value = "/sintomosetUpdate", method = RequestMethod.GET)
	public String sintomosetUpdat(HttpServletRequest request, Model model) {
		return "sintomosetUpdate";
		}*/
	@RequestMapping(value = "/operationForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		
		List<SintomoSetDTO> listaSintomoSet3 = this.sintomosetService.getAll();
		model.addAttribute("listaSintomoSet", listaSintomoSet3);
	    String scelta= request.getParameter("scelta");
	    
	    if (scelta.equals("update")) {
	    	SintomoSetDTO s = this.sintomosetService.getIdsintomoset(Long.parseLong(request.getParameter("idsintomoset")));			
			model.addAttribute("sintomoset", s);
		    return "updateSintomoSet";
		}
	    else if(scelta.equals("delete")) {
            sintomosetService.deleteSintomoSet(Long.parseLong((request.getParameter("idsintomoset"))));			
            listaSintomoSet3 = sintomosetService.getAll();
			model.addAttribute("listaSintomoSet", listaSintomoSet3);
			return "sintomosetView";
	    }
	    
	    return "";
	
	}
	
	@RequestMapping(value = "/operationForm", method = RequestMethod.POST)
	public String sintomosetControlPost(HttpServletRequest request, Model model ) {
		
		List<SintomoSetDTO> listaSintomoSet3 = sintomosetService.getAll();
		model.addAttribute("listaSintomoSet", listaSintomoSet3);	
		String scelta=request.getParameter("scelta");

		
			switch(scelta) {
				
			case "update":
				    //System.out.println("IDSINTOMOSET: " + Integer.parseInt(request.getParameter("idsintomoset")));
				    long idsintomoset = Integer.parseInt(request.getParameter("idsintomoset"));
				    
					int idprimosintomo = Integer.parseInt(request.getParameter("idprimosintomo"));
					int idsecondosintomo = Integer.parseInt(request.getParameter("idsecondosintomo"));	
					int idterzosintomo = Integer.parseInt(request.getParameter("idterzosintomo"));
					SintomoSetDTO sdto =new SintomoSetDTO(idsintomoset,idprimosintomo,idsecondosintomo,idterzosintomo);				
					sintomosetService.insertSintomoSet(sdto);
					List<SintomoSetDTO> listaSintomoSet4 = sintomosetService.getAll();
					model.addAttribute("listaSintomoSet", listaSintomoSet4);	
					return "sintomosetView";
			}
		
	
		return "sintomosetView";
	}
	
	
	@RequestMapping(value = "/returnHomeSintomoSet", method = RequestMethod.GET)
	public String returnControl(HttpServletRequest request) {
		return "homeSintomoSet";
	}
	
	@RequestMapping(value = "/returnHomeDoctor", method = RequestMethod.GET)
	public String returnTwoControl(HttpServletRequest request) {
		return "homeDoctor";
	}
}
