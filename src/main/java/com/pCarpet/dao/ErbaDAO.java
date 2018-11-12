package com.pCarpet.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.pCarpet.model.Erba;


@Repository
public interface ErbaDAO extends CrudRepository <Erba, Long>{
	
	

	
	

}