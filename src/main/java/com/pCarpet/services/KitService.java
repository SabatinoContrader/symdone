package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pCarpet.converter.KitConverter;
import com.pCarpet.dao.KitDAO;
import com.pCarpet.dto.KitDTO;
import com.pCarpet.model.Kit;



@Service
public class KitService {
	private KitDAO kitDAO;
	
	@Autowired
	public KitService(KitDAO kitDAO) {
		this.kitDAO = kitDAO;
	}
	
	public List<KitDTO> getAll(){
		List<Kit> listaKit = (List<Kit>) kitDAO.findAll();
		List<KitDTO> listaKit1= new ArrayList<>();
		listaKit.forEach(i->listaKit1.add(KitConverter.convertToDto(i)));
		return listaKit1;
	}
	
	public KitDTO insertKit(KitDTO kitDTO) {
		 Kit kit = KitConverter.convertToKit(kitDTO);
		 this.kitDAO.save(kit);
		 return KitConverter.convertToDto(kitDAO.save(kit));
	}
	
	public KitDTO updateKit(KitDTO kitDTO) {
		Kit kit = KitConverter.convertToKit(kitDTO);
		kitDAO.save(kit);
		return KitConverter.convertToDto(kitDAO.save(kit));
	}
	public void deleteKit(long idkit) {
    	Kit kit = kitDAO.findById(idkit).get();
    	this.kitDAO.delete(kit);
	}
	public KitDTO getIdkit (long idkit) {
        Kit kit = (Kit)this.kitDAO.findById(idkit).get(); 
        return KitConverter.convertToDto(kit);
    }
	public KitDTO findById(long idkit) {
		return KitConverter.convertToDto(kitDAO.findById(idkit).get());
	}
}
