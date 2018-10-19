
package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Erba;
import main.model.Sintomo;
import main.service.ErbaService;
import main.view.View;

public class ErbaReadView implements View {
	private String mode = "";
	private String scelta1;
	private ErbaService erbaService;

	public ErbaReadView() {
		this.erbaService = new ErbaService();

	}

	@Override
	public void showResults(Request request) {
		if (request != null) {
			List<Erba> listaerba = (List<Erba>) request.get("listaErba");
			
			System.out.println("----- Visualizza Erba !!!-----");
	        System.out.println();
	        System.out.println();
	        System.out.format("+--------------------------------------------+%n");
	  		System.out.format("%3s %20s %20s %n","ID", "1. SINTOMO","2. DESCRIZIONE");
	  		System.out.format("+--------------------------------------------+%n");
	  		
	  		
	        for(Erba erba:listaerba){
	        	    //String leftAlignFormat ="| %-4s | %-9s | %-15s |%n";
	                System.out.format( "%3s %20s %20s %n", erba.getIdErba() , erba.getNomeErba() , erba.getDescErba());
	            }	
	          System.out.println();
			/*System.out.println("----- Visualizza Erba -----");
			System.out.println();
			System.out.println("ID  Nome   Descrizione");
			for (Erba erba : listaerba) {
				System.out.println(erba.getIdErba()+ "   " + erba.getNomeErba() + "  " + erba.getDescErba());
			}*/

		}

	}

	@Override
	public void showOptions() {

	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();

	}

	@Override
	public void submit() {
		Request requestType = new Request();
		requestType.put("choice", "read");
		MainDispatcher.getInstance().callAction("Erba", "doControl", requestType);

	}

}
