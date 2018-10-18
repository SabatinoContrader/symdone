package main.model;

public class Sintomo {
	
	private int idSintomo;
	private String tipoSintomo;
	private String descrizione;
	
	public Sintomo() 
	{		
	}

	public Sintomo(int idSintomo, String tipoSintomo) {
		this();
		this.idSintomo = idSintomo;
		this.tipoSintomo = tipoSintomo;
	}

	public int getIdSintomo() {
		return idSintomo;
	}

	public void setIdSintomo(int idSintomo) {
		this.idSintomo = idSintomo;
	}

	public String getTipoSintomo() {
		return tipoSintomo;
	}

	public void setTipoSintomo(String tipoSintomo) {
		this.tipoSintomo = tipoSintomo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}
