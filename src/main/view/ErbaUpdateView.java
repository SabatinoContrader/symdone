package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Erba;

public class ErbaUpdateView implements View {

	public ErbaUpdateView() {

	}

	@Override
	public void showResults(Request request) {
		if(request != null ){	 
			
	          List<Erba> listaerba = (List<Erba>) request.get("listaErba");
	          System.out.println("----- Seleziona Erba da modificare -----");
	          System.out.println();
	          System.out.println();
	          System.out.format("+--------------------------------------------+%n");
	  		  System.out.format("%3s %20s %20s %n","ID", "1. ERBA","2. DESCRIZIONE");
	  		  System.out.format("+--------------------------------------------+%n");
	  		
	  		
	          for(Erba erba:listaerba){
	        	    //String leftAlignFormat ="| %-4s | %-9s | %-15s |%n";
	                System.out.format("%3s %20s %20s %n", erba.getIdErba() ,erba.getNomeErba() , erba.getDescErba());
	                //System.out.println("+--------------------------------------------+");
	            }	
	          System.out.println();
	       }

	}

	@Override
	public void showOptions() {
		int idErba = 0;
		//try {
			
			System.out.println("Inserisci l'id dell'erba che vuoi modificare ");
		    idErba= Integer.parseInt(getInput());

		/*} catch (Exception e) {
			System.out.println("L'ID dell'erba deve essere un INTERO");

		}*/
		
		System.out.println("Inserisci il numero del campo che vuoi modificare: 1) Nome dell'erba 2) Descrizione");
		int num= Integer.parseInt(getInput());
		String campo="";
		
		switch(num){
		
		
		case 1 : 
			
			campo = "herb_name";
			break;
			
		case 2: 
			
			campo = "herb_desc";
			break;
		}
		
		System.out.println("Inserisci " + campo + " dell'erba curativa");
		String newCampo = getInput();
		
		Request request = new Request();
		request.put("idErba", idErba);
		request.put("newCampo", newCampo);
		request.put("campo", campo);
		request.put("choice", "updateErba");
		MainDispatcher.getInstance().callAction("Erba", "doControl", request);
	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	@Override
	public void submit() {
		 MainDispatcher.getInstance().callAction("Erba", "doControl", null);
	}

}
