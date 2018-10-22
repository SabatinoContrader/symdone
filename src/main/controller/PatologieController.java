package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.Patologie;
import main.service.PatologieService;

public class PatologieController implements Controller {

	private PatologieService patologieService;
	private String message;
	private Request request;
	
	@Override
	public void doControl(Request request) {
		this.message = "";
		this.request = request;
		this.patologieService = new PatologieService();
		String choice = this.request.get("choice").toString();

		switch (choice) {
		case "read":
			List<Patologie> patologie = patologieService.getAllPatologie();
			request.put("listaPatologie", patologie);
			MainDispatcher.getInstance().callView("PatologieRead", request);
			break;

			
		case "readPatologie":
			MainDispatcher.getInstance().callView("Patologie", request);
			break;
			
		case "insert":

			MainDispatcher.getInstance().callView("PatologieInsert", request);
			break;

		case "insertPatologie":
			Patologie patologia= (Patologie) request.get("patologia");
			if (this.patologieService.insertPatologie(patologia)) {
				this.message ="Inserimento eseguito con successo";
				

			} else {
				this.message ="Inserimento non eseguito";
				

			}
			request.put("message", this.message);
			MainDispatcher.getInstance().callView("Patologie", request);
			break;
			
		case "update":
			List<Patologie> patologiem = patologieService.getAllPatologie();
			request.put("listaPatologie", patologiem);
			MainDispatcher.getInstance().callView("PatologieUpdate", request);
			break;
			
		case "updatePatologia":
			if (this.patologieService.updatePatologie(request)) {
				this.message = "Aggiornamento Patologia avvenuto correttamente";
        	}
        	else {
        		this.message = "Aggiornamento Patologia non avvenuto correttamente"; 		
			}
			request.put("message", this.message);
			MainDispatcher.getInstance().callView("Patologie", request);
			break;
			
		case "delete":
			List<Patologie> patologied = patologieService.getAllPatologie();
			request.put("listaPatologie", patologied);
			MainDispatcher.getInstance().callView("PatologieDelete", request);
			break;
		
		case "deletePatologia":
			if(this.patologieService.DeletePatologie(Integer.parseInt(request.get("deletePatologia").toString()))){
				this.message = "Cancellazione patologia avvenuta correttamente";
			}
			else {
				this.message = "Cancellazione patologia non avvenuta correttamente";
			}
			request.put("message", this.message);
			MainDispatcher.getInstance().callView("Patologie", request);
			break;
		case "return":
			MainDispatcher.getInstance().callView("Home", request);
			break;
		}	
		
	}
}	
	
