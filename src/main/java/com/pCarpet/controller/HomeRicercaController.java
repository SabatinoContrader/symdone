package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pCarpet.dto.ErbaDTO;
import com.pCarpet.dto.MedicoDTO;
import com.pCarpet.dto.EsameDTO;
import com.pCarpet.dto.PatologiaDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.services.ErbaService;
import com.pCarpet.services.MedicoService;
import com.pCarpet.services.EsameService;
import com.pCarpet.services.PatologiaService;
import com.pCarpet.services.SintomoService;

@RestController
//@Controller
@CrossOrigin
@RequestMapping("/HomeSearchSintomo")
public class HomeRicercaController {
	private List<EsameDTO>listaEsame;
	private SintomoService sintomoService;
	private EsameService esameService;
	private PatologiaService patologiaService;
	private MedicoService medicoService;
	private List<SintomoDTO> searchListSintomi;
	private List<PatologiaDTO> listaPatologia;
	private List<MedicoDTO> listaMedici;
	private int count=0;
	private long idsintomo = 0;
	private long idsintomoDue = 0;
	private long idsintomoTre = 0;
	private ErbaService erbaService;
	private List<ErbaDTO> listaErba;
	private List<PatologiaDTO> searchListPatologie;

	@Autowired
	public HomeRicercaController (SintomoService sintomoService, PatologiaService patologiaService, MedicoService medicoService, ErbaService erbaService,EsameService esameService) {
		this.sintomoService =  sintomoService;
		this.patologiaService =  patologiaService;
		this.medicoService = medicoService;
		this.erbaService = erbaService;
	    this.esameService = esameService;
	}
	
	@RequestMapping(value = "/searchViewForm", method = RequestMethod.GET)
	public List<SintomoDTO> searchView() {
		List<SintomoDTO> listSintomi = sintomoService.getAll();
		return listSintomi;
	}
	
	/*@RequestMapping(value = "/operationSearchForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
		
		List<SintomoDTO> listaSintomo2 = this.sintomoService.getAll();
		model.addAttribute("listaSintomo", listaSintomo2);
	    List<PatologiaDTO> listaPatologia2 = this.patologiaService.getAll();
		model.addAttribute("listaPatologia", listaPatologia2);
		
	    String scelta= request.getParameter("scelta");
	    System.out.println("SCELTA: " + scelta);
	    
	    switch(scelta) {
		
		case "updateView":
			listaSintomo2 = sintomoService.getAll();
			model.addAttribute("listaSintomo", listaSintomo2);
			return "ricercaPatologie";
			
		case "searchPatologia":
			count += 1;
			System.out.println("COUNT: " + count);
			if(count == 1) {
				idsintomo = Integer.parseInt(request.getParameter("idRicerca"));
				searchListSintomi = sintomoService.getListaPatologia(idsintomo);
				model.addAttribute("listaSintomo", searchListSintomi);
				return "ricercaPatologie";
			}else if(count == 2) {
				idsintomoDue = Integer.parseInt(request.getParameter("idRicerca"));
				searchListSintomi = sintomoService.getListaPatologiaDue(idsintomo, idsintomoDue);
				model.addAttribute("listaSintomo", searchListSintomi);
				return "ricercaPatologie";
			}else if(count == 3) {
				idsintomoTre = Integer.parseInt(request.getParameter("idRicerca"));
				listaPatologia = patologiaService.getListaResultPatologiaTre(idsintomo, idsintomoDue, idsintomoTre);
				model.addAttribute("listaPatologia", listaPatologia);
				listaMedici = medicoService.getListaResultMediciTre(idsintomo, idsintomoDue, idsintomoTre);
				model.addAttribute("listaMedici", listaMedici);
				listaErba = erbaService.getListaResultErbaTre(idsintomo, idsintomoDue, idsintomoTre);
				model.addAttribute("listaErba", listaErba);
				listaEsame= esameService.getListaResultEsameTre(idsintomo, idsintomoDue, idsintomoTre);
				model.addAttribute("listaEsame",listaEsame);
				return "resultSearch";
								
			}
			
			
			
		case "result":
			if(count == 1) {
				listaPatologia = patologiaService.getListaResultPatologia(idsintomo);
				model.addAttribute("listaPatologia", listaPatologia);
				listaMedici = medicoService.getListaResultMedici(idsintomo);
				model.addAttribute("listaMedici", listaMedici);
				listaErba = erbaService.getListaResultErba(idsintomo);
				model.addAttribute("listaErba", listaErba);
				listaEsame = esameService.getListaResultEsame(idsintomo);
				model.addAttribute("listaEsame",listaEsame);
				count = 0;
				idsintomo = 0;
				return "resultSearch";
				
			}
			else if(count == 2) {
				listaPatologia = patologiaService.getListaResultPatologiaDue(idsintomo, idsintomoDue);
				model.addAttribute("listaPatologia", listaPatologia);
				listaMedici = medicoService.getListaResultMediciDue(idsintomo, idsintomoDue);
				model.addAttribute("listaMedici", listaMedici);
				listaErba = erbaService.getListaResultErbaDue(idsintomo, idsintomoDue);
				model.addAttribute("listaErba", listaErba);
				listaEsame = esameService.getListaResultEsameDue(idsintomo, idsintomoDue);
				model.addAttribute("listaEsame", listaEsame);
				count = 0;
				idsintomo = 0;
				idsintomoDue = 0;
				return "resultSearch";
			}
			
		}	    
			
		return "";	    
	
	} */

	@RequestMapping(value = "/returnControl", method = RequestMethod.GET)
	public String indietroControl(HttpServletRequest request, Model model ) {
		count = 0;
		return "homeDIM";
	}
	
}  
	

	

