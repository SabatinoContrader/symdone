package com.pCarpet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pCarpet.dto.KitDTO;
import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.services.KitService;


@RestController
@CrossOrigin
@RequestMapping("/HomeKit")
public class HomeKitController {

	private KitService kitService;


	@Autowired
	public HomeKitController (KitService kitService) {
		this.kitService =  kitService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/ShowKit", method = RequestMethod.GET)
	public List<KitDTO> getAll(){
		List<KitDTO> kit = kitService.getAll();
		return kit;
	}
	@RequestMapping(value = "/insertKit", method = RequestMethod.POST)
	@CrossOrigin
	public  KitDTO  newKit(
		@RequestParam(value="tipoKit") String tipoKit,
		@RequestParam(value="descrizioneKit") String descrizioneKit,
		@RequestParam(value="software") String software ) {
		
		KitDTO kitDTO = new KitDTO();
		kitDTO.setTipoKit(tipoKit);
		kitDTO.setDescrizioneKit(descrizioneKit);
		kitDTO.setSoftware(software);
		kitService.insertKit(kitDTO);
		return kitDTO;
	}
		 List<KitDTO> getAll1(){
		List<KitDTO> kit = kitService.getAll();
		return kit;
    }
		 @CrossOrigin
			@RequestMapping(value="/deleteKit", method = RequestMethod.GET)
			public boolean deleteKit(@RequestParam(value="idkit") long idkit) {
				kitService.deleteKit(idkit);
				return true;
				
		 }
		 
		 @CrossOrigin
		 @RequestMapping (value ="/updateKit", method= RequestMethod.POST)
		 public KitDTO updateKit (
				 @RequestParam(value = "idkit") long idkit,
				 @RequestParam(value="tipoKit") String tipoKit,
				 @RequestParam(value="descrizioneKit") String descrizioneKit,
				 @RequestParam(value="software") String software ) {
			 KitDTO kitDTO = kitService.findById(idkit);
			 kitDTO.setTipoKit(tipoKit);
			 kitDTO.setDescrizioneKit(descrizioneKit);
			 kitDTO.setSoftware(software);
			 kitService.updateKit(kitDTO);
			return kitDTO ; 
		 }
}
