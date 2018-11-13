package com.pCarpet.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Medico;

@Repository
public interface MedicoDAO extends CrudRepository<Medico, Long> {

}
