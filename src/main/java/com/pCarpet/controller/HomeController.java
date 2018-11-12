package com.pCarpet.controller;


import com.pCarpet.model.User;
import com.pCarpet.services.UserService;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/Home")
public class HomeController {

	private UserService userService;

	@Autowired
	public HomeController(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value = "/homeSintomo", method = RequestMethod.GET)
	public String HomeSintomo(HttpServletRequest request, Model model) {
		return "homeSintomo";
	}
	@RequestMapping(value = "/homePatologia", method = RequestMethod.GET)
	public String HomePatologia(HttpServletRequest request, Model model) {
		return "homePatologia";
		}
	

	@RequestMapping(value = "/homeSintomoSet", method = RequestMethod.GET)
	public String HomeSintomoSet(HttpServletRequest request, Model model) {
		return "homeSintomoSet";
	}


	@RequestMapping(value = "/homeEsame", method = RequestMethod.GET)
	public String HomeEsame(HttpServletRequest request, Model model) {
		return "homeEsame";
	}
	

	@RequestMapping(value = "/homeErba", method = RequestMethod.GET)
	public String HomeErba(HttpServletRequest request, Model model) {
		return "homeErba";
	}
	
	@RequestMapping(value = "/homeDoctor", method = RequestMethod.GET)
	public String HomeDoc(HttpServletRequest request, Model model) {
		return "homeDoctor";
	}
	

}