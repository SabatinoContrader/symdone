package main.view;

import java.util.Scanner;
import main.MainDispatcher;
import main.controller.Request;
import main.model.Sintomo;
import java.util.List;
import main.service.SintomoService;
import main.service.GommaService;

public class SearchView implements View {
	
	private SintomoService sintomoService;
	private Request request;
	private String idsint;
	
	public SearchView () {
	     this.sintomoService = new SintomoService();
	     this.idsint = "";
	  }

	@Override
	public void showResults(Request request) {
		if(request != null ){	       
		    
	          List<Sintomo> listasintomi = (List<Sintomo>) request.get("listaSintomi");
	          System.out.println("------- Selezionare l'ID del Sintomo -------");
	          System.out.println();
	          System.out.println();
	          System.out.format("+--------------------------------------------+%n");
	  		  System.out.format("%3s %20s %20s %n","ID", "1. SINTOMO","2. DESCRIZIONE");
	  		  System.out.format("+--------------------------------------------+%n");
	  			  		
	          for(Sintomo sintomo:listasintomi){
	                System.out.format( "%3s %20s %20s %n", sintomo.getIdSintomo() , sintomo.getTipoSintomo() , sintomo.getDescrizione());
	            }	
	          System.out.println();
	       }
	}

	@Override
	public void showOptions() {      
		   System.out.println("Inserisci l'ID");
		   System.out.print(".>");
	       idsint = getInput();
	       //System.out.println("CHOICE DIAGNOSI: " + idsint);
	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}

	@Override
	public void submit() {
		Request request = new Request();
		request.put("choice", "searchDiagnosi");
		request.put("Diagnosi", idsint);
		MainDispatcher.getInstance().callAction("Sintomo", "doControl", request);
	}	

}
