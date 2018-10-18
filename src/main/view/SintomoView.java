package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Sintomo;
import main.service.GommaService;
import main.service.SintomoService;

public class SintomoView implements View{
	
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
        System.out.println("-------MENU Sintomo-------");
        System.out.println("");
        System.out.println("1) Visualizza sintomi ");
        System.out.println("2) Inserimento sintomo ");
        System.out.println("3) modifica sintomo ");
        System.out.println("4) Elimina sintomo ");
        System.out.println("5) return");
        System.out.print(".> ");
        this.choice = Integer.parseInt(getInput());
    }

    public void submit() {
        if (choice < 1 || choice > 5) {
            MainDispatcher.getInstance().callAction("Sintomo", "doControl", null);
        }
        else if (choice == 5) {
        	this.requestChoice = new Request();
        	requestChoice.put("choice", choice);
            MainDispatcher.getInstance().callAction("HomeGeneral", "doControl", requestChoice);  // creare questo controllore
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
            MainDispatcher.getInstance().callAction("Sintomo", "doControl", request);
        }
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
