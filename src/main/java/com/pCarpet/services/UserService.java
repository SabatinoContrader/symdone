package com.pCarpet.services;

import com.pCarpet.converter.UserConverter;
import com.pCarpet.dao.UserRepository;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.model.Stato;
import com.pCarpet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    
    
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
     
    
    public UserRepository getUserRepository() {
    	return this.userRepository;
    }
    
    public UserDTO login (String username, String password) {
    	//List<User> listUser=(List<User>) this.userRepository.findAll();
    	User user = userRepository.findByUsernameAndPassword(username,password);
    	UserDTO userDTO = UserConverter.covertToDTO(user);
    	/*for(User u: listUser) {
    		if(username.equals(u.getUsername()) && password.equals(u.getPassword())) {   			
    			return u.getRuolo();
    		}
    		
    	}*/
    	
    	return userDTO;
    }

    public List<UserDTO> getAllUsers () {
    	
        List<User> listU = (List<User>)this.userRepository.findAll();       
        List<User> ll=new LinkedList<User>();             
        List<UserDTO> listDTO=new ArrayList<>();
        
        for(User u: ll) 
        {
        	listDTO.add(UserConverter.covertToDTO(u));
        }
        
        return listDTO;
        
    
    }
    
    public UserDTO getUser (long id) {  
        User u = this.userRepository.findById(id).get();        
        return UserConverter.covertToDTO(u); 
    }
    
    public boolean insertUser (UserDTO userDTO) {
    
    	User user = UserConverter.converToEntity(userDTO);
        return this.userRepository.save(user)!=null;
     
    }
    
    public UserDTO newUser(UserDTO userDTO) {
		return UserConverter.covertToDTO(userRepository.save(UserConverter.converToEntity(userDTO)));
	}
    
    public void deleteUser(int idUser) {
    	User u = this.userRepository.findById(Long.valueOf(idUser)).get();
    	Stato a = new Stato();
    	a.setFlag(2);
    	a.setValore("eliminato");
    	this.userRepository.save(u);   	
    }
    
    public boolean updateUser(UserDTO userDTO) {
    	return this.userRepository.save(UserConverter.converToEntity(userDTO))!=null;
    }
}
