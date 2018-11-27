package com.pCarpet.dao;

import com.pCarpet.model.User;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface UserRepository  extends CrudRepository<User, Long>{
	@Query(value = "select * from user where id_ruolo='3'", nativeQuery=true)
	List<User> findAllListUser();
	
	User findByUsernameAndPassword(String username, String password);
	
	
}
