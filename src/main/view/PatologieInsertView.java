package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Patologie;

public class PatologieInsertView implements View {

	private String nomePatologia;
    private String descPatologia;
	
	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		System.out.println("inserisci nuova Patologia");
		 System.out.println("-----Patologia----");
	        System.out.println("Nome Patologia:");
	        nomePatologia = getInput();
	        System.out.println("descPatologia:");
	        descPatologia= getInput();
	    }
	

	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        return scanner.nextLine();

	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		Request request = new Request();
		request.put("nomePatologia", nomePatologia); 
		request.put("descPatolgia", descPatologia); 
		Patologie patologia=new Patologie();
		patologia.setNomePatologia(nomePatologia);
		patologia.setDescPatologia(descPatologia);
		request.put("choice","insertPatologie");
		request.put("patologia", patologia);
		MainDispatcher.getInstance().callAction("Patologie", "doControl", request);
		
		
	}
	
	
	
	
	

}
