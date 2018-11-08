package com.pCarpet.converter;

import com.pCarpet.dto.UserDTO;
import com.pCarpet.model.User;

public class UserConverter{

	
	public static User converToEntity(UserDTO dto) {

		User u=new User();
		u.setIduser(dto.getIduser());
		u.setUsername(dto.getUsername());
		u.setPassword(dto.getPassword());
		u.setIdRuolo(dto.getIdRuolo());
		u.setRuolo(dto.getRuolo());		
		return u;
	}


	public static UserDTO covertToDTO(User entity) {
		UserDTO userDTO=new UserDTO();
		userDTO.setIduser(entity.getIduser());
		userDTO.setUsername(entity.getUsername());
		userDTO.setPassword(entity.getPassword());
		userDTO.setIdRuolo(entity.getIdRuolo());
		userDTO.setRuolo(entity.getRuolo());
		return userDTO;
	}
	
}
