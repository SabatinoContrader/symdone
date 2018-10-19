package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Erba;

public class ErbaDeleteView implements View{
	
	private Request request;

	@Override
	public void showResults(Request request) {
		if(request != null) {
			List<Erba> listaerba = (List<Erba>) request.get("listaErba");
			System.out.println("Seleziona Erba da eliminare ------");
			System.out.println();
			for(Erba erba:listaerba) {
				System.out.println(erba.getIdErba()+ " " + erba.getNomeErba() + " " + erba.getDescErba());
			}
			
		}
	}

	@Override
	public void showOptions() {
		System.out.println("Inserire l'id dell'erba da eliminare");
		System.out.println("Id:");
		this.request = new Request();
		int idErba = Integer.parseInt(getInput());
		this.request.put("deleteErba", idErba);
		this.request.put("choice", "deleteErba");
	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner (System.in);
		return scanner.nextLine();
	}

	@Override
	public void submit() {
		MainDispatcher.getInstance().callAction("Erba", "doControl", this.request);
		
	}
	

}
