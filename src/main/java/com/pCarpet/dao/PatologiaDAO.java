package com.pCarpet.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Patologia;;

@Repository
public interface PatologiaDAO extends CrudRepository<Patologia, Long> {

 }
