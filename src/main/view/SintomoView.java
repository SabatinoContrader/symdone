package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Sintomo;
import main.service.GommaService;
import main.service.SintomoService;

public class SintomoView implements View{
	
	private String scelta1;
	private SintomoService sintomoService;
	private String mode="";
	
	public SintomoView () {
	      this.sintomoService = new SintomoService();
	  }

	@Override
	public void showResults(Request request) {
		if(request != null && request.get("mode") != null){	        
		      this.mode = request.get("mode").toString();
	          List<Sintomo> listasintomi = (List<Sintomo>) request.get("listaSintomi");
	          System.out.println("----- Seleziona Sintomo !!!-----");
	          System.out.println();
	          for(Sintomo sintomo:listasintomi){
	                System.out.println(sintomo.getIdSintomo() + " " +sintomo.getTipoSintomo());
	            }
	          
	       }
	}

	@Override
	public void showOptions() {
		System.out.println(".> ");
        scelta1 = getInput();      		
	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}

	@Override
	public void submit() {
		Request requestType = new Request();
        requestType.put("SceltaTipo", this.scelta1);
        //MainDispatcher.getInstance().callAction("Prodotto", "doControl", requestType);
	}	

}
