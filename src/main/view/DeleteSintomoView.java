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
		// TODO Auto-generated method stub
		if(request != null ){	 
	          List<Sintomo> listasintomi = (List<Sintomo>) request.get("listaSintomi");
	          System.out.println("----- Seleziona Sintomo da eliminare -----");
	          System.out.println();
	          for(Sintomo sintomo:listasintomi){
	                System.out.println(sintomo.getIdSintomo() + " " +sintomo.getTipoSintomo() + " " + sintomo.getDescrizione());
	            }
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
