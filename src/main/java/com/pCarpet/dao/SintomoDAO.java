package com.pCarpet.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Sintomo;

@Repository
public interface SintomoDAO extends CrudRepository<Sintomo, Long> {

	List<Sintomo> findBySintomo(Sintomo sintomo);
}
