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
	
	@Query(value = "select idsintomo, sintomo from sintomo where idsintomo in (select idsintomo from sintomopatologia where idpatologia in (select idpatologia from sintomopatologia where idsintomo=?))", nativeQuery=true)
	List<Sintomo> findAllListSintomo(long idsintomo);
	
}
