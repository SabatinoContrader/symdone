package com.pCarpet.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Kit;

@Repository
@Transactional
public interface KitDAO extends CrudRepository<Kit, Long> {

}
