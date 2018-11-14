package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.ErbaConverter;
import com.pCarpet.converter.MedicoConverter;
import com.pCarpet.converter.PatologiaConverter;
import com.pCarpet.converter.SintomoConverter;
import com.pCarpet.dao.ErbaDAO;
import com.pCarpet.dto.ErbaDTO;
import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.dto.PatologiaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Erba;
import com.pCarpet.model.Medico;
import com.pCarpet.model.Patologia;
import com.pCarpet.model.Sintomo;

@Service
public class ErbaService {
	
	private ErbaDAO erbaDAO;
	
	@Autowired
	public ErbaService(ErbaDAO erbaDAO) {
		this.erbaDAO = erbaDAO;
	}
	
	public List<ErbaDTO> getAll(){
		List<Erba> listaErba = (List<Erba>) erbaDAO.findAll();
		List<ErbaDTO> erbePerPatologie= new ArrayList<>();
		listaErba.forEach(i->erbePerPatologie.add(ErbaConverter.convertToDto(i)));
		return erbePerPatologie;
		
		}
	
	public void insertErba(ErbaDTO erba) {
		erbaDAO.save(ErbaConverter.convertToErba(erba));

	}
	
	
	public void deleteErba (Long iderba) {
		Erba e = erbaDAO.findById(iderba).get();
		erbaDAO.delete(e);
	}
	
	public void updateErba(ErbaDTO erbaDTO) {
		this.erbaDAO.save(ErbaConverter.convertToErba(erbaDTO));
	}
	
	public ErbaDTO getErbaID (long id) {
        Erba erba = (Erba)this.erbaDAO.findById(id).get(); // procedura automatica di spring col DAO
        return ErbaConverter.convertToDto(erba);
    }
	
	 public List<ErbaDTO> getListaResultErba(long iderba) {
			
			List<Erba> listaErba = (List<Erba>) this.erbaDAO.findAllListErba(iderba);
			List<ErbaDTO> PatologiaPerErbaSet= new ArrayList<>();
			listaErba.forEach(i->PatologiaPerErbaSet.add(ErbaConverter.convertToDto(i)));
			return PatologiaPerErbaSet;
			}
	 
		public List<ErbaDTO> getListaResultErbaDue(long idsintomoUno, long idsintomoDue) {
			List<Erba> listaErba = (List<Erba>) this.erbaDAO.findAllListErbaTwoParameter(idsintomoUno,idsintomoDue);
			List<ErbaDTO> SintomoPerErbaSet= new ArrayList<>();
			listaErba.forEach(i->SintomoPerErbaSet.add(ErbaConverter.convertToDto(i)));
			return SintomoPerErbaSet;
		}
		public List<ErbaDTO> getListaResultErbaTre(long idsintomoUno, long idsintomoDue, long idsintomoTre) {
			List<Erba> listaErba = (List<Erba>) this.erbaDAO.findAllListErbaThreeParameter(idsintomoUno,idsintomoDue,idsintomoTre);
			List<ErbaDTO> SintomoPerErbaSetDue= new ArrayList<>();
			listaErba.forEach(i->SintomoPerErbaSetDue.add(ErbaConverter.convertToDto(i)));
			return SintomoPerErbaSetDue;
			}
}