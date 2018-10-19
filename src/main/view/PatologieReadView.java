package main.view;

import java.util.List;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Patologie;
import main.service.PatologieService;

public class PatologieReadView implements View {

	private PatologieService patologieService;
	private Request request;

	public PatologieReadView() {
		this.patologieService = new PatologieService();
	}

	@Override
	public void showResults(Request request) {
		this.request = request;
		List<Patologie> listaPatologie = (List<Patologie>) request.get("listaPatologie");
		if (listaPatologie != null) {
			//listaPatologie = (List<Patologie>) request.get("listaPatologie");
			System.out.println("----- Elenco Patologie !!!-----");
			System.out.println();
			for (Patologie patologie : listaPatologie) {
				System.out.println(patologie.getIdPatologia() + " " + patologie.getNomePatologia() + " "
						+ patologie.getDescPatologia());
			}
		}
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void submit() {
		this.request = new Request();
		this.request.put("choice", "return");
		MainDispatcher.getInstance().callAction("Patologie", "doControl", this.request);
	}

}
