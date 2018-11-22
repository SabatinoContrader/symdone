package com.pCarpet.controller;

import java.sql.Blob;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pCarpet.dto.DatiBiomediciDTO;
import com.pCarpet.services.DatiBiomediciService;


@RestController
@CrossOrigin
@RequestMapping("/HomeDatiBiomedici")
public class HomeDatiBiomediciController {
	
	private DatiBiomediciService datiBiomediciService;
	
	@Autowired
	public HomeDatiBiomediciController(DatiBiomediciService datiBiomediciService) {
		this.datiBiomediciService = datiBiomediciService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/ShowDatiBiomedici", method = RequestMethod.GET)
	public List<DatiBiomediciDTO> getAll(){
		List<DatiBiomediciDTO> datiBiomedici = datiBiomediciService.getAll();
		return datiBiomedici;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/InsertDatiBiomedici", method = RequestMethod.POST)
	public DatiBiomediciDTO newDatiBiomedici(
			@RequestParam(value="risultato") Blob risultato,
			@RequestParam(value="data") Date data){
		DatiBiomediciDTO datiBiomediciDTO = new DatiBiomediciDTO();
		datiBiomediciDTO.setRisultato(risultato);
		datiBiomediciDTO.setData(data);
		datiBiomediciDTO = datiBiomediciService.insertDatiBiomedici(datiBiomediciDTO);
		return datiBiomediciDTO;
	}
	 @CrossOrigin
		@RequestMapping(value="/delete", method = RequestMethod.GET)
		public boolean delete(@RequestParam(value="idcartella") long idcartella) {
			datiBiomediciService.deleteDatiBiomedici(idcartella);
			return true;	
		}
	 
	 @CrossOrigin
		@RequestMapping(value="/update", method = RequestMethod.POST)
	 public DatiBiomediciDTO updateDatiBiomedici(
			 @RequestParam(value="idcartella") Long idcartella,
				@RequestParam(value="risultato") Blob risultato,
				@RequestParam(value="data") Date data){
		 DatiBiomediciDTO datiBiomediciDTO = datiBiomediciService.findById(idcartella);
			datiBiomediciDTO.setRisultato(risultato);
			datiBiomediciDTO.setData(data);
		 datiBiomediciService.updateDatiBiomedici(datiBiomediciDTO);
		return datiBiomediciDTO;
	 }
}
