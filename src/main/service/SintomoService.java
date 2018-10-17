package main.service;

import java.util.List;

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
}
