package com.pCarpet.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Patologia;
import com.pCarpet.model.Sintomo;;

@Repository
public interface PatologiaDAO extends CrudRepository<Patologia, Long> {
	
	@Query(value = "select idpatologia, patologia, descrizione from patologia where idpatologia in\r\n" + 
			"(select idpatologia from sintomopatologia where idsintomo = ? )", nativeQuery=true)
	List<Patologia> findAllListPatologia(long idpatologia);
	
	@Query(value = "Select idpatologia, patologia, descrizione from patologia where idpatologia in(select idpatologia from sintomopatologia where idpatologia in(select a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia where a.idsintomo = ? and b.idsintomo = ?))", nativeQuery=true)
	List<Patologia> findAllListPatologiaTwoParameter(long idpatologia1, long idpatologia2);
	
	@Query(value = "Select distinct idpatologia, patologia, descrizione from patologia where idpatologia in (select idpatologia from sintomopatologia where idpatologia in(select distinct a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia inner join sintomopatologia c on b.idpatologia = c.idpatologia where a.idsintomo = ? and b.idsintomo = ? and c.idsintomo = ?))", nativeQuery=true)
	List<Patologia> findAllListPatologiaThreeParameter(long idpatologia1, long idpatologia2, long idpatologia3);
	
	/*@Query(value = "select idpatologia, patologia, descrizione from patologia where idpatologia in (select idpatologia from patologiaerba where iderba in (select iderba from patologiaerba where idpatologia=?))", nativeQuery=true)
	List<Patologia> findAllListPatologia2(long idpatologia);*/
	
 }
