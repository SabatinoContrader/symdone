package com.pCarpet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Erba;
import com.pCarpet.model.Esame;
import com.pCarpet.model.Patologia;
import com.pCarpet.model.Sintomo;



	@Repository
	public interface EsameDAO extends CrudRepository<Esame, Long> {

		@Query(value = "Select idesame, esame, descrizione from esame where idesame in(Select idesame from patologiaesame where idpatologia in (select idpatologia from sintomopatologia where idsintomo in (select idsintomo from sintomopatologia where idsintomo=?)))", nativeQuery=true)

		List<Esame> findAllListEsame(long idesame1);
		
		@Query(value = "Select idesame, esame, descrizione from esame where idesame in (Select idesame from patologiaesame where idpatologia in (select a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia where a.idsintomo = ? and b.idsintomo = ?))", nativeQuery=true)
		List<Esame> findAllListEsameTwoParameter(long idesame1, long idesame2);
		
		
		@Query(value = "Select idesame, esame, descrizione from esame where idesame in\r\n" + 
				"(Select idesame from patologiaesame where idpatologia in\r\n" + 
				"(select a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia inner join sintomopatologia c on b.idpatologia = c.idpatologia where a.idsintomo = ? and b.idsintomo = ? and c.idsintomo = ?))", nativeQuery=true)
		List<Esame> findAllListEsameThreeParameter(long idesame1, long idesame2, long idesame3);
		
	 }


	

