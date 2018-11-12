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
import com.pCarpet.model.Erba;
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

	@RequestMapping(value = "/deleteForm", method = RequestMethod.GET)
	public String deleteForm(HttpServletRequest request, Model model) {
		List<ErbaDTO> listaErba = this.erbaService.getAll();
		model.addAttribute("listaErba", listaErba);
		return "deleteErba";

	}
	
	@RequestMapping(value = "/deleteErba", method = RequestMethod.POST)
	public String deleteErba(HttpServletRequest request, Model model) {
		
		Long iderba = Long.parseLong(request.getParameter("iderba"));
		erbaService.deleteErba(iderba);
		List<ErbaDTO>listaErba = erbaService.getAll();
		model.addAttribute("listaErba", listaErba);
		return "erbaView";
		
	}
	
	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		List<ErbaDTO> listaErba = this.erbaService.getAll();
		model.addAttribute("listaErba", listaErba);
		return "updateErba";

	}
	
	@RequestMapping(value = "/updateErba", method = RequestMethod.POST)
	public String updateErba(HttpServletRequest request, Model model) {
		
		Long iderba = Long.parseLong(request.getParameter("iderba").toString());
		model.addAttribute("iderba", iderba);
		ErbaDTO erbaDTO = new ErbaDTO();
		erbaDTO.setIderba(Long.parseLong(request.getParameter("iderba").toString()));
		erbaDTO.setErba(request.getParameter("erba"));
		erbaDTO.setDescrizione(request.getParameter("descrizione"));
		erbaService.updateErba(erbaDTO);
		List<ErbaDTO> listaErba = this.erbaService.getAll();
		model.addAttribute("listaErba", listaErba);
		return "erbaView";
		
	}
	
	
	
	

}