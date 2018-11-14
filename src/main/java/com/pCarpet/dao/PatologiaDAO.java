package com.pCarpet.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Patologia;;

@Repository
public interface PatologiaDAO extends CrudRepository<Patologia, Long> {
	
	@Query(value = "select idpatologia, patologia, descrizione from patologia where idpatologia in\r\n" + 
			"(select idpatologia from sintomopatologia where idsintomo = ? )", nativeQuery=true)
	List<Patologia> findAllListPatologia(long idpatologia);
	
 }
