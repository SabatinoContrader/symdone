package com.pCarpet.dto;

import com.pCarpet.model.Abbonamento;
import com.pCarpet.model.Stato;

public class UserDTO {

	private long iduser;
    private String username;
    private String password;
    private int idRuolo;
    private String ruolo;
    
    public UserDTO() {
    	
    }
    
	public UserDTO(long iduser, String username, String password, int idRuolo, String ruolo) {
		this();
		this.iduser = iduser;
		this.username = username;
		this.password = password;
		this.idRuolo = idRuolo;
		this.ruolo = ruolo;
	}
	
	public UserDTO(String username, String ruolo) {
		this();
		this.username=username;
		this.ruolo=ruolo;
	}
	
	public UserDTO(int idutente, String username) {
    	this.iduser=idutente;
    	this.username=username;
    }
	
	public long getIduser() {
		return iduser;
	}
	public void setIduser(long iduser) {
		this.iduser = iduser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getIdRuolo() {
		return idRuolo;
	}
	public void setIdRuolo(int idRuolo) {
		this.idRuolo = idRuolo;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
}
