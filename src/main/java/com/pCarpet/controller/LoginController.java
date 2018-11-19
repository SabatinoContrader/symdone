package com.pCarpet.controller;

//import com.google.gson.JsonObject;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.services.UserService;

//import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
//@Controller
@RequestMapping("/Login")
public class LoginController {

	private UserService userService;
	private UserDTO user;	
	private HttpSession session;
	
	
	
	@Autowired
	public LoginController(UserService userService) {
		this.userService = userService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/loginControl", method = RequestMethod.POST)
	public UserDTO loginControl(
			@RequestParam(value="username", required=true) String username, 
			@RequestParam(value="password", required=true) String password) 
	{
		UserDTO userDTO = userService.login(username,password);
		return userDTO;
	}

	/*@RequestMapping(value = "/loginControl", method = RequestMethod.POST)
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
	}*/
	
	@RequestMapping(value = "/logoutControl", method = RequestMethod.GET)
	public String logoutControl(HttpServletRequest request, Model model ) {
		//this.session.invalidate();
		return "index";
	}
	
	public HttpSession getSession() {
		return this.session;
	}
	
}
