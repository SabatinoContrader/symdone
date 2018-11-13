package com.pCarpet.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.pCarpet.dao.ErbaDAO;
import com.pCarpet.dto.ErbaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Erba;
import com.pCarpet.model.Sintomo;
import com.pCarpet.services.ErbaService;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/HomeErbaC")
public class HomeErbaController {

	private ErbaService erbaService;
	private ErbaDAO erbaDAO;
	

	@Autowired
	public HomeErbaController(ErbaService erbaService) {
		this.erbaService = erbaService;
	}

	@RequestMapping(value = "/ShowErba", method = RequestMethod.GET)
	public String HomeErbaC(HttpServletRequest request, Model model) {
		List<ErbaDTO> listaErba = this.erbaService.getAll();
		model.addAttribute("listaErba", listaErba);
		return "erbaView";

	}

	@RequestMapping(value = "/insertForm", method = RequestMethod.GET)
	public String insertForm(HttpServletRequest request) {
		return "insertErba";
	}

	@RequestMapping(value = "/insertErba", method = RequestMethod.POST)
	public String insert(HttpServletRequest request, Model model) {
		ErbaDTO erba = new ErbaDTO();
		erba.setErba(request.getParameter("erba"));
		erba.setDescrizione(request.getParameter("descrizione"));
		erbaService.insertErba(erba);
		List<ErbaDTO> listaErba = erbaService.getAll();
		model.addAttribute("listaErba", listaErba);
		return "erbaView";
	}
	
	@RequestMapping(value = "/operationForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		
		List<ErbaDTO> listaErba = this.erbaService.getAll();
		model.addAttribute("listaErba", listaErba);
	    String scelta= request.getParameter("scelta");
	   
	    if (scelta.equals("update")) {
	    	ErbaDTO erba = this.erbaService.getErbaID(Integer.parseInt(request.getParameter("id")))	;		
			model.addAttribute("erba", erba);
		    return "updateErba";
		}
	    else if(scelta.equals("delete")) {
            erbaService.deleteErba(Long.parseLong((request.getParameter("id"))));			
            listaErba = erbaService.getAll();
			model.addAttribute("listaErba", listaErba);
			return "erbaView";
	    }
            
	    return "";
	
	}
	
	@RequestMapping(value = "/operationForm", method = RequestMethod.POST)
	public String erbaControlPost(HttpServletRequest request, Model model ) {
		
		List<ErbaDTO> listaErba2= erbaService.getAll();
		model.addAttribute("listaErba", listaErba2);	
		String scelta=request.getParameter("scelta");
	
		
			switch(scelta) {
				
			case "update":
				long iderba = Integer.parseInt(request.getParameter("id"));
					String erba = request.getParameter("erba");
					String descrizione = request.getParameter("descrizione");
					ErbaDTO ErbaDTO =new ErbaDTO(iderba,erba,descrizione);				
					erbaService.insertErba(ErbaDTO);
					List<ErbaDTO> listaErba3 = erbaService.getAll();
					model.addAttribute("listaErba", listaErba3);	
					return "erbaView";
			}
		
	
		return "erbaView";
	}
	

	
}