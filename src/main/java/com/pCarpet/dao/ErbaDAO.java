package com.pCarpet.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.pCarpet.model.Erba;
import com.pCarpet.model.Medico;
import com.pCarpet.model.Patologia;


@Repository
public interface ErbaDAO extends CrudRepository <Erba, Long>{
	@Query(value = "Select iderba, erba, descrizione from erba where iderba in\r\n" + 
			"(Select iderba from patologiaerba where idpatologia in \r\n" + 
			"(select idpatologia from sintomopatologia where idsintomo=?))", nativeQuery=true)
	List<Erba> findAllListErba(long iderba);
	

	
	

}