package main.controller;

import java.util.List;
import main.MainDispatcher;
import main.model.Patologie;
import main.service.PatologieService;


public class ResearchController implements Controller{
private PatologieService patologieService;
	
	@Override
	public void doControl(Request request) {
		
		this.patologieService = new PatologieService();
        String choice = request.get("choice").toString();
       	List<Patologie> patologia = patologieService.SearchPatologie(Integer.parseInt(choice));
	    request.put("listaPatologie", patologia);
	    MainDispatcher.getInstance().callView("Search", request);
	   
	}

}