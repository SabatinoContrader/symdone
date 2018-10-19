package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;

public class PatologieView implements View{
	private int choice;
    private Request requestChoice;
    
    
	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub
		this.requestChoice = request;
		if(this.requestChoice.get("message")!= null) {
			System.out.println(this.requestChoice.get("message"));
		}
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		System.out.println("Benvenuto in ContraderFramework");
        System.out.println("");
        System.out.println("");
        System.out.println("-------MENU Patologie-------");
        System.out.println("");
        System.out.println("1) Elenco patologie ");
        System.out.println("2) Inserimento patologie ");
        System.out.println("3) Modifica patologie ");
        System.out.println("4) Elimina patologie ");
        System.out.println("5) Return");
        System.out.print(".> ");
        this.choice = Integer.parseInt(getInput());
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
		 if (choice < 1 || choice > 5) {
	            MainDispatcher.getInstance().callAction("Patologie", "doControl", null);
	        }
	        else if (choice == 5) {
	        	this.requestChoice = new Request();
	        	requestChoice.put("choice", choice);
	            MainDispatcher.getInstance().callAction("HomeGeneral", "doControl", requestChoice); 
	            // creare questo controllore
	        }
	        else {  
	        	Request request = new Request();
	        	if(this.choice == 1) {
	        	    request.put("choice", "read");
	        	}
	        	else if(this.choice == 2) {
	        	    request.put("choice", "insert"); 
	            }
	        	else if(this.choice == 3){
	        	    request.put("choice", "update");
	            }
	        	else if(this.choice == 4) {
	        	    request.put("choice", "delete");
	            }
	            MainDispatcher.getInstance().callAction("Patologie", "doControl", request);
	        }
	}

	
}
