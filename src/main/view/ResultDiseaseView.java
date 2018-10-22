package main.view;

import java.util.List;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Patologie;
import main.model.Sintomo;

public class ResultDiseaseView implements View {

	private Request request;
	@Override
	public void showResults(Request request) {
		this.request = request;
		if(request != null ){	        
	          List<Patologie> listaRsltDisease = (List<Patologie>) request.get("listaPatologie");
	          System.out.println("-----Possibili Diagnosi-----");
	          System.out.println();
	          System.out.println();
	          System.out.format("+--------------------------------------------+%n");
	  		  System.out.format("%3s %20s %20s %n","ID", "1. PATOLOGIA","2. DESCRIZIONE");
	  		  System.out.format("+--------------------------------------------+%n");
	  		
	  		
	          for(Patologie patologia:listaRsltDisease){
	        	    //String leftAlignFormat ="| %-4s | %-9s | %-15s |%n";
	                System.out.format( "%3s %20s %20s %n", patologia.getIdPatologia() , patologia.getNomePatologia() , patologia.getDescPatologia());
	                //System.out.println("+--------------------------------------------+");
	            }	
	          System.out.println();
	       }
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void submit() {
		this.request = new Request();
		this.request.put("choice", "return");
		 MainDispatcher.getInstance().callAction("Home", "doControl", this.request);
		
	}
	
}
