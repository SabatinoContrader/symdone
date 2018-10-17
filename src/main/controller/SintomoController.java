package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.Gomma;
import main.model.Sintomo;
import main.service.GommaService;
import main.service.SintomoService;

public class SintomoController implements Controller{
	
	private SintomoService sintomoService;

	@Override
	public void doControl(Request request) {
		
		this.sintomoService = new SintomoService();
        int choice = (int) request.get("choice");
        //System.out.println("choice: " + choice);
        
        switch (choice) {
	            case 1:
	            	List<Sintomo> sintomo = sintomoService.getAllSympthom();
	            	request.put("listaSintomi", sintomo);
	                request.put("mode", "allSintomi");
	                break;
	        }
        
        MainDispatcher.getInstance().callView("Sintomo", request);
	
	}

}
