package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Sintomo;

public class DeleteSintomoView implements View {

	private Request request;
	
	@Override
	public void showResults(Request request) {
	
		if(request != null ){	 
	          List<Sintomo> listasintomi = (List<Sintomo>) request.get("listaSintomi");
	          System.out.println("----- Seleziona Sintomo da eliminare -----");
	          System.out.println("----- Seleziona Sintomo !!!-----");
	          System.out.println();
	          System.out.println();
	          System.out.format("+--------------------------------------------+%n");
	  		  System.out.format("%3s %20s %20s %n","ID", "1. SINTOMO","2. DESCRIZIONE");
	  		  System.out.format("+--------------------------------------------+%n");
	  		
	  		
	          for(Sintomo sintomo:listasintomi){
	        	    //String leftAlignFormat ="| %-4s | %-9s | %-15s |%n";
	                System.out.format( "%3s %20s %20s %n", sintomo.getIdSintomo() , sintomo.getTipoSintomo() , sintomo.getDescrizione());
	                //System.out.println("+--------------------------------------------+");
	            }	
	          System.out.println();
	          }
	}

	@Override
	public void showOptions() {    	
    	System.out.println("Inserire l'id del sintomo da eliminare");
    	System.out.println("Id:");
    	int idSintomo = Integer.parseInt(getInput());
    	this.request = new Request();
    	this.request.put("deleteSintomo",idSintomo);
    	this.request.put("choice", "deleteSintomo");
    }

    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    	
    	
	}



	@Override
	public void submit() {
		MainDispatcher.getInstance().callAction("Sintomo", "doControl", this.request);
		
	}
	

}
