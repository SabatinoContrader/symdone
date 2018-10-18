package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Sintomo;
import main.service.SintomoService;

public class SintomoReadView implements View{
	
	private String scelta1;
	private SintomoService sintomoService;
	//private String mode="";
	private Request request;
	
	public SintomoReadView () {
	      this.sintomoService = new SintomoService();
	      this.request = new Request();
	  }

	@Override
	public void showResults(Request request) {
		if(request != null ){	        //&& request.get("mode") != null
		      //this.mode = request.get("mode").toString();
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
	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}

	@Override
	public void submit() {
		this.request.put("choice", "readSintomo");
		MainDispatcher.getInstance().callAction("Sintomo", "doControl", this.request);
	}	
}
