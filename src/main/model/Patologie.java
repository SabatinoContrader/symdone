package main.model;

public class Patologie {

	private String nomePatologia;
	private String descPatologia;
	
	public Patologie(String nomePatologia, String descPatologia) {
		this.nomePatologia = nomePatologia;
		this.descPatologia = descPatologia;
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
	
}
