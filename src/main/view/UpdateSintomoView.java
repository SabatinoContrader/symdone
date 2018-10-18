package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;

public class UpdateSintomoView implements View{
	
	
	
    public UpdateSintomoView () {
    	
    }

	@Override
	public void showResults(Request request) {
	}

	@Override
	public void showOptions() {
		
		int idSintomo=0;
    	//try {
    		System.out.println("Inserisci l'id riferito al Sintomo da aggiornare:");
    		idSintomo=Integer.parseInt(getInput());
    	/*}catch(Exception e) {        
    		   System.out.println("L'ID del SINTOMO deve essere un intero");
    	}*/
    	
    	System.out.println("Inserisci il numero colonna del campo che vuoi modificare:");
    	int num=Integer.parseInt(getInput());
    	String campo="";
        
	    switch(num) {
		     case 1: campo="sympthom_name";
		             break;
		     case 2: campo="descrizione";
		             break;
	    }
	
	    System.out.println("Inserisci il nuovo campo "+ campo +" dei Sintomi:");
	    String newCampo = getInput();
	    
	    Request request = new Request();
	    request.put("idSintomo", idSintomo);
	    request.put("newCampo", newCampo);
	    request.put("campo", campo);
	    request.put("choice", "updateSintomo");
	    MainDispatcher.getInstance().callAction("Sintomo", "doControl", request);
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
