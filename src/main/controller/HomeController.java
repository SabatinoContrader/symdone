package main.controller;

import main.MainDispatcher;
import main.service.LoginService;

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
            	       MainDispatcher.getInstance().callView("MovimentiExportHome", request);
            	       break;
            }
        }
        else {
        	MainDispatcher.getInstance().callView("Home", null);
        }
    }
}
