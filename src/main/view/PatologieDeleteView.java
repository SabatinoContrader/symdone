package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Patologie;

public class PatologieDeleteView implements View {

	private Request request;

	@Override
	public void showResults(Request request) {
		this.request = request;
		if (request != null) {
			List<Patologie> listaPatologie = (List<Patologie>) request.get("listaPatologie");
			System.out.println("----- Seleziona Patologia da eliminare !!!-----");
			System.out.println();
			for (Patologie patologie : listaPatologie) {
				System.out.println(patologie.getIdPatologia() + " " + patologie.getNomePatologia() + " "
						+ patologie.getDescPatologia());
			}}
		
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		System.out.println("Inserire l'id della patologia da eliminare");
		System.out.println("Id");
		int idPatologia=Integer.parseInt(getInput());
		this.request= new Request();
		this.request.put("deletePatologia", idPatologia);
		this.request.put("choice", "deletePatologia");
				
		
		
	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}

	@Override
	public void submit() {
		MainDispatcher.getInstance().callAction("Patologie", "doControl", this.request);
	}
	

}
