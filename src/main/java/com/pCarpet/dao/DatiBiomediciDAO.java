package com.pCarpet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.DatiBiomedici;

@Repository
public interface DatiBiomediciDAO extends CrudRepository<DatiBiomedici, Long> { 

}
