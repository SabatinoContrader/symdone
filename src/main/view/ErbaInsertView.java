package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Erba;
import main.service.ErbaService;

public class ErbaInsertView implements View {

	private Request request;

	@Override
	public void showResults(Request request) {

		this.request = request;

	}

	@Override
	public void showOptions() {
	
		System.out.println ("Inserisci nuova erba");
		System.out.println (" Nome : ");
		String nomeHerb = getInput();
		System.out.println("Inserisci descrizione erba");
		String descHerb = getInput();
		Erba insertHerbs = new Erba ();
		insertHerbs.setNomeErba(nomeHerb);
		insertHerbs.setDescErba(descHerb);
		request = new Request () ;
		this.request.put("newHerbs", insertHerbs);
	//	this.request.put("descHerb", descHerb);
		this.request.put("choice", "insertDB");
	//	this.request.put("choice", descHerb);
			
	}

	@Override
	public String getInput() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	@Override
	public void submit() {
		
		MainDispatcher.getInstance().callAction("Erba", "doControl", this.request);

	}

}
