package main.view;

import main.MainDispatcher;
import main.controller.Request;
//import sun.applet.Main;

import java.util.Scanner;

public class HomeView implements View {

    private int choice;

    public void showResults(Request request) {

    }


    public void showOptions() {
        System.out.println("Benvenuto in ContraderFramework");
        System.out.println("");
        System.out.println("");
        System.out.println("-------MENU-------");
        System.out.println("");
        System.out.println("1) Seleziona sintomo ");
        System.out.println("3) Logout");
        System.out.print(".> ");
        this.choice = Integer.parseInt(getInput());
    }

    public void submit() {
        if (choice < 1 || choice > 3)
            MainDispatcher.getInstance().callAction("Home", "doControl", null);
        else if (choice == 1) {
        	Request request = new Request();
            request.put("choice", choice);
            MainDispatcher.getInstance().callAction("Sintomo", "doControl", request);
        }else {
        	Request request = new Request();
            request.put("choice", choice);
            MainDispatcher.getInstance().callAction("Home", "doControl", request);
        }
    }


    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
