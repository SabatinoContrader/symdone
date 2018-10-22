package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.Sintomo;
import main.service.LoginService;
import main.service.SintomoService;

public class HomeController implements Controller {

    private LoginService loginService;

    
    public HomeController() {
        loginService = new LoginService();

    }

    public void doControl(Request request) {
    	
    	String choice = request.get("choice").toString();
    	
        if (choice != null) {
        	
        	   switch (choice) {
                  case "sintomi":
            	       MainDispatcher.getInstance().callView("Sintomo", request);
            	       break;
                  case "patologie":
            	       MainDispatcher.getInstance().callView("Patologie", request);
            	       break;
                  case "erbe":
            	       MainDispatcher.getInstance().callView("Erba", request);
            	       break;
                  case "return":
                	  MainDispatcher.getInstance().callView("Home", request);
                	  break;
            }
        }
        else {
        	MainDispatcher.getInstance().callView("Home", null);
        }
    }
}
