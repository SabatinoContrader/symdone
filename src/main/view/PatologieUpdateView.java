package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Patologie;

public class PatologieUpdateView implements View{

	private Request request;

	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub
		this.request = request;
		if (request != null) {
			List<Patologie> listaPatologie = (List<Patologie>) request.get("listaPatologie");
			System.out.println("----- Elenco Patologie !!!-----");
			System.out.println();
			for (Patologie patologie : listaPatologie) {
				System.out.println(patologie.getIdPatologia() + " " + patologie.getNomePatologia() + " "
						+ patologie.getDescPatologia());
			}
		}
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		
		int idPatologia=0;
    	try {
    		System.out.println("Inserisci l'id riferito alla patologia da aggiornare:");
    		idPatologia=Integer.parseInt(getInput());
    	}catch(Exception e) {//Controllo id valido
    		System.out.println("L'ID patologia deve essere un intero");	
    	}

    		System.out.println("Inserisci il numero del campo che vuoi modificare:");
    		System.out.println("1 per Nome");
    		System.out.println("2 per Descrizione");
    	int num=Integer.parseInt(getInput());
    	String campo="";  
    	
    	switch(num) {
		case 1: campo="disease_name";break;
		case 2: campo="disease_desc";break;
    	}
    	System.out.println("Inserisci il nuovo valore per "+ campo);
    	String newData=getInput();
    	
    	this.request = new Request();
    	this.request.put("idPatologia", idPatologia);
    	this.request.put("newData", newData);
    	this.request.put("campo", campo);
    	this.request.put("choice", "updatePatologia");
    	}
    	
	
	
	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        return scanner.nextLine();
	}


	@Override
	public void submit() {
		MainDispatcher.getInstance().callAction("Patologie", "doControl", this.request);
	}


}
