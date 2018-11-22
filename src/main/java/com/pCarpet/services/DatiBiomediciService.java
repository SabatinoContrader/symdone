package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.DatiBiomediciConverter;
import com.pCarpet.dao.DatiBiomediciDAO;
import com.pCarpet.dto.DatiBiomediciDTO;
import com.pCarpet.model.DatiBiomedici;

@Service
public class DatiBiomediciService {
	
private DatiBiomediciDAO datiBiomediciDAO;
	
	@Autowired
	public DatiBiomediciService(DatiBiomediciDAO datiBiomediciDAO) {
		this.datiBiomediciDAO=datiBiomediciDAO;
	}
	public List<DatiBiomediciDTO> getAll(){
		List<DatiBiomedici> listaDatiBiomedici = (List<DatiBiomedici>) datiBiomediciDAO.findAll();
		List<DatiBiomediciDTO> DatiPerDatiSet= new ArrayList<>();
		listaDatiBiomedici.forEach(i->DatiPerDatiSet.add(DatiBiomediciConverter.convertToDto(i)));
		return DatiPerDatiSet;
	}	
	
	public DatiBiomediciDTO insertDatiBiomedici(DatiBiomediciDTO datiBiomediciDTO) {
		DatiBiomedici datiBiomedici = DatiBiomediciConverter.convertToDatiBiomedici(datiBiomediciDTO);
		this.datiBiomediciDAO.save(datiBiomedici);
		return DatiBiomediciConverter.convertToDto(datiBiomediciDAO.save(datiBiomedici));
    }

	public void deleteDatiBiomedici(Long idcartella) {
		DatiBiomedici d = datiBiomediciDAO.findById(idcartella).get();
		datiBiomediciDAO.delete(d);
	}	
	
	 public DatiBiomediciDTO updateDatiBiomedici(DatiBiomediciDTO datiBiomediciDTO) {
		 DatiBiomedici datiBiomedici = DatiBiomediciConverter.convertToDatiBiomedici(datiBiomediciDTO);
		    this.datiBiomediciDAO.save(datiBiomedici);
		    return DatiBiomediciConverter.convertToDto(datiBiomediciDAO.save(datiBiomedici));
	    }
	 
	 public DatiBiomediciDTO findById(long idcartella) {
		 DatiBiomediciDTO datiBiomediciDTO = DatiBiomediciConverter.convertToDto(datiBiomediciDAO.findById(idcartella).get());
			return datiBiomediciDTO;
		}
	    
	    public DatiBiomediciDTO getIdcartella(long idcartella) {
		    DatiBiomedici d=(DatiBiomedici)this.datiBiomediciDAO.findById(idcartella).get();
		    return DatiBiomediciConverter.convertToDto(d);
	    }
}
