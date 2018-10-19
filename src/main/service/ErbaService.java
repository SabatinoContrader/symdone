package main.service;

import java.util.List;

import main.controller.Request;
import main.dao.ErbaDAO;
import main.model.Erba;

public class ErbaService {

	private ErbaDAO erbaDAO;

	public ErbaService() {
		erbaDAO = new ErbaDAO();

	}

	public List<Erba> getAllErbe() {
		return this.erbaDAO.getAllErba();

	}

	public boolean insertErba(Erba herbs) {
		return this.erbaDAO.insertErba(herbs);
	}

	public boolean updateErba(Request request) {
		return this.erbaDAO.updateErba(request);
	}

	public boolean deleteErba(int idErba) {
		return this.erbaDAO.deleteErba(idErba);

	}

}
