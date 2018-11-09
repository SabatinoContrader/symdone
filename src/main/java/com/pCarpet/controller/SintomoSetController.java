package com.pCarpet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.services.SintomoSetService;

@Controller
@RequestMapping("/HomeSintomoSet")
public class SintomoSetController {
	
	private SintomoSetService sintomosetService;
	@Autowired
	public SintomoSetController(SintomoSetService sintomosetService) {
		this.sintomosetService = sintomosetService;
	}
	@RequestMapping(value="/insertForm", method=RequestMethod.GET)
	public String insertForm(HttpServletRequest request) {
		return "insertSintomoSet";
	}

}
