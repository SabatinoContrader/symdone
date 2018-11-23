package com.pCarpet.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.pCarpet.model.Sensori;

@Repository
@Transactional
public interface SensoriDAO extends CrudRepository <Sensori,Long>{
	

}
