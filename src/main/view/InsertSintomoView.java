package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Sintomo;

public class InsertSintomoView implements View{
	
	private Request request;

	@Override
	public void showResults(Request request) {
		this.request = request;
	}

	@Override
	public void showOptions() {
		System.out.println("New Insert Simpthom:");
    	System.out.println("Nome Sintomo: ");
    	String nomeSintomo = getInput();
    	Sintomo insertSintomo = new Sintomo(0,nomeSintomo);
    	request = new Request();
        this.request.put("insertSintomo", insertSintomo);
        this.request.put("choice", "insertSintomo");
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
