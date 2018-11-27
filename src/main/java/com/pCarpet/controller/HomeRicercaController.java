package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdForm", method = RequestMethod.GET)
	public List<SintomoDTO> searchViewWithValue(
			
			@RequestParam(value = "iduser") String iduser
			
			) {
		
		long idUser = Integer.parseInt(iduser);
		List<SintomoDTO> listNewSintomi = sintomoService.getListaPatologia(idUser);
		return listNewSintomi;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormErba", method = RequestMethod.GET)
	public List<ErbaDTO> searchViewWithErbaValue(
			
			@RequestParam(value = "iderba") String iderba
			
			) {
		
		long iderba1 = Integer.parseInt(iderba);
		List<ErbaDTO> listErba = erbaService.getListaResultErba(iderba1);
		System.out.println(listErba.size());
		return listErba;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormEsame", method = RequestMethod.GET)
	public List<EsameDTO> searchViewWithEsameValue(
			
			@RequestParam(value = "idesame") String idesame
			
			) {
		
		long esame = Integer.parseInt(idesame);
		List<EsameDTO> listEsame = esameService.getListaResultEsame(esame);
		return listEsame;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormDoctor", method = RequestMethod.GET)
	public List<MedicoDTO> searchViewWithMedicoValue(
			
			@RequestParam(value = "idfirst") String idfirst
			
			) {
		
		long medico = Integer.parseInt(idfirst);
		List<MedicoDTO> listMedico = medicoService.getListaResultMedici(medico);
		return listMedico;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormTwoElem", method = RequestMethod.GET)
	public List<SintomoDTO> searchViewWithTwoValue(
			
			@RequestParam(value = "idfirst") String idfirst,
			@RequestParam(value = "idsecond") String idsecond
			
			) {
		
		long first = Integer.parseInt(idfirst);
		long second = Integer.parseInt(idsecond);
		List<SintomoDTO> listNewSintomi = sintomoService.getListaPatologiaDue(first,second);
		return listNewSintomi;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormTwoElemHerbs", method = RequestMethod.GET)
	public List<ErbaDTO> searchViewWithTwoValueErbe(
			
			@RequestParam(value = "idfirst") String idfirst,
			@RequestParam(value = "idsecond") String idsecond
			
			) {
		
		long first = Integer.parseInt(idfirst);
		long second = Integer.parseInt(idsecond);
		List<ErbaDTO> listErba = erbaService.getListaResultErbaDue(first,second);
		return listErba;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormTwoElemExame", method = RequestMethod.GET)
	public List<EsameDTO> searchViewWithTwoValueEsame(
			
			@RequestParam(value = "idfirst") String idfirst,
			@RequestParam(value = "idsecond") String idsecond
			
			) {
		
		long first = Integer.parseInt(idfirst);
		long second = Integer.parseInt(idsecond);
		List<EsameDTO> listEsame = esameService.getListaResultEsameDue(first,second);
		return listEsame;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormTwoElemDoctor", method = RequestMethod.GET)
	public List<MedicoDTO> searchViewWithTwoValueDoctor(
			
			@RequestParam(value = "idfirst") String idfirst,
			@RequestParam(value = "idsecond") String idsecond
			
			) {
		
		long first = Integer.parseInt(idfirst);
		long second = Integer.parseInt(idsecond);
		List<MedicoDTO> listMedico = medicoService.getListaResultMediciDue(first,second);
		return listMedico;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormThreeElem", method = RequestMethod.GET)
	public List<PatologiaDTO> searchViewWithThreeValue(
			
			@RequestParam(value = "idfirst") String idfirst,
			@RequestParam(value = "idsecond") String idsecond,
			@RequestParam(value = "idthird") String idthird
			) {
		
		long first = Integer.parseInt(idfirst);
		long second = Integer.parseInt(idsecond);
		long third = Integer.parseInt(idthird);
		List<PatologiaDTO> listPatologie = patologiaService.getListaResultPatologiaTre(first,second,third);
		return listPatologie;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormThreeElemHerbs", method = RequestMethod.GET)
	public List<ErbaDTO> searchViewWithThreeValueErbe(
			
			@RequestParam(value = "idfirst") String idfirst,
			@RequestParam(value = "idsecond") String idsecond,
			@RequestParam(value = "idthird") String idthird
			) {
		
		long first = Integer.parseInt(idfirst);
		long second = Integer.parseInt(idsecond);
		long third = Integer.parseInt(idthird);
		List<ErbaDTO> listErba = erbaService.getListaResultErbaTre(first,second,third);
		return listErba;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormThreeElemExame", method = RequestMethod.GET)
	public List<EsameDTO> searchViewWithThreeValueEsame(
			
			@RequestParam(value = "idfirst") String idfirst,
			@RequestParam(value = "idsecond") String idsecond,
			@RequestParam(value = "idthird") String idthird
			) {
		
		long first = Integer.parseInt(idfirst);
		long second = Integer.parseInt(idsecond);
		long third = Integer.parseInt(idthird);
		List<EsameDTO> listEsame = esameService.getListaResultEsameTre(first,second,third);
		return listEsame;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/searchViewWithIdFormThreeElemDoctor", method = RequestMethod.GET)
	public List<MedicoDTO> searchViewWithThreeValueDoctor(
			
			@RequestParam(value = "idfirst") String idfirst,
			@RequestParam(value = "idsecond") String idsecond,
			@RequestParam(value = "idthird") String idthird
			) {
		
		long first = Integer.parseInt(idfirst);
		long second = Integer.parseInt(idsecond);
		long third = Integer.parseInt(idthird);
		List<MedicoDTO> listMedico = medicoService.getListaResultMediciTre(first,second,third);
		return listMedico;
	}
	
	@RequestMapping(value = "/searchViewResultForm", method = RequestMethod.GET)
	public List<PatologiaDTO> searchResultView(
			
		@RequestParam(value = "iduser") String iduser
		
		) {
	
	    long idUser = Integer.parseInt(iduser);
		List<PatologiaDTO> listPatologie = patologiaService.getListaResultPatologia(idUser);
		return listPatologie;
	}
	
	@RequestMapping(value = "/searchViewResultTwoForm", method = RequestMethod.GET)
	public List<PatologiaDTO> searchResultTwoView(
			
		@RequestParam(value = "iduser1") String iduser1,
		@RequestParam(value = "iduser2") String iduser2
		) {
	
	    long idfirst = Integer.parseInt(iduser1);
	    long idsecond = Integer.parseInt(iduser2);
		List<PatologiaDTO> listPatologie = patologiaService.getListaResultPatologiaDue(idfirst,idsecond);
		return listPatologie;
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
				listaPatologia = patologiaService.getListaResultPatologia(idsintomo); 1
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
	

	

