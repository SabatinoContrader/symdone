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

	@CrossOrigin
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public UserDTO newUser(		
			
			@RequestParam(value = "iduser") String iduser,
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password,
			@RequestParam(value = "idRuolo") String idRuolo,
			@RequestParam(value = "ruolo") String ruolo,
			@RequestParam(value = "name") String name,			
			@RequestParam(value = "surname") String surname,
			@RequestParam(value = "phone") String phone,
			@RequestParam(value = "email") String email		
			
	) {

		System.out.println("Sono qui");
		long idRole = Integer.parseInt(idRuolo);
		long idUser = Integer.parseInt(iduser);
		UserDTO  userDTO = new UserDTO(idUser,  username, password, idRole, ruolo, name, surname, phone, email);
		userDTO = userService.newUser(userDTO);
		return userDTO;

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
