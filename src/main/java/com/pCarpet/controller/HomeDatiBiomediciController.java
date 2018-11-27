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
import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.dto.SensoriDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.services.DatiBiomediciService;
import com.pCarpet.services.MedicoService;
import com.pCarpet.services.SensoriService;
import com.pCarpet.services.UserService;



@RestController
@CrossOrigin
@RequestMapping("/HomeDatiBiomedici")
public class HomeDatiBiomediciController {
	
	private DatiBiomediciService datiBiomediciService;
	private UserService userService;
	private MedicoService medicoService;
	private SensoriService sensoriService;
	
	@Autowired
	public HomeDatiBiomediciController(DatiBiomediciService datiBiomediciService, UserService userService, MedicoService medicoService, SensoriService sensoriService) {
		this.datiBiomediciService = datiBiomediciService;
		this.userService= userService;
		this.medicoService=medicoService;
		this.sensoriService=sensoriService;
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
			@RequestParam(value="idpaziente") Long idpaziente,
			@RequestParam(value="idmedico") Long idmedico,
			@RequestParam(value="idsensore") Long idsensore,
			@RequestParam(value="risultato") String risultato,
			@RequestParam(value="data") Date data){
		DatiBiomediciDTO datiBiomediciDTO = new DatiBiomediciDTO();
		datiBiomediciDTO.setIdpaziente(idpaziente);
		datiBiomediciDTO.setIdmedico(idmedico);
		datiBiomediciDTO.setIdsensore(idsensore);
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
			 @RequestParam(value="idpaziente") Long idpaziente,
			 @RequestParam(value="idmedico") Long idmedico,
			 @RequestParam(value="idsensore") Long idsensore,
			//	@RequestParam(value="risultato") String risultato,
				@RequestParam(value="data") Date data){
		 DatiBiomediciDTO datiBiomediciDTO = datiBiomediciService.findById(idcartella);
		 datiBiomediciDTO.setIdpaziente(idpaziente);
			datiBiomediciDTO.setIdmedico(idmedico);
			datiBiomediciDTO.setIdsensore(idsensore);
			//datiBiomediciDTO.setRisultato(risultato);
			datiBiomediciDTO.setData(data);
		 datiBiomediciService.updateDatiBiomedici(datiBiomediciDTO);
		return datiBiomediciDTO;
	 }
	 
	 @CrossOrigin
	 @RequestMapping(value = "/ShowPazienti", method = RequestMethod.GET)
		public List<UserDTO> findAllListUser(){
		List<UserDTO> pazienti=userService.findAllListUser();
			return pazienti;
	 }
	 @CrossOrigin
	 @RequestMapping(value = "/ShowMedici", method = RequestMethod.GET)
		public List<MedicoDTO> getAllMedici(){
		List<MedicoDTO> medici=medicoService.getAll();
			return medici;
	 }
	 @CrossOrigin
	 @RequestMapping(value = "/ShowSensori", method = RequestMethod.GET)
		public List<SensoriDTO> getAllSensori(){
		List<SensoriDTO> sensori=sensoriService.getAll();
			return sensori;
	 }
	 
}
