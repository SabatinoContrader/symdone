package com.pCarpet.controller;

//import com.google.gson.JsonObject;
import com.pCarpet.dto.AbbonamentoDTO;
import com.pCarpet.dto.AssetDTO;
import com.pCarpet.dto.StatoDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.services.AbbonamentoService;
import com.pCarpet.services.AssetService;
import com.pCarpet.services.StatoService;
import com.pCarpet.services.UserService;

//import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@Controller
@RequestMapping("/Login")
public class LoginController {

	private UserService userService;
	private UserDTO user;
	private HttpSession session;
	private AbbonamentoService abbonamentoservice;
	private StatoService statoService;
	private AssetService assetService;
	
	@Autowired
	public LoginController(UserService userService, AbbonamentoService abs,AssetService assetService, StatoService statoService) {
		this.userService = userService;
		this.abbonamentoservice=abs;
		this.statoService=statoService;
		this.assetService=assetService;
	}

	@RequestMapping(value = "/loginControl", method = RequestMethod.POST)
	public String loginControl(HttpServletRequest request, Model model ) {
		
		this.session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String ruolo = this.userService.login(username, password);
		if (ruolo!="") {
			//session.setAttribute("user", this.user);
			if (ruolo.equals("doctor")) {
				return "homeDoctor";
			}	
			else if (ruolo.equals("patient")) {
				return "homeDIM";
			}
			else if (ruolo.equals("admin")) {
				return "homeAdmin";
			}	
			else {
				//return "index";
			}	
		}
		else {
			model.addAttribute("feedback", "wrong");
			//return "index";
		}
		return "index";
	}
	
	@RequestMapping(value = "/logoutControl", method = RequestMethod.GET)
	public String logoutControl(HttpServletRequest request, Model model ) {
		//this.session.invalidate();
		return "index";
	}
	
	public HttpSession getSession() {
		return this.session;
	}
	
}
