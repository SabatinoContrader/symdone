package main.service;

import java.util.List;

import main.controller.Request;
import main.dao.SintomoDAO;
import main.model.Sintomo;

public class SintomoService {
	
	private SintomoDAO sintomoDAO;
	
	public SintomoService() {
        sintomoDAO = new SintomoDAO();
    }

	public List<Sintomo> getAllSympthom () {
        return this.sintomoDAO.getAllSympthom();
    }
	
	public boolean insertSypthom(Sintomo sintomo) {
		return this.sintomoDAO.insertSypthom(sintomo);
	}
	
	public boolean updateSypthom(Request request) {
		return this.sintomoDAO.updateSypthom(request); 
	}
	
	public boolean DeleteSintomo(int idSintomo) {
		return this.sintomoDAO.DeleteSintomo(idSintomo);
	}
}
