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
	
	@Query(value = "Select iderba, erba, descrizione from erba where iderba in\r\n" + 
			"(Select iderba from patologiaerba where idpatologia in\r\n" + 
			"(select a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia where a.idsintomo = ? and b.idsintomo = ?))", nativeQuery=true)
	List<Erba> findAllListErbaTwoParameter(long iderba1, long iderba2);
	
	@Query(value = "Select iderba, erba, descrizione from erba where iderba in\r\n" + 
			"(Select iderba from patologiaerba where idpatologia in\r\n" + 
			"(select a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia inner join sintomopatologia c on b.idpatologia = c.idpatologia where a.idsintomo = ? and b.idsintomo = ? and c.idsintomo = ?))", nativeQuery=true)
	List<Erba> findAllListErbaThreeParameter(long iderba1, long iderba2, long iderba3);
	

}