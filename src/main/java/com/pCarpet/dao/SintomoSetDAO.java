package com.pCarpet.dao;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.dto.SintomoSetDTO;
import com.pCarpet.model.SintomoSet;
import com.pCarpet.model.User;

@Repository
public interface SintomoSetDAO extends CrudRepository <SintomoSet, Long> {
	
	
}