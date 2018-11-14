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

	@Query(value = "Select idmedico, nome, cognome, indirizzo, specializzazione, mail from medico where idmedico in\r\n" + 
			"(Select idmedico from patologiamedici where idpatologia in\r\n" + 
			"(select a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia where a.idsintomo = ? and b.idsintomo = ?))", nativeQuery=true)
	List<Medico> findAllListMedicoTwoParameter(long idmedico1, long idmedico2);
	
	@Query(value = "Select idmedico, nome, cognome, indirizzo, specializzazione, mail from medico where idmedico in\r\n" + 
			"(Select idmedico from patologiamedici where idpatologia in\r\n" + 
			"(select a.idpatologia from sintomopatologia a inner join sintomopatologia b on a.idpatologia = b.idpatologia inner join sintomopatologia c on b.idpatologia = c.idpatologia where a.idsintomo = ? and b.idsintomo = ? and c.idsintomo = ?))", nativeQuery=true)
	List<Medico> findAllListMedicoThreeParameter(long idmedico1, long idmedico2, long idmedico3);

}
