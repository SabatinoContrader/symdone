package main.model;

public class Erbe {
	
	private String nomeErba;
	private String descErba;
	
	public Erbe(String nomeErba, String descErba) {
		this.nomeErba = nomeErba;
		this.descErba = descErba;
	}

	public String getNomeErba() {
		return nomeErba;
	}

	public void setNomeErba(String nomeErba) {
		this.nomeErba = nomeErba;
	}

	public String getDescErba() {
		return descErba;
	}

	public void setDescErba(String descErba) {
		this.descErba = descErba;
	}	
	
}
