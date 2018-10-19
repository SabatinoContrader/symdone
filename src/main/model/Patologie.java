package main.model;

public class Patologie {
	private int  idPatologia;
	private String nomePatologia;
	private String descPatologia;
	
	public Patologie(int idPatologia, String nomePatologia, String descPatologia) {
		this.idPatologia = idPatologia;
		this.nomePatologia = nomePatologia;
		this.descPatologia = descPatologia;
	}

	public Patologie() {
		
	}

	public String getNomePatologia() {
		return nomePatologia;
	}

	public void setNomePatologia(String nomePatologia) {
		this.nomePatologia = nomePatologia;
	}

	public String getDescPatologia() {
		return descPatologia;
	}

	public void setDescPatologia(String descPatologia) {
		this.descPatologia = descPatologia;
	}

	public int getIdPatologia() {
		return idPatologia;
	}

	public void setIdPatologia(int idPatologia) {
		this.idPatologia = idPatologia;
	}

	
}
