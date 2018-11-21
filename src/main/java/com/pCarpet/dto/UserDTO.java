package com.pCarpet.dto;

public class UserDTO {

	private long iduser;
    private String username;
    private String password;
    private long idruolo;
    private String ruolo;
    private String name;
    private String surname;
    private String phone;
    private String email;
    
    public UserDTO() {
    	
    }
    
	public UserDTO(long iduser, String username, String password, long idruolo, String ruolo, String name, String surname, String phone, String email) {
		this();
		this.iduser = iduser;
		this.username = username;
		this.password = password;
		this.idruolo = idruolo;
		this.ruolo = ruolo;
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
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
	
	public long getIdRuolo() {
		return idruolo;
	}
	public void setIdRuolo(long idruolo) { 
		this.idruolo = idruolo;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
