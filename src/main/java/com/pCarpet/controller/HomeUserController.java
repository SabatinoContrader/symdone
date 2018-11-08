package com.pCarpet.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.AbbonamentoDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.model.Abbonamento;
import com.pCarpet.model.User;
import com.pCarpet.services.AbbonamentoService;
import com.pCarpet.services.UserService;

@Controller
@RequestMapping("/HomeUser")
public class HomeUserController {
	
	private UserService userService;
	private boolean isLogged = false;
	private AbbonamentoService abbonamentoService;

	@Autowired
	public HomeUserController(UserService userService,AbbonamentoService abbonamentoService) {
		this.userService = userService;
		this.abbonamentoService=abbonamentoService;
	}

	@RequestMapping(value = "/showUsers", method = RequestMethod.GET)
	public String loginControl(HttpServletRequest request, Model model ) {
		List<UserDTO> users = userService.getAllUsers();
		model.addAttribute("users", users);
				
		String choice=request.getParameter("choice");
		if(choice != null) {
			switch(choice) {
		
				case "managementUsers":
					return "managementUser";
				
				case "insert":
//					users = userService.getAllUsers();
//					model.addAttribute("users", users);
					return "insertUser";
					
				case "update":
					model.addAttribute("user",userService.getUser(Integer.parseInt(request.getParameter("id"))));
//					users = userService.getAllUsers();
//					model.addAttribute("users", users);
					return "updateUser";
				case "delete":
					
					userService.deleteUser(Integer.parseInt((request.getParameter("id"))));
					users = userService.getAllUsers();
					model.addAttribute("users", users);
					return "managementUser";
				case "indietro":
					return "homeCustomers";
				case "indietroManagementUser":
					return "managementUser";
			}
		}
		
		return "managementUser";
	}
	
	

	@RequestMapping(value = "/showUsers", method = RequestMethod.POST)
	public String loginControlPost(HttpServletRequest request, Model model ) {
		List<UserDTO> users = userService.getAllUsers();
		model.addAttribute("users", users);
			
		String choice=request.getParameter("choice");
	
		if(choice != null) {
			switch(choice) {
				case "insert":
					String username=request.getParameter("username");
					String password=request.getParameter("password");					
					String ruolo=request.getParameter("ruolo");				
					UserDTO u=new UserDTO(0,username,password,0,ruolo);
					
					userService.insertUser(u);
					users = userService.getAllUsers();
					model.addAttribute("users", users);
					return "managementUser";
				case "update":
					long idm=Integer.parseInt(request.getParameter("id"));
					String usernamem=request.getParameter("username");
					String passwordm=request.getParameter("password");
					String ruolom=request.getParameter("ruolo");
					UserDTO um=new UserDTO(idm,usernamem,passwordm,0,ruolom);
					
					userService.insertUser(um);
					users = userService.getAllUsers();
					model.addAttribute("users", users);
					return "managementUser";
			}
		}
	
		return "managementUser";
	}
}