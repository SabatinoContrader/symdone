package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;

public class UpdateSintomoView implements View{
	
	private Request request;
	
    public UpdateSintomoView () {
    	
    }

	@Override
	public void showResults(Request request) {
	}

	@Override
	public void showOptions() {
		
		int idSintomo=0;
    	try {
    		System.out.println("Inserisci l'id riferito al Sintomo da aggiornare:");
    		idSintomo=Integer.parseInt(getInput());
    	}catch(Exception e) {        
    		System.out.println("L'ID del SINTOMO deve essere un intero");
    	}
    	
    	System.out.println("Inserisci il numero del campo che vuoi modificare:");
    	int num=Integer.parseInt(getInput());
    	String campo="";
        
	    switch(num) {
		     case 1: campo="sympthom_type";
		             break;
		     case 2: campo="descrizione";
		             break;
	    }
	
	    System.out.println("Inserisci il nuovo campo "+ campo +" dei Sintomi:");
	    String newCampo = getInput();
	    
	    this.request = new Request();
	    this.request.put("idAsset", idSintomo);
	    this.request.put("newCampo", newCampo);
	    this.request.put("campo", campo);
	    this.request.put("choice", "updateSintomo");
    }

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}

	@Override
	public void submit() {
		MainDispatcher.getInstance().callAction("Sintomo", "doControl", null);
	}
	
	
}
