package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dao.SintomoDAO;
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
	
}
