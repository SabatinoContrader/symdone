package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Erba;
import main.service.ErbaService;

public class ErbaView implements View{
	
	private int choice;
    private Request requestChoice;

    public void showResults(Request request) {
    	if (request.get("message") != null) {
    		System.out.println(request.get("message"));
    	}	 
    }

    public void showOptions() {
        System.out.println("Benvenuto in ContraderFramework");
        System.out.println("");
        System.out.println("");
        System.out.println("-------MENU Erba-------");
        System.out.println("");
        System.out.println("1) Visualizzare erba ");
        System.out.println("2) Inserimento erba ");
        System.out.println("3) modifica erba ");
        System.out.println("4) Elimina erba ");
        System.out.println("5) return");
        System.out.print(".> ");
        this.choice = Integer.parseInt(getInput());
    }

    public void submit() {
        if (choice < 1 || choice > 5) {
            MainDispatcher.getInstance().callAction("Erba", "doControl", null);
        }
        else if (choice == 5) {
        	this.requestChoice = new Request();
        	requestChoice.put("choice", "return");
            MainDispatcher.getInstance().callAction("Home", "doControl", requestChoice);  
        }
        else {  
        	Request request = new Request();
        	if(this.choice == 1) {
        	    request.put("choice", "readErba");
        	    MainDispatcher.getInstance().callAction("Erba", "doControl", request);
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
            MainDispatcher.getInstance().callAction("Erba", "doControl", request);
        }
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}