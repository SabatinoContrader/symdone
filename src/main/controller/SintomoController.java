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
        String choice = request.get("choice").toString();
        
        switch (choice) {
	            case "read":
	            	List<Sintomo> sintomo = sintomoService.getAllSympthom();
	            	request.put("listaSintomi", sintomo);
	                //request.put("mode", "allSintomi");
	                MainDispatcher.getInstance().callView("SintomoRead", request);
	                break;
	            case "readSintomo":
	        		MainDispatcher.getInstance().callView("Sintomo", null);
	            	break;
	            case "insert":
	            	MainDispatcher.getInstance().callView("InsertSintomo", request);
	            	break;
	            case "insertSintomo":
	            	if (this.sintomoService.insertSypthom((Sintomo)request.get("insertSintomo"))) {
	            		System.out.println("Sintomo inserito con successo...!!!");
	            		System.out.println();
	            		System.out.println();
	            	}
	            	else {
	            		System.out.println("Errore durante l'inserimento del Sintomo...!!!");
	            		System.out.println();
	            		System.out.println();
	            	}
	            	
	            	MainDispatcher.getInstance().callView("Sintomo", null);
	            	break;
	            case "update":
	            	MainDispatcher.getInstance().callView("UpdateSintomo", request);
	            	break;
	            case "updateSintomo":
	            	if (sintomoService.updateSypthom(request)) {
	            		System.out.println("Sintomo modificato con successo...!!!");
	            		System.out.println();
	            		System.out.println();
	            	}
	            	else {
	            		System.out.println("Errore durante l'aggiornamento del Sintomo...!!!");
	            		System.out.println();
	            		System.out.println();
	            	}
	        		MainDispatcher.getInstance().callView("Sintomo", request);
	            	break;
	            	
	        }
        
	}

}
