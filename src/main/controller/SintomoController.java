package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.Gomma;
import main.model.Patologie;
import main.model.Sintomo;
import main.service.GommaService;
import main.service.PatologieService;
import main.service.SintomoService; 

public class SintomoController implements Controller{
	
	private SintomoService sintomoService;
	private PatologieService patologieService;
	private String message;

	
	@Override
	public void doControl(Request request) {
		
		this.sintomoService = new SintomoService();
		this.patologieService = new PatologieService();
        String choice = request.get("choice").toString();
        this.message = "";
        
        switch (choice) {
	            case "read":
	            	List<Sintomo> sintomo = sintomoService.getAllSympthom();
	            	request.put("listaSintomi", sintomo);
	                MainDispatcher.getInstance().callView("SintomoRead", request);
	                break;
	            case "readSintomo":
	        		MainDispatcher.getInstance().callView("Sintomo", request);
	            	break;
	            case "insert":
	            	MainDispatcher.getInstance().callView("InsertSintomo", request);
	            	break;
	            case "insertSintomo":
	            	if (this.sintomoService.insertSypthom((Sintomo)request.get("insertSintomo"))) {
	            		this.message = "Sintomo inserito con successo...";            		
	            	}
	            	else {
	            		this.message = "Errore durante l'inserimento del Sintomo...!!!";
	            	}
	            	
	            	request.put("message", this.message);
	            	MainDispatcher.getInstance().callView("Sintomo", request);
	            	break;
	            case "update":
	            	List<Sintomo> sintomo2 = sintomoService.getAllSympthom();
	            	request.put("listaSintomi", sintomo2);
	            	MainDispatcher.getInstance().callView("UpdateSintomo", request);
	            	break;
	            case "updateSintomo":
	            	if (sintomoService.updateSypthom(request)) {
	            		this.message = "Sintomo modificato con successo..."; 
	            	}
	            	else {
	            		this.message = "Errore durante la modifica del Sintomo...!!!";
	            	}
	            	request.put("message", this.message);
	        		MainDispatcher.getInstance().callView("Sintomo", request);
	            	break;
	            case "delete":
	            	List<Sintomo> sintomo3 = sintomoService.getAllSympthom();
	            	request.put("listaSintomi", sintomo3);
	            	MainDispatcher.getInstance().callView("DeleteSintomo", request);
	            	break;
	            case "deleteSintomo":
	            	if (this.sintomoService.DeleteSintomo((Integer) request.get("deleteSintomo"))) {
	            		this.message = "Cancellazione sintomo avvenuta correttamente";
	            	}
	            	else {
	            		this.message = "Errore durante la procedura di cancellazione sintomo";
	            	}
	            	request.put("message", this.message);
	            	MainDispatcher.getInstance().callView("Sintomo", request);
	            	break;
	            case "search":
              	  //Request requestSearch = new Request();
              	  List<Sintomo> sintomo4 = sintomoService.getAllSympthom();
              	  request.put("listaSintomi", sintomo4);
              	  MainDispatcher.getInstance().callView("Search", request);
              	  break;
	            case "searchDiagnosi":
	            	int choiceDiagnosi =Integer.parseInt(request.get("Diagnosi").toString());
	            	List<Patologie> patologia = patologieService.SearchPatologie(choiceDiagnosi);
	               	
	        	    request.put("listaPatologie", patologia);
	        	    MainDispatcher.getInstance().callView("ResultDisease", request);
	        	    break;
	            case "return":
	            	MainDispatcher.getInstance().callView("Home", request);
	            	break;
	        }
        
	}

}
