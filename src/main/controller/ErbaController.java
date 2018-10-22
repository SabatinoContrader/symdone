package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.Erba;
import main.service.ErbaService;

public class ErbaController implements Controller {

	private String message;
	private ErbaService erbaService;

	@Override
	public void doControl(Request request) {

		this.erbaService = new ErbaService();
		String choice = request.get("choice").toString();
		this.message = "";

		switch (choice) {
		case "read":

			MainDispatcher.getInstance().callView("Erba", request);
			break;

		case "readErba":

			List<Erba> erba = erbaService.getAllErbe();
			request.put("listaErba", erba);
			MainDispatcher.getInstance().callView("ErbaRead", request);
			break;
		case "insert":

			MainDispatcher.getInstance().callView("ErbaInsert", request);
			break;

		case "insertDB":

			Erba newHerbs = new Erba();
			newHerbs = (Erba) request.get("newHerbs");
			erbaService.insertErba(newHerbs);
			MainDispatcher.getInstance().callView("Home", request);

			break;

		case "update":
			MainDispatcher.getInstance().callView("ErbaUpdate", request);
			break;

		case "updateErba":
			if (erbaService.updateErba(request)) {

				System.out.println("Erba curativa modificata con successo...!!!");
				System.out.println();
				System.out.println();
				MainDispatcher.getInstance().callView("Home", request);

			} else {

				System.out.println("Erba curativa non modificata...!!!");
				System.out.println();
				System.out.println();
			}

		case "delete":
			List<Erba> erbaE = erbaService.getAllErbe();
			request.put("listaErba", erbaE);
			MainDispatcher.getInstance().callView("ErbaDelete", request);
			break;
		case "deleteErba":
			if (this.erbaService.deleteErba(Integer.parseInt(request.get("deleteErba").toString()))) {

				this.message = "Cancellazione erba avvenuta correttamente";

			} else {
				this.message = "Errore durante la procedura di cancellazione erba";
			}
			request.put("message", this.message);

			MainDispatcher.getInstance().callView("Home", request);
			break;
		case "return" :
			MainDispatcher.getInstance().callView("Home", request);
			break;
		}

	}

}
