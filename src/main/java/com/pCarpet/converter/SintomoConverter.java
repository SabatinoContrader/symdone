package com.pCarpet.converter;

import com.pCarpet.dto.SintomoDTO;
import com.pCarpet.model.Sintomo;

public class SintomoConverter {
	
	public static SintomoDTO convertToDto(Sintomo i) {
		SintomoDTO sintomoDTO= new SintomoDTO();
		sintomoDTO.setIdsintomo(i.getIdsintomo());
		sintomoDTO.setNomeSintomo(i.getSintomo());
		sintomoDTO.setRoom(RoomConverter.convertToDto(i.getRoom()));
		sintomoDTO.setItemType(ItemTypeConverter.convertToDto(i.getItemType()));
		if(i.getThing()!=null)
		item.setThing(ThingConverter.convertToDto(i.getThing()));
		return item;
		
		}

	public static Item convertToItem(ItemDTO i) {
		Item item = new Item();
		item.setId(i.getId());
		item.setConsumoEnergetico(i.getConsumoEnergetico());
		item.setSeriale(i.getSeriale());
		item.setRoom(RoomConverter.convertToRoom(i.getRoom()));
		item.setItemType(ItemTypeConverter.convertToItem(i.getItemType()));
		if(i.getThing()!=null)
		item.setThing(ThingConverter.convertToThing(i.getThing()));
		return item;
	  	}
}
