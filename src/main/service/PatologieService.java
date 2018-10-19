package main.service;

import java.util.List;

import main.controller.Request;
import main.dao.PatologieDAO;
import main.model.Patologie;

public class PatologieService {
	
	private PatologieDAO patologieDAO;
	
	public PatologieService() {
		patologieDAO = new PatologieDAO() ;
		
		
	}
	public List<Patologie> getAllPatologie(){
		return this.patologieDAO.getAllPatologie();		
		
	}
	public boolean insertPatologie(Patologie patologie){
		return this.patologieDAO.insertPatologie(patologie);	
		
		
	}
	 public boolean updatePatologie (Request request) {
		 return this.patologieDAO.updatePatologie(request);
	 }

	 public boolean DeletePatologie (int idPatologie) {
		 return this.patologieDAO.deletePatologie(idPatologie);
	 }
	 
}
