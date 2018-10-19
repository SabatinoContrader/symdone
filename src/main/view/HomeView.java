package main.view;

import main.MainDispatcher;
import main.controller.Request;
//import sun.applet.Main;

import java.util.Scanner;

public class HomeView implements View {

    private int choice;
    private Request requestChoice;

    public void showResults(Request request) {

    }

    public void showOptions() {
        System.out.println("Benvenuto in ContraderFramework");
        System.out.println("");
        System.out.println("");
        System.out.println("-------MENU Sintomo-------");
        System.out.println("");
        System.out.println("1) Gestione Sintomi ");
        System.out.println("2) Gestione patologie");
        System.out.println("3) Gestione Erbe");
        System.out.println("4) Ricerca Diagnosi");
        System.out.println("5) Logout");
        System.out.print(".> ");
        this.choice = Integer.parseInt(getInput());
    }

    public void submit() {
    	this.requestChoice = new Request();
    	
        if (choice < 1 || choice > 5) {
            MainDispatcher.getInstance().callAction("Home", "doControl", null);
        }
        else if (choice == 5) {
        	//requestChoice.put("choice", "login");
            MainDispatcher.getInstance().callAction("Login", "doControl", null);  
        }
        else if (choice == 1) {
        	this.requestChoice.put("choice", "sintomi");
            MainDispatcher.getInstance().callAction("Home", "doControl", requestChoice);
        }
        else if (choice == 2) {
        	this.requestChoice.put("choice", "patologie");
        	MainDispatcher.getInstance().callAction("Home", "doControl", this.requestChoice); 
        }
        else if (choice == 3) {
        	this.requestChoice.put("choice", "erbe");
        	MainDispatcher.getInstance().callAction("Home", "doControl", this.requestChoice);
        }
        else if (choice == 4) {
        	//this.request.put("choice", "logs");
        	//MainDispatcher.getInstance().callAction("Home", "doControl", this.request);  //sistemare con Italo
        }
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
