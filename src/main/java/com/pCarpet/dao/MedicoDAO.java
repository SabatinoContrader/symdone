package com.pCarpet.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Medico;

@Repository
@Transactional
public interface MedicoDAO extends CrudRepository<Medico, Long> {
	
	@Query(value = "Select idmedico, nome, cognome, indirizzo, specializzazione, mail from medico where idmedico in(Select idmedico from patologiamedici where idpatologia in (select idpatologia from sintomopatologia where idsintomo in (select idsintomo from sintomopatologia where idsintomo=?)))", nativeQuery=true)
	List<Medico> findAllListMedico(long idmed);

}
