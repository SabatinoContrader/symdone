package com.pCarpet.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Sintomo;

@Repository
@Transactional
public interface SintomoDAO extends CrudRepository<Sintomo, Long> {
	
	@Query(value = "select idsintomo, sintomo from sintomo where idsintomo in (select idsintomo from sintomopatologia where idpatologia in (select idpatologia from sintomopatologia where idsintomo=?1)) and idsintomo <> ?1", nativeQuery=true)
	List<Sintomo> findAllListSintomo(long idsintomo);
	
	@Query(value = "select idsintomo, sintomo from sintomo where idsintomo in (select idsintomo from sintomopatologia where idpatologia in (select a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia where a.idsintomo = ?1 and b.idsintomo = ?2)) and idsintomo not in (?1, ?2)", nativeQuery=true)
	List<Sintomo> findAllListSintomoTwoParameter(long idsintomoUno, long idsintomoDue);
	
}
