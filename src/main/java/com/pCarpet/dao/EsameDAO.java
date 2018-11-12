package com.pCarpet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Esame;
import com.pCarpet.model.Sintomo;



	@Repository
	public interface EsameDAO extends CrudRepository<Esame, Long> {

	}


	

