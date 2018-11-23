package com.pCarpet.dto;

public class SensoriDTO {
private long idsensore;
private String tipoSensore;
private String specificheSensore;



public SensoriDTO () {
	
}

public SensoriDTO (long idsensore, String tipoSensore, String specificheSensore) {
	this.idsensore=idsensore;
	this.tipoSensore=tipoSensore;
	this.specificheSensore=specificheSensore;
	
	
}

public long getIdsensore() {
	return idsensore;
}

public void setIdsensore(long idsensore) {
	this.idsensore = idsensore;
}

public String getTipoSensore() {
	return tipoSensore;
}

public void setTipoSensore(String tipoSensore) {
	this.tipoSensore = tipoSensore;
}

public String getSpecificheSensore() {
	return specificheSensore;
}

public void setSpecificheSensore(String specificheSensore) {
	this.specificheSensore = specificheSensore;
}


}